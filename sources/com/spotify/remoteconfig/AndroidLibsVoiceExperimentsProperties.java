package com.spotify.remoteconfig;

public abstract class AndroidLibsVoiceExperimentsProperties implements n0e {

    public enum VoiceEndpointBackend implements m0e {
        SPEECH_RECOGNITION_SPOTIFY_COM("speech-recognition.spotify.com"),
        SPEECH_RECOGNITION_TEST_SPOTIFY_COM("speech-recognition-test.spotify.com"),
        SPEECH_RECOGNITION_VIM_SPOTIFY_COM("speech-recognition-vim.spotify.com"),
        SPEECH_RECOGNITION_V2V3_SPOTIFY_COM("speech-recognition-v2v3.spotify.com");
        
        final String value;

        private VoiceEndpointBackend(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract VoiceEndpointBackend a();

    public abstract boolean b();
}
