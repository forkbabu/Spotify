package com.spotify.music.libs.search.trending;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import com.spotify.music.C0707R;
import defpackage.s51;
import java.util.EnumSet;

public class j extends d.a<a> {
    private final TrendingSearchLogger a;
    private final boolean b;

    static class a extends s51.c.a<RecyclerView> {
        private final i61 b;
        private final RecyclerView c;

        /* renamed from: com.spotify.music.libs.search.trending.j$a$a  reason: collision with other inner class name */
        class C0300a extends RecyclerView.q {
            final /* synthetic */ TrendingSearchLogger a;

            C0300a(TrendingSearchLogger trendingSearchLogger) {
                this.a = trendingSearchLogger;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.q
            public void a(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    this.a.o();
                    a.this.c.D0(this);
                }
            }
        }

        protected a(RecyclerView recyclerView, w51 w51, TrendingSearchLogger trendingSearchLogger, boolean z) {
            super(recyclerView);
            this.c = recyclerView;
            recyclerView.setHasFixedSize(true);
            if (z) {
                int dimensionPixelOffset = recyclerView.getResources().getDimensionPixelOffset(C0707R.dimen.content_area_horizontal_margin);
                recyclerView.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
                recyclerView.setClipToPadding(false);
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, 0);
            staggeredGridLayoutManager.m2(2);
            staggeredGridLayoutManager.D1(false);
            i61 i61 = new i61(w51);
            this.b = i61;
            recyclerView.setLayoutManager(staggeredGridLayoutManager);
            recyclerView.S0(i61, false);
            recyclerView.n(new C0300a(trendingSearchLogger));
            trendingSearchLogger.g(recyclerView);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
            g91.b(this.c, aVar, iArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.b.c0(s81.children());
            this.b.z();
        }
    }

    public j(TrendingSearchLogger trendingSearchLogger, boolean z) {
        trendingSearchLogger.getClass();
        this.a = trendingSearchLogger;
        this.b = z;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((RecyclerView) je.G(viewGroup, C0707R.layout.trending_searches_scrolling_view, viewGroup, false), w51, this.a, this.b);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return EnumSet.of(GlueLayoutTraits.Trait.STACKABLE, GlueLayoutTraits.Trait.SPACED_VERTICALLY, GlueLayoutTraits.Trait.OUTSIDE_CONTENT_AREA);
    }
}
