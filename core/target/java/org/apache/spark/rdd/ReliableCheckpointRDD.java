package org.apache.spark.rdd;
/**
 * An RDD that reads from checkpoint files previously written to reliable storage.
 */
  class ReliableCheckpointRDD<T extends java.lang.Object> extends org.apache.spark.rdd.CheckpointRDD<T> {
  /**
   * Return the checkpoint file name for the given partition.
   * @param partitionIndex (undocumented)
   * @return (undocumented)
   */
  static private  java.lang.String checkpointFileName (int partitionIndex)  { throw new RuntimeException(); }
  static private  java.lang.String checkpointPartitionerFileName ()  { throw new RuntimeException(); }
  /**
   * Write RDD to checkpoint files and return a ReliableCheckpointRDD representing the RDD.
   * @param originalRDD (undocumented)
   * @param checkpointDir (undocumented)
   * @param blockSize (undocumented)
   * @param evidence$2 (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> org.apache.spark.rdd.ReliableCheckpointRDD<T> writeRDDToCheckpointDirectory (org.apache.spark.rdd.RDD<T> originalRDD, java.lang.String checkpointDir, int blockSize, scala.reflect.ClassTag<T> evidence$2)  { throw new RuntimeException(); }
  /**
   * Write an RDD partition's data to a checkpoint file.
   * @param path (undocumented)
   * @param broadcastedConf (undocumented)
   * @param blockSize (undocumented)
   * @param ctx (undocumented)
   * @param iterator (undocumented)
   * @param evidence$3 (undocumented)
   */
  static public <T extends java.lang.Object> void writePartitionToCheckpointFile (java.lang.String path, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf, int blockSize, org.apache.spark.TaskContext ctx, scala.collection.Iterator<T> iterator, scala.reflect.ClassTag<T> evidence$3)  { throw new RuntimeException(); }
  /**
   * Write a partitioner to the given RDD checkpoint directory. This is done on a best-effort
   * basis; any exception while writing the partitioner is caught, logged and ignored.
   * @param sc (undocumented)
   * @param partitioner (undocumented)
   * @param checkpointDirPath (undocumented)
   */
  static private  void writePartitionerToCheckpointDir (org.apache.spark.SparkContext sc, org.apache.spark.Partitioner partitioner, org.apache.hadoop.fs.Path checkpointDirPath)  { throw new RuntimeException(); }
  /**
   * Read a partitioner from the given RDD checkpoint directory, if it exists.
   * This is done on a best-effort basis; any exception while reading the partitioner is
   * caught, logged and ignored.
   * @param sc (undocumented)
   * @param checkpointDirPath (undocumented)
   * @return (undocumented)
   */
  static private  scala.Option<org.apache.spark.Partitioner> readCheckpointedPartitionerFile (org.apache.spark.SparkContext sc, java.lang.String checkpointDirPath)  { throw new RuntimeException(); }
  /**
   * Read the content of the specified checkpoint file.
   * @param path (undocumented)
   * @param broadcastedConf (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  static public <T extends java.lang.Object> scala.collection.Iterator<T> readCheckpointFile (org.apache.hadoop.fs.Path path, org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static protected  java.lang.String logName ()  { throw new RuntimeException(); }
  static protected  org.slf4j.Logger log ()  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg)  { throw new RuntimeException(); }
  static protected  void logInfo (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logDebug (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logTrace (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logWarning (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  void logError (scala.Function0<java.lang.String> msg, java.lang.Throwable throwable)  { throw new RuntimeException(); }
  static protected  boolean isTraceEnabled ()  { throw new RuntimeException(); }
  static protected  void initializeLogIfNecessary (boolean isInterpreter)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary (boolean isInterpreter, boolean silent)  { throw new RuntimeException(); }
  static protected  boolean initializeLogIfNecessary$default$2 ()  { throw new RuntimeException(); }
  static   org.apache.spark.SparkConf conf ()  { throw new RuntimeException(); }
  static protected  scala.collection.Seq<org.apache.spark.Dependency<?>> getDependencies ()  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkContext sparkContext ()  { throw new RuntimeException(); }
  static public  int id ()  { throw new RuntimeException(); }
  static public  java.lang.String name ()  { throw new RuntimeException(); }
  static public  void name_$eq (java.lang.String x$1)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> setName (java.lang.String _name)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> persist (org.apache.spark.storage.StorageLevel newLevel)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> persist ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> cache ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> unpersist (boolean blocking)  { throw new RuntimeException(); }
  static public  org.apache.spark.storage.StorageLevel getStorageLevel ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<org.apache.spark.Dependency<?>> dependencies ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.Partition[] partitions ()  { throw new RuntimeException(); }
  static public final  int getNumPartitions ()  { throw new RuntimeException(); }
  static public final  scala.collection.Seq<java.lang.String> preferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  static public final  scala.collection.Iterator<T> iterator (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static   scala.collection.Seq<org.apache.spark.rdd.RDD<?>> getNarrowAncestors ()  { throw new RuntimeException(); }
  static   scala.collection.Iterator<T> computeOrReadCheckpoint (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static   scala.collection.Iterator<T> getOrCompute (org.apache.spark.Partition partition, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
  static  <U extends java.lang.Object> U withScope (scala.Function0<U> body)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> map (scala.Function1<T, U> f, scala.reflect.ClassTag<U> evidence$3)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> flatMap (scala.Function1<T, scala.collection.TraversableOnce<U>> f, scala.reflect.ClassTag<U> evidence$4)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> filter (scala.Function1<T, java.lang.Object> f)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> distinct (int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> distinct ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> repartition (int numPartitions, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> coalesce (int numPartitions, boolean shuffle, scala.Option<org.apache.spark.rdd.PartitionCoalescer> partitionCoalescer, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> sample (boolean withReplacement, double fraction, long seed)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T>[] randomSplit (double[] weights, long seed)  { throw new RuntimeException(); }
  static   org.apache.spark.rdd.RDD<T> randomSampleWithRange (double lb, double ub, long seed)  { throw new RuntimeException(); }
  static public  java.lang.Object takeSample (boolean withReplacement, int num, long seed)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> union (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> $plus$plus (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<T> sortBy (scala.Function1<T, K> f, boolean ascending, int numPartitions, scala.math.Ordering<K> ord, scala.reflect.ClassTag<K> ctag)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner partitioner, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> intersection (org.apache.spark.rdd.RDD<T> other, int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.Object> glom ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<T, U>> cartesian (org.apache.spark.rdd.RDD<U> other, scala.reflect.ClassTag<U> evidence$5)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, scala.reflect.ClassTag<K> kt)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, int numPartitions, scala.reflect.ClassTag<K> kt)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.collection.Iterable<T>>> groupBy (scala.Function1<T, K> f, org.apache.spark.Partitioner p, scala.reflect.ClassTag<K> kt, scala.math.Ordering<K> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.String> pipe (java.lang.String command)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.String> pipe (java.lang.String command, scala.collection.Map<java.lang.String, java.lang.String> env)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.String> pipe (scala.collection.Seq<java.lang.String> command, scala.collection.Map<java.lang.String, java.lang.String> env, scala.Function1<scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> printPipeContext, scala.Function2<T, scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> printRDDElement, boolean separateWorkingDir, int bufferSize, java.lang.String encoding)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitions (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$6)  { throw new RuntimeException(); }
  static  <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsWithIndexInternal (scala.Function2<java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, boolean isOrderSensitive, scala.reflect.ClassTag<U> evidence$7)  { throw new RuntimeException(); }
  static  <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsInternal (scala.Function1<scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$8)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> mapPartitionsWithIndex (scala.Function2<java.lang.Object, scala.collection.Iterator<T>, scala.collection.Iterator<U>> f, boolean preservesPartitioning, scala.reflect.ClassTag<U> evidence$9)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<T, U>> zip (org.apache.spark.rdd.RDD<U> other, scala.reflect.ClassTag<U> evidence$10)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, boolean preservesPartitioning, scala.Function2<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$11, scala.reflect.ClassTag<V> evidence$12)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, scala.Function2<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$13, scala.reflect.ClassTag<V> evidence$14)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, boolean preservesPartitioning, scala.Function3<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$15, scala.reflect.ClassTag<C> evidence$16, scala.reflect.ClassTag<V> evidence$17)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, scala.Function3<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$18, scala.reflect.ClassTag<C> evidence$19, scala.reflect.ClassTag<V> evidence$20)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, org.apache.spark.rdd.RDD<D> rdd4, boolean preservesPartitioning, scala.Function4<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<D>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$21, scala.reflect.ClassTag<C> evidence$22, scala.reflect.ClassTag<D> evidence$23, scala.reflect.ClassTag<V> evidence$24)  { throw new RuntimeException(); }
  static public <B extends java.lang.Object, C extends java.lang.Object, D extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<V> zipPartitions (org.apache.spark.rdd.RDD<B> rdd2, org.apache.spark.rdd.RDD<C> rdd3, org.apache.spark.rdd.RDD<D> rdd4, scala.Function4<scala.collection.Iterator<T>, scala.collection.Iterator<B>, scala.collection.Iterator<C>, scala.collection.Iterator<D>, scala.collection.Iterator<V>> f, scala.reflect.ClassTag<B> evidence$25, scala.reflect.ClassTag<C> evidence$26, scala.reflect.ClassTag<D> evidence$27, scala.reflect.ClassTag<V> evidence$28)  { throw new RuntimeException(); }
  static public  void foreach (scala.Function1<T, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  void foreachPartition (scala.Function1<scala.collection.Iterator<T>, scala.runtime.BoxedUnit> f)  { throw new RuntimeException(); }
  static public  java.lang.Object collect ()  { throw new RuntimeException(); }
  static public  scala.collection.Iterator<T> toLocalIterator ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> collect (scala.PartialFunction<T, U> f, scala.reflect.ClassTag<U> evidence$29)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other, int numPartitions)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<T> subtract (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner p, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  T reduce (scala.Function2<T, T, T> f)  { throw new RuntimeException(); }
  static public  T treeReduce (scala.Function2<T, T, T> f, int depth)  { throw new RuntimeException(); }
  static public  T fold (T zeroValue, scala.Function2<T, T, T> op)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> U aggregate (U zeroValue, scala.Function2<U, T, U> seqOp, scala.Function2<U, U, U> combOp, scala.reflect.ClassTag<U> evidence$30)  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> U treeAggregate (U zeroValue, scala.Function2<U, T, U> seqOp, scala.Function2<U, U, U> combOp, int depth, scala.reflect.ClassTag<U> evidence$31)  { throw new RuntimeException(); }
  static public  long count ()  { throw new RuntimeException(); }
  static public  org.apache.spark.partial.PartialResult<org.apache.spark.partial.BoundedDouble> countApprox (long timeout, double confidence)  { throw new RuntimeException(); }
  static public  scala.collection.Map<T, java.lang.Object> countByValue (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  org.apache.spark.partial.PartialResult<scala.collection.Map<T, org.apache.spark.partial.BoundedDouble>> countByValueApprox (long timeout, double confidence, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  long countApproxDistinct (int p, int sp)  { throw new RuntimeException(); }
  static public  long countApproxDistinct (double relativeSD)  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<T, java.lang.Object>> zipWithIndex ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<T, java.lang.Object>> zipWithUniqueId ()  { throw new RuntimeException(); }
  static public  java.lang.Object take (int num)  { throw new RuntimeException(); }
  static public  T first ()  { throw new RuntimeException(); }
  static public  java.lang.Object top (int num, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  java.lang.Object takeOrdered (int num, scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  T max (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  T min (scala.math.Ordering<T> ord)  { throw new RuntimeException(); }
  static public  boolean isEmpty ()  { throw new RuntimeException(); }
  static public  void saveAsTextFile (java.lang.String path)  { throw new RuntimeException(); }
  static public  void saveAsTextFile (java.lang.String path, java.lang.Class<? extends org.apache.hadoop.io.compress.CompressionCodec> codec)  { throw new RuntimeException(); }
  static public  void saveAsObjectFile (java.lang.String path)  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, T>> keyBy (scala.Function1<T, K> f)  { throw new RuntimeException(); }
  static   java.lang.Object[] collectPartitions ()  { throw new RuntimeException(); }
  static public  boolean isCheckpointed ()  { throw new RuntimeException(); }
  static   boolean isCheckpointedAndMaterialized ()  { throw new RuntimeException(); }
  static   boolean isLocallyCheckpointed ()  { throw new RuntimeException(); }
  static   boolean isReliablyCheckpointed ()  { throw new RuntimeException(); }
  static   org.apache.spark.util.CallSite creationSite ()  { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.rdd.RDDOperationScope> scope ()  { throw new RuntimeException(); }
  static   java.lang.String getCreationSite ()  { throw new RuntimeException(); }
  static   scala.reflect.ClassTag<T> elementClassTag ()  { throw new RuntimeException(); }
  static   scala.Option<org.apache.spark.rdd.RDDCheckpointData<T>> checkpointData ()  { throw new RuntimeException(); }
  static   void checkpointData_$eq (scala.Option<org.apache.spark.rdd.RDDCheckpointData<T>> x$1)  { throw new RuntimeException(); }
  static protected <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> firstParent (scala.reflect.ClassTag<U> evidence$32)  { throw new RuntimeException(); }
  static protected <U extends java.lang.Object> org.apache.spark.rdd.RDD<U> parent (int j, scala.reflect.ClassTag<U> evidence$33)  { throw new RuntimeException(); }
  static public  org.apache.spark.SparkContext context ()  { throw new RuntimeException(); }
  static   org.apache.spark.rdd.RDD<T> retag (java.lang.Class<T> cls)  { throw new RuntimeException(); }
  static   org.apache.spark.rdd.RDD<T> retag (scala.reflect.ClassTag<T> classTag)  { throw new RuntimeException(); }
  static   void markCheckpointed ()  { throw new RuntimeException(); }
  static protected  void clearDependencies ()  { throw new RuntimeException(); }
  static public  java.lang.String toDebugString ()  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.api.java.JavaRDD<T> toJavaRDD ()  { throw new RuntimeException(); }
  static  final  scala.Enumeration.Value outputDeterministicLevel ()  { throw new RuntimeException(); }
  static protected  scala.Enumeration.Value getOutputDeterministicLevel ()  { throw new RuntimeException(); }
  static public  long sample$default$3 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsWithIndex$default$2 ()  { throw new RuntimeException(); }
  static public  boolean unpersist$default$1 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> distinct$default$2 (int numPartitions)  { throw new RuntimeException(); }
  static public  boolean coalesce$default$2 ()  { throw new RuntimeException(); }
  static public  scala.Option<org.apache.spark.rdd.PartitionCoalescer> coalesce$default$3 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> coalesce$default$4 (int numPartitions, boolean shuffle, scala.Option<org.apache.spark.rdd.PartitionCoalescer> partitionCoalescer)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> repartition$default$2 (int numPartitions)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> subtract$default$3 (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> intersection$default$3 (org.apache.spark.rdd.RDD<T> other, org.apache.spark.Partitioner partitioner)  { throw new RuntimeException(); }
  static public  long randomSplit$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> boolean sortBy$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> int sortBy$default$3 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitions$default$2 ()  { throw new RuntimeException(); }
  static public <K extends java.lang.Object> scala.runtime.Null$ groupBy$default$4 (scala.Function1<T, K> f, org.apache.spark.Partitioner p)  { throw new RuntimeException(); }
  static public  scala.collection.Map<java.lang.String, java.lang.String> pipe$default$2 ()  { throw new RuntimeException(); }
  static public  scala.Function1<scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> pipe$default$3 ()  { throw new RuntimeException(); }
  static public  scala.Function2<T, scala.Function1<java.lang.String, scala.runtime.BoxedUnit>, scala.runtime.BoxedUnit> pipe$default$4 ()  { throw new RuntimeException(); }
  static public  boolean pipe$default$5 ()  { throw new RuntimeException(); }
  static public  int pipe$default$6 ()  { throw new RuntimeException(); }
  static public  java.lang.String pipe$default$7 ()  { throw new RuntimeException(); }
  static public  int treeReduce$default$2 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> int treeAggregate$default$4 (U zeroValue)  { throw new RuntimeException(); }
  static public  double countApprox$default$2 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> countByValue$default$1 ()  { throw new RuntimeException(); }
  static public  double countByValueApprox$default$2 ()  { throw new RuntimeException(); }
  static public  scala.math.Ordering<T> countByValueApprox$default$3 (long timeout, double confidence)  { throw new RuntimeException(); }
  static public  long takeSample$default$3 ()  { throw new RuntimeException(); }
  static public  double countApproxDistinct$default$1 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsWithIndexInternal$default$2 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsWithIndexInternal$default$3 ()  { throw new RuntimeException(); }
  static public <U extends java.lang.Object> boolean mapPartitionsInternal$default$2 ()  { throw new RuntimeException(); }
  static public  void doCheckpoint ()  { throw new RuntimeException(); }
  static public  void checkpoint ()  { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.CheckpointRDD<T> localCheckpoint ()  { throw new RuntimeException(); }
  public  java.lang.String checkpointPath ()  { throw new RuntimeException(); }
  // not preceding
  public   ReliableCheckpointRDD (org.apache.spark.SparkContext sc, java.lang.String checkpointPath, scala.Option<org.apache.spark.Partitioner> _partitioner, scala.reflect.ClassTag<T> evidence$1)  { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConf ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path cpath ()  { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs ()  { throw new RuntimeException(); }
  private  org.apache.spark.broadcast.Broadcast<org.apache.spark.util.SerializableConfiguration> broadcastedConf ()  { throw new RuntimeException(); }
  /**
   * Return the path of the checkpoint directory this RDD reads data from.
   * @return (undocumented)
   */
  public  scala.Option<java.lang.String> getCheckpointFile ()  { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.Partitioner> partitioner ()  { throw new RuntimeException(); }
  /**
   * Return partitions described by the files in the checkpoint directory.
   * <p>
   * Since the original RDD may belong to a prior application, there is no way to know a
   * priori the number of partitions to expect. This method assumes that the original set of
   * checkpoint files are fully preserved in a reliable storage across application lifespans.
   * @return (undocumented)
   */
  protected  org.apache.spark.Partition[] getPartitions ()  { throw new RuntimeException(); }
  /**
   * Return the locations of the checkpoint file associated with the given partition.
   * @param split (undocumented)
   * @return (undocumented)
   */
  protected  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split)  { throw new RuntimeException(); }
  /**
   * Read the content of the checkpoint file associated with the given partition.
   * @param split (undocumented)
   * @param context (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context)  { throw new RuntimeException(); }
}
