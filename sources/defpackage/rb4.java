package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: rb4  reason: default package */
public final class rb4 implements fjf<qb4> {
    private final wlf<ImpressionLogger> a;
    private final wlf<l81> b;
    private final wlf<tb4> c;

    public rb4(wlf<ImpressionLogger> wlf, wlf<l81> wlf2, wlf<tb4> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qb4(this.a.get(), this.b.get(), this.c.get());
    }
}
