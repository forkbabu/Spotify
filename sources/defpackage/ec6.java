package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: ec6  reason: default package */
public final class ec6 implements fjf<ImmutableList<gu6>> {
    private final wlf<of6> a;
    private final wlf<mf6> b;
    private final wlf<qf6> c;
    private final wlf<kf6> d;

    public ec6(wlf<of6> wlf, wlf<mf6> wlf2, wlf<qf6> wlf3, wlf<kf6> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableList of = ImmutableList.of((mf6) this.c.get(), (mf6) this.a.get(), (mf6) this.d.get(), this.b.get());
        yif.g(of, "Cannot return null from a non-@Nullable @Provides method");
        return of;
    }
}
