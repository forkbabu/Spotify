package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class LoggingParameters implements JacksonModel {
    @JsonProperty("command_initiated_time")
    public long commandInitiatedTime;

    private LoggingParameters() {
    }

    @JsonCreator
    public static LoggingParameters createWithCustomTimestamp(@JsonProperty("command_initiated_time") long j) {
        LoggingParameters loggingParameters = new LoggingParameters();
        loggingParameters.commandInitiatedTime = j;
        return loggingParameters;
    }
}
