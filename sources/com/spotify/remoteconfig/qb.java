package com.spotify.remoteconfig;

public final class qb implements fjf<AndroidLibsWakeWordSensoryProperties> {
    private final wlf<l0e> a;

    public qb(wlf<l0e> wlf) {
        this.a = wlf;
    }

    @Override // defpackage.wlf
    public Object get() {
        AndroidLibsWakeWordSensoryProperties androidLibsWakeWordSensoryProperties = (AndroidLibsWakeWordSensoryProperties) this.a.get().a(q1.a);
        yif.g(androidLibsWakeWordSensoryProperties, "Cannot return null from a non-@Nullable @Provides method");
        return androidLibsWakeWordSensoryProperties;
    }
}
