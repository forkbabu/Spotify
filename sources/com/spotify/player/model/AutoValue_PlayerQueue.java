package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.player.model.PlayerQueue;

final class AutoValue_PlayerQueue extends PlayerQueue {
    private final ImmutableList<ContextTrack> nextTracks;
    private final ImmutableList<ContextTrack> prevTracks;
    private final String revision;
    private final Optional<ContextTrack> track;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlayerQueue.Builder {
        private ImmutableList<ContextTrack> nextTracks;
        private ImmutableList<ContextTrack> prevTracks;
        private String revision;
        private Optional<ContextTrack> track;

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue build() {
            String str = this.revision == null ? " revision" : "";
            if (this.nextTracks == null) {
                str = je.x0(str, " nextTracks");
            }
            if (this.prevTracks == null) {
                str = je.x0(str, " prevTracks");
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayerQueue(this.revision, this.track, this.nextTracks, this.prevTracks);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder nextTracks(ImmutableList<ContextTrack> immutableList) {
            if (immutableList != null) {
                this.nextTracks = immutableList;
                return this;
            }
            throw new NullPointerException("Null nextTracks");
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder prevTracks(ImmutableList<ContextTrack> immutableList) {
            if (immutableList != null) {
                this.prevTracks = immutableList;
                return this;
            }
            throw new NullPointerException("Null prevTracks");
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder revision(String str) {
            if (str != null) {
                this.revision = str;
                return this;
            }
            throw new NullPointerException("Null revision");
        }

        @Override // com.spotify.player.model.PlayerQueue.Builder
        public PlayerQueue.Builder track(ContextTrack contextTrack) {
            this.track = Optional.of(contextTrack);
            return this;
        }

        Builder() {
            this.track = Optional.absent();
        }

        private Builder(PlayerQueue playerQueue) {
            this.track = Optional.absent();
            this.revision = playerQueue.revision();
            this.track = playerQueue.track();
            this.nextTracks = playerQueue.nextTracks();
            this.prevTracks = playerQueue.prevTracks();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerQueue)) {
            return false;
        }
        PlayerQueue playerQueue = (PlayerQueue) obj;
        if (!this.revision.equals(playerQueue.revision()) || !this.track.equals(playerQueue.track()) || !this.nextTracks.equals(playerQueue.nextTracks()) || !this.prevTracks.equals(playerQueue.prevTracks())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.revision.hashCode() ^ 1000003) * 1000003) ^ this.track.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003) ^ this.prevTracks.hashCode();
    }

    @Override // com.spotify.player.model.PlayerQueue
    @JsonProperty("next_tracks")
    public ImmutableList<ContextTrack> nextTracks() {
        return this.nextTracks;
    }

    @Override // com.spotify.player.model.PlayerQueue
    @JsonProperty("prev_tracks")
    public ImmutableList<ContextTrack> prevTracks() {
        return this.prevTracks;
    }

    @Override // com.spotify.player.model.PlayerQueue
    @JsonProperty("revision")
    public String revision() {
        return this.revision;
    }

    @Override // com.spotify.player.model.PlayerQueue
    public PlayerQueue.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerQueue{revision=");
        V0.append(this.revision);
        V0.append(", track=");
        V0.append(this.track);
        V0.append(", nextTracks=");
        V0.append(this.nextTracks);
        V0.append(", prevTracks=");
        V0.append(this.prevTracks);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.player.model.PlayerQueue
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public Optional<ContextTrack> track() {
        return this.track;
    }

    private AutoValue_PlayerQueue(String str, Optional<ContextTrack> optional, ImmutableList<ContextTrack> immutableList, ImmutableList<ContextTrack> immutableList2) {
        this.revision = str;
        this.track = optional;
        this.nextTracks = immutableList;
        this.prevTracks = immutableList2;
    }
}
