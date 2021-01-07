package com.spotify.remoteconfig;

public abstract class AndroidFeaturePremiumHubProperties implements n0e {

    public enum PremiumHubPhase2 implements m0e {
        CONTROL("control"),
        TREATMENT1("treatment1"),
        TREATMENT2("treatment2"),
        TREATMENT3("treatment3");
        
        final String value;

        private PremiumHubPhase2(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract PremiumHubPhase2 a();
}
