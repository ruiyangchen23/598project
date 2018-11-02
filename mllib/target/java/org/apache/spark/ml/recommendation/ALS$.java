package org.apache.spark.ml.recommendation;
/**
 * :: DeveloperApi ::
 * An implementation of ALS that supports generic ID types, specialized for Int and Long. This is
 * exposed as a developer API for users who do need other ID types. But it is not recommended
 * because it increases the shuffle size and memory requirement during training. For simplicity,
 * users and items must have the same type. The number of distinct users/items should be smaller
 * than 2 billion.
 */
public  class ALS$ implements org.apache.spark.ml.util.DefaultParamsReadable<org.apache.spark.ml.recommendation.ALS>, org.apache.spark.internal.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ALS$ MODULE$ = null;
  public   ALS$ ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.recommendation.ALS load (java.lang.String path)  { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Implementation of the ALS algorithm.
   * <p>
   * This implementation of the ALS factorization algorithm partitions the two sets of factors among
   * Spark workers so as to reduce network communication by only sending one copy of each factor
   * vector to each Spark worker on each iteration, and only if needed.  This is achieved by
   * precomputing some information about the ratings matrix to determine which users require which
   * item factors and vice versa.  See the Scaladoc for <code>InBlock</code> for a detailed explanation of how
   * the precomputation is done.
   * <p>
   * In addition, since each iteration of calculating the factor matrices depends on the known
   * ratings, which are spread across Spark partitions, a naive implementation would incur
   * significant network communication overhead between Spark workers, as the ratings RDD would be
   * repeatedly shuffled during each iteration.  This implementation reduces that overhead by
   * performing the shuffling operation up front, precomputing each partition's ratings dependencies
   * and duplicating those values to the appropriate workers before starting iterations to solve for
   * the factor matrices.  See the Scaladoc for <code>OutBlock</code> for a detailed explanation of how the
   * precomputation is done.
   * <p>
   * Note that the term "rating block" is a bit of a misnomer, as the ratings are not partitioned by
   * contiguous blocks from the ratings matrix but by a hash function on the rating's location in
   * the matrix.  If it helps you to visualize the partitions, it is easier to think of the term
   * "block" as referring to a subset of an RDD containing the ratings rather than a contiguous
   * submatrix of the ratings matrix.
   * @param ratings (undocumented)
   * @param rank (undocumented)
   * @param numUserBlocks (undocumented)
   * @param numItemBlocks (undocumented)
   * @param maxIter (undocumented)
   * @param regParam (undocumented)
   * @param implicitPrefs (undocumented)
   * @param alpha (undocumented)
   * @param nonnegative (undocumented)
   * @param intermediateRDDStorageLevel (undocumented)
   * @param finalRDDStorageLevel (undocumented)
   * @param checkpointInterval (undocumented)
   * @param seed (undocumented)
   * @param evidence$1 (undocumented)
   * @param ord (undocumented)
   * @return (undocumented)
   */
  public <ID extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>, org.apache.spark.rdd.RDD<scala.Tuple2<ID, float[]>>> train (org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<ID>> ratings, int rank, int numUserBlocks, int numItemBlocks, int maxIter, double regParam, boolean implicitPrefs, double alpha, boolean nonnegative, org.apache.spark.storage.StorageLevel intermediateRDDStorageLevel, org.apache.spark.storage.StorageLevel finalRDDStorageLevel, int checkpointInterval, long seed, scala.reflect.ClassTag<ID> evidence$1, scala.math.Ordering<ID> ord)  { throw new RuntimeException(); }
  /**
   * Initializes factors randomly given the in-link blocks.
   * <p>
   * @param inBlocks in-link blocks
   * @param rank rank
   * @return initialized factor blocks
   * @param seed (undocumented)
   */
  private <ID extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, float[][]>> initialize (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.ml.recommendation.ALS.InBlock<ID>>> inBlocks, int rank, long seed)  { throw new RuntimeException(); }
  /**
   * Groups an RDD of {@link Rating}s by the user partition and item partition to which each <code>Rating</code>
   * maps according to the given partitioners.  The returned pair RDD holds the ratings, encoded in
   * a memory-efficient format but otherwise unchanged, keyed by the (user partition ID, item
   * partition ID) pair.
   * <p>
   * Performance note: This is an expensive operation that performs an RDD shuffle.
   * <p>
   * Implementation note: This implementation produces the same result as the following but
   * generates fewer intermediate objects:
   * <p>
   * <pre><code>
   *     ratings.map { r =&gt;
   *       ((srcPart.getPartition(r.user), dstPart.getPartition(r.item)), r)
   *     }.aggregateByKey(new RatingBlockBuilder)(
   *         seqOp = (b, r) =&gt; b.add(r),
   *         combOp = (b0, b1) =&gt; b0.merge(b1.build()))
   *       .mapValues(_.build())
   * </code></pre>
   * <p>
   * @param ratings raw ratings
   * @param srcPart partitioner for src IDs
   * @param dstPart partitioner for dst IDs
   * @return an RDD of rating blocks in the form of ((srcBlockId, dstBlockId), ratingBlock)
   * @param evidence$5 (undocumented)
   */
  private <ID extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.ml.recommendation.ALS.RatingBlock<ID>>> partitionRatings (org.apache.spark.rdd.RDD<org.apache.spark.ml.recommendation.ALS.Rating<ID>> ratings, org.apache.spark.Partitioner srcPart, org.apache.spark.Partitioner dstPart, scala.reflect.ClassTag<ID> evidence$5)  { throw new RuntimeException(); }
  /**
   * Creates in-blocks and out-blocks from rating blocks.
   * <p>
   * @param prefix prefix for in/out-block names
   * @param ratingBlocks rating blocks
   * @param srcPart partitioner for src IDs
   * @param dstPart partitioner for dst IDs
   * @return (in-blocks, out-blocks)
   * @param storageLevel (undocumented)
   * @param evidence$10 (undocumented)
   * @param srcOrd (undocumented)
   */
  private <ID extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.ml.recommendation.ALS.InBlock<ID>>>, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, int[][]>>> makeBlocks (java.lang.String prefix, org.apache.spark.rdd.RDD<scala.Tuple2<scala.Tuple2<java.lang.Object, java.lang.Object>, org.apache.spark.ml.recommendation.ALS.RatingBlock<ID>>> ratingBlocks, org.apache.spark.Partitioner srcPart, org.apache.spark.Partitioner dstPart, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<ID> evidence$10, scala.math.Ordering<ID> srcOrd)  { throw new RuntimeException(); }
  /**
   * Compute dst factors by constructing and solving least square problems.
   * <p>
   * @param srcFactorBlocks src factors
   * @param srcOutBlocks src out-blocks
   * @param dstInBlocks dst in-blocks
   * @param rank rank
   * @param regParam regularization constant
   * @param srcEncoder encoder for src local indices
   * @param implicitPrefs whether to use implicit preference
   * @param alpha the alpha constant in the implicit preference formulation
   * @param solver solver for least squares problems
   * @return dst factors
   */
  private <ID extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, float[][]>> computeFactors (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, float[][]>> srcFactorBlocks, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, int[][]>> srcOutBlocks, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.ml.recommendation.ALS.InBlock<ID>>> dstInBlocks, int rank, double regParam, org.apache.spark.ml.recommendation.ALS.LocalIndexEncoder srcEncoder, boolean implicitPrefs, double alpha, org.apache.spark.ml.recommendation.ALS.LeastSquaresNESolver solver)  { throw new RuntimeException(); }
  /**
   * Computes the Gramian matrix of user or item factors, which is only used in implicit preference.
   * Caching of the input factors is handled in {@link ALS#train}.
   * @param factorBlocks (undocumented)
   * @param rank (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.ml.recommendation.ALS.NormalEquation computeYtY (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, float[][]>> factorBlocks, int rank)  { throw new RuntimeException(); }
  /**
   * Private function to clean up all of the shuffles files from the dependencies and their parents.
   * @param sc (undocumented)
   * @param deps (undocumented)
   * @param blocking (undocumented)
   */
   <T extends java.lang.Object> void cleanShuffleDependencies (org.apache.spark.SparkContext sc, scala.collection.Seq<org.apache.spark.Dependency<?>> deps, boolean blocking)  { throw new RuntimeException(); }
}