package com.spotify.libs.onboarding.allboarding.picker;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.v;
import com.spotify.libs.onboarding.allboarding.c;
import com.spotify.libs.onboarding.allboarding.room.j;
import com.spotify.libs.onboarding.allboarding.room.y;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class AllboardingRvAdapter extends v<j, RecyclerView.b0> implements m {
    private static final m.d<j> q = new a();
    private final Picasso n;
    private final rmf<j, Integer, f> o;
    private final smf<j, Integer, Boolean, f> p;

    public static final class a extends m.d<j> {
        a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean a(j jVar, j jVar2) {
            j jVar3 = jVar;
            j jVar4 = jVar2;
            h.e(jVar3, "oldItem");
            h.e(jVar4, "newItem");
            return h.a(jVar3, jVar4);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // androidx.recyclerview.widget.m.d
        public boolean b(j jVar, j jVar2) {
            j jVar3 = jVar;
            j jVar4 = jVar2;
            h.e(jVar3, "oldItem");
            h.e(jVar4, "newItem");
            return h.a(jVar3.i(), jVar4.i());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: rmf<? super com.spotify.libs.onboarding.allboarding.room.j, ? super java.lang.Integer, kotlin.f> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: smf<? super com.spotify.libs.onboarding.allboarding.room.j, ? super java.lang.Integer, ? super java.lang.Boolean, kotlin.f> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AllboardingRvAdapter(Picasso picasso, rmf<? super j, ? super Integer, f> rmf, smf<? super j, ? super Integer, ? super Boolean, f> smf) {
        super(q);
        h.e(picasso, "picasso");
        this.n = picasso;
        this.o = rmf;
        this.p = smf;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void K(RecyclerView.b0 b0Var, int i) {
        h.e(b0Var, "holder");
        j jVar = (j) Y(i);
        if (b0Var instanceof fw0) {
            y k = jVar.k();
            h.c(k);
            ((fw0) b0Var).h0(k);
        } else if (b0Var instanceof bw0) {
            h.d(jVar, "item");
            ((bw0) b0Var).l0(jVar);
        } else if (b0Var instanceof aw0) {
            h.d(jVar, "item");
            ((aw0) b0Var).l0(jVar);
        } else if (b0Var instanceof cw0) {
            h.d(jVar, "item");
            ((cw0) b0Var).l0(jVar);
        } else if (b0Var instanceof ew0) {
            h.d(jVar, "item");
            ((ew0) b0Var).l0(jVar);
        } else if (b0Var instanceof dw0) {
            h.d(jVar, "item");
            ((dw0) b0Var).l0(jVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public RecyclerView.b0 M(ViewGroup viewGroup, int i) {
        h.e(viewGroup, "parent");
        Context context = viewGroup.getContext();
        h.d(context, "parent.context");
        View g = c.g(context, i, viewGroup, false, 4);
        if (i == C0707R.layout.allboarding_item_header) {
            h.d(g, "view");
            return new fw0(g);
        } else if (i == C0707R.layout.allboarding_item_artist) {
            h.d(g, "view");
            return new bw0(g, this.o, this.p, this.n);
        } else if (i == C0707R.layout.allboarding_item_artist_more) {
            h.d(g, "view");
            return new aw0(g, this.o, this.p);
        } else if (i == C0707R.layout.allboarding_item_banner) {
            h.d(g, "view");
            return new cw0(g, this.o, this.p, this.n);
        } else if (i == C0707R.layout.allboarding_item_squircle_show) {
            h.d(g, "view");
            return new ew0(g, this.o, this.p, this.n);
        } else if (i == C0707R.layout.allboarding_item_squircle_show_more) {
            h.d(g, "view");
            return new dw0(g, this.o, this.p);
        } else {
            throw new IllegalStateException(je.p0("I don't know objects of that viewType ", i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int w(int i) {
        j jVar = (j) Y(i);
        if (jVar.k() != null) {
            return C0707R.layout.allboarding_item_header;
        }
        if (jVar.b() != null) {
            return C0707R.layout.allboarding_item_artist;
        }
        if (jVar.c() != null) {
            return C0707R.layout.allboarding_item_artist_more;
        }
        if (jVar.e() != null) {
            return C0707R.layout.allboarding_item_banner;
        }
        if (jVar.m() != null) {
            return C0707R.layout.allboarding_item_squircle_show;
        }
        if (jVar.n() != null) {
            return C0707R.layout.allboarding_item_squircle_show_more;
        }
        throw new IllegalStateException("This Picker object seems invalid -> " + jVar);
    }
}
