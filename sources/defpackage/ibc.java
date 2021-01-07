package defpackage;

import androidx.lifecycle.e0;
import androidx.lifecycle.g0;
import androidx.lifecycle.i0;
import com.spotify.pageloader.o0;
import com.spotify.pageloader.t0;

/* renamed from: ibc  reason: default package */
public class ibc<T> implements cbc<T> {
    private final g0 a;

    /* renamed from: ibc$a */
    static class a<T> extends e0 {
        private final t0<T> c;

        a(t0<T> t0Var) {
            this.c = t0Var;
            t0Var.start();
        }

        /* access modifiers changed from: protected */
        @Override // androidx.lifecycle.e0
        public void e() {
            this.c.stop();
        }

        /* access modifiers changed from: package-private */
        public t0<T> g() {
            return this.c;
        }
    }

    /* renamed from: ibc$b */
    static class b<K> implements g0.b {
        private final o0<K> a;
        private final sg0<o0<K>, t0<K>> b;

        b(o0<K> o0Var, sg0<o0<K>, t0<K>> sg0) {
            this.b = sg0;
            this.a = o0Var;
        }

        @Override // androidx.lifecycle.g0.b
        public <T extends e0> T a(Class<T> cls) {
            if (cls.isAssignableFrom(a.class)) {
                return (T) new a(this.b.apply(this.a));
            }
            throw new IllegalArgumentException(cls.getName());
        }
    }

    public ibc(i0 i0Var, o0<T> o0Var, sg0<o0<T>, t0<T>> sg0) {
        this.a = new g0(i0Var.Z(), new b(o0Var, sg0));
    }

    @Override // defpackage.cbc
    public t0<T> get() {
        return ((a) this.a.a(a.class)).g();
    }
}
