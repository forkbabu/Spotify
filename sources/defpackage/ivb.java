package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.player.model.ContextTrack;

/* renamed from: ivb  reason: default package */
public class ivb extends drb<e<ContextTrack>> {
    private final kvb f;

    public ivb(kvb kvb) {
        this.f = kvb;
        U(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        ((e) b0Var).h0(c0(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return this.f.b(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        return 0;
    }
}
