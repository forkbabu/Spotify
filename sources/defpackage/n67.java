package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

/* renamed from: n67  reason: default package */
public final class n67 implements fjf<m67> {
    private final wlf<ImpressionLogger> a;
    private final wlf<InteractionLogger> b;

    public n67(wlf<ImpressionLogger> wlf, wlf<InteractionLogger> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new m67(this.a.get(), this.b.get());
    }
}
