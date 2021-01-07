package com.spotify.music.features.podcast.entity.di;

import com.spotify.remoteconfig.AndroidFeaturePodcastEntityProperties;
import kotlin.jvm.internal.h;

public final class r0 implements fjf<Boolean> {
    private final wlf<AndroidFeaturePodcastEntityProperties> a;

    public r0(wlf<AndroidFeaturePodcastEntityProperties> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidFeaturePodcastEntityProperties androidFeaturePodcastEntityProperties = this.a.get();
        h.e(androidFeaturePodcastEntityProperties, "properties");
        return Boolean.valueOf(androidFeaturePodcastEntityProperties.a());
    }
}
