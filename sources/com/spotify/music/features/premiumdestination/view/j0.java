package com.spotify.music.features.premiumdestination.view;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.mobile.android.util.x;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class j0 extends pk9.a<a> {
    private final h a;

    static class a extends s51.c.a<ViewGroup> {
        private final h b;
        private final TextView c;

        protected a(ViewGroup viewGroup, h hVar) {
            super(viewGroup);
            this.c = (TextView) viewGroup.findViewById(C0707R.id.legal_text);
            this.b = hVar;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            if (s81.text().title() == null) {
                this.c.setText("");
            } else {
                this.c.setMovementMethod(LinkMovementMethod.getInstance());
                Spannable spannable = (Spannable) z42.m(s81.text().title());
                x.l(spannable, null);
                this.c.setText(spannable);
            }
            if ("natural".equals(s81.custom().string("alignment", ""))) {
                this.c.setGravity(8388611);
            }
            h hVar = this.b;
            V v = this.a;
            hVar.b(s81, (ViewGroup) v, ((ViewGroup) v).getResources().getDisplayMetrics());
        }
    }

    public j0(h hVar) {
        this.a = hVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.offer_legal_link, viewGroup, false), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_offer_legal_text;
    }
}
