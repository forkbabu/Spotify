package defpackage;

import com.spotify.mobile.android.video.q;

/* renamed from: wl2  reason: default package */
public final class wl2 implements fjf<vl2> {
    private final wlf<nl2> a;
    private final wlf<pl2> b;
    private final wlf<q> c;
    private final wlf<rl2> d;

    public wl2(wlf<nl2> wlf, wlf<pl2> wlf2, wlf<q> wlf3, wlf<rl2> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vl2(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
