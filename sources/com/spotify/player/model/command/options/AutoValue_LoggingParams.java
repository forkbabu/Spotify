package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableSet;
import com.spotify.player.model.command.options.LoggingParams;

final class AutoValue_LoggingParams extends LoggingParams {
    private final Optional<Long> commandInitiatedTime;
    private final ImmutableSet<String> interactionIds;
    private final ImmutableSet<String> pageInstanceIds;

    /* access modifiers changed from: package-private */
    public static final class Builder extends LoggingParams.Builder {
        private Optional<Long> commandInitiatedTime;
        private ImmutableSet<String> interactionIds;
        private ImmutableSet<String> pageInstanceIds;

        @Override // com.spotify.player.model.command.options.LoggingParams.Builder
        public LoggingParams build() {
            String str = this.pageInstanceIds == null ? " pageInstanceIds" : "";
            if (this.interactionIds == null) {
                str = je.x0(str, " interactionIds");
            }
            if (str.isEmpty()) {
                return new AutoValue_LoggingParams(this.commandInitiatedTime, this.pageInstanceIds, this.interactionIds);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.options.LoggingParams.Builder
        public LoggingParams.Builder commandInitiatedTime(Long l) {
            this.commandInitiatedTime = Optional.of(l);
            return this;
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.player.model.command.options.LoggingParams.Builder
        public LoggingParams.Builder interactionIds(ImmutableSet<String> immutableSet) {
            if (immutableSet != null) {
                this.interactionIds = immutableSet;
                return this;
            }
            throw new NullPointerException("Null interactionIds");
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.player.model.command.options.LoggingParams.Builder
        public LoggingParams.Builder pageInstanceIds(ImmutableSet<String> immutableSet) {
            if (immutableSet != null) {
                this.pageInstanceIds = immutableSet;
                return this;
            }
            throw new NullPointerException("Null pageInstanceIds");
        }

        Builder() {
            this.commandInitiatedTime = Optional.absent();
        }

        private Builder(LoggingParams loggingParams) {
            this.commandInitiatedTime = Optional.absent();
            this.commandInitiatedTime = loggingParams.commandInitiatedTime();
            this.pageInstanceIds = loggingParams.pageInstanceIds();
            this.interactionIds = loggingParams.interactionIds();
        }
    }

    @Override // com.spotify.player.model.command.options.LoggingParams
    @JsonProperty("command_initiated_time")
    public Optional<Long> commandInitiatedTime() {
        return this.commandInitiatedTime;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoggingParams)) {
            return false;
        }
        LoggingParams loggingParams = (LoggingParams) obj;
        if (!this.commandInitiatedTime.equals(loggingParams.commandInitiatedTime()) || !this.pageInstanceIds.equals(loggingParams.pageInstanceIds()) || !this.interactionIds.equals(loggingParams.interactionIds())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.commandInitiatedTime.hashCode() ^ 1000003) * 1000003) ^ this.pageInstanceIds.hashCode()) * 1000003) ^ this.interactionIds.hashCode();
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.player.model.command.options.LoggingParams
    @JsonProperty("interaction_ids")
    public ImmutableSet<String> interactionIds() {
        return this.interactionIds;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.player.model.command.options.LoggingParams
    @JsonProperty("page_instance_ids")
    public ImmutableSet<String> pageInstanceIds() {
        return this.pageInstanceIds;
    }

    @Override // com.spotify.player.model.command.options.LoggingParams
    public LoggingParams.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("LoggingParams{commandInitiatedTime=");
        V0.append(this.commandInitiatedTime);
        V0.append(", pageInstanceIds=");
        V0.append(this.pageInstanceIds);
        V0.append(", interactionIds=");
        V0.append(this.interactionIds);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_LoggingParams(Optional<Long> optional, ImmutableSet<String> immutableSet, ImmutableSet<String> immutableSet2) {
        this.commandInitiatedTime = optional;
        this.pageInstanceIds = immutableSet;
        this.interactionIds = immutableSet2;
    }
}
