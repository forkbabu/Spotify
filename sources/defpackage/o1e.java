package defpackage;

import io.reactivex.internal.operators.observable.ObservableTimeout;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.w;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

/* renamed from: o1e  reason: default package */
public class o1e<T> implements w<T, T> {
    private final int a;
    private final T b;
    private final y c;

    /* renamed from: o1e$b */
    public static final class b<T> {
        private int a = 800;
        private final T b;
        private final y c;

        public b(T t, y yVar) {
            this.b = t;
            this.c = yVar;
        }

        public o1e<T> a() {
            return new o1e<>(this.a, this.b, this.c, null);
        }

        public b<T> b(int i) {
            this.a = i;
            return this;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    o1e(int i, Object obj, y yVar, a aVar) {
        this.a = i;
        obj.getClass();
        this.b = obj;
        yVar.getClass();
        this.c = yVar;
    }

    public v a(s sVar) {
        return new ObservableTimeout(sVar, s.X0((long) this.a, TimeUnit.MILLISECONDS, this.c), d1e.a, s.k0(sVar, s.i0(this.b)));
    }

    @Override // io.reactivex.w
    public v apply(s sVar) {
        return sVar.t0(new e1e(this));
    }
}
