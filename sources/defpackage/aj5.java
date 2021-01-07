package defpackage;

import com.spotify.mobile.android.spotlets.tooltip.a;

/* renamed from: aj5  reason: default package */
public final class aj5 implements fjf<zi5> {
    private final wlf<a> a;
    private final wlf<bg5> b;
    private final wlf<bj5> c;
    private final wlf<hha> d;

    public aj5(wlf<a> wlf, wlf<bg5> wlf2, wlf<bj5> wlf3, wlf<hha> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zi5(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
