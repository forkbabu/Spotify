package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsWakeWordSensoryProperties;
import com.spotify.remoteconfig.hh;

public final /* synthetic */ class q1 implements o0e {
    public static final /* synthetic */ q1 a = new q1();

    private /* synthetic */ q1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-wake-word-sensory", "enable_seamless_wake_word", false);
        AndroidLibsWakeWordSensoryProperties.OperatingPoint operatingPoint = AndroidLibsWakeWordSensoryProperties.OperatingPoint.DEFAULT;
        boolean a3 = p0e.a("android-libs-wake-word-sensory", "voice_enable_wake_word", false);
        hh.b bVar = new hh.b();
        bVar.b(false);
        bVar.c(operatingPoint);
        bVar.d(false);
        bVar.b(a2);
        bVar.c((AndroidLibsWakeWordSensoryProperties.OperatingPoint) p0e.b("android-libs-wake-word-sensory", "operating_point", operatingPoint));
        bVar.d(a3);
        return bVar.a();
    }
}
