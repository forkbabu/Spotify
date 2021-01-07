package com.spotify.music.libs.search.ondemand.editorial.cache;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.libs.search.ondemand.editorial.cache.AutoValue_EditorialOnDemandCachedInfo;

@JsonDeserialize(builder = AutoValue_EditorialOnDemandCachedInfo.b.class)
public abstract class EditorialOnDemandCachedInfo implements JacksonModel {

    public interface a {
        EditorialOnDemandCachedInfo build();

        @JsonProperty("playedTimeInMillis")
        a playedTimeInMillis(long j);

        @JsonProperty("playlistUri")
        a playlistUri(String str);
    }

    public static a builder() {
        return new AutoValue_EditorialOnDemandCachedInfo.b();
    }

    @JsonCreator
    public static EditorialOnDemandCachedInfo create(String str, long j) {
        return builder().playlistUri(str).playedTimeInMillis(j).build();
    }

    @JsonProperty("playedTimeInMillis")
    public abstract long playedTimeInMillis();

    @JsonProperty("playlistUri")
    public abstract String playlistUri();
}
