package com.spotify.remoteconfig;

public abstract class AndroidLibsCarDetectionProperties implements n0e {

    public enum CarDetectionIsEnabled implements m0e {
        ENABLED("enabled"),
        DISABLED("disabled"),
        FORCED("forced");
        
        final String value;

        private CarDetectionIsEnabled(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract CarDetectionIsEnabled a();
}
