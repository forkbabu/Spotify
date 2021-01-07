package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.canvas.model.CanvasContentType;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.d;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.g;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.o;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.r;
import com.spotify.player.model.ContextTrack;

/* renamed from: brb  reason: default package */
public class brb extends drb<e<ContextTrack>> {
    private final o f;
    private final r n;
    private final d o;
    private final g p;
    private final vl2 q;
    private final pl2 r;

    public brb(o oVar, r rVar, d dVar, g gVar, vl2 vl2, pl2 pl2) {
        this.f = oVar;
        this.n = rVar;
        this.o = dVar;
        this.p = gVar;
        this.q = vl2;
        this.r = pl2;
        U(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        ((e) b0Var).h0(c0(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f.b(viewGroup, false);
        }
        if (i == 1) {
            return this.n.b(viewGroup);
        }
        if (i == 2) {
            return this.p.b(viewGroup);
        }
        if (i == 3) {
            return this.o.b(viewGroup);
        }
        throw new IllegalArgumentException(je.p0("Unsupported view type: ", i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        ContextTrack c0 = c0(i);
        if (!this.q.a(c0)) {
            return kxd.l(c0) ? 1 : 0;
        }
        CanvasContentType b = this.r.b(c0);
        return b == CanvasContentType.VIDEO || b == CanvasContentType.VIDEO_LOOPING || b == CanvasContentType.VIDEO_LOOPING_RANDOM ? 2 : 3;
    }
}
