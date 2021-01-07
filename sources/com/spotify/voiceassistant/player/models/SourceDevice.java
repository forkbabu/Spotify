package com.spotify.voiceassistant.player.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.voiceassistant.player.models.AutoValue_SourceDevice;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = AutoValue_SourceDevice.Builder.class)
public abstract class SourceDevice {

    @JsonIgnoreProperties(ignoreUnknown = true)
    public interface Builder {
        @JsonProperty("brand")
        Builder brand(String str);

        SourceDevice build();

        @JsonProperty("device_id")
        Builder deviceId(String str);

        @JsonProperty("device_type")
        Builder deviceType(String str);

        @JsonProperty("model")
        Builder model(String str);
    }

    public static Builder builder() {
        return new AutoValue_SourceDevice.Builder();
    }

    @JsonProperty("brand")
    public abstract String brand();

    @JsonProperty("device_id")
    public abstract String deviceId();

    @JsonProperty("device_type")
    public abstract String deviceType();

    @JsonProperty("model")
    public abstract String model();
}
