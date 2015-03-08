package failcompile;

import java.io.Serializable;

public class ComparableList<E extends Comparable<E> & Serializable> implements Comparable<ComparableList<E>>, Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public int compareTo(ComparableList<E> o) {
		return 0;
	}
}
