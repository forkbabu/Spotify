package defpackage;

import com.spotify.music.connection.l;

/* renamed from: wh5  reason: default package */
public final class wh5 implements fjf<vh5> {
    private final wlf<l> a;
    private final wlf<ol5> b;
    private final wlf<hl5> c;
    private final wlf<k1e<b91>> d;

    public wh5(wlf<l> wlf, wlf<ol5> wlf2, wlf<hl5> wlf3, wlf<k1e<b91>> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new vh5(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
