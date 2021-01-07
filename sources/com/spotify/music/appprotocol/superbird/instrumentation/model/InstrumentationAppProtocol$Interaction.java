package com.spotify.music.appprotocol.superbird.instrumentation.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class InstrumentationAppProtocol$Interaction implements JacksonModel {
    @JsonCreator
    public static InstrumentationAppProtocol$Interaction create(JsonNode jsonNode) {
        return new AutoValue_InstrumentationAppProtocol_Interaction(jsonNode);
    }

    public abstract JsonNode interaction();
}
