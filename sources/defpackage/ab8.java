package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: ab8  reason: default package */
public final class ab8 implements fjf<za8> {
    private final wlf<ere> a;
    private final wlf<jz1> b;
    private final wlf<ifd> c;
    private final wlf<c.a> d;
    private final wlf<cqe> e;

    public ab8(wlf<ere> wlf, wlf<jz1> wlf2, wlf<ifd> wlf3, wlf<c.a> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    public static ab8 a(wlf<ere> wlf, wlf<jz1> wlf2, wlf<ifd> wlf3, wlf<c.a> wlf4, wlf<cqe> wlf5) {
        return new ab8(wlf, wlf2, wlf3, wlf4, wlf5);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new za8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
