package defpackage;

import com.spotify.music.nowplaying.common.view.contextmenu.o;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: nxb  reason: default package */
public final class nxb implements fjf<g<o>> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<vl2> b;

    public nxb(wlf<g<ContextTrack>> wlf, wlf<vl2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        vl2 vl2 = this.b.get();
        vl2.getClass();
        return this.a.get().O(new lxb(vl2)).O(jxb.a);
    }
}
