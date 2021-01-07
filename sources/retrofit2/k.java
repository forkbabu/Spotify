package retrofit2;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import okhttp3.a0;
import retrofit2.c;

/* access modifiers changed from: package-private */
public final class k extends c.a {
    private final Executor a;

    class a implements c<Object, b<?>> {
        final /* synthetic */ Type a;
        final /* synthetic */ Executor b;

        a(k kVar, Type type, Executor executor) {
            this.a = type;
            this.b = executor;
        }

        @Override // retrofit2.c
        public Type a() {
            return this.a;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [retrofit2.b] */
        @Override // retrofit2.c
        public b<?> b(b<Object> bVar) {
            Executor executor = this.b;
            return executor == null ? bVar : new b(executor, bVar);
        }
    }

    static final class b<T> implements b<T> {
        final Executor a;
        final b<T> b;

        class a implements d<T> {
            final /* synthetic */ d a;

            /* renamed from: retrofit2.k$b$a$a  reason: collision with other inner class name */
            class RunnableC0675a implements Runnable {
                final /* synthetic */ v a;

                RunnableC0675a(v vVar) {
                    this.a = vVar;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.b.l()) {
                        a aVar = a.this;
                        aVar.a.a(b.this, new IOException("Canceled"));
                        return;
                    }
                    a aVar2 = a.this;
                    aVar2.a.b(b.this, this.a);
                }
            }

            /* renamed from: retrofit2.k$b$a$b  reason: collision with other inner class name */
            class RunnableC0676b implements Runnable {
                final /* synthetic */ Throwable a;

                RunnableC0676b(Throwable th) {
                    this.a = th;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    aVar.a.a(b.this, this.a);
                }
            }

            a(d dVar) {
                this.a = dVar;
            }

            @Override // retrofit2.d
            public void a(b<T> bVar, Throwable th) {
                b.this.a.execute(new RunnableC0676b(th));
            }

            @Override // retrofit2.d
            public void b(b<T> bVar, v<T> vVar) {
                b.this.a.execute(new RunnableC0675a(vVar));
            }
        }

        b(Executor executor, b<T> bVar) {
            this.a = executor;
            this.b = bVar;
        }

        @Override // retrofit2.b
        /* renamed from: G1 */
        public b<T> clone() {
            return new b(this.a, this.b.G1());
        }

        @Override // retrofit2.b
        public void cancel() {
            this.b.cancel();
        }

        @Override // retrofit2.b
        public void d0(d<T> dVar) {
            this.b.d0(new a(dVar));
        }

        @Override // retrofit2.b
        public v<T> h() {
            return this.b.h();
        }

        @Override // retrofit2.b
        public a0 i() {
            return this.b.i();
        }

        @Override // retrofit2.b
        public boolean l() {
            return this.b.l();
        }
    }

    k(Executor executor) {
        this.a = executor;
    }

    @Override // retrofit2.c.a
    public c<?, ?> a(Type type, Annotation[] annotationArr, w wVar) {
        Executor executor = null;
        if (a0.g(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type f = a0.f(0, (ParameterizedType) type);
            if (!a0.j(annotationArr, y.class)) {
                executor = this.a;
            }
            return new a(this, f, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
