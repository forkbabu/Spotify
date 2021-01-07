package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: kp1  reason: default package */
public final class kp1 implements fjf<jp1> {
    private final wlf<ImpressionLogger> a;
    private final wlf<l81> b;

    public kp1(wlf<ImpressionLogger> wlf, wlf<l81> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new jp1(this.a.get(), this.b.get());
    }
}
