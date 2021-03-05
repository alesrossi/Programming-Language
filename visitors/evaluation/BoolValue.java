package project.visitors.evaluation;

public class BoolValue extends PrimValue<Boolean> {

	public BoolValue(Boolean value) {
		super(value);
	}

	@Override
	public final boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BoolValue))
			return false;
		return value.equals(((BoolValue) obj).value);
	}

	@Override
	public boolean toBool() {
		return value;
	}
	
	@Override
	public boolean compare(Value exp) {
		return exp.toBool() && this.value == false;
	}
}
