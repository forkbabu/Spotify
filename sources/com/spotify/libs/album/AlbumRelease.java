package com.spotify.libs.album;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize
public abstract class AlbumRelease implements JacksonModel {
    @JsonCreator
    public static AlbumRelease create(@JsonProperty("discs") List<AlbumDisc> list, @JsonProperty("cover") AlbumCover albumCover, @JsonProperty("track_count") int i) {
        return new AutoValue_AlbumRelease(i, gf0.a(list), albumCover);
    }

    @JsonGetter("cover")
    public abstract AlbumCover getCover();

    @JsonGetter("discs")
    public abstract List<AlbumDisc> getDiscs();

    @JsonGetter(PlayerContext.Metadata.KEY_TRACK_COUNT)
    public abstract int getTrackCount();
}
