package kotlin;

import java.io.Serializable;

public final class InitializedLazyImpl<T> implements d<T>, Serializable {
    private final T value;

    public InitializedLazyImpl(T t) {
        this.value = t;
    }

    @Override // kotlin.d
    public T getValue() {
        return this.value;
    }

    @Override // java.lang.Object
    public String toString() {
        return String.valueOf(this.value);
    }
}
