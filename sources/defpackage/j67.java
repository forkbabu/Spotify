package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: j67  reason: default package */
public final class j67 implements fjf<i67> {
    private final wlf<InteractionLogger> a;
    private final wlf<String> b;

    public j67(wlf<InteractionLogger> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new i67(this.a.get(), this.b.get());
    }
}
