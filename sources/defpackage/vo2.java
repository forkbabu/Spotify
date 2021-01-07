package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.e;
import com.spotify.player.model.ContextTrack;

/* renamed from: vo2  reason: default package */
public class vo2 extends drb<e<ContextTrack>> {
    private final yo2 f;

    public vo2(yo2 yo2) {
        this.f = yo2;
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
}
