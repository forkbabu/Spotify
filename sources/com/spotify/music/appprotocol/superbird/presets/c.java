package com.spotify.music.appprotocol.superbird.presets;

public final class c implements fjf<PresetsEndpoints> {
    private final wlf<ppe> a;

    public c(wlf<ppe> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PresetsEndpoints(this.a.get());
    }
}
