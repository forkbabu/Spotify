package com.spotify.nowplaying.core.di;

import androidx.fragment.app.Fragment;
import defpackage.bxd;
import kotlin.jvm.internal.h;

public final class d implements fjf<bxd> {
    private final wlf<bxd.a> a;
    private final wlf<Fragment> b;

    public d(wlf<bxd.a> wlf, wlf<Fragment> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        bxd.a aVar = this.a.get();
        Fragment fragment = this.b.get();
        h.e(aVar, "factory");
        h.e(fragment, "fragment");
        bxd a2 = aVar.a(fragment.A());
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
