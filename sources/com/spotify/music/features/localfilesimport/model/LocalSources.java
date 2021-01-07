package com.spotify.music.features.localfilesimport.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Collection;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LocalSources implements JacksonModel, d<LocalSourceJacksonModel> {
    @JsonProperty("rows")
    private final List<LocalSourceJacksonModel> mItems;

    public LocalSources(@JsonProperty("rows") List<LocalSourceJacksonModel> list) {
        this.mItems = list;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnfilteredLength() {
        return this.mItems.size();
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
    public ImmutableList<LocalSourceJacksonModel> getItems() {
        return ImmutableList.copyOf((Collection) this.mItems);
    }
}
