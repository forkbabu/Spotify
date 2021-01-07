package defpackage;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.spotlets.common.recyclerview.b;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.features.creatorartist.model.Image;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.List;

/* renamed from: tu4  reason: default package */
public class tu4 extends b<uu4> {
    private List<Image> c = Collections.emptyList();
    private final Picasso f;

    public tu4(Picasso picasso) {
        this.f = picasso;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        ((uu4) b0Var).u0(this.c.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        return new uu4(viewGroup, viewGroup.getContext(), this.f);
    }

    public void Z(List<Image> list) {
        if (list == null) {
            Assertion.g("images passed in is null");
        } else {
            this.c = list;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
