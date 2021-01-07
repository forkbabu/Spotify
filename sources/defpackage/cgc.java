package defpackage;

import com.spotify.instrumentation.a;
import com.spotify.music.navigation.t;

/* renamed from: cgc  reason: default package */
public final class cgc implements fjf<bgc> {
    private final wlf<t> a;
    private final wlf<ere> b;
    private final wlf<a> c;

    public cgc(wlf<t> wlf, wlf<ere> wlf2, wlf<a> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new bgc(this.a.get(), this.b.get(), this.c.get());
    }
}
