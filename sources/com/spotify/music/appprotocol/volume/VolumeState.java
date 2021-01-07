package com.spotify.music.appprotocol.volume;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class VolumeState implements JacksonModel {
    public static final VolumeState DEFAULT_VOLUME_STATE = create(-1.0f, false);

    @JsonCreator
    public static VolumeState create(@JsonProperty("volume") float f, @JsonProperty("controllable") boolean z) {
        return new AutoValue_VolumeState(f, z);
    }

    @JsonProperty("controllable")
    public abstract boolean controllable();

    @JsonProperty("volume")
    public abstract float volume();
}
