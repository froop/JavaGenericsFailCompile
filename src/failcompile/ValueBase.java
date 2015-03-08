package failcompile;

public class ValueBase<T extends Comparable<T>> implements Value<T> {

	@Override
	public int compareTo(Value<T> o) {
		return 0;
	}
}
