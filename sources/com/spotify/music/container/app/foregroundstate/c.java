package com.spotify.music.container.app.foregroundstate;

import com.spotify.music.container.app.foregroundstate.a;
import io.reactivex.s;
import kotlin.jvm.internal.h;

public final class c implements fjf<s<ForegroundServicesStatus>> {
    private final wlf<f> a;

    public c(wlf<f> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        f fVar = this.a.get();
        a.C0211a aVar = a.a;
        h.e(fVar, "foregroundServicesStatusProvider");
        return fVar.c();
    }
}
