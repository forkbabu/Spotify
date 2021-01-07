package defpackage;

import com.spotify.music.libs.viewuri.c;

/* renamed from: r26  reason: default package */
public final class r26 implements fjf<o26> {
    private final wlf<c> a;
    private final wlf<ere> b;
    private final wlf<q26> c;
    private final wlf<uq6> d;

    public r26(wlf<c> wlf, wlf<ere> wlf2, wlf<q26> wlf3, wlf<uq6> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new o26(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
