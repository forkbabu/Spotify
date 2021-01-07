package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class PlayerOptions implements JacksonModel {
    public static final PlayerOptions DEFAULT = create(false, 0);

    @JsonCreator
    public static PlayerOptions create(@JsonProperty("shuffle") boolean z, @JsonProperty("repeat") int i) {
        return new AutoValue_PlayerOptions(z, i);
    }

    @JsonProperty("repeat")
    public abstract int repeat();

    @JsonProperty("shuffle")
    public abstract boolean shuffle();
}
