package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import defpackage.ia0;
import defpackage.s51;
import java.util.EnumSet;

abstract class x<H extends ia0> extends h<H> {

    static final class b extends x<ia0> {
        public b() {
            super(ia0.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.e().a(context, viewGroup);
        }
    }

    static final class c extends f {
        c() {
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.e().b(context, viewGroup);
        }
    }

    static final class d extends x<ia0> {
        public d() {
            super(ia0.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.e().d(context, viewGroup);
        }
    }

    static final class e extends f {
        e() {
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.e().e(context, viewGroup);
        }
    }

    private static abstract class f extends x<qa0> {
        public f() {
            super(qa0.class, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.x, com.spotify.mobile.android.hubframework.defaults.components.glue.h
        public void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            qa0 qa0 = (qa0) g90;
            i(qa0, s81, w51);
            qa0.setSubtitle(s81.text().description());
        }
    }

    x(Class cls, a aVar) {
        super(EnumSet.of(GlueLayoutTraits.Trait.HEADER), cls);
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobile.android.hubframework.defaults.components.glue.h
    public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
        i((ia0) g90, s81, w51);
    }

    /* JADX WARN: Incorrect args count in method signature: (TH;Ls81;Lw51;Ls51$b;)V */
    /* access modifiers changed from: protected */
    public void i(ia0 ia0, s81 s81, w51 w51) {
        ia0.setTitle(s81.text().title());
        View B2 = ia0.B2();
        boolean z = false;
        if (B2 != null) {
            if (s81.target() != null) {
                z = true;
            }
            ia0.S(z);
            t51.a(w51, B2, s81);
        } else {
            ia0.S(false);
        }
        ia0.q1(s81.text().accessory());
    }
}
