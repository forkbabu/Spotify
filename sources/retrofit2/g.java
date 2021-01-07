package retrofit2;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import retrofit2.c;

final class g extends c.a {
    static final c.a a = new g();

    /* access modifiers changed from: private */
    public static final class a<R> implements c<R, CompletableFuture<R>> {
        private final Type a;

        a(Type type) {
            this.a = type;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.a;
        }

        @Override // retrofit2.c
        public Object b(b bVar) {
            e eVar = new e(this, bVar);
            bVar.d0(new f(this, eVar));
            return eVar;
        }
    }

    /* access modifiers changed from: private */
    public static final class b<R> implements c<R, CompletableFuture<v<R>>> {
        private final Type a;

        b(Type type) {
            this.a = type;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.a;
        }

        @Override // retrofit2.c
        public Object b(b bVar) {
            h hVar = new h(this, bVar);
            bVar.d0(new i(this, hVar));
            return hVar;
        }
    }

    g() {
    }

    @Override // retrofit2.c.a
    public c<?, ?> a(Type type, Annotation[] annotationArr, w wVar) {
        if (a0.g(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type f = a0.f(0, (ParameterizedType) type);
            if (a0.g(f) != v.class) {
                return new a(f);
            }
            if (f instanceof ParameterizedType) {
                return new b(a0.f(0, (ParameterizedType) f));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
