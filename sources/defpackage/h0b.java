package defpackage;

import com.google.common.base.Optional;
import io.reactivex.functions.h;
import io.reactivex.functions.l;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import java.util.concurrent.Callable;

/* renamed from: h0b  reason: default package */
public class h0b<T, R> implements w<T, R> {
    private final l<T, s<R>> a;
    private final h<T, T, T, Boolean> b;
    private final s<b<T, R>> c = s.c0(new a());

    /* renamed from: h0b$a */
    class a implements Callable<b<T, R>> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new b(h0b.this.b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0b$b */
    public static class b<T, R> implements io.reactivex.functions.c<T, c<T, R>, Optional<R>> {
        private final h<T, T, T, Boolean> a;
        private Optional<T> b = Optional.absent();

        b(h<T, T, T, Boolean> hVar) {
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

    /* renamed from: h0b$c */
    static class c<T, R> {
        public final T a;
        public final R b;

        c(T t, R r) {
            t.getClass();
            this.a = t;
            r.getClass();
            this.b = r;
        }
    }

    public h0b(l<T, s<R>> lVar, h<T, T, T, Boolean> hVar) {
        this.a = lVar;
        this.b = hVar;
    }

    public static s b(h0b h0b, Object obj) {
        h0b.getClass();
        return s.n(s.i0(obj), h0b.a.apply(obj), qza.a);
    }

    @Override // io.reactivex.w
    public v apply(s sVar) {
        return this.c.W(new lza(this, sVar.z0()), false, Integer.MAX_VALUE);
    }
}
