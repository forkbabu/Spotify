package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

public final class i implements fjf<h> {
    private final wlf<g> a;

    public i(wlf<g> wlf) {
        this.a = wlf;
    }

    public static h a(g gVar) {
        return new h(gVar);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new h(this.a.get());
    }
}
