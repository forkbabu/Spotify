package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.c0;
import okhttp3.e0;
import retrofit2.j;
import retrofit2.w;

/* renamed from: tqf  reason: default package */
public final class tqf extends j.a {
    private tqf() {
    }

    public static tqf c() {
        return new tqf();
    }

    @Override // retrofit2.j.a
    public j<?, c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
        if (type == String.class || type == Boolean.TYPE || type == Boolean.class || type == Byte.TYPE || type == Byte.class || type == Character.TYPE || type == Character.class || type == Double.TYPE || type == Double.class || type == Float.TYPE || type == Float.class || type == Integer.TYPE || type == Integer.class || type == Long.TYPE || type == Long.class || type == Short.TYPE || type == Short.class) {
            return jqf.a;
        }
        return null;
    }

    @Override // retrofit2.j.a
    public j<e0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        if (type == String.class) {
            return sqf.a;
        }
        if (type == Boolean.class || type == Boolean.TYPE) {
            return kqf.a;
        }
        if (type == Byte.class || type == Byte.TYPE) {
            return lqf.a;
        }
        if (type == Character.class || type == Character.TYPE) {
            return mqf.a;
        }
        if (type == Double.class || type == Double.TYPE) {
            return nqf.a;
        }
        if (type == Float.class || type == Float.TYPE) {
            return oqf.a;
        }
        if (type == Integer.class || type == Integer.TYPE) {
            return pqf.a;
        }
        if (type == Long.class || type == Long.TYPE) {
            return qqf.a;
        }
        if (type == Short.class || type == Short.TYPE) {
            return rqf.a;
        }
        return null;
    }
}
