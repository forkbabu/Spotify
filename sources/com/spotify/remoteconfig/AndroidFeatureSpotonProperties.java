package com.spotify.remoteconfig;

public abstract class AndroidFeatureSpotonProperties implements n0e {

    public enum SpotonOnboardingTts implements m0e {
        NONE("none"),
        ONCE("once"),
        THREE_TIMES("three-times");
        
        final String value;

        private SpotonOnboardingTts(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum SpotonPlaylistWhatsPlayingTts implements m0e {
        NONE("none"),
        TTS_PLAY_PLAYLIST("tts_play_playlist"),
        TTS_PLAYLIST("tts_playlist");
        
        final String value;

        private SpotonPlaylistWhatsPlayingTts(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract boolean a();

    public abstract SpotonOnboardingTts b();

    public abstract SpotonPlaylistWhatsPlayingTts c();
}
