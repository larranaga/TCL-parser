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
	 * Visit a parse tree produced by {@link TclV2Parser#subRutineArgumentListCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRutineArgumentListCall(TclV2Parser.SubRutineArgumentListCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV2Parser#subRutineArgumentCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRutineArgumentCall(TclV2Parser.SubRutineArgumentCallContext ctx);
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