// Generated from /home/larra/pl/TCL-parser/Grammar/TclV3.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TclV3Parser}.
 */
public interface TclV3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#tcl}.
	 * @param ctx the parse tree
	 */
	void enterTcl(TclV3Parser.TclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#tcl}.
	 * @param ctx the parse tree
	 */
	void exitTcl(TclV3Parser.TclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#instructionBlock}.
	 * @param ctx the parse tree
	 */
	void enterInstructionBlock(TclV3Parser.InstructionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#instructionBlock}.
	 * @param ctx the parse tree
	 */
	void exitInstructionBlock(TclV3Parser.InstructionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutine}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutine(TclV3Parser.SubRoutineContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutine}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutine(TclV3Parser.SubRoutineContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutineInstruction}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineInstruction(TclV3Parser.SubRoutineInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutineInstruction}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineInstruction(TclV3Parser.SubRoutineInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutineIfBlock}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineIfBlock(TclV3Parser.SubRoutineIfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutineIfBlock}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineIfBlock(TclV3Parser.SubRoutineIfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutineWhileBlock}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineWhileBlock(TclV3Parser.SubRoutineWhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutineWhileBlock}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineWhileBlock(TclV3Parser.SubRoutineWhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutineForBlock}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineForBlock(TclV3Parser.SubRoutineForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutineForBlock}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineForBlock(TclV3Parser.SubRoutineForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutineCycleInstruction}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineCycleInstruction(TclV3Parser.SubRoutineCycleInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutineCycleInstruction}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineCycleInstruction(TclV3Parser.SubRoutineCycleInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutineSwitchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineSwitchBlock(TclV3Parser.SubRoutineSwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutineSwitchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineSwitchBlock(TclV3Parser.SubRoutineSwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutineCaseBlock}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineCaseBlock(TclV3Parser.SubRoutineCaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutineCaseBlock}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineCaseBlock(TclV3Parser.SubRoutineCaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutineDefaultBlock}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineDefaultBlock(TclV3Parser.SubRoutineDefaultBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutineDefaultBlock}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineDefaultBlock(TclV3Parser.SubRoutineDefaultBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlock(TclV3Parser.ReturnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlock(TclV3Parser.ReturnBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#returnArgument}.
	 * @param ctx the parse tree
	 */
	void enterReturnArgument(TclV3Parser.ReturnArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#returnArgument}.
	 * @param ctx the parse tree
	 */
	void exitReturnArgument(TclV3Parser.ReturnArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(TclV3Parser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(TclV3Parser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(TclV3Parser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(TclV3Parser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#array_index}.
	 * @param ctx the parse tree
	 */
	void enterArray_index(TclV3Parser.Array_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#array_index}.
	 * @param ctx the parse tree
	 */
	void exitArray_index(TclV3Parser.Array_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#value_to_assign}.
	 * @param ctx the parse tree
	 */
	void enterValue_to_assign(TclV3Parser.Value_to_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#value_to_assign}.
	 * @param ctx the parse tree
	 */
	void exitValue_to_assign(TclV3Parser.Value_to_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#execute}.
	 * @param ctx the parse tree
	 */
	void enterExecute(TclV3Parser.ExecuteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#execute}.
	 * @param ctx the parse tree
	 */
	void exitExecute(TclV3Parser.ExecuteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#executeBody}.
	 * @param ctx the parse tree
	 */
	void enterExecuteBody(TclV3Parser.ExecuteBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#executeBody}.
	 * @param ctx the parse tree
	 */
	void exitExecuteBody(TclV3Parser.ExecuteBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subroutineArgumentListCall}.
	 * @param ctx the parse tree
	 */
	void enterSubroutineArgumentListCall(TclV3Parser.SubroutineArgumentListCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subroutineArgumentListCall}.
	 * @param ctx the parse tree
	 */
	void exitSubroutineArgumentListCall(TclV3Parser.SubroutineArgumentListCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutineArgumentCall}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineArgumentCall(TclV3Parser.SubRoutineArgumentCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutineArgumentCall}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineArgumentCall(TclV3Parser.SubRoutineArgumentCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#subRoutineArgumentFormat}.
	 * @param ctx the parse tree
	 */
	void enterSubRoutineArgumentFormat(TclV3Parser.SubRoutineArgumentFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#subRoutineArgumentFormat}.
	 * @param ctx the parse tree
	 */
	void exitSubRoutineArgumentFormat(TclV3Parser.SubRoutineArgumentFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#arrayCallArguments}.
	 * @param ctx the parse tree
	 */
	void enterArrayCallArguments(TclV3Parser.ArrayCallArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#arrayCallArguments}.
	 * @param ctx the parse tree
	 */
	void exitArrayCallArguments(TclV3Parser.ArrayCallArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#readInput}.
	 * @param ctx the parse tree
	 */
	void enterReadInput(TclV3Parser.ReadInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#readInput}.
	 * @param ctx the parse tree
	 */
	void exitReadInput(TclV3Parser.ReadInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#writeOutput}.
	 * @param ctx the parse tree
	 */
	void enterWriteOutput(TclV3Parser.WriteOutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#writeOutput}.
	 * @param ctx the parse tree
	 */
	void exitWriteOutput(TclV3Parser.WriteOutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#outputArgument}.
	 * @param ctx the parse tree
	 */
	void enterOutputArgument(TclV3Parser.OutputArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#outputArgument}.
	 * @param ctx the parse tree
	 */
	void exitOutputArgument(TclV3Parser.OutputArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(TclV3Parser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(TclV3Parser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(TclV3Parser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(TclV3Parser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(TclV3Parser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(TclV3Parser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#forSetArgument}.
	 * @param ctx the parse tree
	 */
	void enterForSetArgument(TclV3Parser.ForSetArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#forSetArgument}.
	 * @param ctx the parse tree
	 */
	void exitForSetArgument(TclV3Parser.ForSetArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#cycleInstruction}.
	 * @param ctx the parse tree
	 */
	void enterCycleInstruction(TclV3Parser.CycleInstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#cycleInstruction}.
	 * @param ctx the parse tree
	 */
	void exitCycleInstruction(TclV3Parser.CycleInstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlock(TclV3Parser.SwitchBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#switchBlock}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlock(TclV3Parser.SwitchBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(TclV3Parser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(TclV3Parser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void enterDefaultBlock(TclV3Parser.DefaultBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#defaultBlock}.
	 * @param ctx the parse tree
	 */
	void exitDefaultBlock(TclV3Parser.DefaultBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TclV3Parser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TclV3Parser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#callID}.
	 * @param ctx the parse tree
	 */
	void enterCallID(TclV3Parser.CallIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#callID}.
	 * @param ctx the parse tree
	 */
	void exitCallID(TclV3Parser.CallIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TclV3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TclV3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TclV3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TclV3Parser.ExpressionContext ctx);
}