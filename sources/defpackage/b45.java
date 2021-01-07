package defpackage;

import com.spotify.player.controls.d;
import com.spotify.player.model.PlayerState;
import com.spotify.player.play.f;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: b45  reason: default package */
public final class b45 implements fjf<x35> {
    private final wlf<d> a;
    private final wlf<g<PlayerState>> b;
    private final wlf<f> c;

    public b45(wlf<d> wlf, wlf<g<PlayerState>> wlf2, wlf<f> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        d dVar = this.a.get();
        g<PlayerState> gVar = this.b.get();
        f fVar = this.c.get();
        h.e(dVar, "playerControls");
        h.e(gVar, "playerState");
        h.e(fVar, "player");
        return new a45(dVar, gVar, fVar);
    }
}
