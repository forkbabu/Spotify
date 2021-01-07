package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureSpotonProperties;
import com.spotify.remoteconfig.me;

public final /* synthetic */ class b4 implements o0e {
    public static final /* synthetic */ b4 a = new b4();

    private /* synthetic */ b4() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-spoton", "spoton_feature_enabled", true);
        AndroidFeatureSpotonProperties.SpotonOnboardingTts spotonOnboardingTts = AndroidFeatureSpotonProperties.SpotonOnboardingTts.NONE;
        AndroidFeatureSpotonProperties.SpotonPlaylistWhatsPlayingTts spotonPlaylistWhatsPlayingTts = AndroidFeatureSpotonProperties.SpotonPlaylistWhatsPlayingTts.NONE;
        me.b bVar = new me.b();
        bVar.b(true);
        bVar.c(spotonOnboardingTts);
        bVar.d(spotonPlaylistWhatsPlayingTts);
        bVar.b(a2);
        bVar.c((AndroidFeatureSpotonProperties.SpotonOnboardingTts) p0e.b("android-feature-spoton", "spoton_onboarding_tts", spotonOnboardingTts));
        bVar.d((AndroidFeatureSpotonProperties.SpotonPlaylistWhatsPlayingTts) p0e.b("android-feature-spoton", "spoton_playlist_whats_playing_tts", spotonPlaylistWhatsPlayingTts));
        return bVar.a();
    }
}
