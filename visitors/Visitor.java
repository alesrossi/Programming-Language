package project.visitors;

import project.parser.ast.Block;
import project.parser.ast.Exp;
import project.parser.ast.Stmt;
import project.parser.ast.StmtSeq;
import project.parser.ast.VarIdent;
import project.parser.ast.Season;

public interface Visitor<T> {
	T visitAdd(Exp left, Exp right);

	T visitAssignStmt(VarIdent ident, Exp exp);

	T visitIntLiteral(int value);

	T visitEq(Exp left, Exp right);
	
	T visitLth(Exp left, Exp right);

	T visitMoreStmt(Stmt first, StmtSeq rest);

	T visitMul(Exp left, Exp right);

	T visitPrintStmt(Exp exp);

	T visitProg(StmtSeq stmtSeq);

	T visitSign(Exp exp);

	T visitVarIdent(VarIdent id); // the only corner case ...

	T visitSingleStmt(Stmt stmt);

	T visitVarStmt(VarIdent ident, Exp exp);

	T visitNot(Exp exp);

	T visitAnd(Exp left, Exp right);

	T visitBoolLiteral(boolean value);

	T visitIfStmt(Exp exp, Block thenBlock, Block elseBlock);
	
	T visitForStmt(VarIdent ident, Exp exp, Block Block);

	T visitBlock(StmtSeq stmtSeq);

	T visitPairLit(Exp left, Exp right);

	T visitFst(Exp exp);

	T visitSnd(Exp exp);
	
	T visitSeasonLiteral(Season season);
	
	T visitSeasonOf(Exp exp);
	
	T visitNumOf(Exp exp);
}
