package com.spotify.podcast.endpoints;

public final class o implements fjf<PodcastDecorateEndpointImpl> {
    private final wlf<m> a;
    private final wlf<u> b;

    public o(wlf<m> wlf, wlf<u> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new PodcastDecorateEndpointImpl(this.a.get(), this.b.get());
    }
}
