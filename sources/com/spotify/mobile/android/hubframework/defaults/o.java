package com.spotify.mobile.android.hubframework.defaults;

import android.content.Context;
import com.spotify.mobile.android.ui.layout_traits.a;

public final class o implements fjf<n> {
    private final wlf<Context> a;
    private final wlf<a> b;
    private final wlf<Integer> c;

    public o(wlf<Context> wlf, wlf<a> wlf2, wlf<Integer> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    public static n a(Context context, a aVar, int i) {
        return new n(context, aVar, i);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n(this.a.get(), this.b.get(), this.c.get().intValue());
    }
}
