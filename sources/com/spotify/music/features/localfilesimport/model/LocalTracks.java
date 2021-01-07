package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalTracks implements JacksonModel, d<f> {
    @JsonProperty("rows")
    private final List<LocalTrackJacksonModel> mItems;
    @JsonProperty("unfilteredLength")
    private final int mUnfilteredLength;

    public LocalTracks(@JsonProperty("rows") List<LocalTrackJacksonModel> list, @JsonProperty("unfilteredLength") int i) {
        this.mItems = list;
        this.mUnfilteredLength = i;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnfilteredLength() {
        return this.mUnfilteredLength;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnrangedLength() {
        return this.mItems.size();
    }

    @Override // com.spotify.playlist.models.i
    public boolean isLoading() {
        return false;
    }

    @Override // com.spotify.playlist.models.i
    public ImmutableList<f> getItems() {
        return ImmutableList.copyOf((Collection) this.mItems);
    }
}