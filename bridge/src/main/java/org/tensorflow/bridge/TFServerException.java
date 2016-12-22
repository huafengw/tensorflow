package org.tensorflow.bridge;

public class TFServerException extends RuntimeException {
  public TFServerException(String errorMsg) {
    super(errorMsg);
  }
}
