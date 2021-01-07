package com.spotify.music.features.entityselector.pages.podcasts.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.internal.h;

public final class d extends v<sy4, e> {
    private final Picasso n;
    private final PublishSubject<sy4> o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Picasso picasso, PublishSubject<sy4> publishSubject) {
        super(new a());
        h.e(picasso, "picasso");
        h.e(publishSubject, "podcastEpisodeClickSubject");
        this.n = picasso;
        this.o = publishSubject;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        e eVar = (e) b0Var;
        h.e(eVar, "viewHolder");
        Object Y = Y(i);
        h.d(Y, "getItem(position)");
        eVar.j0((sy4) Y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C0707R.layout.recently_played_list_item, viewGroup, false);
        h.d(inflate, "LayoutInflater.from(pare…      false\n            )");
        return new e(inflate, this.n, this.o);
    }
}
