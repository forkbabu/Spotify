package com.spotify.music.features.secondaryintent.datasource;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.features.ads.model.Ad;
import java.util.List;

public abstract class SavedAds implements JacksonModel {
    @JsonCreator
    public static SavedAds create(@JsonProperty("saved-ads") List<Ad> list) {
        return new AutoValue_SavedAds(list);
    }

    public abstract List<Ad> getAds();

    @JsonCreator
    public static SavedAds create() {
        return new AutoValue_SavedAds(null);
    }
}
