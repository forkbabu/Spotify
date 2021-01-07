package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;

/* renamed from: la7  reason: default package */
public final class la7 implements fjf<ka7> {
    private final wlf<String> a;
    private final wlf<OffliningLogger> b;
    private final wlf<jz1> c;
    private final wlf<aqe> d;

    public la7(wlf<String> wlf, wlf<OffliningLogger> wlf2, wlf<jz1> wlf3, wlf<aqe> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ka7(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
