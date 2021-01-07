package com.spotify.music.libs.assistedcuration.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.PlayabilityRestriction;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ResponseTrack implements JacksonModel {
    @JsonCreator
    public static ResponseTrack create(@JsonProperty("link") String str, @JsonProperty("name") String str2, @JsonProperty("imageUri") String str3, @JsonProperty("previewId") String str4, @JsonProperty("is19PlusOnly") boolean z, @JsonProperty("isExplicit") boolean z2, @JsonProperty("album") ResponseItem responseItem, @JsonProperty("artists") List<ResponseItem> list, @JsonProperty("trackPlayState") TrackPlayState trackPlayState) {
        return new AutoValue_ResponseTrack(str, str2, str3, str4, z, z2 && !z, trackPlayState.isPlayable(), trackPlayState.getPlayabilityRestriction(), responseItem, list);
    }

    public abstract ResponseItem getAlbum();

    public abstract List<ResponseItem> getArtists();

    public abstract String getImage();

    public abstract String getName();

    public abstract String getPreviewId();

    public abstract String getUri();

    public abstract boolean isExplicit();

    public abstract boolean isNineteenPlusOnly();

    public abstract boolean isPlayable();

    public abstract PlayabilityRestriction playabilityRestriction();
}
