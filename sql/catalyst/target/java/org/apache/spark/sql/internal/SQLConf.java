package org.apache.spark.sql.internal;
/**
 * A class that enables the setting and getting of mutable config parameters/hints.
 * <p>
 * In the presence of a SQLContext, these can be set and queried by passing SET commands
 * into Spark SQL's query functions (i.e. sql()). Otherwise, users of this class can
 * modify the hints by programmatically calling the setters and getters of this class.
 * <p>
 * SQLConf is thread-safe (internally synchronized, so safe to be used in multiple threads).
 */
public  class SQLConf implements scala.Serializable, org.apache.spark.internal.Logging {
  static public  class ParquetOutputTimestampType$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final ParquetOutputTimestampType$ MODULE$ = null;
    public   ParquetOutputTimestampType$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value INT96 ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value TIMESTAMP_MICROS ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value TIMESTAMP_MILLIS ()  { throw new RuntimeException(); }
  }
  static public  class HiveCaseSensitiveInferenceMode$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final HiveCaseSensitiveInferenceMode$ MODULE$ = null;
    public   HiveCaseSensitiveInferenceMode$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value INFER_AND_SAVE ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value INFER_ONLY ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value NEVER_INFER ()  { throw new RuntimeException(); }
  }
  static public  class PartitionOverwriteMode$ extends scala.Enumeration {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final PartitionOverwriteMode$ MODULE$ = null;
    public   PartitionOverwriteMode$ ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value STATIC ()  { throw new RuntimeException(); }
    public  scala.Enumeration.Value DYNAMIC ()  { throw new RuntimeException(); }
  }
  static public  class Deprecated$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Deprecated$ MODULE$ = null;
    public   Deprecated$ ()  { throw new RuntimeException(); }
    public  java.lang.String MAPRED_REDUCE_TASKS ()  { throw new RuntimeException(); }
  }
  static public  class Replaced$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Replaced$ MODULE$ = null;
    public   Replaced$ ()  { throw new RuntimeException(); }
    public  java.lang.String MAPREDUCE_JOB_REDUCES ()  { throw new RuntimeException(); }
  }
  static private  java.util.Map<java.lang.String, org.apache.spark.internal.config.ConfigEntry<?>> sqlConfEntries ()  { throw new RuntimeException(); }
  static public  java.util.Set<java.lang.String> staticConfKeys ()  { throw new RuntimeException(); }
  static private  void register (org.apache.spark.internal.config.ConfigEntry<?> entry)  { throw new RuntimeException(); }
  static   void unregister (org.apache.spark.internal.config.ConfigEntry<?> entry)  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigBuilder buildConf (java.lang.String key)  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigBuilder buildStaticConf (java.lang.String key)  { throw new RuntimeException(); }
  /**
   * Default config. Only used when there is no active SparkSession for the thread.
   * See {@link get} for more information.
   * @return (undocumented)
   */
  static private  java.lang.ThreadLocal<org.apache.spark.sql.internal.SQLConf> fallbackConf ()  { throw new RuntimeException(); }
  /** See {@link get} for more information. */
  static public  org.apache.spark.sql.internal.SQLConf getFallbackConf ()  { throw new RuntimeException(); }
  /**
   * Defines a getter that returns the SQLConf within scope.
   * See {@link get} for more information.
   * @return (undocumented)
   */
  static private  java.util.concurrent.atomic.AtomicReference<scala.Function0<org.apache.spark.sql.internal.SQLConf>> confGetter ()  { throw new RuntimeException(); }
  /**
   * Sets the active config object within the current scope.
   * See {@link get} for more information.
   * @param getter (undocumented)
   */
  static public  void setSQLConfGetter (scala.Function0<org.apache.spark.sql.internal.SQLConf> getter)  { throw new RuntimeException(); }
  /**
   * Returns the active config object within the current scope. If there is an active SparkSession,
   * the proper SQLConf associated with the thread's session is used.
   * <p>
   * The way this works is a little bit convoluted, due to the fact that config was added initially
   * only for physical plans (and as a result not in sql/catalyst module).
   * <p>
   * The first time a SparkSession is instantiated, we set the {@link confGetter} to return the
   * active SparkSession's config. If there is no active SparkSession, it returns using the thread
   * local {@link fallbackConf}. The reason {@link fallbackConf} is a thread local (rather than just a conf)
   * is to support setting different config options for different threads so we can potentially
   * run tests in parallel. At the time this feature was implemented, this was a no-op since we
   * run unit tests (that does not involve SparkSession) in serial order.
   * @return (undocumented)
   */
  static public  org.apache.spark.sql.internal.SQLConf get ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> OPTIMIZER_MAX_ITERATIONS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> OPTIMIZER_INSET_CONVERSION_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> COMPRESS_CACHED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> COLUMN_BATCH_SIZE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> IN_MEMORY_PARTITION_PRUNING ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CACHE_VECTORIZED_READER_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> COLUMN_VECTOR_OFFHEAP_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PREFER_SORTMERGEJOIN ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> RADIX_SORT_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> AUTO_BROADCASTJOIN_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> LIMIT_SCALE_UP_FACTOR ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ADVANCED_PARTITION_PREDICATE_PUSHDOWN ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ENABLE_FALL_BACK_TO_HDFS_FOR_STATS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DEFAULT_SIZE_IN_BYTES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SHUFFLE_PARTITIONS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SHUFFLE_TARGET_POSTSHUFFLE_INPUT_SIZE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ADAPTIVE_EXECUTION_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SHUFFLE_MIN_NUM_POSTSHUFFLE_PARTITIONS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SUBEXPRESSION_ELIMINATION_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CASE_SENSITIVE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONSTRAINT_PROPAGATION_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ESCAPED_STRING_LITERALS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_COMRESSION_FACTOR ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_SCHEMA_MERGING_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_SCHEMA_RESPECT_SUMMARIES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_BINARY_AS_STRING ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_INT96_AS_TIMESTAMP ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_INT96_TIMESTAMP_CONVERSION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> PARQUET_OUTPUT_TIMESTAMP_TYPE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_INT64_AS_TIMESTAMP_MILLIS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> PARQUET_COMPRESSION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_FILTER_PUSHDOWN_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_WRITE_LEGACY_FORMAT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_RECORD_FILTER_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> PARQUET_OUTPUT_COMMITTER_CLASS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARQUET_VECTORIZED_READER_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> ORC_COMPRESSION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> ORC_IMPLEMENTATION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ORC_VECTORIZED_READER_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ORC_COPY_BATCH_TO_SPARK ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ORC_FILTER_PUSHDOWN_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_VERIFY_PARTITION_PATH ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_METASTORE_PARTITION_PRUNING ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_MANAGE_FILESOURCE_PARTITIONS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HIVE_FILESOURCE_PARTITION_FILE_CACHE_SIZE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> HIVE_CASE_SENSITIVE_INFERENCE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> OPTIMIZER_METADATA_ONLY ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> COLUMN_NAME_OF_CORRUPT_RECORD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FROM_JSON_FORCE_NULLABLE_SCHEMA ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> BROADCAST_TIMEOUT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> THRIFTSERVER_POOL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> THRIFTSERVER_INCREMENTAL_COLLECT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> THRIFTSERVER_UI_STATEMENT_LIMIT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> THRIFTSERVER_UI_SESSION_LIMIT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> DEFAULT_DATA_SOURCE_NAME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONVERT_CTAS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> GATHER_FASTSTAT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARTITION_COLUMN_TYPE_INFERENCE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> BUCKETING_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CROSS_JOINS_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ORDER_BY_ORDINAL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> GROUP_BY_ORDINAL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> GROUP_BY_ALIASES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> OUTPUT_COMMITTER_CLASS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> FILE_COMMIT_PROTOCOL_CLASS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARALLEL_PARTITION_DISCOVERY_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PARALLEL_PARTITION_DISCOVERY_PARALLELISM ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DATAFRAME_SELF_JOIN_AUTO_RESOLVE_AMBIGUITY ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DATAFRAME_RETAIN_GROUP_COLUMNS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DATAFRAME_PIVOT_MAX_VALUES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> RUN_SQL_ON_FILES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> WHOLESTAGE_CODEGEN_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> WHOLESTAGE_CODEGEN_USE_ID_IN_CLASS_NAME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> WHOLESTAGE_MAX_NUM_FIELDS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CODEGEN_FALLBACK ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CODEGEN_LOGGING_MAX_LINES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> WHOLESTAGE_HUGE_METHOD_LIMIT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> WHOLESTAGE_SPLIT_CONSUME_FUNC_BY_OPERATOR ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILES_MAX_PARTITION_BYTES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILES_OPEN_COST_IN_BYTES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> IGNORE_CORRUPT_FILES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> IGNORE_MISSING_FILES ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> MAX_RECORDS_PER_FILE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> EXCHANGE_REUSE_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> STATE_STORE_PROVIDER_CLASS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STATE_STORE_MIN_DELTAS_FOR_SNAPSHOT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.OptionalConfigEntry<java.lang.String> CHECKPOINT_LOCATION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> MIN_BATCHES_TO_RETAIN ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> UNSUPPORTED_OPERATION_CHECK_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> VARIABLE_SUBSTITUTE_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> VARIABLE_SUBSTITUTE_DEPTH ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ENABLE_TWOLEVEL_AGG_MAP ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> MAX_NESTED_VIEW_DEPTH ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> STREAMING_FILE_COMMIT_PROTOCOL_CLASS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> OBJECT_AGG_SORT_BASED_FALLBACK_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> USE_OBJECT_HASH_AGG ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SINK_LOG_DELETION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SINK_LOG_COMPACT_INTERVAL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SINK_LOG_CLEANUP_DELAY ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SOURCE_LOG_DELETION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SOURCE_LOG_COMPACT_INTERVAL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> FILE_SOURCE_LOG_CLEANUP_DELAY ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STREAMING_SCHEMA_INFERENCE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STREAMING_POLLING_DELAY ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STREAMING_NO_DATA_PROGRESS_EVENT_INTERVAL ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STREAMING_METRICS_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STREAMING_PROGRESS_RETENTION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> NDV_MAX_ERROR ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HISTOGRAM_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> HISTOGRAM_NUM_BINS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PERCENTILE_ACCURACY ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> AUTO_SIZE_UPDATE_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CBO_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> JOIN_REORDER_ENABLED ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> JOIN_REORDER_DP_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> JOIN_REORDER_CARD_WEIGHT ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> JOIN_REORDER_DP_STAR_FILTER ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STARSCHEMA_DETECTION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> STARSCHEMA_FACT_TABLE_RATIO ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> SESSION_LOCAL_TIMEZONE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> WINDOW_EXEC_BUFFER_IN_MEMORY_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> WINDOW_EXEC_BUFFER_SPILL_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SORT_MERGE_JOIN_EXEC_BUFFER_IN_MEMORY_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SORT_MERGE_JOIN_EXEC_BUFFER_SPILL_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CARTESIAN_PRODUCT_EXEC_BUFFER_IN_MEMORY_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CARTESIAN_PRODUCT_EXEC_BUFFER_SPILL_THRESHOLD ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SUPPORT_QUOTED_REGEX_COLUMN_NAME ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> RANGE_EXCHANGE_SAMPLE_SIZE_PER_PARTITION ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ARROW_EXECUTION_ENABLE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ARROW_EXECUTION_MAX_RECORDS_PER_BATCH ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> PANDAS_RESPECT_SESSION_LOCAL_TIMEZONE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> REPLACE_EXCEPT_WITH_FILTER ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> DECIMAL_OPERATIONS_ALLOW_PREC_LOSS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<scala.util.matching.Regex> SQL_OPTIONS_REDACTION_PATTERN ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<scala.Option<scala.util.matching.Regex>> SQL_STRING_REDACTION_PATTERN ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONCAT_BINARY_AS_STRING ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> ELT_OUTPUT_AS_STRING ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONTINUOUS_STREAMING_EXECUTOR_QUEUE_SIZE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> CONTINUOUS_STREAMING_EXECUTOR_POLL_INTERVAL_MS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> DISABLED_V2_STREAMING_WRITERS ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.String> PARTITION_OVERWRITE_MODE ()  { throw new RuntimeException(); }
  static public  org.apache.spark.internal.config.ConfigEntry<java.lang.Object> SORT_BEFORE_REPARTITION ()  { throw new RuntimeException(); }
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
  public   SQLConf ()  { throw new RuntimeException(); }
  /** Only low degree of contention is expected for conf, thus NOT using ConcurrentHashMap. */
  protected  java.util.Map<java.lang.String, java.lang.String> settings ()  { throw new RuntimeException(); }
  private  org.apache.spark.internal.config.ConfigReader reader ()  { throw new RuntimeException(); }
  /** ************************ Spark SQL Params/Hints ******************* */
  public  int optimizerMaxIterations ()  { throw new RuntimeException(); }
  public  int optimizerInSetConversionThreshold ()  { throw new RuntimeException(); }
  public  java.lang.String stateStoreProviderClass ()  { throw new RuntimeException(); }
  public  int stateStoreMinDeltasForSnapshot ()  { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> checkpointLocation ()  { throw new RuntimeException(); }
  public  boolean isUnsupportedOperationCheckEnabled ()  { throw new RuntimeException(); }
  public  java.lang.String streamingFileCommitProtocolClass ()  { throw new RuntimeException(); }
  public  boolean fileSinkLogDeletion ()  { throw new RuntimeException(); }
  public  int fileSinkLogCompactInterval ()  { throw new RuntimeException(); }
  public  long fileSinkLogCleanupDelay ()  { throw new RuntimeException(); }
  public  boolean fileSourceLogDeletion ()  { throw new RuntimeException(); }
  public  int fileSourceLogCompactInterval ()  { throw new RuntimeException(); }
  public  long fileSourceLogCleanupDelay ()  { throw new RuntimeException(); }
  public  boolean streamingSchemaInference ()  { throw new RuntimeException(); }
  public  long streamingPollingDelay ()  { throw new RuntimeException(); }
  public  long streamingNoDataProgressEventInterval ()  { throw new RuntimeException(); }
  public  boolean streamingMetricsEnabled ()  { throw new RuntimeException(); }
  public  int streamingProgressRetention ()  { throw new RuntimeException(); }
  public  long filesMaxPartitionBytes ()  { throw new RuntimeException(); }
  public  long filesOpenCostInBytes ()  { throw new RuntimeException(); }
  public  boolean ignoreCorruptFiles ()  { throw new RuntimeException(); }
  public  boolean ignoreMissingFiles ()  { throw new RuntimeException(); }
  public  long maxRecordsPerFile ()  { throw new RuntimeException(); }
  public  boolean useCompression ()  { throw new RuntimeException(); }
  public  java.lang.String orcCompressionCodec ()  { throw new RuntimeException(); }
  public  boolean orcVectorizedReaderEnabled ()  { throw new RuntimeException(); }
  public  java.lang.String parquetCompressionCodec ()  { throw new RuntimeException(); }
  public  boolean parquetVectorizedReaderEnabled ()  { throw new RuntimeException(); }
  public  int columnBatchSize ()  { throw new RuntimeException(); }
  public  boolean cacheVectorizedReaderEnabled ()  { throw new RuntimeException(); }
  public  int numShufflePartitions ()  { throw new RuntimeException(); }
  public  long targetPostShuffleInputSize ()  { throw new RuntimeException(); }
  public  boolean adaptiveExecutionEnabled ()  { throw new RuntimeException(); }
  public  int minNumPostShufflePartitions ()  { throw new RuntimeException(); }
  public  int minBatchesToRetain ()  { throw new RuntimeException(); }
  public  boolean parquetFilterPushDown ()  { throw new RuntimeException(); }
  public  boolean orcFilterPushDown ()  { throw new RuntimeException(); }
  public  boolean verifyPartitionPath ()  { throw new RuntimeException(); }
  public  boolean metastorePartitionPruning ()  { throw new RuntimeException(); }
  public  boolean manageFilesourcePartitions ()  { throw new RuntimeException(); }
  public  long filesourcePartitionFileCacheSize ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value caseSensitiveInferenceMode ()  { throw new RuntimeException(); }
  public  boolean gatherFastStats ()  { throw new RuntimeException(); }
  public  boolean optimizerMetadataOnly ()  { throw new RuntimeException(); }
  public  boolean wholeStageEnabled ()  { throw new RuntimeException(); }
  public  boolean wholeStageUseIdInClassName ()  { throw new RuntimeException(); }
  public  int wholeStageMaxNumFields ()  { throw new RuntimeException(); }
  public  boolean codegenFallback ()  { throw new RuntimeException(); }
  public  int loggingMaxLinesForCodegen ()  { throw new RuntimeException(); }
  public  int hugeMethodLimit ()  { throw new RuntimeException(); }
  public  boolean wholeStageSplitConsumeFuncByOperator ()  { throw new RuntimeException(); }
  public  int tableRelationCacheSize ()  { throw new RuntimeException(); }
  public  boolean exchangeReuseEnabled ()  { throw new RuntimeException(); }
  public  boolean caseSensitiveAnalysis ()  { throw new RuntimeException(); }
  public  boolean constraintPropagationEnabled ()  { throw new RuntimeException(); }
  public  boolean escapedStringLiterals ()  { throw new RuntimeException(); }
  public  double fileCompressionFactor ()  { throw new RuntimeException(); }
  public  scala.Option<scala.util.matching.Regex> stringRedactionPattern ()  { throw new RuntimeException(); }
  public  boolean sortBeforeRepartition ()  { throw new RuntimeException(); }
  /**
   * Returns the {@link Resolver} for the current configuration, which can be used to determine if two
   * identifiers are equal.
   * @return (undocumented)
   */
  public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver ()  { throw new RuntimeException(); }
  public  boolean subexpressionEliminationEnabled ()  { throw new RuntimeException(); }
  public  long autoBroadcastJoinThreshold ()  { throw new RuntimeException(); }
  public  int limitScaleUpFactor ()  { throw new RuntimeException(); }
  public  boolean advancedPartitionPredicatePushdownEnabled ()  { throw new RuntimeException(); }
  public  boolean fallBackToHdfsForStatsEnabled ()  { throw new RuntimeException(); }
  public  boolean preferSortMergeJoin ()  { throw new RuntimeException(); }
  public  boolean enableRadixSort ()  { throw new RuntimeException(); }
  public  long defaultSizeInBytes ()  { throw new RuntimeException(); }
  public  boolean isParquetSchemaMergingEnabled ()  { throw new RuntimeException(); }
  public  boolean isParquetSchemaRespectSummaries ()  { throw new RuntimeException(); }
  public  java.lang.String parquetOutputCommitterClass ()  { throw new RuntimeException(); }
  public  boolean isParquetBinaryAsString ()  { throw new RuntimeException(); }
  public  boolean isParquetINT96AsTimestamp ()  { throw new RuntimeException(); }
  public  boolean isParquetINT96TimestampConversion ()  { throw new RuntimeException(); }
  public  boolean isParquetINT64AsTimestampMillis ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value parquetOutputTimestampType ()  { throw new RuntimeException(); }
  public  boolean writeLegacyParquetFormat ()  { throw new RuntimeException(); }
  public  boolean parquetRecordFilterEnabled ()  { throw new RuntimeException(); }
  public  boolean inMemoryPartitionPruning ()  { throw new RuntimeException(); }
  public  boolean offHeapColumnVectorEnabled ()  { throw new RuntimeException(); }
  public  java.lang.String columnNameOfCorruptRecord ()  { throw new RuntimeException(); }
  public  long broadcastTimeout ()  { throw new RuntimeException(); }
  public  java.lang.String defaultDataSourceName ()  { throw new RuntimeException(); }
  public  boolean convertCTAS ()  { throw new RuntimeException(); }
  public  boolean partitionColumnTypeInferenceEnabled ()  { throw new RuntimeException(); }
  public  java.lang.String fileCommitProtocolClass ()  { throw new RuntimeException(); }
  public  int parallelPartitionDiscoveryThreshold ()  { throw new RuntimeException(); }
  public  int parallelPartitionDiscoveryParallelism ()  { throw new RuntimeException(); }
  public  boolean bucketingEnabled ()  { throw new RuntimeException(); }
  public  boolean dataFrameSelfJoinAutoResolveAmbiguity ()  { throw new RuntimeException(); }
  public  boolean dataFrameRetainGroupColumns ()  { throw new RuntimeException(); }
  public  int dataFramePivotMaxValues ()  { throw new RuntimeException(); }
  public  boolean runSQLonFile ()  { throw new RuntimeException(); }
  public  boolean enableTwoLevelAggMap ()  { throw new RuntimeException(); }
  public  boolean useObjectHashAggregation ()  { throw new RuntimeException(); }
  public  int objectAggSortBasedFallbackThreshold ()  { throw new RuntimeException(); }
  public  boolean variableSubstituteEnabled ()  { throw new RuntimeException(); }
  public  int variableSubstituteDepth ()  { throw new RuntimeException(); }
  public  java.lang.String warehousePath ()  { throw new RuntimeException(); }
  public  boolean hiveThriftServerSingleSession ()  { throw new RuntimeException(); }
  public  boolean orderByOrdinal ()  { throw new RuntimeException(); }
  public  boolean groupByOrdinal ()  { throw new RuntimeException(); }
  public  boolean groupByAliases ()  { throw new RuntimeException(); }
  public  boolean crossJoinEnabled ()  { throw new RuntimeException(); }
  public  java.lang.String sessionLocalTimeZone ()  { throw new RuntimeException(); }
  public  double ndvMaxError ()  { throw new RuntimeException(); }
  public  boolean histogramEnabled ()  { throw new RuntimeException(); }
  public  int histogramNumBins ()  { throw new RuntimeException(); }
  public  int percentileAccuracy ()  { throw new RuntimeException(); }
  public  boolean cboEnabled ()  { throw new RuntimeException(); }
  public  boolean autoSizeUpdateEnabled ()  { throw new RuntimeException(); }
  public  boolean joinReorderEnabled ()  { throw new RuntimeException(); }
  public  int joinReorderDPThreshold ()  { throw new RuntimeException(); }
  public  double joinReorderCardWeight ()  { throw new RuntimeException(); }
  public  boolean joinReorderDPStarFilter ()  { throw new RuntimeException(); }
  public  int windowExecBufferInMemoryThreshold ()  { throw new RuntimeException(); }
  public  int windowExecBufferSpillThreshold ()  { throw new RuntimeException(); }
  public  int sortMergeJoinExecBufferInMemoryThreshold ()  { throw new RuntimeException(); }
  public  int sortMergeJoinExecBufferSpillThreshold ()  { throw new RuntimeException(); }
  public  int cartesianProductExecBufferInMemoryThreshold ()  { throw new RuntimeException(); }
  public  int cartesianProductExecBufferSpillThreshold ()  { throw new RuntimeException(); }
  public  int maxNestedViewDepth ()  { throw new RuntimeException(); }
  public  boolean starSchemaDetection ()  { throw new RuntimeException(); }
  public  double starSchemaFTRatio ()  { throw new RuntimeException(); }
  public  boolean supportQuotedRegexColumnName ()  { throw new RuntimeException(); }
  public  int rangeExchangeSampleSizePerPartition ()  { throw new RuntimeException(); }
  public  boolean arrowEnable ()  { throw new RuntimeException(); }
  public  int arrowMaxRecordsPerBatch ()  { throw new RuntimeException(); }
  public  boolean pandasRespectSessionTimeZone ()  { throw new RuntimeException(); }
  public  boolean replaceExceptWithFilter ()  { throw new RuntimeException(); }
  public  boolean decimalOperationsAllowPrecisionLoss ()  { throw new RuntimeException(); }
  public  int continuousStreamingExecutorQueueSize ()  { throw new RuntimeException(); }
  public  long continuousStreamingExecutorPollIntervalMs ()  { throw new RuntimeException(); }
  public  java.lang.String disabledV2StreamingWriters ()  { throw new RuntimeException(); }
  public  boolean concatBinaryAsString ()  { throw new RuntimeException(); }
  public  boolean eltOutputAsString ()  { throw new RuntimeException(); }
  public  scala.Enumeration.Value partitionOverwriteMode ()  { throw new RuntimeException(); }
  /** Set Spark SQL configuration properties. */
  public  void setConf (java.util.Properties props)  { throw new RuntimeException(); }
  /** Set the given Spark SQL configuration property using a `string` value. */
  public  void setConfString (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  /** Set the given Spark SQL configuration property. */
  public <T extends java.lang.Object> void setConf (org.apache.spark.internal.config.ConfigEntry<T> entry, T value)  { throw new RuntimeException(); }
  /** Return the value of Spark SQL configuration property for the given key. */
  public  java.lang.String getConfString (java.lang.String key) throws java.util.NoSuchElementException { throw new RuntimeException(); }
  /**
   * Return the value of Spark SQL configuration property for the given key. If the key is not set
   * yet, return <code>defaultValue</code>. This is useful when <code>defaultValue</code> in ConfigEntry is not the
   * desired one.
   * @param entry (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T getConf (org.apache.spark.internal.config.ConfigEntry<T> entry, T defaultValue)  { throw new RuntimeException(); }
  /**
   * Return the value of Spark SQL configuration property for the given key. If the key is not set
   * yet, return <code>defaultValue</code> in {@link ConfigEntry}.
   * @param entry (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> T getConf (org.apache.spark.internal.config.ConfigEntry<T> entry)  { throw new RuntimeException(); }
  /**
   * Return the value of an optional Spark SQL configuration property for the given key. If the key
   * is not set yet, returns None.
   * @param entry (undocumented)
   * @return (undocumented)
   */
  public <T extends java.lang.Object> scala.Option<T> getConf (org.apache.spark.internal.config.OptionalConfigEntry<T> entry)  { throw new RuntimeException(); }
  /**
   * Return the <code>string</code> value of Spark SQL configuration property for the given key. If the key is
   * not set yet, return <code>defaultValue</code>.
   * @param key (undocumented)
   * @param defaultValue (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getConfString (java.lang.String key, java.lang.String defaultValue)  { throw new RuntimeException(); }
  /**
   * Return all the configuration properties that have been set (i.e. not the default).
   * This creates a new copy of the config properties in the form of a Map.
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getAllConfs ()  { throw new RuntimeException(); }
  /**
   * Return all the configuration definitions that have been defined in {@link SQLConf}. Each
   * definition contains key, defaultValue and doc.
   * @return (undocumented)
   */
  public  scala.collection.Seq<scala.Tuple3<java.lang.String, java.lang.String, java.lang.String>> getAllDefinedConfs ()  { throw new RuntimeException(); }
  /**
   * Redacts the given option map according to the description of SQL_OPTIONS_REDACTION_PATTERN.
   * @param options (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> redactOptions (scala.collection.immutable.Map<java.lang.String, java.lang.String> options)  { throw new RuntimeException(); }
  /**
   * Return whether a given key is set in this {@link SQLConf}.
   * @param key (undocumented)
   * @return (undocumented)
   */
  public  boolean contains (java.lang.String key)  { throw new RuntimeException(); }
  private  void setConfWithCheck (java.lang.String key, java.lang.String value)  { throw new RuntimeException(); }
  public  void unsetConf (java.lang.String key)  { throw new RuntimeException(); }
  public  void unsetConf (org.apache.spark.internal.config.ConfigEntry<?> entry)  { throw new RuntimeException(); }
  public  void clear ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf clone ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf copy (scala.collection.Seq<scala.Tuple2<org.apache.spark.internal.config.ConfigEntry<?>, java.lang.Object>> entries)  { throw new RuntimeException(); }
}