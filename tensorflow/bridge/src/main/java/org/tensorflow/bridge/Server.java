package org.tensorflow.bridge;

import org.tensorflow.distruntime.ServerDef;
import org.tensorflow.framework.ConfigProto;

public class Server {

  public static ServerDef makeServerDef(ServerDef serverDef, String jobName,
    int taskIndex, String proto, ConfigProto config) {
    ServerDef result = ServerDef.newBuilder().setJobName(jobName).setTaskIndex(taskIndex)
      .setProtocol(proto).setDefaultSessionConfig(config).build();
    return result;
  }

  public Server() {

  }
}
