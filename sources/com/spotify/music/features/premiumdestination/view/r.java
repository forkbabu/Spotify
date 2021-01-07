package com.spotify.music.features.premiumdestination.view;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.common.base.MoreObjects;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;

public class r extends pk9.a<a> {
    private final h a;

    static class a extends s51.c.a<ViewGroup> {
        private final TextView b;
        private final h c;

        protected a(ViewGroup viewGroup, h hVar) {
            super(viewGroup);
            this.b = (TextView) viewGroup.findViewById(C0707R.id.flexbox_legal);
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
            String title = s81.text().title();
            if (MoreObjects.isNullOrEmpty(title)) {
                this.b.setText("");
            } else {
                int indexOf = title.indexOf(91);
                int indexOf2 = title.indexOf(93);
                if (indexOf < 0 || indexOf2 < 0 || indexOf2 <= indexOf) {
                    this.b.setText(title);
                } else {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) title, 0, indexOf).append((CharSequence) title, indexOf + 1, indexOf2).append((CharSequence) title, indexOf2 + 1, title.length());
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.b.getLinkTextColors().getDefaultColor()), indexOf, indexOf2 - 1, 33);
                    this.b.setText(spannableStringBuilder);
                }
            }
            TextView textView = this.b;
            if (s81.events().containsKey("click")) {
                i91.b(w51.b()).e("click").d(s81).c(textView).a();
            }
        }
    }

    public r(h hVar) {
        this.a = hVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.flexbox_legal, viewGroup, false), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_flexbox_legal;
    }
}
