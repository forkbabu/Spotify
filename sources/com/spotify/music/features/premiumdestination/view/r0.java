package com.spotify.music.features.premiumdestination.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class r0 extends pk9.a<a> {

    static class a extends s51.c.a<ViewGroup> {
        private final ViewGroup b;

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = (ViewGroup) viewGroup.findViewById(C0707R.id.content);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.b.removeAllViews();
            for (s81 s812 : s81.children()) {
                s51<?> a = w51.g().a(w51.c().d(s812));
                ViewGroup viewGroup = this.b;
                if (a != null) {
                    View h = a.h(viewGroup, w51);
                    a.c(h, s812, w51, bVar);
                    viewGroup.addView(h);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((CardView) je.G(viewGroup, C0707R.layout.value_card, viewGroup, false));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_value_card;
    }
}
