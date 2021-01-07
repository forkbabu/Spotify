package com.spotify.music.libs.collection.json;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.libs.collection.model.c;
import com.spotify.playlist.models.a;
import com.spotify.playlist.models.o;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AlbumEntityJacksonModel extends c implements JacksonModel {
    @JsonProperty("album")
    private final AlbumJacksonModel mHeader;
    @JsonProperty("isLoading")
    private final boolean mIsLoading;
    @JsonProperty("items")
    private final TrackJacksonModel[] mItems;
    @JsonProperty("unfilteredLength")
    private final int mUnfilteredLength;
    @JsonProperty("unrangedLength")
    private final int mUnrangedLength;

    public AlbumEntityJacksonModel(@JsonProperty("album") AlbumJacksonModel albumJacksonModel, @JsonProperty("items") TrackJacksonModel[] trackJacksonModelArr, @JsonProperty("isLoading") boolean z, @JsonProperty("unfilteredLength") int i, @JsonProperty("unrangedLength") int i2) {
        this.mHeader = albumJacksonModel;
        this.mItems = trackJacksonModelArr;
        this.mIsLoading = z;
        this.mUnfilteredLength = i;
        this.mUnrangedLength = i2;
    }

    @Override // com.spotify.music.libs.collection.model.c
    @JsonIgnore
    public a getHeader() {
        return this.mHeader.getAlbum();
    }

    @Override // com.spotify.playlist.models.i
    @JsonIgnore
    public int getUnfilteredLength() {
        return this.mUnfilteredLength;
    }

    @Override // com.spotify.playlist.models.i
    @JsonIgnore
    public int getUnrangedLength() {
        return this.mUnrangedLength;
    }

    @Override // com.spotify.playlist.models.i
    @JsonIgnore
    public boolean isLoading() {
        return this.mIsLoading;
    }

    /* Return type fixed from 'com.google.common.collect.ImmutableList<com.spotify.playlist.models.o>' to match base method */
    @Override // com.spotify.playlist.models.i
    @JsonIgnore
    public List<o> getItems() {
        return ImmutableList.copyOf(this.mItems);
    }
}
