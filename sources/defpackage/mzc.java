package defpackage;

import android.content.Context;
import com.spotify.mobile.android.util.o0;
import com.spotify.music.share.logging.ShareMenuLogger;
import com.spotify.player.model.PlayerState;
import com.spotify.remoteconfig.sa;
import com.spotify.share.util.m;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: mzc  reason: default package */
public final class mzc implements fjf<lzc> {
    private final wlf<g<PlayerState>> a;
    private final wlf<jz1> b;
    private final wlf<r4e> c;
    private final wlf<c1d> d;
    private final wlf<y> e;
    private final wlf<c2d> f;
    private final wlf<o0> g;
    private final wlf<m> h;
    private final wlf<v0d> i;
    private final wlf<sa> j;
    private final wlf<ShareMenuLogger> k;
    private final wlf<Context> l;

    public mzc(wlf<g<PlayerState>> wlf, wlf<jz1> wlf2, wlf<r4e> wlf3, wlf<c1d> wlf4, wlf<y> wlf5, wlf<c2d> wlf6, wlf<o0> wlf7, wlf<m> wlf8, wlf<v0d> wlf9, wlf<sa> wlf10, wlf<ShareMenuLogger> wlf11, wlf<Context> wlf12) {
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
        this.k = wlf11;
        this.l = wlf12;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new lzc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get(), this.k.get(), this.l.get());
    }
}
