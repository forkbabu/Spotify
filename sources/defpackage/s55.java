package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: s55  reason: default package */
public final class s55 implements fjf<tk9> {
    private final wlf<ImpressionLogger> a;
    private final wlf<l81> b;
    private final wlf<rk9> c;

    public s55(wlf<ImpressionLogger> wlf, wlf<l81> wlf2, wlf<rk9> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new tk9(this.a.get(), this.b.get(), this.c.get());
    }
}
