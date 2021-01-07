package com.spotify.music.features.premiumdestination.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class t0 extends pk9.a<a> {

    static class a extends s51.c.a<ViewGroup> {
        private final TextView b;
        private final TextView c = ((TextView) ((ViewGroup) this.a).findViewById(C0707R.id.value_card_free_description));

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
            this.b.setText(s81.text().title());
            this.c.setText(s81.text().subtitle());
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.value_card_free, viewGroup, false));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_value_card_free;
    }
}
