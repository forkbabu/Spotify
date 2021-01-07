package com.spotify.rxjava2;

import io.reactivex.y;

public final class v implements fjf<y> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final v a = new v();
    }

    public static v a() {
        return a.a;
    }

    public static y b() {
        y c = io.reactivex.schedulers.a.c();
        yif.g(c, "Cannot return null from a non-@Nullable @Provides method");
        return c;
    }

    @Override // defpackage.wlf
    public Object get() {
        return b();
    }
}
