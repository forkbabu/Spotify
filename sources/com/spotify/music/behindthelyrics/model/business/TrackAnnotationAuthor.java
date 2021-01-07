package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class TrackAnnotationAuthor implements JacksonModel {
    @JsonCreator
    public static TrackAnnotationAuthor create(@JsonProperty("verified") boolean z, @JsonProperty("spotifyId") String str, @JsonProperty("displayName") String str2, @JsonProperty("avatarURL") String str3) {
        return new AutoValue_TrackAnnotationAuthor(z, str, str2, str3);
    }

    @JsonProperty("avatarURL")
    public abstract String getAvatarUrl();

    @JsonProperty("displayName")
    public abstract String getDisplayName();

    @JsonProperty("spotifyId")
    public abstract String getSpotifyId();

    @JsonProperty("verified")
    public abstract boolean isVerified();
}
