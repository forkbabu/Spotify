package com.spotify.remoteconfig;

public abstract class AndroidGoogleClockProperties implements n0e {

    public enum GoogleClockTestContent implements m0e {
        WAKE("wake"),
        CURATED_WAKE("curated_wake"),
        HOME("home");
        
        final String value;

        private GoogleClockTestContent(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract GoogleClockTestContent a();
}
