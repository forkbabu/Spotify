package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public interface c<R, T> {

    public static abstract class a {
        protected static Type b(int i, ParameterizedType parameterizedType) {
            return a0.f(i, parameterizedType);
        }

        protected static Class<?> c(Type type) {
            return a0.g(type);
        }

        public abstract c<?, ?> a(Type type, Annotation[] annotationArr, w wVar);
    }

    Type a();

    T b(b<R> bVar);
}
