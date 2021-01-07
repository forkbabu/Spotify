package com.spotify.music.playlist.extender;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.music.json.e;
import com.spotify.music.json.g;

public final class m0 implements fjf<ObjectMapper> {
    private final wlf<g> a;

    public m0(wlf<g> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        e b = this.a.get().b();
        b.a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        ObjectMapper build = b.build();
        yif.g(build, "Cannot return null from a non-@Nullable @Provides method");
        return build;
    }
}
