package defpackage;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.util.ui.e;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import java.util.List;
import kotlin.jvm.internal.h;

/* renamed from: jeb  reason: default package */
public final class jeb extends RecyclerView.e<leb> {
    public List<qeb> c;
    private final Picasso f;
    private final zdb n;
    private final e o;
    private final ceb p;

    public jeb(Picasso picasso, zdb zdb, e eVar, ceb ceb) {
        h.e(picasso, "picasso");
        h.e(zdb, "assetPickerPresenter");
        h.e(eVar, "colorTransitionHelperFactory");
        h.e(ceb, "cardRatioProvider");
        this.f = picasso;
        this.n = zdb;
        this.o = eVar;
        this.p = ceb;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(leb leb, int i) {
        leb leb2 = leb;
        h.e(leb2, "holder");
        List<qeb> list = this.c;
        if (list != null) {
            leb2.u0(i, list.get(i), this.f);
        } else {
            h.k("items");
            throw null;
        }
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public leb M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        Resources resources = viewGroup.getResources();
        h.d(resources, "parent.resources");
        double d = (double) resources.getDisplayMetrics().widthPixels;
        double a = this.p.a();
        Double.isNaN(d);
        Double.isNaN(d);
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.lyrics_share_asset, viewGroup, false);
        h.d(inflate, "itemView");
        inflate.getLayoutParams().width = (int) (a * d);
        inflate.setOnClickListener(new ieb(this));
        return new leb(inflate, this.o);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        List<qeb> list = this.c;
        if (list != null) {
            return list.size();
        }
        h.k("items");
        throw null;
    }
}
