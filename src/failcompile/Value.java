package failcompile;

import java.io.Serializable;

public interface Value<T extends Comparable<T> & Serializable> extends Comparable<Value<T>>, Serializable {
}
