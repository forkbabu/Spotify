package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import java.util.LinkedList;
import java.util.List;

/* renamed from: x97  reason: default package */
public class x97 extends RecyclerView.e<fa7> {
    private final List<j87> c = new LinkedList();
    private final Drawable f;
    private final Drawable n;
    private final Picasso o;
    private y97 p;

    public x97(Context context, Picasso picasso) {
        this.f = yc0.o(context);
        this.n = yc0.h(context);
        this.o = picasso;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(fa7 fa7, int i) {
        fa7.h0(i, this.c.get(i));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public fa7 M(ViewGroup viewGroup, int i) {
        return new fa7(je.G(viewGroup, C0707R.layout.tracklist_item_layout, viewGroup, false), this.o, this.f, this.n, this.p);
    }

    public void X(k87 k87) {
        List<j87> f2 = k87.f();
        this.c.clear();
        this.c.addAll(f2);
        z();
    }

    public void Y(y97 y97) {
        this.p = y97;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
