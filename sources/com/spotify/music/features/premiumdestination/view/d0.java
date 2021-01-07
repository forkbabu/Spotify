package com.spotify.music.features.premiumdestination.view;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class d0 extends pk9.a<a> {
    private static final int a = Color.parseColor("#404040");
    private static final int b = Color.parseColor("#404040");

    static class a extends s51.c.a<ViewGroup> {
        private final LinearLayout b;

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = (LinearLayout) viewGroup.findViewById(C0707R.id.content);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            int i;
            int i2;
            try {
                p81 bundle = s81.custom().bundle("gradient");
                if (bundle != null) {
                    i = Color.parseColor(bundle.string("startColor"));
                    i2 = Color.parseColor(bundle.string("endColor"));
                } else {
                    i = d0.a;
                    i2 = d0.b;
                }
            } catch (IllegalArgumentException unused) {
                i = d0.a;
                i2 = d0.b;
            }
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i, i2});
            gradientDrawable.setCornerRadius(((ViewGroup) this.a).getResources().getDimension(C0707R.dimen.corner_radius_offer_card));
            ((ViewGroup) this.a).setBackground(gradientDrawable);
            this.b.removeAllViews();
            for (s81 s812 : s81.children()) {
                s51<?> a = w51.g().a(w51.c().d(s812));
                LinearLayout linearLayout = this.b;
                if (a != null) {
                    View h = a.h(linearLayout, w51);
                    a.c(h, s812, w51, bVar);
                    linearLayout.addView(h);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.offer_card, viewGroup, false));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_offer_card;
    }
}
