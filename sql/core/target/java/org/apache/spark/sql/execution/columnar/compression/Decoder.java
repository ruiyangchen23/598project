package org.apache.spark.sql.execution.columnar.compression;
  interface Decoder<T extends org.apache.spark.sql.types.AtomicType> {
  public  void next (org.apache.spark.sql.catalyst.InternalRow row, int ordinal)  ;
  public  boolean hasNext ()  ;
  public  void decompress (org.apache.spark.sql.execution.vectorized.WritableColumnVector columnVector, int capacity)  ;
}