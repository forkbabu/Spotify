package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: dad  reason: default package */
public final class dad implements fjf<z9d> {
    private final wlf<ImpressionLogger> a;
    private final wlf<InteractionLogger> b;
    private final wlf<ere> c;
    private final wlf<y9d> d;

    public dad(wlf<ImpressionLogger> wlf, wlf<InteractionLogger> wlf2, wlf<ere> wlf3, wlf<y9d> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new z9d(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
