package com.spotify.music.features.followfeed.views;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.spotify.music.C0707R;
import com.spotify.music.features.followfeed.views.FollowRecsView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.h;

public final class c extends RecyclerView.e<j> {
    private FollowRecsView.c c;
    private final List<j45> f = new ArrayList();
    private boolean n;
    private final Picasso o;

    public c(Picasso picasso) {
        h.e(picasso, "picasso");
        this.o = picasso;
    }

    public static final boolean Y(c cVar) {
        if (cVar.n) {
            return true;
        }
        cVar.n = true;
        return false;
    }

    public static final void Z(c cVar, int i) {
        cVar.f.remove(i);
        cVar.I(i);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$b0, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(j jVar, int i) {
        j jVar2 = jVar;
        h.e(jVar2, "holder");
        jVar2.j0(this.f.get(i), i, this.o, new b(this, i, new Handler()));
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$b0' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    public j M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        View G = je.G(viewGroup, C0707R.layout.follow_recs_artist_card, viewGroup, false);
        if (G != null) {
            return new j((ViewGroup) G);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    public final void c0(List<j45> list) {
        h.e(list, "artistModels");
        List<j45> list2 = this.f;
        list2.clear();
        list2.addAll(list);
    }

    public final void f0(FollowRecsView.c cVar) {
        h.e(cVar, "clickListener");
        this.c = cVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int u() {
        return this.f.size();
    }
}
