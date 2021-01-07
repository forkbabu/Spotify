package com.spotify.music.features.premiumdestination.view;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class v0 extends pk9.a<a> {
    private static final int a = Color.parseColor("#006450");
    private static final int b = Color.parseColor("#19E68C");

    static class a extends s51.c.a<ViewGroup> {
        private final TextView b;
        private final TextView c = ((TextView) ((ViewGroup) this.a).findViewById(C0707R.id.value_card_premium_description));

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = (TextView) viewGroup.findViewById(C0707R.id.value_card_header);
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
            this.b.setText(s81.text().title());
            this.c.setText(s81.text().subtitle());
            try {
                p81 bundle = s81.custom().bundle("gradient");
                if (bundle != null) {
                    i = Color.parseColor(bundle.string("startColor"));
                    i2 = Color.parseColor(bundle.string("endColor"));
                } else {
                    i = v0.a;
                    i2 = v0.b;
                }
            } catch (IllegalArgumentException unused) {
                i = v0.a;
                i2 = v0.b;
            }
            ((ViewGroup) this.a).setBackground(new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i, i2}));
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.value_card_premium, viewGroup, false));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_value_card_premium;
    }
}
