package defpackage;

import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import java.lang.Enum;
import java.util.Locale;
import java.util.Map;

/* renamed from: kg0  reason: default package */
public final class kg0<T extends Enum<T>> {
    private final Class<T> a;
    private final Map<String, T> b;
    private final boolean c;

    private kg0(Class<T> cls, sg0<? super T, String> sg0, boolean z) {
        cls.getClass();
        this.a = cls;
        T[] enumConstants = cls.getEnumConstants();
        this.b = Collections2.newHashMapWithExpectedSize(enumConstants.length);
        for (T t : enumConstants) {
            this.b.put(sg0.apply(t).toUpperCase(Locale.US), t);
        }
        this.c = z;
    }

    public static <T extends Enum<T>> kg0<T> a(Class<T> cls) {
        return new kg0<>(cls, jg0.a, false);
    }

    public static <T extends Enum<T>> kg0<T> b(Class<T> cls, sg0<? super T, String> sg0) {
        return new kg0<>(cls, sg0, false);
    }

    private T d(String str) {
        if (this.c) {
            str = str.replace('-', '_');
        }
        Map<String, T> map = this.b;
        str.getClass();
        return map.get(str.toUpperCase(Locale.US));
    }

    public Optional<T> c(String str) {
        return str != null ? f(str) : Optional.absent();
    }

    public Class<T> e() {
        return this.a;
    }

    public Optional<T> f(String str) {
        T d = d(str);
        return d != null ? Optional.of(d) : Optional.absent();
    }

    public T g(String str) {
        T d = d(str);
        if (d != null) {
            return d;
        }
        throw new EnumConstantNotPresentException(this.a, str);
    }
}
