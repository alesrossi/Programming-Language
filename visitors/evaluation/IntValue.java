package project.visitors.evaluation;

import project.parser.ast.Season;
import javax.swing.*;

public class IntValue extends PrimValue<Integer> {

	public IntValue(Integer value) {
		super(value);
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof IntValue))
			return false;
		return value.equals(((IntValue) obj).value);
	}

	@Override
	public int toInt() {
		return value;
	}
	
	@Override
	public Season intToSeason() {
		if (value >= 0 && value < Season.values().length)
			return Season.values()[value];
		else throw new EvaluatorException("java.lang.ArrayIndexOutOfBoundsException: Index " + value + " out of bounds for length " + Season.values().length);
	}
	
	@Override
	public boolean compare(Value exp) {
		return this.value < exp.toInt();
	}
}
