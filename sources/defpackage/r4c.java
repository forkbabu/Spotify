package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.k;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.o;
import com.spotify.player.model.ContextTrack;

/* renamed from: r4c  reason: default package */
public class r4c extends drb<e<ContextTrack>> {
    private final o f;
    private final k n;

    public r4c(o oVar, k kVar) {
        this.f = oVar;
        this.n = kVar;
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
        throw new IllegalArgumentException(je.p0("Unsupported view type: ", i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return kxd.l(c0(i)) ? 1 : 0;
    }
}
