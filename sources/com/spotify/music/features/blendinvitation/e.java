package com.spotify.music.features.blendinvitation;

import android.os.Bundle;
import kotlin.jvm.internal.h;

public final class e implements fjf<x34> {
    private final c a;
    private final wlf<Bundle> b;

    public e(c cVar, wlf<Bundle> wlf) {
        this.a = cVar;
        this.b = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        c cVar = this.a;
        Bundle bundle = this.b.get();
        cVar.getClass();
        h.e(bundle, "arguments");
        return new x34(null, bundle.getBoolean("link_expired", false), 1);
    }
}
