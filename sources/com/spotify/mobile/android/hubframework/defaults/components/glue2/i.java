package com.spotify.mobile.android.hubframework.defaults.components.glue2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.hubframework.defaults.d;
import defpackage.g90;
import defpackage.s51;
import java.util.EnumSet;

/* access modifiers changed from: package-private */
public abstract class i<V extends g90> implements d<View> {
    private final Class<V> a;
    private final EnumSet<GlueLayoutTraits.Trait> b;

    i(EnumSet<GlueLayoutTraits.Trait> enumSet, Class<V> cls) {
        enumSet.getClass();
        this.b = enumSet;
        cls.getClass();
        this.a = cls;
    }

    /* access modifiers changed from: protected */
    public abstract void a(V v, s81 s81, w51 w51, s51.b bVar);

    @Override // defpackage.s51
    public void b(View view, s81 s81, s51.a<View> aVar, int... iArr) {
        Class<V> cls = this.a;
        int i = e90.i;
        g91.a(l70.o(view, cls).getView(), s81, aVar, iArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.spotify.mobile.android.hubframework.defaults.components.glue2.i<V extends g90> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s51
    public final void c(View view, s81 s81, w51 w51, s51.b bVar) {
        Class<V> cls = this.a;
        int i = e90.i;
        a(l70.o(view, cls), s81, w51, bVar);
    }

    @Override // com.spotify.mobile.android.hubframework.defaults.d
    public EnumSet<GlueLayoutTraits.Trait> e() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public abstract V f(Context context, ViewGroup viewGroup, w51 w51);

    @Override // defpackage.s51
    public final View h(ViewGroup viewGroup, w51 w51) {
        return f(viewGroup.getContext(), viewGroup, w51).getView();
    }
}
