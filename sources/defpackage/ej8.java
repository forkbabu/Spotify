package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.common.recyclerview.b;
import com.spotify.music.features.ads.model.Ad;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: ej8  reason: default package */
public class ej8 extends b<gj8> {
    private final th8 c;
    private final Picasso f;
    private List<Ad> n = ImmutableList.of();

    public ej8(th8 th8, Picasso picasso) {
        this.c = th8;
        this.f = picasso;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        ((gj8) b0Var).h0(this.n.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return new gj8(viewGroup.getContext(), this.f, viewGroup, this.c);
    }

    public void Z(List<Ad> list) {
        this.n = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.n.size();
    }
}
