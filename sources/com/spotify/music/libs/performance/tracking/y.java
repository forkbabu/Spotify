package com.spotify.music.libs.performance.tracking;

import com.spotify.performancesdk.timekeeper.c;
import com.spotify.performancesdk.timekeeper.h;

public final class y implements fjf<h> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final y a = new y();
    }

    public static y a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        h a2 = c.a();
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
