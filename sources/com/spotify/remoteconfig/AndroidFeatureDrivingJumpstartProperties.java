package com.spotify.remoteconfig;

public abstract class AndroidFeatureDrivingJumpstartProperties implements n0e {

    public enum DrivingCarViewNpvHoldback implements m0e {
        CONTROL("Control"),
        ENABLED("Enabled");
        
        final String value;

        private DrivingCarViewNpvHoldback(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract DrivingCarViewNpvHoldback a();
}
