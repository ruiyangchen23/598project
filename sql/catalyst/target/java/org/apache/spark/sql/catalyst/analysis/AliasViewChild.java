package org.apache.spark.sql.catalyst.analysis;
/**
 * Make sure that a view's child plan produces the view's output attributes. We try to wrap the
 * child by:
 * 1. Generate the <code>queryOutput</code> by:
 *    1.1. If the query column names are defined, map the column names to attributes in the child
 *         output by name(This is mostly for handling view queries like SELECT * FROM ..., the
 *         schema of the referenced table/view may change after the view has been created, so we
 *         have to save the output of the query to <code>viewQueryColumnNames</code>, and restore them during
 *         view resolution, in this way, we are able to get the correct view column ordering and
 *         omit the extra columns that we don't require);
 *    1.2. Else set the child output attributes to <code>queryOutput</code>.
 * 2. Map the <code>queryOutput</code> to view output by index, if the corresponding attributes don't match,
 *    try to up cast and alias the attribute in <code>queryOutput</code> to the attribute in the view output.
 * 3. Add a Project over the child, with the new output generated by the previous steps.
 * If the view output doesn't have the same number of columns neither with the child output, nor
 * with the query column names, throw an AnalysisException.
 * <p>
 * This should be only done after the batch of Resolution, because the view attributes are not
 * completely resolved during the batch of Resolution.
 */
public  class AliasViewChild extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.CastSupport, scala.Product, scala.Serializable {
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
  static public  java.lang.String ruleName ()  { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.expressions.Cast cast (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.types.DataType dataType)  { throw new RuntimeException(); }
  static public abstract  boolean canEqual (Object that)  ;
  static public abstract  boolean equals (Object that)  ;
  static public abstract  Object productElement (int n)  ;
  static public abstract  int productArity ()  ;
  static public  scala.collection.Iterator<java.lang.Object> productIterator ()  { throw new RuntimeException(); }
  static public  java.lang.String productPrefix ()  { throw new RuntimeException(); }
  public  org.apache.spark.sql.internal.SQLConf conf ()  { throw new RuntimeException(); }
  // not preceding
  public   AliasViewChild (org.apache.spark.sql.internal.SQLConf conf)  { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan)  { throw new RuntimeException(); }
  /**
   * Find the attribute that has the expected attribute name from an attribute list, the names
   * are compared using conf.resolver.
   * If the expected attribute is not found, throw an AnalysisException.
   * @param name (undocumented)
   * @param attrs (undocumented)
   * @param resolver (undocumented)
   * @return (undocumented)
   */
  private  org.apache.spark.sql.catalyst.expressions.Attribute findAttributeByName (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> attrs, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver)  { throw new RuntimeException(); }
}