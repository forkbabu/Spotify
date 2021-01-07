package com.spotify.remoteconfig;

public abstract class AndroidMusicLibsVoiceAssistantFlagsProperties implements n0e {

    public enum ThirdPartyAlternativeResults implements m0e {
        NEVER("never"),
        IN_CAR("in_car"),
        ALWAYS("always");
        
        final String value;

        private ThirdPartyAlternativeResults(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum ThirdPartyAlternativeResultsShowIntent implements m0e {
        NEVER("never"),
        IN_CAR("in_car");
        
        final String value;

        private ThirdPartyAlternativeResultsShowIntent(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum ThirdPartyUtteranceBanner implements m0e {
        NEVER("never"),
        IN_CAR("in_car"),
        ALWAYS("always");
        
        final String value;

        private ThirdPartyUtteranceBanner(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract ThirdPartyAlternativeResults a();

    public abstract ThirdPartyAlternativeResultsShowIntent b();

    public abstract ThirdPartyUtteranceBanner c();

    public abstract boolean d();
}
