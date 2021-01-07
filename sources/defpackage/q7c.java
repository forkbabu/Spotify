package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.music.nowplaying.common.view.carousel.adapter.viewholder.r;
import com.spotify.player.model.ContextTrack;

/* renamed from: q7c  reason: default package */
public class q7c extends drb<e<ContextTrack>> {
    private final t7c f;
    private final r n;

    public q7c(t7c t7c, r rVar) {
        this.f = t7c;
        this.n = rVar;
        U(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        ((e) b0Var).h0(c0(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f.b(viewGroup);
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
