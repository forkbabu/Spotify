package com.spotify.music.notification;

import com.spotify.http.u;
import kotlin.jvm.internal.h;

public final class b implements fjf<c> {
    private final a a;
    private final wlf<u> b;

    public b(a aVar, wlf<u> wlf) {
        this.a = aVar;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        a aVar = this.a;
        u uVar = this.b.get();
        aVar.getClass();
        h.e(uVar, "retrofitMaker");
        Object c = uVar.c(c.class);
        h.d(c, "retrofitMaker.createWebg…ncesEndpoint::class.java)");
        return (c) c;
    }
}
