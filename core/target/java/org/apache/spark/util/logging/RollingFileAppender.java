package org.apache.spark.util.logging;
/**
 * Continuously appends data from input stream into the given file, and rolls
 * over the file after the given interval. The rolled over files are named
 * based on the given pattern.
 * <p>
 * param:  inputStream             Input stream to read data from
 * param:  activeFile              File to write data to
 * param:  rollingPolicy           Policy based on which files will be rolled over.
 * param:  conf                    SparkConf that is used to pass on extra configurations
 * param:  bufferSize              Optional buffer size. Used mainly for testing.
 */
  class RollingFileAppender extends org.apache.spark.util.logging.FileAppender {
  static public  java.lang.String STRATEGY_PROPERTY ()  { throw new RuntimeException(); }
  static public  java.lang.String STRATEGY_DEFAULT ()  { throw new RuntimeException(); }
  static public  java.lang.String INTERVAL_PROPERTY ()  { throw new RuntimeException(); }
  static public  java.lang.String INTERVAL_DEFAULT ()  { throw new RuntimeException(); }
  static public  java.lang.String SIZE_PROPERTY ()  { throw new RuntimeException(); }
  static public  java.lang.String SIZE_DEFAULT ()  { throw new RuntimeException(); }
  static public  java.lang.String RETAINED_FILES_PROPERTY ()  { throw new RuntimeException(); }
  static public  int DEFAULT_BUFFER_SIZE ()  { throw new RuntimeException(); }
  static public  java.lang.String ENABLE_COMPRESSION ()  { throw new RuntimeException(); }
  static public  java.lang.String GZIP_LOG_SUFFIX ()  { throw new RuntimeException(); }
  /**
   * Get the sorted list of rolled over files. This assumes that the all the rolled
   * over file names are prefixed with the <code>activeFileName</code>, and the active file
   * name has the latest logs. So it sorts all the rolled over logs (that are
   * prefixed with <code>activeFileName</code>) and appends the active file
   * @param directory (undocumented)
   * @param activeFileName (undocumented)
   * @return (undocumented)
   */
  static public  scala.collection.Seq<java.io.File> getSortedRolledOverFiles (java.lang.String directory, java.lang.String activeFileName)  { throw new RuntimeException(); }
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
  static public  void awaitTermination ()  { throw new RuntimeException(); }
  static protected  void appendStreamToFile ()  { throw new RuntimeException(); }
  static protected  void openFile ()  { throw new RuntimeException(); }
  static protected  void closeFile ()  { throw new RuntimeException(); }
  public  org.apache.spark.util.logging.RollingPolicy rollingPolicy ()  { throw new RuntimeException(); }
  // not preceding
  public   RollingFileAppender (java.io.InputStream inputStream, java.io.File activeFile, org.apache.spark.util.logging.RollingPolicy rollingPolicy, org.apache.spark.SparkConf conf, int bufferSize)  { throw new RuntimeException(); }
  private  int maxRetainedFiles ()  { throw new RuntimeException(); }
  private  boolean enableCompression ()  { throw new RuntimeException(); }
  /** Stop the appender */
  public  void stop ()  { throw new RuntimeException(); }
  /** Append bytes to file after rolling over is necessary */
  protected  void appendToFile (byte[] bytes, int len)  { throw new RuntimeException(); }
  /** Rollover the file, by closing the output stream and moving it over */
  private  void rollover ()  { throw new RuntimeException(); }
  private  void rotateFile (java.io.File activeFile, java.io.File rolloverFile)  { throw new RuntimeException(); }
  private  boolean rolloverFileExist (java.io.File file)  { throw new RuntimeException(); }
  /** Move the active log file to a new rollover file */
  private  void moveFile ()  { throw new RuntimeException(); }
  /** Retain only last few files */
    void deleteOldFiles ()  { throw new RuntimeException(); }
}