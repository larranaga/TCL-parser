// Generated from F:/u/decimo/monitoria/TCL-parser/Grammar\TclV2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TclV2Parser}.
 */
public interface TclV2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#tcl}.
	 * @param ctx the parse tree
	 */
	void enterTcl(TclV2Parser.TclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#tcl}.
	 * @param ctx the parse tree
	 */
	void exitTcl(TclV2Parser.TclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#instructionBlock}.
	 * @param ctx the parse tree
	 */
	void enterInstructionBlock(TclV2Parser.InstructionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#instructionBlock}.
	 * @param ctx the parse tree
	 */
	void exitInstructionBlock(TclV2Parser.InstructionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(TclV2Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(TclV2Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TclV2Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TclV2Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary_expression(TclV2Parser.Binary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#binary_expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary_expression(TclV2Parser.Binary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(TclV2Parser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(TclV2Parser.Unary_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(TclV2Parser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(TclV2Parser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(TclV2Parser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(TclV2Parser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#single_id}.
	 * @param ctx the parse tree
	 */
	void enterSingle_id(TclV2Parser.Single_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#single_id}.
	 * @param ctx the parse tree
	 */
	void exitSingle_id(TclV2Parser.Single_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#subRoutineBlock}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineBlock(TclV2Parser.SubRoutineBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#subRoutineBlock}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineBlock(TclV2Parser.SubRoutineBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#subRoutineDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineDeclaration(TclV2Parser.SubRoutineDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#subRoutineDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineDeclaration(TclV2Parser.SubRoutineDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#subRoutineArgumentListDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineArgumentListDeclaration(TclV2Parser.SubRoutineArgumentListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#subRoutineArgumentListDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineArgumentListDeclaration(TclV2Parser.SubRoutineArgumentListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#subRoutineArgumentDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineArgumentDeclaration(TclV2Parser.SubRoutineArgumentDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#subRoutineArgumentDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineArgumentDeclaration(TclV2Parser.SubRoutineArgumentDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#instructionBlockSubroutine}.
	 * @param ctx the parse tree
	 */
	void enterInstructionBlockSubroutine(TclV2Parser.InstructionBlockSubroutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#instructionBlockSubroutine}.
	 * @param ctx the parse tree
	 */
	void exitInstructionBlockSubroutine(TclV2Parser.InstructionBlockSubroutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#subRoutineInstruction}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineInstruction(TclV2Parser.SubRoutineInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#subRoutineInstruction}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineInstruction(TclV2Parser.SubRoutineInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(TclV2Parser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(TclV2Parser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#returnArguments}.
	 * @param ctx the parse tree
	 */
	void enterReturnArguments(TclV2Parser.ReturnArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#returnArguments}.
	 * @param ctx the parse tree
	 */
	void exitReturnArguments(TclV2Parser.ReturnArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TclV2Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TclV2Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#value_to_assign}.
	 * @param ctx the parse tree
	 */
	void enterValue_to_assign(TclV2Parser.Value_to_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#value_to_assign}.
	 * @param ctx the parse tree
	 */
	void exitValue_to_assign(TclV2Parser.Value_to_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(TclV2Parser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(TclV2Parser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#array_index}.
	 * @param ctx the parse tree
	 */
	void enterArray_index(TclV2Parser.Array_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#array_index}.
	 * @param ctx the parse tree
	 */
	void exitArray_index(TclV2Parser.Array_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#readInput}.
	 * @param ctx the parse tree
	 */
	void enterReadInput(TclV2Parser.ReadInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#readInput}.
	 * @param ctx the parse tree
	 */
	void exitReadInput(TclV2Parser.ReadInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#writeOutput}.
	 * @param ctx the parse tree
	 */
	void enterWriteOutput(TclV2Parser.WriteOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#writeOutput}.
	 * @param ctx the parse tree
	 */
	void exitWriteOutput(TclV2Parser.WriteOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#outputArgument}.
	 * @param ctx the parse tree
	 */
	void enterOutputArgument(TclV2Parser.OutputArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#outputArgument}.
	 * @param ctx the parse tree
	 */
	void exitOutputArgument(TclV2Parser.OutputArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#subRoutineArgumentListCall}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineArgumentListCall(TclV2Parser.SubRoutineArgumentListCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#subRoutineArgumentListCall}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineArgumentListCall(TclV2Parser.SubRoutineArgumentListCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#subRoutineArgumentCall}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineArgumentCall(TclV2Parser.SubRoutineArgumentCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#subRoutineArgumentCall}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineArgumentCall(TclV2Parser.SubRoutineArgumentCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#subRoutineArgumentFormat}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineArgumentFormat(TclV2Parser.SubRoutineArgumentFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#subRoutineArgumentFormat}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineArgumentFormat(TclV2Parser.SubRoutineArgumentFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#arrayCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterArrayCallArguments(TclV2Parser.ArrayCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#arrayCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitArrayCallArguments(TclV2Parser.ArrayCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#execution}.
	 * @param ctx the parse tree
	 */
	void enterExecution(TclV2Parser.ExecutionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#execution}.
	 * @param ctx the parse tree
	 */
	void exitExecution(TclV2Parser.ExecutionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#executionBody}.
	 * @param ctx the parse tree
	 */
	void enterExecutionBody(TclV2Parser.ExecutionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#executionBody}.
	 * @param ctx the parse tree
	 */
	void exitExecutionBody(TclV2Parser.ExecutionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(TclV2Parser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(TclV2Parser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseifBlock(TclV2Parser.ElseifBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#elseifBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseifBlock(TclV2Parser.ElseifBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#elseif}.
	 * @param ctx the parse tree
	 */
	void enterElseif(TclV2Parser.ElseifContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#elseif}.
	 * @param ctx the parse tree
	 */
	void exitElseif(TclV2Parser.ElseifContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(TclV2Parser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(TclV2Parser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#elseSubBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseSubBlock(TclV2Parser.ElseSubBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#elseSubBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseSubBlock(TclV2Parser.ElseSubBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(TclV2Parser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(TclV2Parser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#incrArgument}.
	 * @param ctx the parse tree
	 */
	void enterIncrArgument(TclV2Parser.IncrArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#incrArgument}.
	 * @param ctx the parse tree
	 */
	void exitIncrArgument(TclV2Parser.IncrArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(TclV2Parser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(TclV2Parser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#instructionBlockCycle}.
	 * @param ctx the parse tree
	 */
	void enterInstructionBlockCycle(TclV2Parser.InstructionBlockCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#instructionBlockCycle}.
	 * @param ctx the parse tree
	 */
	void exitInstructionBlockCycle(TclV2Parser.InstructionBlockCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#cycleInstruction}.
	 * @param ctx the parse tree
	 */
	void enterCycleInstruction(TclV2Parser.CycleInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#cycleInstruction}.
	 * @param ctx the parse tree
	 */
	void exitCycleInstruction(TclV2Parser.CycleInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(TclV2Parser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(TclV2Parser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(TclV2Parser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(TclV2Parser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#caseSubBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseSubBlock(TclV2Parser.CaseSubBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#caseSubBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseSubBlock(TclV2Parser.CaseSubBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBlock(TclV2Parser.DefaultBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBlock(TclV2Parser.DefaultBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#defaultSubBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultSubBlock(TclV2Parser.DefaultSubBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#defaultSubBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultSubBlock(TclV2Parser.DefaultSubBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV2Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(TclV2Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV2Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(TclV2Parser.ValueContext ctx);
}