package defpackage;

import com.spotify.libs.connect.instrumentation.f;

/* renamed from: nba  reason: default package */
public final class nba implements fjf<mba> {
    private final wlf<jz1> a;
    private final wlf<aqe> b;
    private final wlf<f> c;

    public nba(wlf<jz1> wlf, wlf<aqe> wlf2, wlf<f> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new mba(this.a.get(), this.b.get(), this.c.get());
    }
}
