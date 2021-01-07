package defpackage;

import com.spotify.android.glue.patterns.prettylist.u;

/* renamed from: p65  reason: default package */
public final class p65 implements fjf<o65> {
    private final wlf<zvd> a;
    private final wlf<g85> b;
    private final wlf<u> c;
    private final wlf<j85> d;

    public p65(wlf<zvd> wlf, wlf<g85> wlf2, wlf<u> wlf3, wlf<j85> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o65(this.a.get(), this.b.get(), this.c, this.d.get());
    }
}
