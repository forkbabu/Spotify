package com.spotify.music.features.california.feature;

import defpackage.bxd;
import kotlin.jvm.internal.h;

public final class b implements fjf<bxd> {
    private final wlf<bxd.a> a;
    private final wlf<etd> b;

    public b(wlf<bxd.a> wlf, wlf<etd> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        bxd.a aVar = this.a.get();
        etd etd = this.b.get();
        h.e(aVar, "factory");
        h.e(etd, "pageContext");
        bxd a2 = aVar.a(etd.a().A());
        h.d(a2, "factory.create(pageConte…LifecycleOwner.lifecycle)");
        return a2;
    }
}
