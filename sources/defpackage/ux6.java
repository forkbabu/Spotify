package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.h0;

/* renamed from: ux6  reason: default package */
public final class ux6 implements fjf<tx6> {
    private final wlf<wt6> a;
    private final wlf<ry6> b;
    private final wlf<h0> c;

    public ux6(wlf<wt6> wlf, wlf<ry6> wlf2, wlf<h0> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tx6(this.a.get(), this.b.get(), this.c.get());
    }
}
