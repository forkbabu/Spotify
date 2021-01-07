package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.features.languagepicker.logger.a;
import com.squareup.picasso.Picasso;

/* renamed from: gm5  reason: default package */
public class gm5 extends dm5<hm5> {
    private final Picasso q;
    private final GridLayoutManager.b r;

    public gm5(Picasso picasso, a aVar, int i) {
        super(aVar);
        this.q = picasso;
        this.r = new fm5(this, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return new hm5(viewGroup, this.p, this.q);
    }

    public GridLayoutManager.b k0() {
        return this.r;
    }
}
