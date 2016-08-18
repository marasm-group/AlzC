// Generated from /Users/vhq473/marasm/AlzC/src/main/antlr/Alzheimer.g4 by ANTLR 4.5.3
package com.marasm.alzc;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlzheimerParser}.
 */
public interface AlzheimerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(AlzheimerParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(AlzheimerParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(AlzheimerParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(AlzheimerParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(AlzheimerParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(AlzheimerParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(AlzheimerParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(AlzheimerParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void enterFuncDecl(AlzheimerParser.FuncDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#funcDecl}.
	 * @param ctx the parse tree
	 */
	void exitFuncDecl(AlzheimerParser.FuncDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(AlzheimerParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(AlzheimerParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(AlzheimerParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(AlzheimerParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(AlzheimerParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(AlzheimerParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(AlzheimerParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(AlzheimerParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(AlzheimerParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(AlzheimerParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(AlzheimerParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(AlzheimerParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(AlzheimerParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(AlzheimerParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(AlzheimerParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(AlzheimerParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(AlzheimerParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(AlzheimerParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(AlzheimerParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(AlzheimerParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlzheimerParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(AlzheimerParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlzheimerParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(AlzheimerParser.StatementContext ctx);
}