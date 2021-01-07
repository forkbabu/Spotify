package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: ta8  reason: default package */
public final class ta8 implements fjf<sa8> {
    private final wlf<ere> a;
    private final wlf<jz1> b;
    private final wlf<ifd> c;
    private final wlf<c.a> d;
    private final wlf<cqe> e;

    public ta8(wlf<ere> wlf, wlf<jz1> wlf2, wlf<ifd> wlf3, wlf<c.a> wlf4, wlf<cqe> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new sa8(this.a, this.b, this.c, this.d, this.e);
    }
}
