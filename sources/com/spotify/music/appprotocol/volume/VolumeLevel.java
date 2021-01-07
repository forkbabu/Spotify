package com.spotify.music.appprotocol.volume;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class VolumeLevel implements JacksonModel {
    @JsonCreator
    public static VolumeLevel create(@JsonProperty("volume") float f) {
        return new AutoValue_VolumeLevel(f);
    }

    @JsonProperty("volume")
    public abstract float volume();
}
