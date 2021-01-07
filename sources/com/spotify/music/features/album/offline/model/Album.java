package com.spotify.music.features.album.offline.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.offline.a;
import com.spotify.playlist.models.offline.b;

public abstract class Album implements JacksonModel {
    @JsonCreator
    public static Album create(@JsonProperty("collectionLink") String str, @JsonProperty("offline") String str2, @JsonProperty("inferredOffline") String str3, @JsonProperty("syncProgress") int i, @JsonProperty("complete") boolean z, @JsonProperty("numTracksInCollection") int i2) {
        return new AutoValue_Album(str, b.a(str2, i), b.a(str3, i), z, i2);
    }

    public abstract String getCollectionUri();

    public abstract a getInferredOfflineState();

    public abstract int getNumTracksInCollection();

    public abstract a getOfflineState();

    public abstract boolean isCompleteInCollection();
}
