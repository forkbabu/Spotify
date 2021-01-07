package defpackage;

import com.spotify.music.premiummini.k;

/* renamed from: yp6  reason: default package */
public final class yp6 implements fjf<xp6> {
    private final wlf<zp6> a;
    private final wlf<k> b;

    public yp6(wlf<zp6> wlf, wlf<k> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xp6(this.a.get(), this.b.get());
    }
}
