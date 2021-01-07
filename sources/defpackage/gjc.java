package defpackage;

import com.spotify.player.model.PlayOrigin;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import com.spotify.playlist.endpoints.d;
import io.reactivex.g;
import io.reactivex.y;

/* renamed from: gjc  reason: default package */
public final class gjc implements fjf<fjc> {
    private final wlf<hjc> a;
    private final wlf<d> b;
    private final wlf<jjc> c;
    private final wlf<f> d;
    private final wlf<PlayOrigin> e;
    private final wlf<y> f;
    private final wlf<g<PlayerState>> g;
    private final wlf<com.spotify.player.controls.d> h;
    private final wlf<lxd> i;
    private final wlf<bre> j;

    public gjc(wlf<hjc> wlf, wlf<d> wlf2, wlf<jjc> wlf3, wlf<f> wlf4, wlf<PlayOrigin> wlf5, wlf<y> wlf6, wlf<g<PlayerState>> wlf7, wlf<com.spotify.player.controls.d> wlf8, wlf<lxd> wlf9, wlf<bre> wlf10) {
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
        return new fjc(this.a.get(), this.b.get(), this.c.get(), this.d.get(), this.e.get(), this.f.get(), this.g.get(), this.h.get(), this.i.get(), this.j.get());
    }
}
