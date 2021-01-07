package defpackage;

import com.google.common.base.Optional;

/* renamed from: jvd  reason: default package */
public class jvd<T> {
    private final T a;
    private Optional<T> b = Optional.absent();

    private jvd(T t) {
        this.a = t;
    }

    public static <T> jvd<T> b(T t) {
        return new jvd<>(t);
    }

    public T a() {
        return this.b.isPresent() ? this.b.get() : this.a;
    }
}
