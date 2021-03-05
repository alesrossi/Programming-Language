package project.parser.ast;

import project.visitors.Visitor;

public class SeasonLiteral extends PrimLiteral<Season> {

    public SeasonLiteral(Season n) {
        super(n);
    }

    @Override
    public <T> T accept(Visitor<T> visitor) {
        return visitor.visitSeasonLiteral(value);
    }
}
