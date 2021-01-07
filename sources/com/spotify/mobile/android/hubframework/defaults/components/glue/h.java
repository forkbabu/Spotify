package com.spotify.mobile.android.hubframework.defaults.components.glue;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import defpackage.g90;
import defpackage.s51;
import java.util.EnumSet;

/* access modifiers changed from: package-private */
public abstract class h<V extends g90> implements d<View> {
    private final Class<V> a;
    private final EnumSet<GlueLayoutTraits.Trait> b;

    h(EnumSet<GlueLayoutTraits.Trait> enumSet, Class<V> cls) {
        enumSet.getClass();
        this.b = enumSet;
        cls.getClass();
        this.a = cls;
    }

    /* access modifiers changed from: protected */
    public abstract void a(V v, s81 s81, w51 w51, s51.b bVar);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.spotify.mobile.android.hubframework.defaults.components.glue.h<V extends g90> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        Class<V> cls = this.a;
        int i = e90.i;
        g(l70.o(view, cls), s81, aVar, iArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.spotify.mobile.android.hubframework.defaults.components.glue.h<V extends g90> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s51
    public final void c(View view, s81 s81, w51 w51, s51.b bVar) {
        Class<V> cls = this.a;
        int i = e90.i;
        g90 o = l70.o(view, cls);
        a(o, s81, w51, bVar);
        if (o instanceof f90) {
            ((f90) o).setActive("1".equals(s81.custom().get("hubs:glue:highlight")));
        }
        View view2 = o.getView();
        int i2 = k.c;
        view2.setEnabled(!s81.custom().boolValue("disabled", false));
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract V f(Context context, ViewGroup viewGroup, w51 w51);

    /* access modifiers changed from: protected */
    public void g(V v, s81 s81, s51.a<View> aVar, int... iArr) {
        g91.a(v.getView(), s81, aVar, iArr);
    }

    @Override // defpackage.s51
    public final View h(ViewGroup viewGroup, w51 w51) {
        return f(viewGroup.getContext(), viewGroup, w51).getView();
    }
}
