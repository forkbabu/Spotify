package com.spotify.music.podcast.freetierlikes.tabs.di;

import com.spotify.encore.consumer.entrypoint.EncoreConsumerEntryPoint;
import com.spotify.music.podcast.entity.adapter.episoderow.i;
import com.spotify.music.podcast.freetierlikes.tabs.di.b;
import kotlin.jvm.internal.h;

public final class e implements fjf<i.a> {
    private final wlf<EncoreConsumerEntryPoint> a;
    private final wlf<jhc> b;

    public e(wlf<EncoreConsumerEntryPoint> wlf, wlf<jhc> wlf2) {
        this.a = wlf;
        this.b = wlf2;
    }

    @Override // defpackage.wlf
    public Object get() {
        EncoreConsumerEntryPoint encoreConsumerEntryPoint = this.a.get();
        jhc jhc = this.b.get();
        b.a aVar = b.a;
        h.e(encoreConsumerEntryPoint, "entryPoint");
        h.e(jhc, "eventsHandler");
        return new a(encoreConsumerEntryPoint, jhc);
    }
}