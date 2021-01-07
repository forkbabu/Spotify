package com.spotify.music.features.premiumdestination.view;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class x extends pk9.a<a> {

    static class a extends s51.c.a<ViewGroup> {
        protected a(ViewGroup viewGroup) {
            super(viewGroup);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            GradientDrawable gradientDrawable = null;
            try {
                p81 bundle = s81.custom().bundle("gradient");
                if (bundle != null) {
                    gradientDrawable = new GradientDrawable("topLeftBottomRight".equals(bundle.string("direction")) ? GradientDrawable.Orientation.TL_BR : GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor(bundle.string("startColor")), Color.parseColor(bundle.string("endColor"))});
                }
            } catch (IllegalArgumentException unused) {
            }
            ((ViewGroup) this.a).setBackground(gradientDrawable);
            ((ViewGroup) this.a).removeAllViews();
            for (s81 s812 : s81.children()) {
                s51<?> a = w51.g().a(w51.c().d(s812));
                ViewGroup viewGroup = (ViewGroup) this.a;
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
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.premium_page_gradient, viewGroup, false));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_gradient;
    }
}
