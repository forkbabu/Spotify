package defpackage;

import com.spotify.music.nowplaying.common.view.contextmenu.o;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;

/* renamed from: vwb  reason: default package */
public final class vwb implements fjf<g<o>> {
    private final wlf<g<PlayerState>> a;
    private final wlf<vl2> b;

    public vwb(wlf<g<PlayerState>> wlf, wlf<vl2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().u(swb.a).O(new qwb(this.b.get()));
    }
}
