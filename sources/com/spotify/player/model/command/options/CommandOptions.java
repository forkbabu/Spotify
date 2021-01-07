package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.player.model.command.options.AutoValue_CommandOptions;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class CommandOptions {
    public static final CommandOptions EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return CommandOptions.builder();
        }

        public abstract CommandOptions build();

        @JsonProperty("only_for_local_device")
        public abstract Builder onlyForLocalDevice(boolean z);

        @JsonProperty("override_restrictions")
        public abstract Builder overrideRestrictions(boolean z);

        @JsonProperty("system_initiated")
        public abstract Builder systemInitiated(boolean z);
    }

    public static Builder builder() {
        return new AutoValue_CommandOptions.Builder();
    }

    @JsonProperty("only_for_local_device")
    public abstract Optional<Boolean> onlyForLocalDevice();

    @JsonProperty("override_restrictions")
    public abstract Optional<Boolean> overrideRestrictions();

    @JsonProperty("system_initiated")
    public abstract Optional<Boolean> systemInitiated();

    public abstract Builder toBuilder();
}
