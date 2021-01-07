package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsVoiceProperties;
import com.spotify.remoteconfig.gh;

public final /* synthetic */ class x1 implements o0e {
    public static final /* synthetic */ x1 a = new x1();

    private /* synthetic */ x1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsVoiceProperties.VoiceAsrBackend voiceAsrBackend = AndroidLibsVoiceProperties.VoiceAsrBackend.CLOUDSPEECH;
        boolean a2 = p0e.a("android-libs-voice", "voice_disable_alt_search_resuls", false);
        boolean a3 = p0e.a("android-libs-voice", "voice_enable_favorites_dialog", false);
        boolean a4 = p0e.a("android-libs-voice", "voice_enable_guessing_game", false);
        boolean a5 = p0e.a("android-libs-voice", "voice_enable_introducer_dialog", false);
        boolean a6 = p0e.a("android-libs-voice", "voice_enable_play_something", false);
        boolean a7 = p0e.a("android-libs-voice", "voice_enable_recommend_dialog", false);
        boolean a8 = p0e.a("android-libs-voice", "voice_enable_show_intent", false);
        boolean a9 = p0e.a("android-libs-voice", "voice_enable_tts", false);
        boolean a10 = p0e.a("android-libs-voice", "voice_enable_umm_dialog", false);
        boolean a11 = p0e.a("android-libs-voice", "voice_enable_user_education", false);
        boolean a12 = p0e.a("android-libs-voice", "voice_enable_user_education_show_message", false);
        AndroidLibsVoiceProperties.VoiceEndpointBackend voiceEndpointBackend = AndroidLibsVoiceProperties.VoiceEndpointBackend.SPEECH_RECOGNITION_SPOTIFY_COM;
        gh.b bVar = new gh.b();
        bVar.b(voiceAsrBackend);
        bVar.c(false);
        bVar.d(false);
        bVar.e(false);
        bVar.f(false);
        bVar.g(false);
        bVar.h(false);
        bVar.i(false);
        bVar.j(false);
        bVar.k(false);
        bVar.l(false);
        bVar.m(false);
        bVar.n(voiceEndpointBackend);
        bVar.b((AndroidLibsVoiceProperties.VoiceAsrBackend) p0e.b("android-libs-voice", "voice_asr_backend", voiceAsrBackend));
        bVar.c(a2);
        bVar.d(a3);
        bVar.e(a4);
        bVar.f(a5);
        bVar.g(a6);
        bVar.h(a7);
        bVar.i(a8);
        bVar.j(a9);
        bVar.k(a10);
        bVar.l(a11);
        bVar.m(a12);
        bVar.n((AndroidLibsVoiceProperties.VoiceEndpointBackend) p0e.b("android-libs-voice", "voice_endpoint_backend", voiceEndpointBackend));
        return bVar.a();
    }
}
