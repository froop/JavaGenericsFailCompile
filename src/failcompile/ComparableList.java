package failcompile;

public class ComparableList<E extends Comparable<E>> implements Comparable<ComparableList<E>> {

	@Override
	public int compareTo(ComparableList<E> o) {
		return 0;
	}
}
