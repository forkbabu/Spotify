package com.spotify.music.features.premiumdestination.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class v extends pk9.a<a> {
    private final h a;

    static class a extends s51.c.a<ViewGroup> {
        private final TextView b;
        private final h c;

        protected a(ViewGroup viewGroup, h hVar) {
            super(viewGroup);
            this.b = (TextView) viewGroup.findViewById(C0707R.id.flexbox_title);
            this.c = hVar;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            h hVar = this.c;
            V v = this.a;
            hVar.b(s81, (ViewGroup) v, ((ViewGroup) v).getResources().getDisplayMetrics());
            this.b.setText(s81.text().title());
        }
    }

    public v(h hVar) {
        this.a = hVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.flexbox_title, viewGroup, false), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_flexbox_title;
    }
}
