package com.spotify.remoteconfig;

public abstract class PremiumDestinationProperties implements n0e {

    public enum PremiumTabTitle implements m0e {
        CONTROL("control"),
        UPGRADE("upgrade"),
        GET_PREMIUM("get_premium"),
        TRY_PREMIUM("try_premium"),
        SUBSCRIBE("subscribe"),
        PLANS("plans"),
        PREMIUM_PLANS("premium_plans");
        
        final String value;

        private PremiumTabTitle(String str) {
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

    public abstract PremiumTabTitle b();

    public abstract boolean c();
}
