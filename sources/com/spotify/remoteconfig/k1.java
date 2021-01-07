package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsVoiceExperimentsProperties;
import com.spotify.remoteconfig.fh;

public final /* synthetic */ class k1 implements o0e {
    public static final /* synthetic */ k1 a = new k1();

    private /* synthetic */ k1() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        AndroidLibsVoiceExperimentsProperties.VoiceEndpointBackend voiceEndpointBackend = AndroidLibsVoiceExperimentsProperties.VoiceEndpointBackend.SPEECH_RECOGNITION_SPOTIFY_COM;
        boolean a2 = p0e.a("android-libs-voice-experiments", "voice_introducer_v2", false);
        fh.b bVar = new fh.b();
        bVar.b(voiceEndpointBackend);
        bVar.c(false);
        bVar.b((AndroidLibsVoiceExperimentsProperties.VoiceEndpointBackend) p0e.b("android-libs-voice-experiments", "voice_endpoint_backend", voiceEndpointBackend));
        bVar.c(a2);
        return bVar.a();
    }
}
