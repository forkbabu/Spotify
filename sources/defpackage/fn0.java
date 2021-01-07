package defpackage;

import com.google.common.collect.ImmutableSet;
import java.util.Set;
import okhttp3.v;

/* renamed from: fn0  reason: default package */
public final class fn0 implements fjf<Set<v>> {
    private final wlf<tn0> a;
    private final wlf<sn0> b;
    private final wlf<kn0> c;
    private final wlf<on0> d;
    private final wlf<pn0> e;

    public fn0(wlf<tn0> wlf, wlf<sn0> wlf2, wlf<kn0> wlf3, wlf<on0> wlf4, wlf<pn0> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableSet of = ImmutableSet.of((pn0) this.a.get(), (pn0) this.b.get(), (pn0) this.c.get(), (pn0) this.d.get(), this.e.get());
        yif.g(of, "Cannot return null from a non-@Nullable @Provides method");
        return of;
    }
}
