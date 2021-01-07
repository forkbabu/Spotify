package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;

/* renamed from: ahc  reason: default package */
public final class ahc implements fjf<zgc> {
    private final wlf<htc> a;
    private final wlf<etc> b;
    private final wlf<jtc> c;
    private final wlf<tgc> d;
    private final wlf<b4<msc>> e;
    private final wlf<j42> f;

    public ahc(wlf<htc> wlf, wlf<etc> wlf2, wlf<jtc> wlf3, wlf<tgc> wlf4, wlf<b4<msc>> wlf5, wlf<j42> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new zgc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
