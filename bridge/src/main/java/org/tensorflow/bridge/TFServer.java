package org.tensorflow.bridge;

import org.tensorflow.distruntime.ServerDef;
import org.tensorflow.framework.ConfigProto;
import java.io.ByteArrayOutputStream;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TFServer {
  public ServerDef serverDef;
  private long nativeServer;

  static {
    System.loadLibrary("bridge"); // Load native library at runtime
  }

  public static ServerDef makeServerDef(ServerDef serverDef, String jobName,
    int taskIndex, String proto, ConfigProto config) {
    return ServerDef.newBuilder().mergeFrom(serverDef).setJobName(jobName)
      .setTaskIndex(taskIndex).setProtocol(proto).setDefaultSessionConfig(config).build();
  }

  public static ServerDef makeServerDef(ClusterSpec clusterSpec, String jobName,
    int taskIndex, String proto, ConfigProto config) {
    return ServerDef.newBuilder().setCluster(clusterSpec.as_cluster_def())
      .setJobName(jobName).setProtocol(proto).setTaskIndex(taskIndex)
      .setDefaultSessionConfig(config).build();
  }

  public TFServer(ClusterSpec clusterSpec, String jobName, int taskIndex,
                  String proto, ConfigProto config) throws TFServerException {
    this.serverDef = makeServerDef(clusterSpec, jobName, taskIndex, proto, config);
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try {
      serverDef.writeTo(baos);
      byte[] bytes = baos.toByteArray();
      baos.close();
      this.nativeServer = createServer(bytes);
    } catch (TFServerException e) {
      throw e;
    } catch (IOException e) {
      //
    }
  }

  public void start() {
    this.startServer(this.nativeServer);
  }

  public void join() {
    this.join(this.nativeServer);
  }

  public void stop() {
    this.stop(this.nativeServer);
  }

  public String getTarget() {
    return target(this.nativeServer);
  }

  public static TFServer createLocalServer() {
    HashMap<String,List<String>> cluster = new HashMap<String,List<String>>();
    List<String> address_list = new ArrayList<String>();
    address_list.add("localhost:0");
    cluster.put("worker",address_list);
    ClusterSpec cluster_spec = new ClusterSpec(cluster);
    return new TFServer(cluster_spec, "worker", 0, "grpc", ConfigProto.getDefaultInstance());
  }

  private native long createServer(byte[] server_def);

  private native void startServer(long server);

  private native void join(long server);

  private native void stop(long server);

  private native String target(long server);
}
