package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: ft8  reason: default package */
public final class ft8 implements fjf<et8> {
    private final wlf<ImpressionLogger> a;
    private final wlf<l81> b;
    private final wlf<gt8> c;

    public ft8(wlf<ImpressionLogger> wlf, wlf<l81> wlf2, wlf<gt8> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new et8(this.a.get(), this.b.get(), this.c.get());
    }
}
