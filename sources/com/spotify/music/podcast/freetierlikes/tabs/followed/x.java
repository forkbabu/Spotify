package com.spotify.music.podcast.freetierlikes.tabs.followed;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.playlist.models.Show;
import java.util.List;

public class x extends RecyclerView.e<a> {
    private final z c;
    private final View.OnLongClickListener f;
    private final w n;

    public static class a extends RecyclerView.b0 {
        public a(View view) {
            super(view);
        }
    }

    public x(z zVar, View.OnLongClickListener onLongClickListener, w wVar) {
        this.c = zVar;
        this.f = onLongClickListener;
        this.n = wVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(a aVar, int i) {
        View view = aVar.a;
        view.setOnClickListener(new a(this, i));
        view.setOnLongClickListener(this.f);
        this.c.b(i, view);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public a M(ViewGroup viewGroup, int i) {
        return new a(this.n.a(viewGroup.getContext(), viewGroup));
    }

    public /* synthetic */ void X(int i, View view) {
        this.c.d(i);
    }

    public void Y(String str) {
        if (!rw.equal(str, this.c.e())) {
            this.c.a(str);
            z();
        }
    }

    public void Z(List<Show> list) {
        this.c.c(list);
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.f();
    }
}
