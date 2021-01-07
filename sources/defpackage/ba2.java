package defpackage;

import com.spotify.mobius.e0;
import com.spotify.mobius.g0;
import defpackage.aa2;
import defpackage.y92;
import java.util.HashSet;
import java.util.Set;

/* renamed from: ba2  reason: default package */
public abstract class ba2<M, E, F, MI, EI, FI> implements g0<M, E, F> {

    /* renamed from: ba2$a */
    public static abstract class a<M, E, F, MI, EI, FI> {
        public abstract ba2<M, E, F, MI, EI, FI> a();

        public abstract a<M, E, F, MI, EI, FI> b(ea2<E, EI> ea2);

        public abstract a<M, E, F, MI, EI, FI> c(z92<M, F, FI> z92);

        public abstract a<M, E, F, MI, EI, FI> d(g0<MI, EI, FI> g0Var);

        public abstract a<M, E, F, MI, EI, FI> e(ea2<M, MI> ea2);

        public abstract a<M, E, F, MI, EI, FI> f(ca2<M, MI, M> ca2);
    }

    public static <M, E, F, MI, EI, FI> a<M, E, F, MI, EI, FI> b() {
        return new y92.b();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: java.util.HashSet */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.spotify.mobius.g0
    public final e0<M, F> a(M m, E e) {
        MI apply = f().apply(m);
        apply.getClass();
        EI apply2 = c().apply(e);
        apply2.getClass();
        e0<MI, FI> a2 = e().a(apply, apply2);
        a2.getClass();
        boolean c = a2.c();
        if (c) {
            m = g().a(m, a2.e());
            m.getClass();
        }
        z92<M, F, FI> d = d();
        Set<FI> b = a2.b();
        aa2.a aVar = (aa2.a) d;
        aVar.getClass();
        if (b.isEmpty()) {
            return c ? e0.f(m) : e0.h();
        }
        HashSet hashSet = new HashSet();
        for (FI fi : b) {
            ea2 ea2 = aVar.a;
            ea2.getClass();
            Object apply3 = ea2.apply(fi);
            apply3.getClass();
            hashSet.add(apply3);
        }
        if (c) {
            return e0.g(m, hashSet);
        }
        return e0.a(hashSet);
    }

    /* access modifiers changed from: protected */
    public abstract ea2<E, EI> c();

    /* access modifiers changed from: protected */
    public abstract z92<M, F, FI> d();

    /* access modifiers changed from: protected */
    public abstract g0<MI, EI, FI> e();

    /* access modifiers changed from: protected */
    public abstract ea2<M, MI> f();

    /* access modifiers changed from: protected */
    public abstract ca2<M, MI, M> g();
}
