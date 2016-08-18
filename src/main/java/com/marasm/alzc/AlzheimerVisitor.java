// Generated from /Users/vhq473/marasm/AlzC/src/main/antlr/Alzheimer.g4 by ANTLR 4.5.3
package com.marasm.alzc;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlzheimerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlzheimerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AlzheimerParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(AlzheimerParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(AlzheimerParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(AlzheimerParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#funcDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDecl(AlzheimerParser.FuncDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(AlzheimerParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(AlzheimerParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(AlzheimerParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(AlzheimerParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(AlzheimerParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(AlzheimerParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(AlzheimerParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(AlzheimerParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AlzheimerParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(AlzheimerParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlzheimerParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AlzheimerParser.StatementContext ctx);
}