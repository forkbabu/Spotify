package defpackage;

import com.spotify.nowplaying.core.orientation.Orientation;
import com.spotify.nowplaying.ui.components.overlay.OverlayDisplayMode;
import com.spotify.nowplaying.ui.components.overlay.j;
import io.reactivex.g;

/* renamed from: x4c  reason: default package */
public final class x4c implements fjf<g<j>> {
    private final wlf<Orientation> a;

    public x4c(wlf<Orientation> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        if (this.a.get() == Orientation.PORTRAIT) {
            return g.N(j.a(OverlayDisplayMode.HIDE_DISABLED, false));
        }
        return g.N(j.a(OverlayDisplayMode.HIDE_ENABLED, true));
    }
}
