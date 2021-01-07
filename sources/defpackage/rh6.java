package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: rh6  reason: default package */
public final class rh6 implements fjf<qh6> {
    private final wlf<ImpressionLogger> a;
    private final wlf<InteractionLogger> b;
    private final wlf<yj6> c;
    private final wlf<ere> d;

    public rh6(wlf<ImpressionLogger> wlf, wlf<InteractionLogger> wlf2, wlf<yj6> wlf3, wlf<ere> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new qh6(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
