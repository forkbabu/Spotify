package defpackage;

import com.spotify.music.navigation.t;

/* renamed from: e71  reason: default package */
public final class e71 implements fjf<d71> {
    private final wlf<t> a;
    private final wlf<p71> b;
    private final wlf<j81> c;
    private final wlf<ere> d;

    public e71(wlf<t> wlf, wlf<p71> wlf2, wlf<j81> wlf3, wlf<ere> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d71(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
