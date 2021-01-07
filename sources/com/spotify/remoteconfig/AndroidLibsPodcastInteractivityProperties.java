package com.spotify.remoteconfig;

public abstract class AndroidLibsPodcastInteractivityProperties implements n0e {

    public enum PollsFeatureInEpisodePage implements m0e {
        NO_POLLS("no_polls"),
        EMBEDDED("embedded"),
        BUTTON("button");
        
        final String value;

        private PollsFeatureInEpisodePage(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum PollsFeatureInNpv implements m0e {
        NO_POLLS("no_polls"),
        EMBEDDED("embedded"),
        BUTTON("button");
        
        final String value;

        private PollsFeatureInNpv(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract PollsFeatureInEpisodePage a();

    public abstract PollsFeatureInNpv b();
}
