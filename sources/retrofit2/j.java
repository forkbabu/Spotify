package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import okhttp3.c0;
import okhttp3.e0;

public interface j<F, T> {

    public static abstract class a {
        public j<?, c0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, w wVar) {
            return null;
        }

        public j<e0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
            return null;
        }
    }

    T convert(F f);
}
