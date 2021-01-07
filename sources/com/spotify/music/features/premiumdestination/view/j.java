package com.spotify.music.features.premiumdestination.view;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class j extends pk9.a<b> {
    wi7 a;

    static class a extends RecyclerView.l {
        private final int a;
        private final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void j(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
            int X = recyclerView.X(view);
            boolean n = nud.n(recyclerView);
            int measuredWidth = (recyclerView.getMeasuredWidth() - view.getLayoutParams().width) / 2;
            if (X != 0) {
                RecyclerView.e adapter = recyclerView.getAdapter();
                adapter.getClass();
                if (X == adapter.u() - 1) {
                    if (n) {
                        rect.set(measuredWidth, 0, this.a, 0);
                    } else {
                        rect.set(this.a, 0, measuredWidth, 0);
                    }
                } else if (n) {
                    rect.set(this.b, 0, this.a, 0);
                } else {
                    rect.set(this.a, 0, this.b, 0);
                }
            } else if (n) {
                rect.set(this.b, 0, measuredWidth, 0);
            } else {
                rect.set(measuredWidth, 0, this.b, 0);
            }
        }
    }

    static class b extends s51.c.a<ViewGroup> {
        private final i61 b;

        protected b(ViewGroup viewGroup, i61 i61, int i, wi7 wi7) {
            super(viewGroup);
            this.b = i61;
            RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(C0707R.id.recycler_view);
            viewGroup.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            z zVar = new z();
            zVar.a(recyclerView);
            recyclerView.k(new a(i, i), -1);
            recyclerView.setAdapter(i61);
            ((RecyclerViewItemIndicator) viewGroup.findViewById(C0707R.id.recycler_view_indicator)).c(recyclerView, zVar);
            wi7.g(recyclerView);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.b.c0(s81.children());
            this.b.z();
        }
    }

    public j(wi7 wi7) {
        this.a = wi7;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new b((ViewGroup) je.G(viewGroup, C0707R.layout.premium_page_carousel, viewGroup, false), new i61(w51), viewGroup.getContext().getResources().getDimensionPixelSize(C0707R.dimen.spacing_value_card), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_carousel;
    }
}
