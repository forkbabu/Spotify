package defpackage;

import com.spotify.nowplaying.ui.components.overlay.j;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: xwb  reason: default package */
public final class xwb implements fjf<g<j>> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<vl2> b;

    public xwb(wlf<g<ContextTrack>> wlf, wlf<vl2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().O(new rwb(this.b.get())).O(twb.a).s();
    }
}
