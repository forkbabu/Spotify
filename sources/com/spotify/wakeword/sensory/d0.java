package com.spotify.wakeword.sensory;

import com.google.common.base.Optional;
import com.spotify.remoteconfig.AndroidLibsWakeWordSensoryProperties;

/* access modifiers changed from: package-private */
public final class d0 implements cif {
    final /* synthetic */ AndroidLibsWakeWordSensoryProperties a;

    d0(AndroidLibsWakeWordSensoryProperties androidLibsWakeWordSensoryProperties) {
        this.a = androidLibsWakeWordSensoryProperties;
    }

    @Override // defpackage.cif
    public Optional<Integer> a() {
        SensroyOperatingPoint d = SensroyOperatingPoint.d(this.a.b().value());
        if (d.g() == 0) {
            return Optional.absent();
        }
        return Optional.of(Integer.valueOf(d.g()));
    }

    @Override // defpackage.cif
    public boolean b() {
        return this.a.a();
    }

    @Override // defpackage.cif
    public boolean c() {
        return this.a.c();
    }
}
