package retrofit2.adapter.rxjava2;

import io.reactivex.a;
import io.reactivex.l;
import io.reactivex.s;
import io.reactivex.y;
import io.reactivex.z;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.c;
import retrofit2.v;
import retrofit2.w;

public final class g extends c.a {
    private final boolean a;

    private g(y yVar, boolean z) {
        this.a = z;
    }

    public static g d() {
        return new g(null, false);
    }

    public static g e() {
        return new g(null, true);
    }

    @Override // retrofit2.c.a
    public c<?, ?> a(Type type, Annotation[] annotationArr, w wVar) {
        boolean z;
        boolean z2;
        Type type2;
        Type type3;
        Class<?> c = c.a.c(type);
        if (c == a.class) {
            return new f(Void.class, null, this.a, false, true, false, false, false, true);
        }
        boolean z3 = true;
        boolean z4 = c == io.reactivex.g.class;
        boolean z5 = c == z.class;
        boolean z6 = c == l.class;
        if (c != s.class && !z4 && !z5 && !z6) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            String str = !z4 ? !z5 ? z6 ? "Maybe" : "Observable" : "Single" : "Flowable";
            throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
        }
        Type b = c.a.b(0, (ParameterizedType) type);
        Class<?> c2 = c.a.c(b);
        if (c2 == v.class) {
            if (b instanceof ParameterizedType) {
                type3 = c.a.b(0, (ParameterizedType) b);
                z3 = false;
            } else {
                throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            }
        } else if (c2 != d.class) {
            type2 = b;
            z2 = false;
            z = true;
            return new f(type2, null, this.a, z2, z, z4, z5, z6, false);
        } else if (b instanceof ParameterizedType) {
            type3 = c.a.b(0, (ParameterizedType) b);
        } else {
            throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
        }
        type2 = type3;
        z2 = z3;
        z = false;
        return new f(type2, null, this.a, z2, z, z4, z5, z6, false);
    }
}
