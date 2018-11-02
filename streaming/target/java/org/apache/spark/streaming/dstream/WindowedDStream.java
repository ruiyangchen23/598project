package org.apache.spark.streaming.dstream;
  class WindowedDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree(), TypeTree()))
  public   WindowedDStream (org.apache.spark.streaming.dstream.DStream<T> parent, org.apache.spark.streaming.Duration _windowDuration, org.apache.spark.streaming.Duration _slideDuration, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration windowDuration ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration parentRememberDuration ()  { throw new RuntimeException(); }
  public  org.apache.spark.streaming.dstream.DStream<T> persist (org.apache.spark.storage.StorageLevel level)  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<T>> compute (org.apache.spark.streaming.Time validTime)  { throw new RuntimeException(); }
}