package org.apache.spark.api.python;
/**
 * Enumerate the type of command that will be sent to the Python worker
 */
public  class PythonEvalType$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PythonEvalType$ MODULE$ = null;
  public   PythonEvalType$ ()  { throw new RuntimeException(); }
  public  int NON_UDF ()  { throw new RuntimeException(); }
  public  int SQL_BATCHED_UDF ()  { throw new RuntimeException(); }
  public  int SQL_SCALAR_PANDAS_UDF ()  { throw new RuntimeException(); }
  public  int SQL_GROUPED_MAP_PANDAS_UDF ()  { throw new RuntimeException(); }
  public  java.lang.String toString (int pythonEvalType)  { throw new RuntimeException(); }
}