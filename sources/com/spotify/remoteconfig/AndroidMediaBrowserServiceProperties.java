package com.spotify.remoteconfig;

public abstract class AndroidMediaBrowserServiceProperties implements n0e {

    public enum BypassAuthHadoukenWithInitCheck implements m0e {
        TRUE("true"),
        FALSE("false"),
        NOT_INITIALIZED("not_initialized");
        
        final String value;

        private BypassAuthHadoukenWithInitCheck(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract BypassAuthHadoukenWithInitCheck a();

    public abstract boolean b();
}
