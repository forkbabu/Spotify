package com.spotify.mobile.android.hubframework.defaults;

import android.content.Context;
import com.spotify.mobile.android.glue.GlueLayoutTraits;
import com.spotify.mobile.android.ui.layout_traits.a;

public final class s implements fjf<a> {
    private final wlf<Context> a;
    private final wlf<w51> b;
    private final wlf<Boolean> c;

    public s(wlf<Context> wlf, wlf<w51> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return GlueLayoutTraits.a(this.a.get(), new a(this.b.get().g()), this.c.get().booleanValue());
    }
}
