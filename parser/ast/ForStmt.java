package project.parser.ast;

import project.visitors.Visitor;
import static java.util.Objects.requireNonNull;

public class ForStmt implements Stmt {
    private final VarIdent ident;
    private final Exp exp;
    private final Block Block;

    public ForStmt(VarIdent ident, Exp exp, Block Block) {
        this.ident = requireNonNull(ident);
        this.exp = requireNonNull(exp);
        this.Block = requireNonNull(Block);


    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + ident + "," + exp + "," + Block + ")";
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitForStmt(ident, exp, Block);
    }

}
