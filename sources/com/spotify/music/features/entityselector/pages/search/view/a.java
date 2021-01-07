package com.spotify.music.features.entityselector.pages.search.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;
import io.reactivex.subjects.c;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class a extends RecyclerView.e<SearchResultViewHolder> {
    private List<uy4> c = EmptyList.a;
    private final Picasso f;
    private final q n;
    private final c<com.spotify.music.features.entityselector.common.a> o;

    public a(Picasso picasso, q qVar, c<com.spotify.music.features.entityselector.common.a> cVar) {
        h.e(picasso, "picasso");
        h.e(qVar, "previewOverlay");
        h.e(cVar, "userInteractionSubject");
        this.f = picasso;
        this.n = qVar;
        this.o = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(SearchResultViewHolder searchResultViewHolder, int i) {
        SearchResultViewHolder searchResultViewHolder2 = searchResultViewHolder;
        h.e(searchResultViewHolder2, "holder");
        searchResultViewHolder2.j0(this.c.get(i));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public SearchResultViewHolder M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.suggested_song_parent_view, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…      false\n            )");
        return new SearchResultViewHolder(inflate, this.f, this.n, this.o);
    }

    public final void X(List<uy4> list) {
        h.e(list, "trackResultlist");
        this.c = list;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
