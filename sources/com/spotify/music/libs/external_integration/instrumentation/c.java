package com.spotify.music.libs.external_integration.instrumentation;

import java.util.Map;

public final class c implements fjf<b> {
    private final wlf<ere> a;
    private final wlf<Map<Page, bea>> b;

    public c(wlf<ere> wlf, wlf<Map<Page, bea>> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new b(this.a.get(), this.b.get());
    }
}
