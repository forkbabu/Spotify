package defpackage;

import com.spotify.music.navigation.t;
import io.reactivex.s;

/* renamed from: ii8  reason: default package */
public final class ii8 implements fjf<hi8> {
    private final wlf<us3> a;
    private final wlf<t> b;
    private final wlf<s<Boolean>> c;
    private final wlf<ji8> d;
    private final wlf<li8> e;
    private final wlf<ws3> f;
    private final wlf<cqe> g;
    private final wlf<wb2> h;

    public ii8(wlf<us3> wlf, wlf<t> wlf2, wlf<s<Boolean>> wlf3, wlf<ji8> wlf4, wlf<li8> wlf5, wlf<ws3> wlf6, wlf<cqe> wlf7, wlf<wb2> wlf8) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
    }

    @Override // defpackage.wlf
    public Object get() {
        hi8 hi8 = new hi8(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get());
        hi8.j = this.h.get();
        return hi8;
    }
}
