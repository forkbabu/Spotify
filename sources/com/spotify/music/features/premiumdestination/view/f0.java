package com.spotify.music.features.premiumdestination.view;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentModel;
import com.spotify.music.C0707R;
import defpackage.p81;
import defpackage.pk9;
import defpackage.s51;
import defpackage.s81;
import kotlin.jvm.internal.h;

public class f0 extends pk9.a<a> {
    private final h a;

    static class a extends s51.c.a<ViewGroup> {
        private final Button b;
        private final h c;
        private final int f;
        private final int n;
        private final int o;
        private final int p;

        protected a(ViewGroup viewGroup, h hVar) {
            super(viewGroup);
            this.b = (Button) viewGroup.findViewById(C0707R.id.offer_cta);
            this.c = hVar;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ViewGroup) this.a).getLayoutParams();
            DisplayMetrics displayMetrics = ((ViewGroup) this.a).getResources().getDisplayMetrics();
            this.f = C(displayMetrics, marginLayoutParams.leftMargin);
            this.n = C(displayMetrics, marginLayoutParams.topMargin);
            this.o = C(displayMetrics, marginLayoutParams.rightMargin);
            this.p = C(displayMetrics, marginLayoutParams.bottomMargin);
        }

        private static s81 B(int i, int i2, int i3, int i4) {
            s81.a builder = HubsImmutableComponentModel.builder();
            p81.a e = HubsImmutableComponentBundle.builder().e("margin", HubsImmutableComponentBundle.builder().j("leading", i).j("top", i2).j("trailing", i3).j("bottom", i4).d());
            builder.getClass();
            h.e(e, "custom");
            return builder.p(e.d()).l();
        }

        private static int C(DisplayMetrics displayMetrics, int i) {
            return (int) (((float) i) / displayMetrics.density);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            int i;
            s81 s812;
            this.b.setText(s81.text().title());
            if ("full_width".equals(s81.custom().string("mode"))) {
                i = 0;
                s812 = B(16, 8, 16, 8);
            } else {
                i = -2;
                s812 = B(this.f, this.n, this.o, this.p);
            }
            ViewGroup.LayoutParams layoutParams = this.b.getLayoutParams();
            layoutParams.width = i;
            this.b.setLayoutParams(layoutParams);
            h hVar = this.c;
            V v = this.a;
            hVar.b(s812, (ViewGroup) v, ((ViewGroup) v).getResources().getDisplayMetrics());
            Button button = this.b;
            if (s81.events().containsKey("click")) {
                i91.b(w51.b()).e("click").d(s81).c(button).a();
            }
        }
    }

    public f0(h hVar) {
        this.a = hVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.offer_cta, viewGroup, false), this.a);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_offer_cta;
    }
}
