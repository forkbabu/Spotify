package io.netty.util.concurrent;

import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.e;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public class p<V> {
    private static final int b = e.i();
    private final int a = e.i();

    private static void a(e eVar, p<?> pVar) {
        Set set;
        int i = b;
        Object h = eVar.h(i);
        if (h == e.m || h == null) {
            set = Collections.newSetFromMap(new IdentityHashMap());
            eVar.n(i, set);
        } else {
            set = (Set) h;
        }
        set.add(pVar);
    }

    public static void g() {
        e f = e.f();
        if (f != null) {
            try {
                Object h = f.h(b);
                if (!(h == null || h == e.m)) {
                    Set set = (Set) h;
                    for (p pVar : (p[]) set.toArray(new p[set.size()])) {
                        pVar.f(f);
                    }
                }
            } finally {
                e.j();
            }
        }
    }

    public final V b() {
        return c(e.e());
    }

    public final V c(e eVar) {
        V v;
        V v2 = (V) eVar.h(this.a);
        if (v2 != e.m) {
            return v2;
        }
        try {
            v = d();
        } catch (Exception e) {
            PlatformDependent.f0(e);
            v = null;
        }
        eVar.n(this.a, v);
        a(eVar, this);
        return v;
    }

    /* access modifiers changed from: protected */
    public V d() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void e(V v) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: io.netty.util.concurrent.p<V> */
    /* JADX WARN: Multi-variable type inference failed */
    public final void f(e eVar) {
        if (eVar != null) {
            Object k = eVar.k(this.a);
            Object h = eVar.h(b);
            Object obj = e.m;
            if (!(h == obj || h == null)) {
                ((Set) h).remove(this);
            }
            if (k != obj) {
                try {
                    e(k);
                } catch (Exception e) {
                    PlatformDependent.f0(e);
                }
            }
        }
    }

    public final void h(e eVar, V v) {
        if (v == e.m) {
            f(eVar);
        } else if (eVar.n(this.a, v)) {
            a(eVar, this);
        }
    }

    public final void i(V v) {
        Object obj = e.m;
        if (v != obj) {
            e e = e.e();
            if (v == obj) {
                f(e);
            } else if (e.n(this.a, v)) {
                a(e, this);
            }
        } else {
            f(e.f());
        }
    }
}
