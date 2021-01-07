package defpackage;

import android.content.Context;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.spotlets.bixbyhomecards.logging.StreamingCardEventLogger;

/* renamed from: eu1  reason: default package */
public final class eu1 implements fjf<du1> {
    private final wlf<Context> a;
    private final wlf<bu1> b;
    private final wlf<Player> c;
    private final wlf<pu1> d;
    private final wlf<StreamingCardEventLogger> e;
    private final wlf<zt1> f;
    private final wlf<nt1> g;
    private final wlf<lt1> h;
    private final wlf<jt1> i;
    private final wlf<ru1> j;

    public eu1(wlf<Context> wlf, wlf<bu1> wlf2, wlf<Player> wlf3, wlf<pu1> wlf4, wlf<StreamingCardEventLogger> wlf5, wlf<zt1> wlf6, wlf<nt1> wlf7, wlf<lt1> wlf8, wlf<jt1> wlf9, wlf<ru1> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new du1(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
