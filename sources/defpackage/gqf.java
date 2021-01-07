package defpackage;

import com.google.protobuf.k;
import com.google.protobuf.u;
import com.google.protobuf.x;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import okhttp3.c0;
import okhttp3.e0;
import retrofit2.j;
import retrofit2.w;

/* renamed from: gqf  reason: default package */
public final class gqf extends j.a {
    private gqf(k kVar) {
    }

    public static gqf c() {
        return new gqf(null);
    }

    @Override // retrofit2.j.a
    public j<?, c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        if ((type instanceof Class) && u.class.isAssignableFrom((Class) type)) {
            return new hqf();
        }
        return null;
    }

    @Override // retrofit2.j.a
    public j<e0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        x xVar;
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!u.class.isAssignableFrom(cls)) {
            return null;
        }
        try {
            xVar = (x) cls.getDeclaredMethod("parser", new Class[0]).invoke(null, new Object[0]);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e.getCause());
        } catch (IllegalAccessException | NoSuchMethodException unused) {
            try {
                xVar = (x) cls.getDeclaredField("PARSER").get(null);
            } catch (IllegalAccessException | NoSuchFieldException unused2) {
                throw new IllegalArgumentException(je.l0(cls, je.V0("Found a protobuf message but "), " had no parser() method or PARSER field."));
            }
        }
        return new iqf(xVar, null);
    }
}
