package com.spotify.music.features.yourlibraryx.view;

import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;

public final class q implements fjf<YourLibraryXAdapter> {
    private final wlf<r> a;
    private final wlf<EncoreConsumerEntryPoint> b;
    private final wlf<g> c;
    private final wlf<eh9> d;

    public q(wlf<r> wlf, wlf<EncoreConsumerEntryPoint> wlf2, wlf<g> wlf3, wlf<eh9> wlf4) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new YourLibraryXAdapter(this.a.get(), this.b.get(), this.c.get(), this.d.get());
    }
}
