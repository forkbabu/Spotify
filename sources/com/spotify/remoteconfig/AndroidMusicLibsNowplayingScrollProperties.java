package com.spotify.remoteconfig;

public abstract class AndroidMusicLibsNowplayingScrollProperties implements n0e {

    public enum DebugDataSource implements m0e {
        CONTROL("control"),
        BTL("btl"),
        EXAMPLE("example"),
        BTL_EXAMPLE("btl_example"),
        LYRICS_BTL("lyrics_btl"),
        UP_NEXT("up_next"),
        PODCAST_MORE_FOR_YOU("podcast_more_for_you");
        
        final String value;

        private DebugDataSource(String str) {
            this.value = str;
        }

        @Override // defpackage.m0e
        public String value() {
            return this.value;
        }
    }

    public static abstract class a {
    }

    public abstract DebugDataSource a();
}
