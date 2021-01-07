package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import okhttp3.d0;
import okhttp3.e;
import okhttp3.e0;
import retrofit2.a0;
import retrofit2.l;
import retrofit2.u;

/* access modifiers changed from: package-private */
public abstract class x<T> {
    x() {
    }

    static <T> x<T> b(w wVar, Method method) {
        Type type;
        boolean z;
        u b = new u.a(wVar, method).b();
        Type genericReturnType = method.getGenericReturnType();
        if (a0.i(genericReturnType)) {
            throw a0.k(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        } else if (genericReturnType != Void.TYPE) {
            boolean z2 = b.k;
            Annotation[] annotations = method.getAnnotations();
            if (z2) {
                Type[] genericParameterTypes = method.getGenericParameterTypes();
                Type type2 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                if (type2 instanceof WildcardType) {
                    type2 = ((WildcardType) type2).getLowerBounds()[0];
                }
                if (a0.g(type2) != v.class || !(type2 instanceof ParameterizedType)) {
                    z = false;
                } else {
                    type2 = a0.f(0, (ParameterizedType) type2);
                    z = true;
                }
                type = new a0.b(null, b.class, type2);
                annotations = z.a(annotations);
            } else {
                type = method.getGenericReturnType();
                z = false;
            }
            try {
                c<?, ?> b2 = wVar.b(type, annotations);
                Type a = b2.a();
                if (a == d0.class) {
                    throw a0.k(method, je.l0(a0.g(a), je.V0("'"), "' is not a valid response body type. Did you mean ResponseBody?"), new Object[0]);
                } else if (a == v.class) {
                    throw a0.k(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                } else if (!b.c.equals("HEAD") || Void.class.equals(a)) {
                    try {
                        j<e0, T> h = wVar.h(a, method.getAnnotations());
                        e.a aVar = wVar.b;
                        if (!z2) {
                            return new l.a(b, aVar, h, b2);
                        }
                        if (z) {
                            return new l.c(b, aVar, h, b2);
                        }
                        return new l.b(b, aVar, h, b2, false);
                    } catch (RuntimeException e) {
                        throw a0.l(method, e, "Unable to create converter for %s", a);
                    }
                } else {
                    throw a0.k(method, "HEAD method must use Void as response type.", new Object[0]);
                }
            } catch (RuntimeException e2) {
                throw a0.l(method, e2, "Unable to create call adapter for %s", type);
            }
        } else {
            throw a0.k(method, "Service methods cannot return void.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract T a(Object[] objArr);
}
