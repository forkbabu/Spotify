package com.spotify.music.features.ads.rx.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class RewardAdsRequestBody implements JacksonModel {
    @JsonCreator
    public static RewardAdsRequestBody create(@JsonProperty("format") String str) {
        return new AutoValue_RewardAdsRequestBody(str);
    }

    public abstract String getFormat();
}
