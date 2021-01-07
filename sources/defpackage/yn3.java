package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.b;
import com.spotify.music.features.ads.audioplus.d;
import com.spotify.music.features.ads.audioplus.topbanner.carousel.a;
import com.squareup.picasso.Picasso;
import java.util.List;

/* renamed from: yn3  reason: default package */
public class yn3 extends b<co3> {
    private List<d> c;
    private final Picasso f;
    private final nu3 n;
    private final com.spotify.music.features.ads.audioplus.topbanner.d o;
    private final a p;

    public yn3(a aVar, com.spotify.music.features.ads.audioplus.topbanner.d dVar, Picasso picasso, nu3 nu3) {
        this.f = picasso;
        this.p = aVar;
        this.o = dVar;
        this.n = nu3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        ((co3) b0Var).v0(this.c.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return new co3(this.f, viewGroup, this.p, this.o, this.n);
    }

    public void Z(List<d> list) {
        this.c = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
