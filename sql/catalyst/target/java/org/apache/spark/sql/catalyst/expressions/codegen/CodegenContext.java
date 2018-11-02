package org.apache.spark.sql.catalyst.expressions.codegen;
/**
 * A context for codegen, tracking a list of objects that could be passed into generated Java
 * function.
 */
public  class CodegenContext {
  public   CodegenContext ()  { throw new RuntimeException(); }
  /**
   * Holding a list of objects that could be used passed into generated class.
   * @return (undocumented)
   */
  public  scala.collection.mutable.ArrayBuffer<java.lang.Object> references ()  { throw new RuntimeException(); }
  /**
   * Add an object to <code>references</code>.
   * <p>
   * Returns the code to access it.
   * <p>
   * This does not to store the object into field but refer it from the references field at the
   * time of use because number of fields in class is limited so we should reduce it.
   * @param objName (undocumented)
   * @param obj (undocumented)
   * @param className (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String addReferenceObj (java.lang.String objName, Object obj, java.lang.String className)  { throw new RuntimeException(); }
  /**
   * Holding the variable name of the input row of the current operator, will be used by
   * <code>BoundReference</code> to generate code.
   * <p>
   * Note that if <code>currentVars</code> is not null, <code>BoundReference</code> prefers <code>currentVars</code> over <code>INPUT_ROW</code>
   * to generate code. If you want to make sure the generated code use <code>INPUT_ROW</code>, you need to set
   * <code>currentVars</code> to null, or set <code>currentVars(i)</code> to null for certain columns, before calling
   * <code>Expression.genCode</code>.
   * @return (undocumented)
   */
  public  java.lang.String INPUT_ROW ()  { throw new RuntimeException(); }
  /**
   * Holding a list of generated columns as input of current operator, will be used by
   * BoundReference to generate code.
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> currentVars ()  { throw new RuntimeException(); }
  /**
   * Holding expressions' inlined mutable states like <code>MonotonicallyIncreasingID.count</code> as a
   * 2-tuple: java type, variable name.
   * As an example, ("int", "count") will produce code:
   * <pre><code>
   *   private int count;
   * </code></pre>
   * as a member variable
   * <p>
   * They will be kept as member variables in generated classes like <code>SpecificProjection</code>.
   * <p>
   * Exposed for tests only.
   * @return (undocumented)
   */
    scala.collection.mutable.ArrayBuffer<scala.Tuple2<java.lang.String, java.lang.String>> inlinedMutableStates ()  { throw new RuntimeException(); }
  /**
   * The mapping between mutable state types and corrseponding compacted arrays.
   * The keys are java type string. The values are {@link MutableStateArrays} which encapsulates
   * the compacted arrays for the mutable states with the same java type.
   * <p>
   * Exposed for tests only.
   * @return (undocumented)
   */
    scala.collection.mutable.Map<java.lang.String, org.apache.spark.sql.catalyst.expressions.codegen.CodegenContext.MutableStateArrays> arrayCompactedMutableStates ()  { throw new RuntimeException(); }
    scala.collection.mutable.ArrayBuffer<java.lang.String> mutableStateInitCode ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> mutableStateNames ()  { throw new RuntimeException(); }
  /**
   * This class holds a set of names of mutableStateArrays that is used for compacting mutable
   * states for a certain type, and holds the next available slot of the current compacted array.
   */
  public  class MutableStateArrays {
    public   MutableStateArrays ()  { throw new RuntimeException(); }
    public  scala.collection.mutable.ListBuffer<java.lang.String> arrayNames ()  { throw new RuntimeException(); }
    private  void createNewArray ()  { throw new RuntimeException(); }
    public  int getCurrentIndex ()  { throw new RuntimeException(); }
    /**
     * Returns the reference of next available slot in current compacted array. The size of each
     * compacted array is controlled by the constant <code>CodeGenerator.MUTABLESTATEARRAY_SIZE_LIMIT</code>.
     * Once reaching the threshold, new compacted array is created.
     * @return (undocumented)
     */
    public  java.lang.String getNextSlot ()  { throw new RuntimeException(); }
  }
  /**
   * A map containing the mutable states which have been defined so far using
   * <code>addImmutableStateIfNotExists</code>. Each entry contains the name of the mutable state as key and
   * its Java type and init code as value.
   * @return (undocumented)
   */
  private  scala.collection.mutable.Map<java.lang.String, scala.Tuple2<java.lang.String, java.lang.String>> immutableStates ()  { throw new RuntimeException(); }
  /**
   * Add a mutable state as a field to the generated class. c.f. the comments above.
   * <p>
   * @param javaType Java type of the field. Note that short names can be used for some types,
   *                 e.g. InternalRow, UnsafeRow, UnsafeArrayData, etc. Other types will have to
   *                 specify the fully-qualified Java type name. See the code in doCompile() for
   *                 the list of default imports available.
   *                 Also, generic type arguments are accepted but ignored.
   * @param variableName Name of the field.
   * @param initFunc Function includes statement(s) to put into the init() method to initialize
   *                 this field. The argument is the name of the mutable state variable.
   *                 If left blank, the field will be default-initialized.
   * @param forceInline whether the declaration and initialization code may be inlined rather than
   *                    compacted. Please set <code>true</code> into forceInline for one of the followings:
   *                    1. use the original name of the status
   *                    2. expect to non-frequently generate the status
   *                       (e.g. not much sort operators in one stage)
   * @param useFreshName If this is false and the mutable state ends up inlining in the outer
   *                     class, the name is not changed
   * @return the name of the mutable state variable, which is the original name or fresh name if
   *         the variable is inlined to the outer class, or an array access if the variable is to
   *         be stored in an array of variables of the same type.
   *         A variable will be inlined into the outer class when one of the following conditions
   *         are satisfied:
   *         1. forceInline is true
   *         2. its type is primitive type and the total number of the inlined mutable variables
   *            is less than <code>CodeGenerator.OUTER_CLASS_VARIABLES_THRESHOLD</code>
   *         3. its type is multi-dimensional array
   *         When a variable is compacted into an array, the max size of the array for compaction
   *         is given by <code>CodeGenerator.MUTABLESTATEARRAY_SIZE_LIMIT</code>.
   */
  public  java.lang.String addMutableState (java.lang.String javaType, java.lang.String variableName, scala.Function1<java.lang.String, java.lang.String> initFunc, boolean forceInline, boolean useFreshName)  { throw new RuntimeException(); }
  /**
   * Add an immutable state as a field to the generated class only if it does not exist yet a field
   * with that name. This helps reducing the number of the generated class' fields, since the same
   * variable can be reused by many functions.
   * <p>
   * Even though the added variables are not declared as final, they should never be reassigned in
   * the generated code to prevent errors and unexpected behaviors.
   * <p>
   * Internally, this method calls <code>addMutableState</code>.
   * <p>
   * @param javaType Java type of the field.
   * @param variableName Name of the field.
   * @param initFunc Function includes statement(s) to put into the init() method to initialize
   *                 this field. The argument is the name of the mutable state variable.
   */
  public  void addImmutableStateIfNotExists (java.lang.String javaType, java.lang.String variableName, scala.Function1<java.lang.String, java.lang.String> initFunc)  { throw new RuntimeException(); }
  /**
   * Add buffer variable which stores data coming from an {@link InternalRow}. This methods guarantees
   * that the variable is safely stored, which is important for (potentially) byte array backed
   * data types like: UTF8String, ArrayData, MapData &amp; InternalRow.
   * @param dataType (undocumented)
   * @param variableName (undocumented)
   * @param initCode (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.codegen.ExprCode addBufferedState (org.apache.spark.sql.types.DataType dataType, java.lang.String variableName, java.lang.String initCode)  { throw new RuntimeException(); }
  public  java.lang.String declareMutableStates ()  { throw new RuntimeException(); }
  public  java.lang.String initMutableStates ()  { throw new RuntimeException(); }
  /**
   * Code statements to initialize states that depend on the partition index.
   * An integer <code>partitionIndex</code> will be made available within the scope.
   * @return (undocumented)
   */
  public  scala.collection.mutable.ArrayBuffer<java.lang.String> partitionInitializationStatements ()  { throw new RuntimeException(); }
  public  void addPartitionInitializationStatement (java.lang.String statement)  { throw new RuntimeException(); }
  public  java.lang.String initPartition ()  { throw new RuntimeException(); }
  /**
   * Holds expressions that are equivalent. Used to perform subexpression elimination
   * during codegen.
   * <p>
   * For expressions that appear more than once, generate additional code to prevent
   * recomputing the value.
   * <p>
   * For example, consider two expression generated from this SQL statement:
   *  SELECT (col1 + col2), (col1 + col2) / col3.
   * <p>
   *  equivalentExpressions will match the tree containing <code>col1 + col2</code> and it will only
   *  be evaluated once.
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.EquivalentExpressions equivalentExpressions ()  { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> subExprEliminationExprs ()  { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.lang.String> subexprFunctions ()  { throw new RuntimeException(); }
  public  java.lang.String outerClassName ()  { throw new RuntimeException(); }
  /**
   * Holds the class and instance names to be generated, where <code>OuterClass</code> is a placeholder
   * standing for whichever class is generated as the outermost class and which will contain any
   * inner sub-classes. All other classes and instance names in this list will represent private,
   * inner sub-classes.
   * @return (undocumented)
   */
  private  scala.collection.mutable.ListBuffer<scala.Tuple2<java.lang.String, java.lang.String>> classes ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<java.lang.String, java.lang.Object> classSize ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<java.lang.String, scala.collection.mutable.Map<java.lang.String, java.lang.String>> classFunctions ()  { throw new RuntimeException(); }
  private  scala.collection.mutable.ListBuffer<java.lang.String> extraClasses ()  { throw new RuntimeException(); }
  private  int currClassSize ()  { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.String, java.lang.String> currClass ()  { throw new RuntimeException(); }
  private  void addClass (java.lang.String className, java.lang.String classInstance)  { throw new RuntimeException(); }
  /**
   * Adds a function to the generated class. If the code for the <code>OuterClass</code> grows too large, the
   * function will be inlined into a new private, inner class, and a class-qualified name for the
   * function will be returned. Otherwise, the function will be inlined to the <code>OuterClass</code> the
   * simple <code>funcName</code> will be returned.
   * <p>
   * @param funcName the class-unqualified name of the function
   * @param funcCode the body of the function
   * @param inlineToOuterClass whether the given code must be inlined to the <code>OuterClass</code>. This
   *                           can be necessary when a function is declared outside of the context
   *                           it is eventually referenced and a returned qualified function name
   *                           cannot otherwise be accessed.
   * @return the name of the function, qualified by class if it will be inlined to a private,
   *         inner class
   */
  public  java.lang.String addNewFunction (java.lang.String funcName, java.lang.String funcCode, boolean inlineToOuterClass)  { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.expressions.codegen.NewFunctionSpec addNewFunctionInternal (java.lang.String funcName, java.lang.String funcCode, boolean inlineToOuterClass)  { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<java.lang.String, java.lang.String> addNewFunctionToClass (java.lang.String funcName, java.lang.String funcCode, java.lang.String className)  { throw new RuntimeException(); }
  /**
   * Declares all function code. If the added functions are too many, split them into nested
   * sub-classes to avoid hitting Java compiler constant pool limitation.
   * @return (undocumented)
   */
  public  java.lang.String declareAddedFunctions ()  { throw new RuntimeException(); }
  /**
   * Emits extra inner classes added with addExtraCode
   * @return (undocumented)
   */
  public  java.lang.String emitExtraCode ()  { throw new RuntimeException(); }
  /**
   * Add extra source code to the outermost generated class.
   * @param code verbatim source code of the inner class to be added.
   */
  public  void addInnerClass (java.lang.String code)  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_BOOLEAN ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_BYTE ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_SHORT ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_INT ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_LONG ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_FLOAT ()  { throw new RuntimeException(); }
  public final  java.lang.String JAVA_DOUBLE ()  { throw new RuntimeException(); }
  /**
   * The map from a variable name to it's next ID.
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> freshNameIds ()  { throw new RuntimeException(); }
  /**
   * A prefix used to generate fresh name.
   * @return (undocumented)
   */
  public  java.lang.String freshNamePrefix ()  { throw new RuntimeException(); }
  /**
   * The map from a place holder to a corresponding comment
   * @return (undocumented)
   */
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.String> placeHolderToComments ()  { throw new RuntimeException(); }
  /**
   * Returns a term name that is unique within this instance of a <code>CodegenContext</code>.
   * @param name (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String freshName (java.lang.String name)  { throw new RuntimeException(); }
  /**
   * Returns the specialized code to access a value from <code>inputRow</code> at <code>ordinal</code>.
   * @param input (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getValue (java.lang.String input, org.apache.spark.sql.types.DataType dataType, java.lang.String ordinal)  { throw new RuntimeException(); }
  /**
   * Returns the code to update a column in Row for a given DataType.
   * @param row (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String setColumn (java.lang.String row, org.apache.spark.sql.types.DataType dataType, int ordinal, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Update a column in MutableRow from ExprCode.
   * <p>
   * @param isVectorized True if the underlying row is of type <code>ColumnarBatch.Row</code>, false otherwise
   * @param row (undocumented)
   * @param dataType (undocumented)
   * @param ordinal (undocumented)
   * @param ev (undocumented)
   * @param nullable (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String updateColumn (java.lang.String row, org.apache.spark.sql.types.DataType dataType, int ordinal, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, boolean nullable, boolean isVectorized)  { throw new RuntimeException(); }
  /**
   * Returns the specialized code to set a given value in a column vector for a given <code>DataType</code>.
   * @param vector (undocumented)
   * @param rowId (undocumented)
   * @param dataType (undocumented)
   * @param value (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String setValue (java.lang.String vector, java.lang.String rowId, org.apache.spark.sql.types.DataType dataType, java.lang.String value)  { throw new RuntimeException(); }
  /**
   * Returns the specialized code to set a given value in a column vector for a given <code>DataType</code>
   * that could potentially be nullable.
   * @param vector (undocumented)
   * @param rowId (undocumented)
   * @param dataType (undocumented)
   * @param ev (undocumented)
   * @param nullable (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String updateColumn (java.lang.String vector, java.lang.String rowId, org.apache.spark.sql.types.DataType dataType, org.apache.spark.sql.catalyst.expressions.codegen.ExprCode ev, boolean nullable)  { throw new RuntimeException(); }
  /**
   * Returns the specialized code to access a value from a column vector for a given <code>DataType</code>.
   * @param vector (undocumented)
   * @param dataType (undocumented)
   * @param rowId (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String getValueFromVector (java.lang.String vector, org.apache.spark.sql.types.DataType dataType, java.lang.String rowId)  { throw new RuntimeException(); }
  /**
   * Returns the name used in accessor and setter for a Java primitive type.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String primitiveTypeName (java.lang.String jt)  { throw new RuntimeException(); }
  public  java.lang.String primitiveTypeName (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Returns the Java type for a DataType.
   * @param dt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String javaType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Returns the boxed type in Java.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String boxedType (java.lang.String jt)  { throw new RuntimeException(); }
  public  java.lang.String boxedType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Returns the representation of default value for a given Java Type.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String defaultValue (java.lang.String jt)  { throw new RuntimeException(); }
  public  java.lang.String defaultValue (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Generates code for equal expression in Java.
   * @param dataType (undocumented)
   * @param c1 (undocumented)
   * @param c2 (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String genEqual (org.apache.spark.sql.types.DataType dataType, java.lang.String c1, java.lang.String c2)  { throw new RuntimeException(); }
  /**
   * Generates code for comparing two expressions.
   * <p>
   * @param dataType data type of the expressions
   * @param c1 name of the variable of expression 1's output
   * @param c2 name of the variable of expression 2's output
   * @return (undocumented)
   */
  public  java.lang.String genComp (org.apache.spark.sql.types.DataType dataType, java.lang.String c1, java.lang.String c2)  { throw new RuntimeException(); }
  /**
   * Generates code for greater of two expressions.
   * <p>
   * @param dataType data type of the expressions
   * @param c1 name of the variable of expression 1's output
   * @param c2 name of the variable of expression 2's output
   * @return (undocumented)
   */
  public  java.lang.String genGreater (org.apache.spark.sql.types.DataType dataType, java.lang.String c1, java.lang.String c2)  { throw new RuntimeException(); }
  /**
   * Generates code to do null safe execution, i.e. only execute the code when the input is not
   * null by adding null check if necessary.
   * <p>
   * @param nullable used to decide whether we should add null check or not.
   * @param isNull the code to check if the input is null.
   * @param execute the code that should only be executed when the input is not null.
   * @return (undocumented)
   */
  public  java.lang.String nullSafeExec (boolean nullable, java.lang.String isNull, java.lang.String execute)  { throw new RuntimeException(); }
  /**
   * List of java data types that have special accessors and setters in {@link InternalRow}.
   * @return (undocumented)
   */
  public  scala.collection.Seq<java.lang.String> primitiveTypes ()  { throw new RuntimeException(); }
  /**
   * Returns true if the Java type has a special accessor and setter in {@link InternalRow}.
   * @param jt (undocumented)
   * @return (undocumented)
   */
  public  boolean isPrimitiveType (java.lang.String jt)  { throw new RuntimeException(); }
  public  boolean isPrimitiveType (org.apache.spark.sql.types.DataType dt)  { throw new RuntimeException(); }
  /**
   * Splits the generated code of expressions into multiple functions, because function has
   * 64kb code size limit in JVM. If the class to which the function would be inlined would grow
   * beyond 1000kb, we declare a private, inner sub-class, and the function is inlined to it
   * instead, because classes have a constant pool limit of 65,536 named values.
   * <p>
   * Note that different from <code>splitExpressions</code>, we will extract the current inputs of this
   * context and pass them to the generated functions. The input is <code>INPUT_ROW</code> for normal codegen
   * path, and <code>currentVars</code> for whole stage codegen path. Whole stage codegen path is not
   * supported yet.
   * <p>
   * @param expressions the codes to evaluate expressions.
   * @param funcName the split function name base.
   * @param extraArguments the list of (type, name) of the arguments of the split function,
   *                       except for the current inputs like <code>ctx.INPUT_ROW</code>.
   * @param returnType the return type of the split function.
   * @param makeSplitFunction makes split function body, e.g. add preparation or cleanup.
   * @param foldFunctions folds the split function calls.
   * @return (undocumented)
   */
  public  java.lang.String splitExpressionsWithCurrentInputs (scala.collection.Seq<java.lang.String> expressions, java.lang.String funcName, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> extraArguments, java.lang.String returnType, scala.Function1<java.lang.String, java.lang.String> makeSplitFunction, scala.Function1<scala.collection.Seq<java.lang.String>, java.lang.String> foldFunctions)  { throw new RuntimeException(); }
  /**
   * Splits the generated code of expressions into multiple functions, because function has
   * 64kb code size limit in JVM. If the class to which the function would be inlined would grow
   * beyond 1000kb, we declare a private, inner sub-class, and the function is inlined to it
   * instead, because classes have a constant pool limit of 65,536 named values.
   * <p>
   * @param expressions the codes to evaluate expressions.
   * @param funcName the split function name base.
   * @param arguments the list of (type, name) of the arguments of the split function.
   * @param returnType the return type of the split function.
   * @param makeSplitFunction makes split function body, e.g. add preparation or cleanup.
   * @param foldFunctions folds the split function calls.
   * @return (undocumented)
   */
  public  java.lang.String splitExpressions (scala.collection.Seq<java.lang.String> expressions, java.lang.String funcName, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> arguments, java.lang.String returnType, scala.Function1<java.lang.String, java.lang.String> makeSplitFunction, scala.Function1<scala.collection.Seq<java.lang.String>, java.lang.String> foldFunctions)  { throw new RuntimeException(); }
  /**
   * Splits the generated code of expressions into multiple sequences of String
   * based on a threshold of length of a String
   * <p>
   * @param expressions the codes to evaluate expressions.
   * @return (undocumented)
   */
  private  scala.collection.Seq<java.lang.String> buildCodeBlocks (scala.collection.Seq<java.lang.String> expressions)  { throw new RuntimeException(); }
  /**
   * Here we handle all the methods which have been added to the inner classes and
   * not to the outer class.
   * Since they can be many, their direct invocation in the outer class adds many entries
   * to the outer class' constant pool. This can cause the constant pool to past JVM limit.
   * Moreover, this can cause also the outer class method where all the invocations are
   * performed to grow beyond the 64k limit.
   * To avoid these problems, we group them and we call only the grouping methods in the
   * outer class.
   * <p>
   * @param functions a {@link Seq} of {@link NewFunctionSpec} defined in the inner classes
   * @param funcName the split function name base.
   * @param arguments the list of (type, name) of the arguments of the split function.
   * @param returnType the return type of the split function.
   * @param makeSplitFunction makes split function body, e.g. add preparation or cleanup.
   * @param foldFunctions folds the split function calls.
   * @return an {@link Iterable} containing the methods' invocations
   */
  private  scala.collection.Iterable<java.lang.String> generateInnerClassesFunctionCalls (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.NewFunctionSpec> functions, java.lang.String funcName, scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> arguments, java.lang.String returnType, scala.Function1<java.lang.String, java.lang.String> makeSplitFunction, scala.Function1<scala.collection.Seq<java.lang.String>, java.lang.String> foldFunctions)  { throw new RuntimeException(); }
  /**
   * Perform a function which generates a sequence of ExprCodes with a given mapping between
   * expressions and common expressions, instead of using the mapping in current context.
   * @param newSubExprEliminationExprs (undocumented)
   * @param f (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> withSubExprEliminationExprs (scala.collection.immutable.Map<org.apache.spark.sql.catalyst.expressions.Expression, org.apache.spark.sql.catalyst.expressions.codegen.SubExprEliminationState> newSubExprEliminationExprs, scala.Function0<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode>> f)  { throw new RuntimeException(); }
  /**
   * Checks and sets up the state and codegen for subexpression elimination. This finds the
   * common subexpressions, generates the code snippets that evaluate those expressions and
   * populates the mapping of common subexpressions to the generated code snippets. The generated
   * code snippets will be returned and should be inserted into generated codes before these
   * common subexpressions actually are used first time.
   * @param expressions (undocumented)
   * @return (undocumented)
   */
  public  org.apache.spark.sql.catalyst.expressions.codegen.SubExprCodes subexpressionEliminationForWholeStageCodegen (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
  /**
   * Checks and sets up the state and codegen for subexpression elimination. This finds the
   * common subexpressions, generates the functions that evaluate those expressions and populates
   * the mapping of common subexpressions to the generated functions.
   * @param expressions (undocumented)
   */
  private  void subexpressionElimination (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions)  { throw new RuntimeException(); }
  /**
   * Generates code for expressions. If doSubexpressionElimination is true, subexpression
   * elimination will be performed. Subexpression elimination assumes that the code for each
   * expression will be combined in the <code>expressions</code> order.
   * @param expressions (undocumented)
   * @param doSubexpressionElimination (undocumented)
   * @return (undocumented)
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.codegen.ExprCode> generateExpressions (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> expressions, boolean doSubexpressionElimination)  { throw new RuntimeException(); }
  /**
   * get a map of the pair of a place holder and a corresponding comment
   * @return (undocumented)
   */
  public  scala.collection.Map<java.lang.String, java.lang.String> getPlaceHolderToComments ()  { throw new RuntimeException(); }
  /**
   * Register a comment and return the corresponding place holder
   * @param text (undocumented)
   * @return (undocumented)
   */
  public  java.lang.String registerComment (scala.Function0<java.lang.String> text)  { throw new RuntimeException(); }
  /**
   * Returns the length of parameters for a Java method descriptor. <code>this</code> contributes one unit
   * and a parameter of type long or double contributes two units. Besides, for nullable parameter,
   * we also need to pass a boolean parameter for the null status.
   * @param params (undocumented)
   * @return (undocumented)
   */
  public  int calculateParamLength (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> params)  { throw new RuntimeException(); }
  /**
   * In Java, a method descriptor is valid only if it represents method parameters with a total
   * length less than a pre-defined constant.
   * @param paramLength (undocumented)
   * @return (undocumented)
   */
  public  boolean isValidParamLength (int paramLength)  { throw new RuntimeException(); }
}