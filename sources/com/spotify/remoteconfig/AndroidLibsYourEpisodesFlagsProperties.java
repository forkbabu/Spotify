package com.spotify.remoteconfig;

public abstract class AndroidLibsYourEpisodesFlagsProperties implements n0e {

    public enum EnableContextDownload implements m0e {
        DISABLED("disabled"),
        ENABLED_FOR_ALL("enabled_for_all"),
        ENABLED_FOR_OFFLINE_CAPABLE_ONLY("enabled_for_offline_capable_only");
        
        final String value;

        private EnableContextDownload(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public enum EnableYourEpisodes implements m0e {
        DISABLED("disabled"),
        ENABLED("enabled");
        
        final String value;

        private EnableYourEpisodes(String str) {
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

    public abstract EnableContextDownload b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract EnableYourEpisodes f();

    public abstract boolean g();
}
