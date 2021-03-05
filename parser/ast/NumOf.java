package project.parser.ast;

import project.visitors.Visitor;

public class NumOf extends  UnaryOp {

    public NumOf(Exp exp) {
        super(exp);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitNumOf(exp); 
    }
}

