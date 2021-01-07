package com.spotify.remoteconfig;

public abstract class MusicLibsPageloaderForMusicProperties implements n0e {

    public enum PageLoaderScopePolicy implements m0e {
        START_STOP("start_stop"),
        CREATE_DESTROY("create_destroy");
        
        final String value;

        private PageLoaderScopePolicy(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract PageLoaderScopePolicy a();
}
