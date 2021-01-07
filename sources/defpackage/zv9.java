package defpackage;

import com.spotify.instrumentation.navigation.logger.m;

/* renamed from: zv9  reason: default package */
public final class zv9 implements fjf<yv9> {
    private final wlf<aw9> a;
    private final wlf<cqe> b;
    private final wlf<m> c;
    private final wlf<xv9> d;

    public zv9(wlf<aw9> wlf, wlf<cqe> wlf2, wlf<m> wlf3, wlf<xv9> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new yv9(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
