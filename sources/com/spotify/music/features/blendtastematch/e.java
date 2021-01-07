package com.spotify.music.features.blendtastematch;

import com.spotify.http.u;
import com.spotify.music.features.blendtastematch.api.a;
import kotlin.jvm.internal.h;

public final class e implements fjf<a> {
    private final d a;
    private final wlf<u> b;

    public e(d dVar, wlf<u> wlf) {
        this.a = dVar;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        d dVar = this.a;
        u uVar = this.b.get();
        dVar.getClass();
        h.e(uVar, "retrofitMaker");
        Object c = uVar.c(a.class);
        h.d(c, "retrofitMaker.createWebg…tionEndpoint::class.java)");
        return (a) c;
    }
}
