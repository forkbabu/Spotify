package com.spotify.music.features.premiumdestination.view;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.music.C0707R;
import com.squareup.picasso.Picasso;
import defpackage.pk9;
import defpackage.s51;

public class x0 extends pk9.a<a> {
    private static final int b = Color.parseColor("#333333");
    private final Picasso a;

    static class a extends s51.c.a<ViewGroup> {
        private final TextView b;
        private final TextView c = ((TextView) ((ViewGroup) this.a).findViewById(C0707R.id.value_card_premium_description));
        private final ImageView f = ((ImageView) ((ViewGroup) this.a).findViewById(C0707R.id.single_value_card_image));
        private final Picasso n;

        protected a(ViewGroup viewGroup, Picasso picasso) {
            super(viewGroup);
            this.n = picasso;
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
            this.b.setText(s81.text().title());
            this.c.setText(s81.text().subtitle());
            x81 main = s81.images().main();
            this.n.m(main != null ? main.uri() : null).n(this.f, null);
            try {
                if (s81.custom().string("backgroundColor") != null) {
                    i = Color.parseColor(s81.custom().string("backgroundColor"));
                } else {
                    i = x0.b;
                }
            } catch (IllegalArgumentException unused) {
                i = x0.b;
            }
            ((ViewGroup) this.a).setBackgroundColor(i);
        }
    }

    public x0(Picasso picasso) {
        this.a = picasso;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.value_card_single, viewGroup, false), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_value_card_single;
    }
}
