package defpackage;

import com.spotify.music.loggers.InteractionLogger;

/* renamed from: l67  reason: default package */
public final class l67 implements fjf<k67> {
    private final wlf<InteractionLogger> a;

    public l67(wlf<InteractionLogger> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k67(this.a.get());
    }
}
