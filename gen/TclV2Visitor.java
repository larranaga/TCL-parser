// Generated from F:/u/decimo/monitoria/TCL-parser/Grammar\TclV2.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TclV2Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TclV2Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#tcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTcl(TclV2Parser.TclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#instructionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionBlock(TclV2Parser.InstructionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(TclV2Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TclV2Parser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#binary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_expression(TclV2Parser.Binary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#unary_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_expression(TclV2Parser.Unary_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(TclV2Parser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(TclV2Parser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#single_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingle_id(TclV2Parser.Single_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#subRoutineBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineBlock(TclV2Parser.SubRoutineBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#subRoutineDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineDeclaration(TclV2Parser.SubRoutineDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#subRoutineArgumentListDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineArgumentListDeclaration(TclV2Parser.SubRoutineArgumentListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#subRoutineArgumentDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineArgumentDeclaration(TclV2Parser.SubRoutineArgumentDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#instructionBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionBlockSubroutine(TclV2Parser.InstructionBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#subRoutineInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineInstruction(TclV2Parser.SubRoutineInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(TclV2Parser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#returnArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnArguments(TclV2Parser.ReturnArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#ifBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlockSubroutine(TclV2Parser.IfBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#elseifBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifBlockSubroutine(TclV2Parser.ElseifBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#elseifSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifSubroutine(TclV2Parser.ElseifSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#elseBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlockSubroutine(TclV2Parser.ElseBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#elseSubBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseSubBlockSubroutine(TclV2Parser.ElseSubBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#forBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlockSubroutine(TclV2Parser.ForBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#forSetArgumentSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForSetArgumentSubroutine(TclV2Parser.ForSetArgumentSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#incrArgumentSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrArgumentSubroutine(TclV2Parser.IncrArgumentSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#whileBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlockSubroutine(TclV2Parser.WhileBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#instructionBlockSubroutineCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionBlockSubroutineCycle(TclV2Parser.InstructionBlockSubroutineCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#cycleInstructionSubRoutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycleInstructionSubRoutine(TclV2Parser.CycleInstructionSubRoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#switchBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockSubroutine(TclV2Parser.SwitchBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#caseBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlockSubroutine(TclV2Parser.CaseBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#caseSubBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseSubBlockSubroutine(TclV2Parser.CaseSubBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#defaultBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBlockSubroutine(TclV2Parser.DefaultBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#defaultSubBlockSubroutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultSubBlockSubroutine(TclV2Parser.DefaultSubBlockSubroutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TclV2Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#value_to_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_to_assign(TclV2Parser.Value_to_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(TclV2Parser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#array_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_index(TclV2Parser.Array_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#readInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInput(TclV2Parser.ReadInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#writeOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteOutput(TclV2Parser.WriteOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#outputArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputArgument(TclV2Parser.OutputArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#subRoutineArgumentListCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineArgumentListCall(TclV2Parser.SubRoutineArgumentListCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#subRoutineArgumentCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineArgumentCall(TclV2Parser.SubRoutineArgumentCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#subRoutineArgumentFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineArgumentFormat(TclV2Parser.SubRoutineArgumentFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#arrayCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCallArguments(TclV2Parser.ArrayCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#execution}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecution(TclV2Parser.ExecutionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#executionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecutionBody(TclV2Parser.ExecutionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(TclV2Parser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#elseifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifBlock(TclV2Parser.ElseifBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#elseif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseif(TclV2Parser.ElseifContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(TclV2Parser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#elseSubBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseSubBlock(TclV2Parser.ElseSubBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(TclV2Parser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#forSetArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForSetArgument(TclV2Parser.ForSetArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#incrArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrArgument(TclV2Parser.IncrArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(TclV2Parser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#instructionBlockCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionBlockCycle(TclV2Parser.InstructionBlockCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#cycleInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycleInstruction(TclV2Parser.CycleInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(TclV2Parser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(TclV2Parser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#caseSubBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseSubBlock(TclV2Parser.CaseSubBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#defaultBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBlock(TclV2Parser.DefaultBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#defaultSubBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultSubBlock(TclV2Parser.DefaultSubBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(TclV2Parser.ValueContext ctx);
}