package project.visitors.evaluation;
import project.parser.ast.Season;
public class SeasonValue extends PrimValue<Season> {

    public SeasonValue(Season value) {
        super(value);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof SeasonValue))
            return false;
        return value.equals(((SeasonValue) obj).value);
    }
    
    @Override
    public Season toSeason() {
        return value;
    }

    @Override
    public boolean compare(Value exp) {
        return this.value.ordinal() < exp.toSeason().ordinal(); //Compared using ordinals Winter = 0, Spring = 1 etc.
    }

}
