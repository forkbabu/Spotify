package defpackage;

import com.spotify.nowplaying.ui.components.color.f;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import io.reactivex.g;

/* renamed from: dub  reason: default package */
public final class dub implements fjf<g<Integer>> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<Picasso> b;

    public dub(wlf<g<ContextTrack>> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return this.a.get().l(new f(this.b.get(), -7829368, -16777216)).V(1).r0();
    }
}
