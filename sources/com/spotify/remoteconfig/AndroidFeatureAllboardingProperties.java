package com.spotify.remoteconfig;

public abstract class AndroidFeatureAllboardingProperties implements n0e {

    public enum EnableAllboarding implements m0e {
        ENABLED("enabled"),
        DISABLED("disabled"),
        UNKNOWN("unknown");
        
        final String value;

        private EnableAllboarding(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract EnableAllboarding a();
}
