package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableSet;
import com.spotify.player.model.command.options.AutoValue_LoggingParams;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class LoggingParams {
    public static final LoggingParams EMPTY = builder().build();

    public static abstract class Builder {
        Builder() {
            pageInstanceIds(ImmutableSet.of());
            interactionIds(ImmutableSet.of());
        }

        @JsonCreator
        public static Builder builder() {
            return LoggingParams.builder();
        }

        public abstract LoggingParams build();

        @JsonProperty("command_initiated_time")
        public abstract Builder commandInitiatedTime(Long l);

        public Builder interactionId(String str) {
            return interactionIds(ImmutableSet.of(str));
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("interaction_ids")
        public abstract Builder interactionIds(ImmutableSet<String> immutableSet);

        public Builder pageInstanceId(String str) {
            return pageInstanceIds(ImmutableSet.of(str));
        }

        /* access modifiers changed from: package-private */
        @JsonProperty("page_instance_ids")
        public abstract Builder pageInstanceIds(ImmutableSet<String> immutableSet);
    }

    public static Builder builder() {
        return new AutoValue_LoggingParams.Builder();
    }

    @JsonProperty("command_initiated_time")
    public abstract Optional<Long> commandInitiatedTime();

    @JsonIgnore
    public Optional<String> interactionId() {
        return Optional.fromNullable(Collections2.getOnlyElement(interactionIds(), null));
    }

    /* access modifiers changed from: package-private */
    @JsonProperty("interaction_ids")
    public abstract ImmutableSet<String> interactionIds();

    @JsonIgnore
    public Optional<String> pageInstanceId() {
        return Optional.fromNullable(Collections2.getOnlyElement(pageInstanceIds(), null));
    }

    /* access modifiers changed from: package-private */
    @JsonProperty("page_instance_ids")
    public abstract ImmutableSet<String> pageInstanceIds();

    public abstract Builder toBuilder();
}
