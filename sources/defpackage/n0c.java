package defpackage;

import com.spotify.nowplaying.core.orientation.OrientationMode;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: n0c  reason: default package */
public final class n0c implements fjf<g<OrientationMode>> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<Boolean> b;

    public n0c(wlf<g<ContextTrack>> wlf, wlf<Boolean> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().O(h0c.a).O(new i0c(this.b.get().booleanValue()));
    }
}
