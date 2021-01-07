package defpackage;

import com.google.common.collect.ImmutableList;
import defpackage.zt6;

/* renamed from: cu6  reason: default package */
public final class cu6 implements fjf<bu6> {
    private final wlf<zt6.a> a;
    private final wlf<ImmutableList<eu6>> b;
    private final wlf<ImmutableList<gu6>> c;

    public cu6(wlf<zt6.a> wlf, wlf<ImmutableList<eu6>> wlf2, wlf<ImmutableList<gu6>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bu6(this.a, this.b, this.c);
    }
}
