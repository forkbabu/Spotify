package defpackage;

import com.spotify.nowplaying.ui.components.overlay.j;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: pxb  reason: default package */
public final class pxb implements fjf<g<j>> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<vl2> b;

    public pxb(wlf<g<ContextTrack>> wlf, wlf<vl2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().O(new kxb(this.b.get())).O(ixb.a).s();
    }
}
