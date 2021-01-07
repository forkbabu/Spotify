package defpackage;

import com.spotify.music.loggers.ImpressionLogger;

/* renamed from: xi7  reason: default package */
public final class xi7 implements fjf<wi7> {
    private final wlf<ImpressionLogger> a;
    private final wlf<yi7> b;
    private final wlf<l81> c;

    public xi7(wlf<ImpressionLogger> wlf, wlf<yi7> wlf2, wlf<l81> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new wi7(this.a.get(), this.b.get(), this.c.get());
    }
}
