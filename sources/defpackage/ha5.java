package defpackage;

import com.spotify.music.offlinetrials.limited.trackentity.p;
import com.spotify.music.ondemandsharing.shufflebutton.o;

/* renamed from: ha5  reason: default package */
public final class ha5 implements fjf<ga5> {
    private final wlf<o> a;
    private final wlf<ea5> b;
    private final wlf<zec> c;
    private final wlf<kk9> d;
    private final wlf<mod> e;
    private final wlf<p> f;

    public ha5(wlf<o> wlf, wlf<ea5> wlf2, wlf<zec> wlf3, wlf<kk9> wlf4, wlf<mod> wlf5, wlf<p> wlf6) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new ga5(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get());
    }
}
