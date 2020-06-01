// Generated from /home/nikhil/super/cvm/asm/CVMasm.g4 by ANTLR 4.7
package io.cvm.asm.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CVMasmParser}.
 */
public interface CVMasmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#add_cmd}.
	 * @param ctx the parse tree
	 */
	void enterAdd_cmd(CVMasmParser.Add_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#add_cmd}.
	 * @param ctx the parse tree
	 */
	void exitAdd_cmd(CVMasmParser.Add_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#sub_cmd}.
	 * @param ctx the parse tree
	 */
	void enterSub_cmd(CVMasmParser.Sub_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#sub_cmd}.
	 * @param ctx the parse tree
	 */
	void exitSub_cmd(CVMasmParser.Sub_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#mul_cmd}.
	 * @param ctx the parse tree
	 */
	void enterMul_cmd(CVMasmParser.Mul_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#mul_cmd}.
	 * @param ctx the parse tree
	 */
	void exitMul_cmd(CVMasmParser.Mul_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#div_cmd}.
	 * @param ctx the parse tree
	 */
	void enterDiv_cmd(CVMasmParser.Div_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#div_cmd}.
	 * @param ctx the parse tree
	 */
	void exitDiv_cmd(CVMasmParser.Div_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#addv_cmd}.
	 * @param ctx the parse tree
	 */
	void enterAddv_cmd(CVMasmParser.Addv_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#addv_cmd}.
	 * @param ctx the parse tree
	 */
	void exitAddv_cmd(CVMasmParser.Addv_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#subv_cmd}.
	 * @param ctx the parse tree
	 */
	void enterSubv_cmd(CVMasmParser.Subv_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#subv_cmd}.
	 * @param ctx the parse tree
	 */
	void exitSubv_cmd(CVMasmParser.Subv_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#mulv_cmd}.
	 * @param ctx the parse tree
	 */
	void enterMulv_cmd(CVMasmParser.Mulv_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#mulv_cmd}.
	 * @param ctx the parse tree
	 */
	void exitMulv_cmd(CVMasmParser.Mulv_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#divv_cmd}.
	 * @param ctx the parse tree
	 */
	void enterDivv_cmd(CVMasmParser.Divv_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#divv_cmd}.
	 * @param ctx the parse tree
	 */
	void exitDivv_cmd(CVMasmParser.Divv_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#set_cmd}.
	 * @param ctx the parse tree
	 */
	void enterSet_cmd(CVMasmParser.Set_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#set_cmd}.
	 * @param ctx the parse tree
	 */
	void exitSet_cmd(CVMasmParser.Set_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#setl_cmd}.
	 * @param ctx the parse tree
	 */
	void enterSetl_cmd(CVMasmParser.Setl_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#setl_cmd}.
	 * @param ctx the parse tree
	 */
	void exitSetl_cmd(CVMasmParser.Setl_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#otype}.
	 * @param ctx the parse tree
	 */
	void enterOtype(CVMasmParser.OtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#otype}.
	 * @param ctx the parse tree
	 */
	void exitOtype(CVMasmParser.OtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#out_cmd}.
	 * @param ctx the parse tree
	 */
	void enterOut_cmd(CVMasmParser.Out_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#out_cmd}.
	 * @param ctx the parse tree
	 */
	void exitOut_cmd(CVMasmParser.Out_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#outl_cmd}.
	 * @param ctx the parse tree
	 */
	void enterOutl_cmd(CVMasmParser.Outl_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#outl_cmd}.
	 * @param ctx the parse tree
	 */
	void exitOutl_cmd(CVMasmParser.Outl_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#mov_cmd}.
	 * @param ctx the parse tree
	 */
	void enterMov_cmd(CVMasmParser.Mov_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#mov_cmd}.
	 * @param ctx the parse tree
	 */
	void exitMov_cmd(CVMasmParser.Mov_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#movl_cmd}.
	 * @param ctx the parse tree
	 */
	void enterMovl_cmd(CVMasmParser.Movl_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#movl_cmd}.
	 * @param ctx the parse tree
	 */
	void exitMovl_cmd(CVMasmParser.Movl_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#cpy_cmd}.
	 * @param ctx the parse tree
	 */
	void enterCpy_cmd(CVMasmParser.Cpy_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#cpy_cmd}.
	 * @param ctx the parse tree
	 */
	void exitCpy_cmd(CVMasmParser.Cpy_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#cpyl_cmd}.
	 * @param ctx the parse tree
	 */
	void enterCpyl_cmd(CVMasmParser.Cpyl_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#cpyl_cmd}.
	 * @param ctx the parse tree
	 */
	void exitCpyl_cmd(CVMasmParser.Cpyl_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#halt_cmd}.
	 * @param ctx the parse tree
	 */
	void enterHalt_cmd(CVMasmParser.Halt_cmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#halt_cmd}.
	 * @param ctx the parse tree
	 */
	void exitHalt_cmd(CVMasmParser.Halt_cmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(CVMasmParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(CVMasmParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#cmdlist}.
	 * @param ctx the parse tree
	 */
	void enterCmdlist(CVMasmParser.CmdlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#cmdlist}.
	 * @param ctx the parse tree
	 */
	void exitCmdlist(CVMasmParser.CmdlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CVMasmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CVMasmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CVMasmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CVMasmParser.ProgramContext ctx);
}