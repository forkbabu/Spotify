package com.spotify.remoteconfig;

public final class j6 implements fjf<AndroidFeaturePodcastEntityProperties> {
    private final wlf<l0e> a;

    public j6(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidFeaturePodcastEntityProperties androidFeaturePodcastEntityProperties = (AndroidFeaturePodcastEntityProperties) this.a.get().a(u3.a);
        yif.g(androidFeaturePodcastEntityProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidFeaturePodcastEntityProperties;
    }
}
