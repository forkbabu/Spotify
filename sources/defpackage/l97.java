package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import io.reactivex.g;

/* renamed from: l97  reason: default package */
public final class l97 implements fjf<k97> {
    private final wlf<g<PlayerState>> a;
    private final wlf<lxd> b;
    private final wlf<f> c;
    private final wlf<d> d;

    public l97(wlf<g<PlayerState>> wlf, wlf<lxd> wlf2, wlf<f> wlf3, wlf<d> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new k97(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
