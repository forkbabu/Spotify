package com.spotify.music.features.premiumdestination.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class n extends pk9.a<a> {
    private final h a;

    static class a extends s51.c.a<ViewGroup> {
        private final Button b;
        private final h c;

        protected a(ViewGroup viewGroup, h hVar) {
            super(viewGroup);
            this.b = (Button) viewGroup.findViewById(C0707R.id.flexbox_button);
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
            Button button = this.b;
            if (s81.events().containsKey("click")) {
                i91.b(w51.b()).e("click").d(s81).c(button).a();
            }
        }
    }

    public n(h hVar) {
        this.a = hVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.flexbox_button, viewGroup, false), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_flexbox_button;
    }
}
