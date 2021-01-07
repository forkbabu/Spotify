package com.spotify.music.features.entityselector.pages.tracks.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.spotify.music.C0707R;
import com.spotify.music.preview.q;
import com.squareup.picasso.Picasso;
import io.reactivex.subjects.c;
import kotlin.jvm.internal.h;

public final class a extends v<uy4, SuggestedSongViewHolder> {
    private final Picasso n;
    private final q o;
    private final c<com.spotify.music.features.entityselector.common.a> p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Picasso picasso, q qVar, c<com.spotify.music.features.entityselector.common.a> cVar) {
        super(new b());
        h.e(picasso, "picasso");
        h.e(qVar, "previewOverlay");
        h.e(cVar, "userInteractionSubject");
        this.n = picasso;
        this.o = qVar;
        this.p = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        SuggestedSongViewHolder suggestedSongViewHolder = (SuggestedSongViewHolder) b0Var;
        h.e(suggestedSongViewHolder, "holder");
        Object Y = Y(i);
        h.d(Y, "getItem(position)");
        suggestedSongViewHolder.j0((uy4) Y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.suggested_song_parent_view, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…      false\n            )");
        return new SuggestedSongViewHolder(inflate, this.n, this.o, this.p);
    }
}
