package com.spotify.music.appprotocol.superbird.pitstop.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import java.util.Map;

public abstract class PitstopAppProtocol$LogMessage implements JacksonModel {
    @JsonCreator
    public static PitstopAppProtocol$LogMessage create(@JsonProperty("logs") List<Map<Object, Object>> list) {
        return new AutoValue_PitstopAppProtocol_LogMessage(list);
    }

    public abstract List<Map<Object, Object>> body();
}
