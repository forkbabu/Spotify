package defpackage;

import com.spotify.nowplaying.ui.components.color.f;
import com.spotify.player.model.ContextTrack;
import com.squareup.picasso.Picasso;
import io.reactivex.g;
import kotlin.jvm.internal.h;

/* renamed from: ys5  reason: default package */
public final class ys5 implements fjf<g<Integer>> {
    private final wlf<g<ContextTrack>> a;
    private final wlf<Picasso> b;

    public ys5(wlf<g<ContextTrack>> wlf, wlf<Picasso> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        g<ContextTrack> gVar = this.a.get();
        Picasso picasso = this.b.get();
        h.e(gVar, "trackFlowable");
        h.e(picasso, "picasso");
        g<R> r0 = gVar.l(new f(picasso, 0, 0, 6)).V(1).r0();
        h.d(r0, "trackFlowable.compose(Pr…so)).replay(1).refCount()");
        return r0;
    }
}
