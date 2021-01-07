package com.spotify.player.model.command.options;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.player.model.AudioStream;
import com.spotify.player.model.Suppressions;
import com.spotify.player.model.command.options.PreparePlayOptions;

final class AutoValue_PreparePlayOptions extends PreparePlayOptions {
    private final Optional<Boolean> alwaysPlaySomething;
    private final Optional<AudioStream> audioStream;
    private final ImmutableMap<String, Object> configurationOverride;
    private final Optional<Boolean> initiallyPaused;
    private final Optional<String> license;
    private final Optional<String> playbackId;
    private final Optional<PlayerOptionOverrides> playerOptionsOverride;
    private final Optional<PrefetchLevel> prefetchLevel;
    private final Optional<Long> seekTo;
    private final Optional<String> sessionId;
    private final Optional<SkipToTrack> skipTo;
    private final Optional<Suppressions> suppressions;
    private final Optional<Boolean> systemInitiated;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PreparePlayOptions.Builder {
        private Optional<Boolean> alwaysPlaySomething;
        private Optional<AudioStream> audioStream;
        private ImmutableMap<String, Object> configurationOverride;
        private Optional<Boolean> initiallyPaused;
        private Optional<String> license;
        private Optional<String> playbackId;
        private Optional<PlayerOptionOverrides> playerOptionsOverride;
        private Optional<PrefetchLevel> prefetchLevel;
        private Optional<Long> seekTo;
        private Optional<String> sessionId;
        private Optional<SkipToTrack> skipTo;
        private Optional<Suppressions> suppressions;
        private Optional<Boolean> systemInitiated;

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder alwaysPlaySomething(boolean z) {
            this.alwaysPlaySomething = Optional.of(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder audioStream(AudioStream audioStream2) {
            this.audioStream = Optional.of(audioStream2);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions build() {
            String str = this.configurationOverride == null ? " configurationOverride" : "";
            if (str.isEmpty()) {
                return new AutoValue_PreparePlayOptions(this.playbackId, this.alwaysPlaySomething, this.skipTo, this.seekTo, this.initiallyPaused, this.systemInitiated, this.playerOptionsOverride, this.suppressions, this.prefetchLevel, this.audioStream, this.sessionId, this.license, this.configurationOverride);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder configurationOverride(ImmutableMap<String, Object> immutableMap) {
            if (immutableMap != null) {
                this.configurationOverride = immutableMap;
                return this;
            }
            throw new NullPointerException("Null configurationOverride");
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder initiallyPaused(boolean z) {
            this.initiallyPaused = Optional.of(Boolean.valueOf(z));
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder license(String str) {
            this.license = Optional.of(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder playbackId(String str) {
            this.playbackId = Optional.of(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder playerOptionsOverride(PlayerOptionOverrides playerOptionOverrides) {
            this.playerOptionsOverride = Optional.of(playerOptionOverrides);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder prefetchLevel(PrefetchLevel prefetchLevel2) {
            this.prefetchLevel = Optional.of(prefetchLevel2);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder seekTo(Long l) {
            this.seekTo = Optional.of(l);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder sessionId(String str) {
            this.sessionId = Optional.of(str);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder skipTo(SkipToTrack skipToTrack) {
            this.skipTo = Optional.of(skipToTrack);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder suppressions(Suppressions suppressions2) {
            this.suppressions = Optional.of(suppressions2);
            return this;
        }

        @Override // com.spotify.player.model.command.options.PreparePlayOptions.Builder
        public PreparePlayOptions.Builder systemInitiated(boolean z) {
            this.systemInitiated = Optional.of(Boolean.valueOf(z));
            return this;
        }

        Builder() {
            this.playbackId = Optional.absent();
            this.alwaysPlaySomething = Optional.absent();
            this.skipTo = Optional.absent();
            this.seekTo = Optional.absent();
            this.initiallyPaused = Optional.absent();
            this.systemInitiated = Optional.absent();
            this.playerOptionsOverride = Optional.absent();
            this.suppressions = Optional.absent();
            this.prefetchLevel = Optional.absent();
            this.audioStream = Optional.absent();
            this.sessionId = Optional.absent();
            this.license = Optional.absent();
        }

        private Builder(PreparePlayOptions preparePlayOptions) {
            this.playbackId = Optional.absent();
            this.alwaysPlaySomething = Optional.absent();
            this.skipTo = Optional.absent();
            this.seekTo = Optional.absent();
            this.initiallyPaused = Optional.absent();
            this.systemInitiated = Optional.absent();
            this.playerOptionsOverride = Optional.absent();
            this.suppressions = Optional.absent();
            this.prefetchLevel = Optional.absent();
            this.audioStream = Optional.absent();
            this.sessionId = Optional.absent();
            this.license = Optional.absent();
            this.playbackId = preparePlayOptions.playbackId();
            this.alwaysPlaySomething = preparePlayOptions.alwaysPlaySomething();
            this.skipTo = preparePlayOptions.skipTo();
            this.seekTo = preparePlayOptions.seekTo();
            this.initiallyPaused = preparePlayOptions.initiallyPaused();
            this.systemInitiated = preparePlayOptions.systemInitiated();
            this.playerOptionsOverride = preparePlayOptions.playerOptionsOverride();
            this.suppressions = preparePlayOptions.suppressions();
            this.prefetchLevel = preparePlayOptions.prefetchLevel();
            this.audioStream = preparePlayOptions.audioStream();
            this.sessionId = preparePlayOptions.sessionId();
            this.license = preparePlayOptions.license();
            this.configurationOverride = preparePlayOptions.configurationOverride();
        }
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("always_play_something")
    public Optional<Boolean> alwaysPlaySomething() {
        return this.alwaysPlaySomething;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("audio_stream")
    public Optional<AudioStream> audioStream() {
        return this.audioStream;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("configuration_override")
    public ImmutableMap<String, Object> configurationOverride() {
        return this.configurationOverride;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PreparePlayOptions)) {
            return false;
        }
        PreparePlayOptions preparePlayOptions = (PreparePlayOptions) obj;
        if (!this.playbackId.equals(preparePlayOptions.playbackId()) || !this.alwaysPlaySomething.equals(preparePlayOptions.alwaysPlaySomething()) || !this.skipTo.equals(preparePlayOptions.skipTo()) || !this.seekTo.equals(preparePlayOptions.seekTo()) || !this.initiallyPaused.equals(preparePlayOptions.initiallyPaused()) || !this.systemInitiated.equals(preparePlayOptions.systemInitiated()) || !this.playerOptionsOverride.equals(preparePlayOptions.playerOptionsOverride()) || !this.suppressions.equals(preparePlayOptions.suppressions()) || !this.prefetchLevel.equals(preparePlayOptions.prefetchLevel()) || !this.audioStream.equals(preparePlayOptions.audioStream()) || !this.sessionId.equals(preparePlayOptions.sessionId()) || !this.license.equals(preparePlayOptions.license()) || !this.configurationOverride.equals(preparePlayOptions.configurationOverride())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((((((((((((((((((this.playbackId.hashCode() ^ 1000003) * 1000003) ^ this.alwaysPlaySomething.hashCode()) * 1000003) ^ this.skipTo.hashCode()) * 1000003) ^ this.seekTo.hashCode()) * 1000003) ^ this.initiallyPaused.hashCode()) * 1000003) ^ this.systemInitiated.hashCode()) * 1000003) ^ this.playerOptionsOverride.hashCode()) * 1000003) ^ this.suppressions.hashCode()) * 1000003) ^ this.prefetchLevel.hashCode()) * 1000003) ^ this.audioStream.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.configurationOverride.hashCode();
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("initially_paused")
    public Optional<Boolean> initiallyPaused() {
        return this.initiallyPaused;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("license")
    public Optional<String> license() {
        return this.license;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
    public Optional<String> playbackId() {
        return this.playbackId;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("player_options_override")
    public Optional<PlayerOptionOverrides> playerOptionsOverride() {
        return this.playerOptionsOverride;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("prefetch_level")
    public Optional<PrefetchLevel> prefetchLevel() {
        return this.prefetchLevel;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("seek_to")
    public Optional<Long> seekTo() {
        return this.seekTo;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("session_id")
    public Optional<String> sessionId() {
        return this.sessionId;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("skip_to")
    public Optional<SkipToTrack> skipTo() {
        return this.skipTo;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("suppressions")
    public Optional<Suppressions> suppressions() {
        return this.suppressions;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    @JsonProperty("system_initiated")
    public Optional<Boolean> systemInitiated() {
        return this.systemInitiated;
    }

    @Override // com.spotify.player.model.command.options.PreparePlayOptions
    public PreparePlayOptions.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PreparePlayOptions{playbackId=");
        V0.append(this.playbackId);
        V0.append(", alwaysPlaySomething=");
        V0.append(this.alwaysPlaySomething);
        V0.append(", skipTo=");
        V0.append(this.skipTo);
        V0.append(", seekTo=");
        V0.append(this.seekTo);
        V0.append(", initiallyPaused=");
        V0.append(this.initiallyPaused);
        V0.append(", systemInitiated=");
        V0.append(this.systemInitiated);
        V0.append(", playerOptionsOverride=");
        V0.append(this.playerOptionsOverride);
        V0.append(", suppressions=");
        V0.append(this.suppressions);
        V0.append(", prefetchLevel=");
        V0.append(this.prefetchLevel);
        V0.append(", audioStream=");
        V0.append(this.audioStream);
        V0.append(", sessionId=");
        V0.append(this.sessionId);
        V0.append(", license=");
        V0.append(this.license);
        V0.append(", configurationOverride=");
        V0.append(this.configurationOverride);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_PreparePlayOptions(Optional<String> optional, Optional<Boolean> optional2, Optional<SkipToTrack> optional3, Optional<Long> optional4, Optional<Boolean> optional5, Optional<Boolean> optional6, Optional<PlayerOptionOverrides> optional7, Optional<Suppressions> optional8, Optional<PrefetchLevel> optional9, Optional<AudioStream> optional10, Optional<String> optional11, Optional<String> optional12, ImmutableMap<String, Object> immutableMap) {
        this.playbackId = optional;
        this.alwaysPlaySomething = optional2;
        this.skipTo = optional3;
        this.seekTo = optional4;
        this.initiallyPaused = optional5;
        this.systemInitiated = optional6;
        this.playerOptionsOverride = optional7;
        this.suppressions = optional8;
        this.prefetchLevel = optional9;
        this.audioStream = optional10;
        this.sessionId = optional11;
        this.license = optional12;
        this.configurationOverride = immutableMap;
    }
}
