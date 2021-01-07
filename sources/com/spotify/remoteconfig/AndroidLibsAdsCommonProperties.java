package com.spotify.remoteconfig;

public abstract class AndroidLibsAdsCommonProperties implements n0e {

    public enum AdsAudioPlusFormat implements m0e {
        NONE("none"),
        TOP_BANNER("top_banner"),
        OVERLAY("overlay"),
        CAROUSEL("carousel");
        
        final String value;

        private AdsAudioPlusFormat(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum AdsAudioPlusVersion implements m0e {
        V1("v1"),
        V2("v2");
        
        final String value;

        private AdsAudioPlusVersion(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum AdsBookmarkableFormatsAndroid implements m0e {
        NONE("none"),
        BASE_ADS("base_ads"),
        BASE_WITH_AUDIOPLUS("base_with_audioplus"),
        VOICE("voice");
        
        final String value;

        private AdsBookmarkableFormatsAndroid(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum AdsInAppBrowserAndroid implements m0e {
        CONTROL("control"),
        ENABLED("enabled");
        
        final String value;

        private AdsInAppBrowserAndroid(String str) {
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

    public abstract int b();

    public abstract AdsAudioPlusFormat c();

    public abstract AdsAudioPlusVersion d();

    public abstract AdsBookmarkableFormatsAndroid e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract AdsInAppBrowserAndroid i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();
}
