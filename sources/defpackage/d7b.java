package defpackage;

import com.google.common.base.Optional;

/* renamed from: d7b  reason: default package */
public abstract class d7b<T> {
    public static <T> d7b<T> a() {
        return new x6b("", null, Optional.absent(), Optional.absent());
    }

    public static <T> d7b<T> c(String str, T t) {
        return new x6b(str, null, Optional.of(t), Optional.absent());
    }

    public static <T> d7b<T> d(String str, T t, String str2) {
        return new x6b(str, str2, Optional.of(t), Optional.absent());
    }

    public static <T> d7b<T> e(String str, Throwable th) {
        return new x6b(str, null, Optional.absent(), Optional.of(th));
    }

    public static <T> d7b<T> f(String str, Throwable th, String str2) {
        return new x6b(str, str2, Optional.absent(), Optional.of(th));
    }

    public abstract Optional<Throwable> b();

    public abstract String g();

    public abstract String h();

    public abstract Optional<T> i();
}
