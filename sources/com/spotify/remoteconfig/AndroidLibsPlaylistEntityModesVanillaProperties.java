package com.spotify.remoteconfig;

public abstract class AndroidLibsPlaylistEntityModesVanillaProperties implements n0e {

    public enum RecommendationsSectionInFree implements m0e {
        NONE("none"),
        PLAYLIST_EXTENDER("playlistExtender"),
        ASSISTED_CURATION("assistedCuration");
        
        final String value;

        private RecommendationsSectionInFree(String str) {
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

    public abstract RecommendationsSectionInFree b();

    public abstract boolean c();
}
