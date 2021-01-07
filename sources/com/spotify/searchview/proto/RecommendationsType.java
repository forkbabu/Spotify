package com.spotify.searchview.proto;

import com.google.protobuf.o;

public enum RecommendationsType implements o.c {
    RECOMMENDATIONS_TYPE_UNKNOWN(0),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST(1),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE(2),
    RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY(3),
    RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK(4),
    RECOMMENDATIONS_TYPE_TOPICS_WITH_EPISODE(5),
    UNRECOGNIZED(-1);
    
    private final int value;

    private RecommendationsType(int i) {
        this.value = i;
    }

    @Override // com.google.protobuf.o.c
    public final int getNumber() {
        return this.value;
    }
}
