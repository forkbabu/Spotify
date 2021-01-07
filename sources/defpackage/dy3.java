package defpackage;

import com.spotify.music.spotlets.offline.util.OffliningLogger;

/* renamed from: dy3  reason: default package */
public final class dy3 implements fjf<cy3> {
    private final wlf<String> a;
    private final wlf<t8a> b;
    private final wlf<m8a> c;
    private final wlf<ly3> d;
    private final wlf<OffliningLogger> e;

    public dy3(wlf<String> wlf, wlf<t8a> wlf2, wlf<m8a> wlf3, wlf<ly3> wlf4, wlf<OffliningLogger> wlf5) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new cy3(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get());
    }
}
