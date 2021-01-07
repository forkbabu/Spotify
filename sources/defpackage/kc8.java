package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: kc8  reason: default package */
public final class kc8 implements fjf<jc8> {
    private final wlf<l81> a;
    private final wlf<jz1> b;
    private final wlf<dc8> c;
    private final wlf<ifd> d;
    private final wlf<c.a> e;
    private final wlf<cqe> f;

    public kc8(wlf<l81> wlf, wlf<jz1> wlf2, wlf<dc8> wlf3, wlf<ifd> wlf4, wlf<c.a> wlf5, wlf<cqe> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    public static kc8 a(wlf<l81> wlf, wlf<jz1> wlf2, wlf<dc8> wlf3, wlf<ifd> wlf4, wlf<c.a> wlf5, wlf<cqe> wlf6) {
        return new kc8(wlf, wlf2, wlf3, wlf4, wlf5, wlf6);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jc8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
