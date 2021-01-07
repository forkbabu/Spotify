package defpackage;

import com.spotify.remoteconfig.z6;
import io.reactivex.z;

/* renamed from: dw8  reason: default package */
public final class dw8 implements fjf<cw8> {
    private final wlf<aw8> a;
    private final wlf<ua1> b;
    private final wlf<wv8> c;
    private final wlf<uv8> d;
    private final wlf<z<p62>> e;
    private final wlf<l6a> f;
    private final wlf<z6> g;

    public dw8(wlf<aw8> wlf, wlf<ua1> wlf2, wlf<wv8> wlf3, wlf<uv8> wlf4, wlf<z<p62>> wlf5, wlf<l6a> wlf6, wlf<z6> wlf7) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cw8(this.a.get(), ejf.a(this.b), this.c.get(), this.d.get(), this.e.get(), this.f.get(), ejf.a(this.g));
    }
}
