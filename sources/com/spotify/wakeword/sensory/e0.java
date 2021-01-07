package com.spotify.wakeword.sensory;

import com.spotify.remoteconfig.AndroidLibsWakeWordSensoryProperties;

public final class e0 implements fjf<cif> {
    private final wlf<AndroidLibsWakeWordSensoryProperties> a;

    public e0(wlf<AndroidLibsWakeWordSensoryProperties> wlf) {
        this.a = wlf;
    }

    public static cif a(AndroidLibsWakeWordSensoryProperties androidLibsWakeWordSensoryProperties) {
        return new d0(androidLibsWakeWordSensoryProperties);
    }

    @Override // defpackage.wlf
    public Object get() {
        return new d0(this.a.get());
    }
}
