package com.spotify.remoteconfig;

public abstract class AndroidLibsOfflineTrialsProperties implements n0e {

    public enum OfflineDailyCap implements m0e {
        CONTROL("control"),
        THIRTY_MIN("thirty_min"),
        SIXTY_MIN("sixty_min");
        
        final String value;

        private OfflineDailyCap(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract OfflineDailyCap a();

    public abstract boolean b();

    public abstract boolean c();
}
