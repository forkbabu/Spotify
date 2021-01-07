package com.spotify.remoteconfig;

public abstract class AndroidLibsAllboardingProperties implements n0e {

    public enum LoadingAnimation implements m0e {
        UNKNOWN("unknown"),
        SIMPLE("simple"),
        GREAT_PICKS("great_picks");
        
        final String value;

        private LoadingAnimation(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract LoadingAnimation a();
}
