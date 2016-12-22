package org.tensorflow.bridge;

public class StartLocalServer {
  public static void main(String[] args) throws Exception {
    TFServer server = TFServer.createLocalServer();
    System.out.println("Local Server target:" + server.getTarget());
    server.start();
    server.join();
  }
}
