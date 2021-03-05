package project.parser.ast;

import project.visitors.Visitor;
public class Lth extends BinaryOp {
    public Lth(Exp left, Exp right) {
        super(left, right);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitLth(left, right);
    }
}

