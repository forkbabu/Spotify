package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: h67  reason: default package */
public final class h67 implements fjf<g67> {
    private final wlf<InteractionLogger> a;
    private final wlf<String> b;

    public h67(wlf<InteractionLogger> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new g67(this.a.get(), this.b.get());
    }
}
