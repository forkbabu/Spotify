package com.spotify.music.features.premiumdestination.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class n0 extends pk9.a<a> {

    static class a extends s51.c.a<ViewGroup> {
        private final TextView b;
        private final TextView c;
        private final TextView f;

        protected a(ViewGroup viewGroup) {
            super(viewGroup);
            this.b = (TextView) viewGroup.findViewById(C0707R.id.offer_title);
            this.c = (TextView) viewGroup.findViewById(C0707R.id.offer_price);
            this.f = (TextView) viewGroup.findViewById(C0707R.id.offer_period);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.b.setText(s81.text().title());
            this.c.setText(s81.text().subtitle());
            this.f.setText(s81.text().accessory());
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.offer_title_price_period, viewGroup, false));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_offer_title_price_period;
    }
}
