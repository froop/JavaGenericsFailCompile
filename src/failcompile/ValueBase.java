package failcompile;

import java.io.Serializable;

public class ValueBase<T extends Comparable<T> & Serializable> implements Value<T> {
	private static final long serialVersionUID = 1L;

	@Override
	public int compareTo(Value<T> o) {
		return 0;
	}
}
