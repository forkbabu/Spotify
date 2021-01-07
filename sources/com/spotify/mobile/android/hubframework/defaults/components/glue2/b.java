package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.util.Assertion;
import defpackage.fa0;
import defpackage.s51;
import java.util.EnumSet;

public abstract class b<T extends fa0> extends i<T> {
    private final cqe c;

    /* renamed from: com.spotify.mobile.android.hubframework.defaults.components.glue2.b$b  reason: collision with other inner class name */
    public static class C0179b extends b<u90> {
        public C0179b(cqe cqe) {
            super(u90.class, cqe, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            i((u90) g90, s81, w51);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return j(context, viewGroup);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [fa0, s81] */
        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.b
        public void g(u90 u90, s81 s81) {
            a.b(u90, s81);
        }

        /* access modifiers changed from: protected */
        public fa0 j(Context context, ViewGroup viewGroup) {
            return e90.d().d(context, viewGroup);
        }
    }

    public static class c extends b<y90> {
        public c(cqe cqe) {
            super(y90.class, cqe, null);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public /* bridge */ /* synthetic */ void a(g90 g90, s81 s81, w51 w51, s51.b bVar) {
            i((y90) g90, s81, w51);
        }

        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.i
        public g90 f(Context context, ViewGroup viewGroup, w51 w51) {
            return j(context, viewGroup);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [fa0, s81] */
        /* access modifiers changed from: protected */
        @Override // com.spotify.mobile.android.hubframework.defaults.components.glue2.b
        public void g(y90 y90, s81 s81) {
            a.c(y90, s81);
        }

        /* access modifiers changed from: protected */
        public fa0 j(Context context, ViewGroup viewGroup) {
            return e90.d().j(context, viewGroup, false);
        }
    }

    b(Class cls, cqe cqe, a aVar) {
        super(EnumSet.of(GlueLayoutTraits.Trait.STACKABLE), cls);
        this.c = cqe;
    }

    /* access modifiers changed from: protected */
    public abstract void g(T t, s81 s81);

    /* JADX WARN: Incorrect args count in method signature: (TT;Ls81;Lw51;Ls51$b;)V */
    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: fa0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    public void i(fa0 fa0, s81 s81, w51 w51) {
        i91.a(fa0.getView());
        g(fa0, s81);
        t51.a(w51, fa0.getView(), s81);
        if (s81.events().containsKey("longClick")) {
            i91.b(w51.b()).e("longClick").d(s81).c(fa0.getView()).b();
        }
        cqe cqe = this.c;
        Assertion.l(s81.custom().bundle("calendar") != null, "calendar data is missing!");
        s42 b = s42.b(fa0.getImageView(), cqe);
        p81 bundle = s81.custom().bundle("calendar");
        if (bundle != null) {
            b.c(bundle.string("month", "APR"), bundle.intValue("dayOfMonth", 1));
        }
        a.a(fa0, s81, w51);
        fa0.setActive(s81.custom().boolValue("active", false));
    }
}
