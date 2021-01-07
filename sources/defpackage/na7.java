package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: na7  reason: default package */
public final class na7 implements fjf<ma7> {
    private final wlf<ImpressionLogger> a;
    private final wlf<l81> b;

    public na7(wlf<ImpressionLogger> wlf, wlf<l81> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ma7(this.a.get(), this.b.get());
    }
}
