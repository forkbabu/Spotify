package com.spotify.libs.connect.volume;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = VolumeState_Deserializer.class)
public class VolumeState implements JacksonModel {
    private final boolean mIsSystemInitiated;
    private final float mVolume;

    @JsonCreator
    public VolumeState(@JsonProperty("system_initiated") boolean z, @JsonProperty("volume") Float f) {
        this.mIsSystemInitiated = z;
        this.mVolume = f.floatValue();
    }

    public static VolumeState withVolume(float f) {
        return new VolumeState(false, Float.valueOf(f));
    }

    @JsonGetter("volume")
    public float getVolume() {
        return this.mVolume;
    }

    @JsonGetter("system_initiated")
    public boolean isSystemInitiated() {
        return this.mIsSystemInitiated;
    }
}
