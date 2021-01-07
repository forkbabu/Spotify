package com.spotify.libs.onboarding.allboarding.search;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.v;
import com.spotify.allboarding.model.v1.proto.SearchItem;
import com.spotify.libs.onboarding.allboarding.c;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class a extends v<SearchItem, RecyclerView.b0> {
    private static final m.d<SearchItem> q = new C0165a();
    private final Picasso n;
    private final rmf<Integer, SearchItem, f> o;
    private final rmf<Integer, SearchItem, f> p;

    /* renamed from: com.spotify.libs.onboarding.allboarding.search.a$a  reason: collision with other inner class name */
    public static final class C0165a extends m.d<SearchItem> {
        C0165a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean a(SearchItem searchItem, SearchItem searchItem2) {
            SearchItem searchItem3 = searchItem;
            SearchItem searchItem4 = searchItem2;
            h.e(searchItem3, "oldItem");
            h.e(searchItem4, "newItem");
            return h.a(searchItem3, searchItem4);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean b(SearchItem searchItem, SearchItem searchItem2) {
            SearchItem searchItem3 = searchItem;
            SearchItem searchItem4 = searchItem2;
            h.e(searchItem3, "oldItem");
            h.e(searchItem4, "newItem");
            return h.a(searchItem3.q(), searchItem4.q());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: rmf<? super java.lang.Integer, ? super com.spotify.allboarding.model.v1.proto.SearchItem, kotlin.f> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: rmf<? super java.lang.Integer, ? super com.spotify.allboarding.model.v1.proto.SearchItem, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Picasso picasso, rmf<? super Integer, ? super SearchItem, f> rmf, rmf<? super Integer, ? super SearchItem, f> rmf2) {
        super(q);
        h.e(picasso, "picasso");
        this.n = picasso;
        this.o = rmf;
        this.p = rmf2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        h.e(b0Var, "holder");
        SearchItem searchItem = (SearchItem) Y(i);
        if (b0Var instanceof b) {
            h.d(searchItem, "searchItem");
            ((b) b0Var).j0(searchItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        Context context = viewGroup.getContext();
        h.d(context, "parent.context");
        View g = c.g(context, C0707R.layout.glue_listtile_2_image, viewGroup, false, 4);
        h.d(g, "view");
        return new b(g, this.n, this.o, this.p);
    }
}
