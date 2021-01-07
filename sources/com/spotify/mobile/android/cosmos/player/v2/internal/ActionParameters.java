package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class ActionParameters<T> implements JacksonModel {
    @JsonProperty("logging_params")
    public final LoggingParameters loggingParams;
    @JsonProperty("value")
    public T value;

    public ActionParameters(cqe cqe) {
        this.loggingParams = LoggingParameters.createWithCustomTimestamp(cqe.d());
    }
}
