package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: dg6  reason: default package */
public final class dg6 implements fjf<cg6> {
    private final wlf<InteractionLogger> a;
    private final wlf<yj6> b;
    private final wlf<ere> c;

    public dg6(wlf<InteractionLogger> wlf, wlf<yj6> wlf2, wlf<ere> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cg6(this.a.get(), this.b.get(), this.c.get());
    }
}
