package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: ga3  reason: default package */
public final class ga3 implements fjf<List<aja>> {
    private final wlf<xia> a;
    private final wlf<cja> b;
    private final wlf<eja> c;

    public ga3(wlf<xia> wlf, wlf<cja> wlf2, wlf<eja> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        ImmutableList of = ImmutableList.of((eja) this.a.get(), (eja) this.b.get(), this.c.get());
        yif.g(of, "Cannot return null from a non-@Nullable @Provides method");
        return of;
    }
}
