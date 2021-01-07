package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: elc  reason: default package */
public final class elc implements fjf<dlc> {
    private final wlf<InteractionLogger> a;
    private final wlf<String> b;

    public elc(wlf<InteractionLogger> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new dlc(this.a.get(), this.b.get());
    }
}
