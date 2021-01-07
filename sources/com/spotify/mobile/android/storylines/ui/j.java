package com.spotify.mobile.android.storylines.ui;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.mobile.android.storylines.model.StorylinesCardImageModel;
import com.spotify.mobile.android.storylines.model.b;
import com.spotify.mobile.android.storylines.ui.StorylinesCardView;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;

public class j extends RecyclerView.e<i> {
    private final List<StorylinesCardImageModel> c = new ArrayList(0);
    private final Picasso f;
    private StorylinesCardView.a n;
    private b o;

    public j(Picasso picasso) {
        this.f = picasso;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(i iVar, int i) {
        iVar.C.b(this.c.get(i), this.f, this.n, this.o);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public i M(ViewGroup viewGroup, int i) {
        return new i(je.G(viewGroup, C0707R.layout.storylines_card, viewGroup, false));
    }

    public void X(List<StorylinesCardImageModel> list, StorylinesCardView.a aVar, b bVar) {
        this.n = aVar;
        this.o = bVar;
        this.c.clear();
        this.c.addAll(list);
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.c.size();
    }
}
