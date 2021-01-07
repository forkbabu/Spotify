package com.spotify.music.features.offlinesync;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OfflineProgressRootModel implements JacksonModel {
    @JsonProperty("progress")
    public final OfflineProgressModel mProgress;

    @JsonCreator
    public OfflineProgressRootModel(@JsonProperty("progress") OfflineProgressModel offlineProgressModel) {
        this.mProgress = offlineProgressModel;
    }

    public static OfflineProgressModel unwrap(OfflineProgressRootModel offlineProgressRootModel) {
        return offlineProgressRootModel.mProgress;
    }

    public static OfflineProgressRootModel wrap(OfflineProgressModel offlineProgressModel) {
        return new OfflineProgressRootModel(offlineProgressModel);
    }
}
