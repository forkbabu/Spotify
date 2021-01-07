package defpackage;

import com.spotify.podcast.endpoints.x;

/* renamed from: q27  reason: default package */
public final class q27 implements fjf<p27> {
    private final wlf<x> a;
    private final wlf<String> b;
    private final wlf<x.a> c;
    private final wlf<b37> d;

    public q27(wlf<x> wlf, wlf<String> wlf2, wlf<x.a> wlf3, wlf<b37> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new p27(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
