// Generated from /home/larra/pl/TCL-parser/Grammar/TclV3.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TclV3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TclV3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#tcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTcl(TclV3Parser.TclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#instructionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstructionBlock(TclV3Parser.InstructionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutine(TclV3Parser.SubRoutineContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutineInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineInstruction(TclV3Parser.SubRoutineInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutineIfBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineIfBlock(TclV3Parser.SubRoutineIfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutineWhileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineWhileBlock(TclV3Parser.SubRoutineWhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutineForBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineForBlock(TclV3Parser.SubRoutineForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutineCycleInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineCycleInstruction(TclV3Parser.SubRoutineCycleInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutineSwitchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineSwitchBlock(TclV3Parser.SubRoutineSwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutineCaseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineCaseBlock(TclV3Parser.SubRoutineCaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutineDefaultBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineDefaultBlock(TclV3Parser.SubRoutineDefaultBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#returnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlock(TclV3Parser.ReturnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#returnArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnArgument(TclV3Parser.ReturnArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(TclV3Parser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(TclV3Parser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#array_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_index(TclV3Parser.Array_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#value_to_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_to_assign(TclV3Parser.Value_to_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#execute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute(TclV3Parser.ExecuteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#executeBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteBody(TclV3Parser.ExecuteBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subroutineArgumentListCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubroutineArgumentListCall(TclV3Parser.SubroutineArgumentListCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutineArgumentCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineArgumentCall(TclV3Parser.SubRoutineArgumentCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#subRoutineArgumentFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubRoutineArgumentFormat(TclV3Parser.SubRoutineArgumentFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#arrayCallArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCallArguments(TclV3Parser.ArrayCallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#readInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadInput(TclV3Parser.ReadInputContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#writeOutput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteOutput(TclV3Parser.WriteOutputContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#outputArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputArgument(TclV3Parser.OutputArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(TclV3Parser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(TclV3Parser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(TclV3Parser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#forSetArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForSetArgument(TclV3Parser.ForSetArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#cycleInstruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCycleInstruction(TclV3Parser.CycleInstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#switchBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlock(TclV3Parser.SwitchBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#caseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseBlock(TclV3Parser.CaseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#defaultBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultBlock(TclV3Parser.DefaultBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TclV3Parser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#callID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallID(TclV3Parser.CallIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TclV3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TclV3Parser.ExpressionContext ctx);
}