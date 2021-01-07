package defpackage;

import com.spotify.nowplaying.core.orientation.Orientation;
import com.spotify.nowplaying.ui.components.overlay.j;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: o0c  reason: default package */
public final class o0c implements fjf<g<j>> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<Orientation> b;

    public o0c(wlf<g<ContextTrack>> wlf, wlf<Orientation> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().O(new j0c(this.b.get())).O(g0c.a).s();
    }
}
