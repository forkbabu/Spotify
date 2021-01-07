package com.spotify.music.features.premiumdestination.view;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.music.C0707R;
import defpackage.pk9;
import defpackage.s51;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class p extends pk9.a<a> {
    private final f a;
    private final h b;

    static class a extends s51.c.a<ViewGroup> {
        private final f b;
        private final ViewGroup c;
        private final h f;

        protected a(ViewGroup viewGroup, f fVar, h hVar) {
            super(viewGroup);
            this.b = fVar;
            this.c = viewGroup;
            this.f = hVar;
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void A(s81 s81, s51.a<View> aVar, int... iArr) {
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.s51.c.a
        public void z(s81 s81, w51 w51, s51.b bVar) {
            this.c.removeAllViews();
            h hVar = this.f;
            V v = this.a;
            hVar.b(s81, (ViewGroup) v, ((ViewGroup) v).getResources().getDisplayMetrics());
            f fVar = this.b;
            List<? extends s81> children = s81.children();
            ViewGroup viewGroup = this.c;
            fVar.getClass();
            ArrayList arrayList = new ArrayList(children.size());
            for (s81 s812 : children) {
                s51<?> a = w51.g().a(w51.c().d(s812));
                if (a != null) {
                    View h = a.h(viewGroup, w51);
                    a.c(h, s812, w51, bVar);
                    arrayList.add(h);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.addView((View) it.next());
            }
            p81 bundle = s81.custom().bundle("backgroundColor");
            if (bundle != null) {
                this.c.setBackgroundColor(Color.parseColor(bundle.string("hex")));
            }
        }
    }

    public p(f fVar, h hVar) {
        this.a = fVar;
        this.b = hVar;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.s51.c
    public s51.c.a a(ViewGroup viewGroup, w51 w51) {
        return new a((ViewGroup) je.G(viewGroup, C0707R.layout.flexbox_container, viewGroup, false), this.a, this.b);
    }

    @Override // defpackage.pk9
    public int d() {
        return C0707R.id.hubs_premium_page_flexbox_container;
    }
}
