package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: f47  reason: default package */
public final class f47 implements fjf<e47> {
    private final wlf<InteractionLogger> a;
    private final wlf<String> b;

    public f47(wlf<InteractionLogger> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e47(this.a.get(), this.b.get());
    }
}
