package com.spotify.music.features.yourlibraryx.domain;

import kotlin.jvm.internal.f;

public enum YourLibraryXSortOption {
    MOST_RELEVANT("most_relevant"),
    RECENTLY_PLAYED("recently_played"),
    RECENTLY_ADDED("recently_added"),
    ALPHABETICAL("alphabetical"),
    CREATOR("creator");
    
    public static final a p = new a(null);
    private final String id;

    public static final class a {
        public a(f fVar) {
        }
    }

    private YourLibraryXSortOption(String str) {
        this.id = str;
    }

    public final String d() {
        return this.id;
    }
}
