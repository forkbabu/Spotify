package defpackage;

import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.android.schedulers.a;
import io.reactivex.g;
import io.reactivex.s;

/* renamed from: y3d  reason: default package */
public final class y3d implements fjf<s<u3<String, ContextTrack>>> {
    private final wlf<g<PlayerState>> a;

    public y3d(wlf<g<PlayerState>> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<PlayerState> gVar = this.a.get();
        return je.Z(gVar, gVar).o0(a.b()).Q(x3d.a).j0(w3d.a).E().v0(1).h1();
    }
}
