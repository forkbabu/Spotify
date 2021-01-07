package defpackage;

import com.google.gson.internal.C$Gson$Types;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* renamed from: z20  reason: default package */
public class z20<T> {
    final Class<? super T> a;
    final Type b;
    final int c;

    protected z20() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            Type a2 = C$Gson$Types.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
            this.b = a2;
            this.a = (Class<? super T>) C$Gson$Types.g(a2);
            this.c = a2.hashCode();
            return;
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public static <T> z20<T> a(Class<T> cls) {
        return new z20<>(cls);
    }

    public static z20<?> b(Type type) {
        return new z20<>(type);
    }

    public final Class<? super T> c() {
        return this.a;
    }

    public final Type d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof z20) && C$Gson$Types.c(this.b, ((z20) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return C$Gson$Types.k(this.b);
    }

    z20(Type type) {
        type.getClass();
        Type a2 = C$Gson$Types.a(type);
        this.b = a2;
        this.a = (Class<? super T>) C$Gson$Types.g(a2);
        this.c = a2.hashCode();
    }
}
