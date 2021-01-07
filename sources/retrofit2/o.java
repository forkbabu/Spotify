package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import okhttp3.e0;
import retrofit2.j;

final class o extends j.a {
    static final j.a a = new o();

    static final class a<T> implements j<e0, Optional<T>> {
        final j<e0, T> a;

        a(j<e0, T> jVar) {
            this.a = jVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // retrofit2.j
        public Object convert(e0 e0Var) {
            return Optional.ofNullable(this.a.convert(e0Var));
        }
    }

    o() {
    }

    @Override // retrofit2.j.a
    public j<e0, ?> b(Type type, Annotation[] annotationArr, w wVar) {
        if (a0.g(type) != Optional.class) {
            return null;
        }
        return new a(wVar.h(a0.f(0, (ParameterizedType) type), annotationArr));
    }
}
