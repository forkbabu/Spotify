package com.spotify.music.features.blendinvitation;

import com.spotify.http.u;
import com.spotify.music.features.blendinvitation.api.b;
import kotlin.jvm.internal.h;

public final class d implements fjf<b> {
    private final c a;
    private final wlf<u> b;

    public d(c cVar, wlf<u> wlf) {
        this.a = cVar;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c cVar = this.a;
        u uVar = this.b.get();
        cVar.getClass();
        h.e(uVar, "retrofitMaker");
        Object c = uVar.c(b.class);
        h.d(c, "retrofitMaker.createWebg…tionEndpoint::class.java)");
        return (b) c;
    }
}
