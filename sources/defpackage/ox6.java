package defpackage;

import com.spotify.android.glue.patterns.toolbarmenu.h0;

/* renamed from: ox6  reason: default package */
public final class ox6 implements fjf<nx6> {
    private final wlf<wt6> a;
    private final wlf<h0> b;
    private final wlf<vxc> c;

    public ox6(wlf<wt6> wlf, wlf<h0> wlf2, wlf<vxc> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new nx6(this.a.get(), this.b.get(), this.c.get());
    }
}
