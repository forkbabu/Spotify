package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.h;
import io.reactivex.functions.l;
import io.reactivex.g;
import io.reactivex.k;
import java.util.concurrent.Callable;

/* renamed from: c3b  reason: default package */
public class c3b<U, V> implements k<U, V> {
    private final l<U, g<V>> a;
    private final h<U, U, U, Boolean> b;
    private final g<b<U, V>> c = g.K(new a());

    /* renamed from: c3b$a */
    class a implements Callable<b<U, V>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new b(c3b.this.b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3b$b */
    public static class b<U, V> implements io.reactivex.functions.c<U, c<U, V>, Optional<V>> {
        private final h<U, U, U, Boolean> a;
        private Optional<U> b = Optional.absent();

        b(h<U, U, U, Boolean> hVar) {
            hVar.getClass();
            this.a = hVar;
        }

        @Override // io.reactivex.functions.c
        public Object a(Object obj, Object obj2) {
            c cVar = (c) obj2;
            if (this.b.isPresent() && !this.a.a(obj, this.b.get(), cVar.a).booleanValue()) {
                return Optional.absent();
            }
            this.b = Optional.of(cVar.a);
            return Optional.of(cVar.b);
        }
    }

    /* renamed from: c3b$c */
    static class c<U, V> {
        public final U a;
        public final V b;

        c(U u, V v) {
            u.getClass();
            this.a = u;
            v.getClass();
            this.b = v;
        }
    }

    public c3b(l<U, g<V>> lVar, h<U, U, U, Boolean> hVar) {
        lVar.getClass();
        this.a = lVar;
        this.b = hVar;
    }

    public static g c(c3b c3b, Object obj) {
        c3b.getClass();
        return g.i(g.N(obj), c3b.a.apply(obj), h1b.a);
    }

    @Override // io.reactivex.k
    public tpf a(g gVar) {
        return this.c.F(new j1b(this, gVar.Z()));
    }
}
