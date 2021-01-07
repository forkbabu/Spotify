package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureHomeProperties;
import com.spotify.remoteconfig.ud;

public final /* synthetic */ class d3 implements o0e {
    public static final /* synthetic */ d3 a = new d3();

    private /* synthetic */ d3() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        boolean a2 = p0e.a("android-feature-home", "hide_settings_button", false);
        int c = p0e.c("android-feature-home", "home_inline_onboarding", 0, 4, 0);
        AndroidFeatureHomeProperties.HomePageloader homePageloader = AndroidFeatureHomeProperties.HomePageloader.CONTROL;
        boolean a3 = p0e.a("android-feature-home", "home_use_new_top_bar", false);
        AndroidFeatureHomeProperties.InlineOnboardingSearchCardPosition inlineOnboardingSearchCardPosition = AndroidFeatureHomeProperties.InlineOnboardingSearchCardPosition.BOTH;
        boolean a4 = p0e.a("android-feature-home", "listening_history", false);
        boolean a5 = p0e.a("android-feature-home", "protobuf_enabled", false);
        boolean a6 = p0e.a("android-feature-home", "uiimpressions_v2", false);
        AndroidFeatureHomeProperties.VoiceMicPermissionPrompt voiceMicPermissionPrompt = AndroidFeatureHomeProperties.VoiceMicPermissionPrompt.CONTROL;
        ud.b bVar = new ud.b();
        bVar.b(false);
        bVar.c(0);
        bVar.d(homePageloader);
        bVar.e(false);
        bVar.f(inlineOnboardingSearchCardPosition);
        bVar.g(false);
        bVar.h(false);
        bVar.i(false);
        bVar.j(voiceMicPermissionPrompt);
        bVar.b(a2);
        bVar.c(c);
        bVar.d((AndroidFeatureHomeProperties.HomePageloader) p0e.b("android-feature-home", "home_pageloader", homePageloader));
        bVar.e(a3);
        bVar.f((AndroidFeatureHomeProperties.InlineOnboardingSearchCardPosition) p0e.b("android-feature-home", "inline_onboarding_search_card_position", inlineOnboardingSearchCardPosition));
        bVar.g(a4);
        bVar.h(a5);
        bVar.i(a6);
        bVar.j((AndroidFeatureHomeProperties.VoiceMicPermissionPrompt) p0e.b("android-feature-home", "voice_mic_permission_prompt", voiceMicPermissionPrompt));
        AndroidFeatureHomeProperties a7 = bVar.a();
        if (a7.b() >= 0 && a7.b() <= 4) {
            return a7;
        }
        throw new IllegalArgumentException("Value for homeInlineOnboarding() out of bounds");
    }
}
