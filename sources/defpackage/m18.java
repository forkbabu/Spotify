package defpackage;

import com.spotify.music.features.quicksilver.utils.e;
import com.spotify.music.features.quicksilver.v2.mobius.h;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.internal.operators.observable.v;
import io.reactivex.s;

/* renamed from: m18  reason: default package */
public final class m18 implements fjf<s<h>> {
    private final wlf<g<PlayerState>> a;
    private final wlf<e> b;

    public m18(wlf<g<PlayerState>> wlf, wlf<e> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<PlayerState> gVar = this.a.get();
        gVar.getClass();
        return new v(gVar).q(this.b.get());
    }
}
