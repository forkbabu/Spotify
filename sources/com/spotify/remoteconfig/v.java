package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidMusicLibsVoiceAssistantFlagsProperties;
import com.spotify.remoteconfig.bi;

public final /* synthetic */ class v implements o0e {
    public static final /* synthetic */ v a = new v();

    private /* synthetic */ v() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResults thirdPartyAlternativeResults = AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResults.NEVER;
        AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResultsShowIntent thirdPartyAlternativeResultsShowIntent = AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResultsShowIntent.NEVER;
        AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyUtteranceBanner thirdPartyUtteranceBanner = AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyUtteranceBanner.NEVER;
        boolean a2 = p0e.a("android-music-libs-voice-assistant-flags", "voice_assistants_settings_enabled", false);
        bi.b bVar = new bi.b();
        bVar.b(thirdPartyAlternativeResults);
        bVar.c(thirdPartyAlternativeResultsShowIntent);
        bVar.d(thirdPartyUtteranceBanner);
        bVar.e(false);
        bVar.b((AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResults) p0e.b("android-music-libs-voice-assistant-flags", "third_party_alternative_results", thirdPartyAlternativeResults));
        bVar.c((AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyAlternativeResultsShowIntent) p0e.b("android-music-libs-voice-assistant-flags", "third_party_alternative_results_show_intent", thirdPartyAlternativeResultsShowIntent));
        bVar.d((AndroidMusicLibsVoiceAssistantFlagsProperties.ThirdPartyUtteranceBanner) p0e.b("android-music-libs-voice-assistant-flags", "third_party_utterance_banner", thirdPartyUtteranceBanner));
        bVar.e(a2);
        return bVar.a();
    }
}
