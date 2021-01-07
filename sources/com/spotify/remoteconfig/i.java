package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsSocialListeningProperties;
import com.spotify.remoteconfig.wg;

public final /* synthetic */ class i implements o0e {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-libs-social-listening", "allow_listen", false);
        boolean a3 = p0e.a("android-libs-social-listening", "can_use_social_sessions", false);
        boolean a4 = p0e.a("android-libs-social-listening", "enabled", false);
        boolean a5 = p0e.a("android-libs-social-listening", "invite_always_enabled", false);
        boolean a6 = p0e.a("android-libs-social-listening", "left_align_device_picker_card", false);
        int c = p0e.c("android-libs-social-listening", "multi_output_max_number_of_participants", 2, 100, 6);
        boolean a7 = p0e.a("android-libs-social-listening", "nearby", false);
        AndroidLibsSocialListeningProperties.PlayActionMode playActionMode = AndroidLibsSocialListeningProperties.PlayActionMode.PLAY;
        wg.b bVar = new wg.b();
        bVar.a(false);
        bVar.c(false);
        bVar.d(false);
        bVar.e(false);
        bVar.f(false);
        bVar.g(6);
        bVar.h(false);
        bVar.i(playActionMode);
        bVar.a(a2);
        bVar.c(a3);
        bVar.d(a4);
        bVar.e(a5);
        bVar.f(a6);
        bVar.g(c);
        bVar.h(a7);
        bVar.i((AndroidLibsSocialListeningProperties.PlayActionMode) p0e.b("android-libs-social-listening", "play_action_mode", playActionMode));
        AndroidLibsSocialListeningProperties b = bVar.b();
        if (b.f() >= 2 && b.f() <= 100) {
            return b;
        }
        throw new IllegalArgumentException("Value for multiOutputMaxNumberOfParticipants() out of bounds");
    }
}
