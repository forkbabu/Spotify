package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.q4;

/* renamed from: c29  reason: default package */
public final class c29 implements fjf<b29> {
    private final wlf<InteractionLogger> a;
    private final wlf<ere> b;
    private final wlf<q4> c;

    public c29(wlf<InteractionLogger> wlf, wlf<ere> wlf2, wlf<q4> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b29(this.a.get(), this.b.get(), this.c.get());
    }
}
