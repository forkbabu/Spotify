package com.spotify.music.features.premiumdestination.view;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class z extends pk9.a<a> {

    static class a extends s51.c.a<TextView> {
        a(TextView textView) {
            super(textView);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            ((TextView) this.a).setText(s81.text().title());
            if ("natural".equals(s81.custom().string("alignment", ""))) {
                ((TextView) this.a).setGravity(8388611);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((TextView) je.G(viewGroup, C0707R.layout.premium_page_header, viewGroup, false));
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_header;
    }
}
