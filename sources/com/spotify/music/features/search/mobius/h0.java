package com.spotify.music.features.search.mobius;

import com.spotify.libs.search.history.l;
import com.spotify.libs.search.history.p;

public final class h0 implements fjf<p> {
    private final wlf<l> a;
    private final wlf<String> b;
    private final wlf<Boolean> c;

    public h0(wlf<l> wlf, wlf<String> wlf2, wlf<Boolean> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        p a2 = this.a.get().a(this.b.get(), this.c.get().booleanValue() ? "assisted_curation" : "default");
        yif.g(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }
}
