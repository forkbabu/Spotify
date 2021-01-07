package defpackage;

import com.spotify.music.explicitcontent.f;

/* renamed from: dh3  reason: default package */
public final class dh3 implements fjf<ch3> {
    private final wlf<f> a;
    private final wlf<ah3> b;

    public dh3(wlf<f> wlf, wlf<ah3> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ch3(this.a.get(), this.b.get());
    }
}
