package org.apache.spark.ml.tuning;
/**
 * Model from train validation split.
 * <p>
 * param:  uid Id.
 * param:  bestModel Estimator determined best model.
 * param:  validationMetrics Evaluated validation metrics.
 */
public  class TrainValidationSplitModel extends org.apache.spark.ml.Model<org.apache.spark.ml.tuning.TrainValidationSplitModel> implements org.apache.spark.ml.tuning.TrainValidationSplitParams, org.apache.spark.ml.util.MLWritable {
  /**
   * Writer for TrainValidationSplitModel.
   * param:  instance TrainValidationSplitModel instance used to construct the writer
   * <p>
   * TrainValidationSplitModel supports an option "persistSubModels", with possible values
   * "true" or "false". If you set the collectSubModels Param before fitting, then you can
   * set "persistSubModels" to "true" in order to persist the subModels. By default,
   * "persistSubModels" will be "true" when subModels are available and "false" otherwise.
   * If subModels are not available, then setting "persistSubModels" to "true" will cause
   * an exception.
   */
  static public final class TrainValidationSplitModelWriter extends org.apache.spark.ml.util.MLWriter {
       TrainValidationSplitModelWriter (org.apache.spark.ml.tuning.TrainValidationSplitModel instance)  { throw new RuntimeException(); }
    protected  void saveImpl (java.lang.String path)  { throw new RuntimeException(); }
  }
  static private  class TrainValidationSplitModelReader extends org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.TrainValidationSplitModel> {
    public   TrainValidationSplitModelReader ()  { throw new RuntimeException(); }
    /** Checked against metadata when loading model */
    private  java.lang.String className ()  { throw new RuntimeException(); }
    public  org.apache.spark.ml.tuning.TrainValidationSplitModel load (java.lang.String path)  { throw new RuntimeException(); }
  }
  static   scala.Option<org.apache.spark.ml.Model<?>[]> copySubModels (scala.Option<org.apache.spark.ml.Model<?>[]> subModels)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.util.MLReader<org.apache.spark.ml.tuning.TrainValidationSplitModel> read ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.tuning.TrainValidationSplitModel load (java.lang.String path)  { throw new RuntimeException(); }
  static public  java.lang.String toString ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<?>[] params ()  { throw new RuntimeException(); }
  static public  java.lang.String explainParam (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  java.lang.String explainParams ()  { throw new RuntimeException(); }
  static public final  boolean isSet (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final  boolean isDefined (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public  boolean hasParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<java.lang.Object> getParam (java.lang.String paramName)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (java.lang.String param, Object value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.ParamPair<?> paramPair)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> get (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.Params clear (org.apache.spark.ml.param.Param<?> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> T getOrDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> T $ (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends java.lang.Object> org.apache.spark.ml.param.Params setDefault (org.apache.spark.ml.param.Param<T> param, T value)  { throw new RuntimeException(); }
  static protected final  org.apache.spark.ml.param.Params setDefault (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> scala.Option<T> getDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static public final <T extends java.lang.Object> boolean hasDefault (org.apache.spark.ml.param.Param<T> param)  { throw new RuntimeException(); }
  static protected final <T extends org.apache.spark.ml.param.Params> T defaultCopy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.ParamMap extractParamMap ()  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> T copyValues (T to, org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  static protected <T extends org.apache.spark.ml.param.Params> org.apache.spark.ml.param.ParamMap copyValues$default$2 ()  { throw new RuntimeException(); }
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
  static public  org.apache.spark.ml.Estimator<M> parent ()  { throw new RuntimeException(); }
  static public  void parent_$eq (org.apache.spark.ml.Estimator<M> x$1)  { throw new RuntimeException(); }
  static public  M setParent (org.apache.spark.ml.Estimator<M> parent)  { throw new RuntimeException(); }
  static public  boolean hasParent ()  { throw new RuntimeException(); }
  static public final  org.apache.spark.ml.param.LongParam seed ()  { throw new RuntimeException(); }
  static public final  long getSeed ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<org.apache.spark.ml.Estimator<?>> estimator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.Estimator<?> getEstimator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<org.apache.spark.ml.param.ParamMap[]> estimatorParamMaps ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.ParamMap[] getEstimatorParamMaps ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.Param<org.apache.spark.ml.evaluation.Evaluator> evaluator ()  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.evaluation.Evaluator getEvaluator ()  { throw new RuntimeException(); }
  static protected  org.apache.spark.sql.types.StructType transformSchemaImpl (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  static protected  void logTuningParams (org.apache.spark.ml.util.Instrumentation<?> instrumentation)  { throw new RuntimeException(); }
  static public  org.apache.spark.ml.param.DoubleParam trainRatio ()  { throw new RuntimeException(); }
  static public  double getTrainRatio ()  { throw new RuntimeException(); }
  static public  void save (java.lang.String path) throws java.io.IOException { throw new RuntimeException(); }
  public  java.lang.String uid ()  { throw new RuntimeException(); }
  public  org.apache.spark.ml.Model<?> bestModel ()  { throw new RuntimeException(); }
  public  double[] validationMetrics ()  { throw new RuntimeException(); }
  // not preceding
     TrainValidationSplitModel (java.lang.String uid, org.apache.spark.ml.Model<?> bestModel, double[] validationMetrics)  { throw new RuntimeException(); }
  /** A Python-friendly auxiliary constructor. */
     TrainValidationSplitModel (java.lang.String uid, org.apache.spark.ml.Model<?> bestModel, java.util.List<java.lang.Object> validationMetrics)  { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.ml.Model<?>[]> _subModels ()  { throw new RuntimeException(); }
    org.apache.spark.ml.tuning.TrainValidationSplitModel setSubModels (scala.Option<org.apache.spark.ml.Model<?>[]> subModels)  { throw new RuntimeException(); }
  /**
   * @return submodels represented in array. The index of array corresponds to the ordering of
   *         estimatorParamMaps
   * @throws IllegalArgumentException if subModels are not available. To retrieve subModels,
   *         make sure to set collectSubModels to true before fitting.
   */
  public  org.apache.spark.ml.Model<?>[] subModels ()  { throw new RuntimeException(); }
  public  boolean hasSubModels ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.Dataset<org.apache.spark.sql.Row> transform (org.apache.spark.sql.Dataset<?> dataset)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.types.StructType transformSchema (org.apache.spark.sql.types.StructType schema)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplitModel copy (org.apache.spark.ml.param.ParamMap extra)  { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.TrainValidationSplitModel.TrainValidationSplitModelWriter write ()  { throw new RuntimeException(); }
}
