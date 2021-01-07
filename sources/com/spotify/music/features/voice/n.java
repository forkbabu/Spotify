package com.spotify.music.features.voice;

import com.spotify.music.libs.carmodeengine.util.y;
import com.spotify.music.libs.voice.a;
import com.spotify.music.libs.voice.b;
import com.spotify.music.libs.voice.e;
import com.spotify.music.navigation.i;
import com.spotify.player.model.PlayerState;
import io.reactivex.g;
import io.reactivex.s;
import io.reactivex.subjects.c;

public final class n {
    public static void a(VoiceActivity voiceActivity, s<d7a> sVar) {
        voiceActivity.H = sVar;
    }

    public static void b(VoiceOnboardingActivity voiceOnboardingActivity, boolean z) {
        voiceOnboardingActivity.H = z;
    }

    public static void c(VoiceOnboardingActivity voiceOnboardingActivity, w52 w52) {
        voiceOnboardingActivity.I = w52;
    }

    public static void d(VoiceActivity voiceActivity, g<PlayerState> gVar) {
        voiceActivity.G = gVar;
    }

    public static void e(VoiceOnboardingActivity voiceOnboardingActivity, c<Boolean> cVar) {
        voiceOnboardingActivity.K = cVar;
    }

    public static void f(VoiceOnboardingActivity voiceOnboardingActivity, e eVar) {
        voiceOnboardingActivity.J = eVar;
    }

    public static void g(VoiceOnboardingActivity voiceOnboardingActivity, cif cif) {
        voiceOnboardingActivity.G = cif;
    }

    public static w h(androidx.fragment.app.c cVar, i iVar, y yVar, b bVar, a aVar, g<PlayerState> gVar) {
        return new w(cVar, iVar, yVar, bVar, aVar, gVar);
    }

    public static z i(t0f t0f) {
        return new z(t0f);
    }
}
