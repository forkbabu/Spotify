package com.spotify.rxjava2;

import io.reactivex.y;

public final class u implements fjf<y> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final u a = new u();
    }

    public static u a() {
        return a.a;
    }

    public static y b() {
        y a2 = io.reactivex.schedulers.a.a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return b();
    }
}
