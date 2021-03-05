package project.visitors.evaluation;

import project.parser.ast.Season;

public interface Value {
	/* default conversion methods */
	default int toInt() {
		throw new EvaluatorException("Expecting an integer");
	}

	default boolean toBool() {
		throw new EvaluatorException("Expecting a boolean");
	}

	default PairValue toProd() {
		throw new EvaluatorException("Expecting a pair");
	}
	
	default Season toSeason() {
		throw new EvaluatorException("Expecting a season");
	}
	
	default Season intToSeason() {
		throw new EvaluatorException("Expecting an integer");
	}
	
	//new method added to compare for Lth, returns true when exp > Value
	default boolean compare(Value exp) {
		throw new EvaluatorException("Expecting same type");
	}
}
