package defpackage;

import com.spotify.music.libs.voice.e;

/* renamed from: yab  reason: default package */
public final class yab implements fjf<xab> {
    private final wlf<jz1> a;
    private final wlf<e> b;
    private final wlf<cqe> c;

    public yab(wlf<jz1> wlf, wlf<e> wlf2, wlf<cqe> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new xab(this.a.get(), this.b.get(), this.c.get());
    }
}
