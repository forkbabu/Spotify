package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: f67  reason: default package */
public final class f67 implements fjf<e67> {
    private final wlf<InteractionLogger> a;
    private final wlf<String> b;

    public f67(wlf<InteractionLogger> wlf, wlf<String> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new e67(this.a.get(), this.b.get());
    }
}
