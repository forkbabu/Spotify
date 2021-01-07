package com.spotify.music.spotlets.optintrial;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class StartTrialRequest implements JacksonModel {
    private static final String TRIAL_DEFAULT = "7d-opt-in";

    @JsonCreator
    public static StartTrialRequest create(@JsonProperty("device_id") String str, @JsonProperty("country") String str2) {
        return new AutoValue_StartTrialRequest(TRIAL_DEFAULT, str, str2);
    }

    @JsonProperty("country")
    public abstract String country();

    @JsonProperty("device_id")
    public abstract String deviceId();

    @JsonProperty("trial")
    public abstract String trial();
}
