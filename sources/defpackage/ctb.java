package defpackage;

import com.spotify.music.nowplaying.common.view.contextmenu.o;
import com.spotify.player.model.ContextTrack;
import io.reactivex.g;

/* renamed from: ctb  reason: default package */
public final class ctb implements fjf<g<o>> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<vl2> b;

    public ctb(wlf<g<ContextTrack>> wlf, wlf<vl2> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        vl2 vl2 = this.b.get();
        vl2.getClass();
        return this.a.get().O(new zsb(vl2)).O(xsb.a);
    }
}