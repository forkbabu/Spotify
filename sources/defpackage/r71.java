package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: r71  reason: default package */
public final class r71 implements fjf<q71> {
    private final wlf<jz1> a;
    private final wlf<ifd> b;
    private final wlf<c.a> c;
    private final wlf<cqe> d;

    public r71(wlf<jz1> wlf, wlf<ifd> wlf2, wlf<c.a> wlf3, wlf<cqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new q71(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
