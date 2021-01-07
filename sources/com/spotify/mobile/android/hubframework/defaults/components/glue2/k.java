package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import defpackage.kb0;
import defpackage.s51;
import java.util.EnumSet;

public abstract class k<C extends kb0> extends i<C> {

    public static final class a extends k<lb0> {
        public a() {
            super(lb0.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            lb0 lb0 = (lb0) g90;
            g(lb0, s81);
            lb0.E(s81.custom().string("buttonTitle"));
            t51.a(w51, lb0.i(), s81);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return pb0.a(context, viewGroup);
        }
    }

    public static final class b extends k<nb0> {
        public b() {
            super(nb0.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            g((nb0) g90, s81);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return pb0.b(context, viewGroup);
        }
    }

    k(Class<C> cls) {
        super(EnumSet.noneOf(GlueLayoutTraits.Trait.class), cls);
    }

    /* JADX WARN: Incorrect args count in method signature: (TC;Ls81;Lw51;Ls51$b;)V */
    /* access modifiers changed from: protected */
    public void g(kb0 kb0, s81 s81) {
        kb0.setTitle(s81.text().title());
        kb0.setSubtitle(s81.text().subtitle());
    }
}
