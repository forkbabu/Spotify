package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.AutoValue_PlayerQueue;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(builder = Builder.class)
public abstract class PlayerQueue {
    public static final PlayerQueue EMPTY = builder().build();

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return PlayerQueue.builder();
        }

        public abstract PlayerQueue build();

        @JsonProperty("next_tracks")
        public abstract Builder nextTracks(ImmutableList<ContextTrack> immutableList);

        @JsonProperty("prev_tracks")
        public abstract Builder prevTracks(ImmutableList<ContextTrack> immutableList);

        @JsonProperty("revision")
        public abstract Builder revision(String str);

        @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
        public abstract Builder track(ContextTrack contextTrack);
    }

    public static Builder builder() {
        return new AutoValue_PlayerQueue.Builder().revision("").nextTracks(ImmutableList.of()).prevTracks(ImmutableList.of());
    }

    @JsonProperty("next_tracks")
    public abstract ImmutableList<ContextTrack> nextTracks();

    @JsonProperty("prev_tracks")
    public abstract ImmutableList<ContextTrack> prevTracks();

    @JsonProperty("revision")
    public abstract String revision();

    public abstract Builder toBuilder();

    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public abstract Optional<ContextTrack> track();
}
