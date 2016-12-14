// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/tensor_shape.proto

package org.tensorflow.framework;

public interface TensorShapeProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.TensorShapeProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Dimensions of the tensor, such as {"input", 30}, {"output", 40}
   * for a 30 x 40 2D tensor.  If an entry has size -1, this
   * corresponds to a dimension of unknown size. The names are
   * optional.
   * The order of entries in "dim" matters: It indicates the layout of the
   * values in the tensor in-memory representation.
   * The first entry in "dim" is the outermost dimension used to layout the
   * values, the last entry is the innermost dimension.  This matches the
   * in-memory layout of RowMajor Eigen tensors.
   * If "dim.size()" &gt; 0, "unknown_rank" must be false.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorShapeProto.Dim dim = 2;</code>
   */
  java.util.List<org.tensorflow.framework.TensorShapeProto.Dim> 
      getDimList();
  /**
   * <pre>
   * Dimensions of the tensor, such as {"input", 30}, {"output", 40}
   * for a 30 x 40 2D tensor.  If an entry has size -1, this
   * corresponds to a dimension of unknown size. The names are
   * optional.
   * The order of entries in "dim" matters: It indicates the layout of the
   * values in the tensor in-memory representation.
   * The first entry in "dim" is the outermost dimension used to layout the
   * values, the last entry is the innermost dimension.  This matches the
   * in-memory layout of RowMajor Eigen tensors.
   * If "dim.size()" &gt; 0, "unknown_rank" must be false.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorShapeProto.Dim dim = 2;</code>
   */
  org.tensorflow.framework.TensorShapeProto.Dim getDim(int index);
  /**
   * <pre>
   * Dimensions of the tensor, such as {"input", 30}, {"output", 40}
   * for a 30 x 40 2D tensor.  If an entry has size -1, this
   * corresponds to a dimension of unknown size. The names are
   * optional.
   * The order of entries in "dim" matters: It indicates the layout of the
   * values in the tensor in-memory representation.
   * The first entry in "dim" is the outermost dimension used to layout the
   * values, the last entry is the innermost dimension.  This matches the
   * in-memory layout of RowMajor Eigen tensors.
   * If "dim.size()" &gt; 0, "unknown_rank" must be false.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorShapeProto.Dim dim = 2;</code>
   */
  int getDimCount();
  /**
   * <pre>
   * Dimensions of the tensor, such as {"input", 30}, {"output", 40}
   * for a 30 x 40 2D tensor.  If an entry has size -1, this
   * corresponds to a dimension of unknown size. The names are
   * optional.
   * The order of entries in "dim" matters: It indicates the layout of the
   * values in the tensor in-memory representation.
   * The first entry in "dim" is the outermost dimension used to layout the
   * values, the last entry is the innermost dimension.  This matches the
   * in-memory layout of RowMajor Eigen tensors.
   * If "dim.size()" &gt; 0, "unknown_rank" must be false.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorShapeProto.Dim dim = 2;</code>
   */
  java.util.List<? extends org.tensorflow.framework.TensorShapeProto.DimOrBuilder> 
      getDimOrBuilderList();
  /**
   * <pre>
   * Dimensions of the tensor, such as {"input", 30}, {"output", 40}
   * for a 30 x 40 2D tensor.  If an entry has size -1, this
   * corresponds to a dimension of unknown size. The names are
   * optional.
   * The order of entries in "dim" matters: It indicates the layout of the
   * values in the tensor in-memory representation.
   * The first entry in "dim" is the outermost dimension used to layout the
   * values, the last entry is the innermost dimension.  This matches the
   * in-memory layout of RowMajor Eigen tensors.
   * If "dim.size()" &gt; 0, "unknown_rank" must be false.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorShapeProto.Dim dim = 2;</code>
   */
  org.tensorflow.framework.TensorShapeProto.DimOrBuilder getDimOrBuilder(
      int index);

  /**
   * <pre>
   * If true, the number of dimensions in the shape is unknown.
   * If true, "dim.size()" must be 0.
   * </pre>
   *
   * <code>optional bool unknown_rank = 3;</code>
   */
  boolean getUnknownRank();
}
