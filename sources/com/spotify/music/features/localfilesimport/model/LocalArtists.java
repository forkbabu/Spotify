package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalArtists implements JacksonModel, d<LocalArtistJacksonModel> {
    @JsonProperty("rows")
    private final List<LocalArtistJacksonModel> mItems;
    @JsonProperty("unfilteredLength")
    private final int mUnfilteredLength;

    public LocalArtists(@JsonProperty("rows") List<LocalArtistJacksonModel> list, @JsonProperty("unfilteredLength") int i) {
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
    public ImmutableList<LocalArtistJacksonModel> getItems() {
        return ImmutableList.copyOf((Collection) this.mItems);
    }
}
