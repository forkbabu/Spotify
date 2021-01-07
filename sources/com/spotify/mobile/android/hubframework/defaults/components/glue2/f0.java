package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import defpackage.ia0;
import defpackage.s51;
import java.util.EnumSet;

/* access modifiers changed from: package-private */
@Deprecated
public abstract class f0<H extends ia0> extends i<H> {

    static final class a extends f0<ia0> {
        public a() {
            super(ia0.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.f0, com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            ((ia0) g90).setTitle(s81.text().title());
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.e().g().c(context, viewGroup);
        }
    }

    static final class b extends f0<ia0> {
        public b() {
            super(ia0.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.f0, com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            ((ia0) g90).setTitle(s81.text().title());
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.e().g().d(context, viewGroup);
        }
    }

    static final class c extends f0<ia0> {
        public c() {
            super(ia0.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.f0, com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            ((ia0) g90).setTitle(s81.text().title());
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.e().g().a(context, viewGroup);
        }
    }

    static final class d extends f0<qa0> {
        public d() {
            super(qa0.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.e().g().f(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void g(qa0 qa0, s81 s81, w51 w51, s51.b bVar) {
            qa0.setTitle(s81.text().title());
            qa0.setSubtitle(s81.text().description());
        }
    }

    static final class e extends f0<oa0> {
        public e() {
            super(oa0.class);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return e90.e().g().e(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void g(oa0 oa0, s81 s81, w51 w51, s51.b bVar) {
            oa0.setTitle(s81.text().title());
            oa0.e(s81.text().subtitle());
        }
    }

    f0(Class<H> cls) {
        super(EnumSet.of(GlueLayoutTraits.Trait.HEADER), cls);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void a(H h, s81 s81, w51 w51, s51.b bVar) {
        h.setTitle(s81.text().title());
    }
}
