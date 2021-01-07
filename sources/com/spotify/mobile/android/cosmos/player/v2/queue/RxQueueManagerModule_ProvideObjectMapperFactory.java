package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.json.e;
import com.spotify.music.json.g;

public final class RxQueueManagerModule_ProvideObjectMapperFactory implements fjf<ObjectMapper> {
    private final wlf<g> objectMapperFactoryProvider;

    public RxQueueManagerModule_ProvideObjectMapperFactory(wlf<g> wlf) {
        this.objectMapperFactoryProvider = wlf;
    }

    public static RxQueueManagerModule_ProvideObjectMapperFactory create(wlf<g> wlf) {
        return new RxQueueManagerModule_ProvideObjectMapperFactory(wlf);
    }

    public static ObjectMapper provideObjectMapper(g gVar) {
        e b = gVar.b();
        b.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ObjectMapper build = b.build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }

    @Override // defpackage.wlf
    public ObjectMapper get() {
        return provideObjectMapper(this.objectMapperFactoryProvider.get());
    }
}
