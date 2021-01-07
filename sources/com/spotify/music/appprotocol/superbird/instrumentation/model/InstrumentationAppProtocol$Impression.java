package com.spotify.music.appprotocol.superbird.instrumentation.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class InstrumentationAppProtocol$Impression implements JacksonModel {
    @JsonCreator
    public static InstrumentationAppProtocol$Impression create(JsonNode jsonNode) {
        return new AutoValue_InstrumentationAppProtocol_Impression(jsonNode);
    }

    public abstract JsonNode impression();
}
