package com.spotify.remoteconfig;

public abstract class AndroidLibsVoiceProperties implements n0e {

    public enum VoiceAsrBackend implements m0e {
        CLOUDSPEECH("cloudspeech"),
        AZURE("azure");
        
        final String value;

        private VoiceAsrBackend(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

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

    public abstract VoiceAsrBackend a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract VoiceEndpointBackend m();
}
