package defpackage;

import com.google.common.collect.ImmutableList;

/* renamed from: hu6  reason: default package */
public final class hu6 implements fjf<ImmutableList<eu6>> {
    private final wlf<yu6> a;
    private final wlf<cv6> b;
    private final wlf<av6> c;

    public hu6(wlf<yu6> wlf, wlf<cv6> wlf2, wlf<av6> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableList of = ImmutableList.of((yu6) this.b.get(), (yu6) this.c.get(), this.a.get());
        yif.g(of, "Cannot return null from a non-@Nullable @Provides method");
        return of;
    }
}
