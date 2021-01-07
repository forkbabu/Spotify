package defpackage;

import com.spotify.music.loggers.InteractionLogger;
import com.spotify.ubi.specification.factories.s;

/* renamed from: n75  reason: default package */
public final class n75 implements fjf<m75> {
    private final wlf<InteractionLogger> a;
    private final wlf<s> b;
    private final wlf<ere> c;

    public n75(wlf<InteractionLogger> wlf, wlf<s> wlf2, wlf<ere> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m75(this.a.get(), this.b.get(), this.c.get());
    }
}
