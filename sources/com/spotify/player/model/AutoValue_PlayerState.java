package com.spotify.player.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import java.util.Collection;
import java.util.List;
import java.util.Map;

final class AutoValue_PlayerState extends PlayerState {
    private final AudioStream audioStream;
    private final ImmutableMap<String, String> contextMetadata;
    private final Restrictions contextRestrictions;
    private final String contextUri;
    private final String contextUrl;
    private final Optional<Long> duration;
    private final Optional<ContextIndex> index;
    private final boolean isBuffering;
    private final boolean isPaused;
    private final boolean isPlaying;
    private final boolean isSystemInitiated;
    private final ImmutableList<ContextTrack> nextTracks;
    private final PlayerOptions options;
    private final ImmutableMap<String, String> pageMetadata;
    private final PlayOrigin playOrigin;
    private final Optional<String> playbackId;
    private final Optional<PlaybackQuality> playbackQuality;
    private final Optional<Double> playbackSpeed;
    private final Optional<Long> positionAsOfTimestamp;
    private final ImmutableList<ContextTrack> prevTracks;
    private final String queueRevision;
    private final Restrictions restrictions;
    private final String sessionId;
    private final Suppressions suppressions;
    private final long timestamp;
    private final Optional<ContextTrack> track;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlayerState.Builder {
        private AudioStream audioStream;
        private ImmutableMap<String, String> contextMetadata;
        private Restrictions contextRestrictions;
        private String contextUri;
        private String contextUrl;
        private Optional<Long> duration;
        private Optional<ContextIndex> index;
        private Boolean isBuffering;
        private Boolean isPaused;
        private Boolean isPlaying;
        private Boolean isSystemInitiated;
        private ImmutableList<ContextTrack> nextTracks;
        private PlayerOptions options;
        private ImmutableMap<String, String> pageMetadata;
        private PlayOrigin playOrigin;
        private Optional<String> playbackId;
        private Optional<PlaybackQuality> playbackQuality;
        private Optional<Double> playbackSpeed;
        private Optional<Long> positionAsOfTimestamp;
        private ImmutableList<ContextTrack> prevTracks;
        private String queueRevision;
        private Restrictions restrictions;
        private String sessionId;
        private Suppressions suppressions;
        private Long timestamp;
        private Optional<ContextTrack> track;

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder audioStream(AudioStream audioStream2) {
            if (audioStream2 != null) {
                this.audioStream = audioStream2;
                return this;
            }
            throw new NullPointerException("Null audioStream");
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState build() {
            String str = this.timestamp == null ? " timestamp" : "";
            if (this.contextUri == null) {
                str = je.x0(str, " contextUri");
            }
            if (this.contextUrl == null) {
                str = je.x0(str, " contextUrl");
            }
            if (this.contextRestrictions == null) {
                str = je.x0(str, " contextRestrictions");
            }
            if (this.playOrigin == null) {
                str = je.x0(str, " playOrigin");
            }
            if (this.isPlaying == null) {
                str = je.x0(str, " isPlaying");
            }
            if (this.isPaused == null) {
                str = je.x0(str, " isPaused");
            }
            if (this.isBuffering == null) {
                str = je.x0(str, " isBuffering");
            }
            if (this.isSystemInitiated == null) {
                str = je.x0(str, " isSystemInitiated");
            }
            if (this.options == null) {
                str = je.x0(str, " options");
            }
            if (this.restrictions == null) {
                str = je.x0(str, " restrictions");
            }
            if (this.suppressions == null) {
                str = je.x0(str, " suppressions");
            }
            if (this.prevTracks == null) {
                str = je.x0(str, " prevTracks");
            }
            if (this.nextTracks == null) {
                str = je.x0(str, " nextTracks");
            }
            if (this.contextMetadata == null) {
                str = je.x0(str, " contextMetadata");
            }
            if (this.pageMetadata == null) {
                str = je.x0(str, " pageMetadata");
            }
            if (this.sessionId == null) {
                str = je.x0(str, " sessionId");
            }
            if (this.queueRevision == null) {
                str = je.x0(str, " queueRevision");
            }
            if (this.audioStream == null) {
                str = je.x0(str, " audioStream");
            }
            if (str.isEmpty()) {
                return new AutoValue_PlayerState(this.timestamp.longValue(), this.contextUri, this.contextUrl, this.contextRestrictions, this.playOrigin, this.index, this.track, this.playbackId, this.playbackQuality, this.playbackSpeed, this.positionAsOfTimestamp, this.duration, this.isPlaying.booleanValue(), this.isPaused.booleanValue(), this.isBuffering.booleanValue(), this.isSystemInitiated.booleanValue(), this.options, this.restrictions, this.suppressions, this.prevTracks, this.nextTracks, this.contextMetadata, this.pageMetadata, this.sessionId, this.queueRevision, this.audioStream);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder contextMetadata(Map<String, String> map) {
            this.contextMetadata = ImmutableMap.copyOf(map);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder contextRestrictions(Restrictions restrictions2) {
            if (restrictions2 != null) {
                this.contextRestrictions = restrictions2;
                return this;
            }
            throw new NullPointerException("Null contextRestrictions");
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder contextUri(String str) {
            if (str != null) {
                this.contextUri = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder contextUrl(String str) {
            if (str != null) {
                this.contextUrl = str;
                return this;
            }
            throw new NullPointerException("Null contextUrl");
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder duration(Long l) {
            this.duration = Optional.of(l);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder index(ContextIndex contextIndex) {
            this.index = Optional.of(contextIndex);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder isBuffering(boolean z) {
            this.isBuffering = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder isPaused(boolean z) {
            this.isPaused = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder isPlaying(boolean z) {
            this.isPlaying = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder isSystemInitiated(boolean z) {
            this.isSystemInitiated = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder nextTracks(List<ContextTrack> list) {
            this.nextTracks = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder options(PlayerOptions playerOptions) {
            if (playerOptions != null) {
                this.options = playerOptions;
                return this;
            }
            throw new NullPointerException("Null options");
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder pageMetadata(Map<String, String> map) {
            this.pageMetadata = ImmutableMap.copyOf(map);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder playOrigin(PlayOrigin playOrigin2) {
            if (playOrigin2 != null) {
                this.playOrigin = playOrigin2;
                return this;
            }
            throw new NullPointerException("Null playOrigin");
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder playbackId(String str) {
            this.playbackId = Optional.of(str);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder playbackQuality(PlaybackQuality playbackQuality2) {
            this.playbackQuality = Optional.of(playbackQuality2);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder playbackSpeed(Double d) {
            this.playbackSpeed = Optional.of(d);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder positionAsOfTimestamp(Long l) {
            this.positionAsOfTimestamp = Optional.of(l);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder prevTracks(List<ContextTrack> list) {
            this.prevTracks = ImmutableList.copyOf((Collection) list);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder queueRevision(String str) {
            if (str != null) {
                this.queueRevision = str;
                return this;
            }
            throw new NullPointerException("Null queueRevision");
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder restrictions(Restrictions restrictions2) {
            if (restrictions2 != null) {
                this.restrictions = restrictions2;
                return this;
            }
            throw new NullPointerException("Null restrictions");
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder sessionId(String str) {
            if (str != null) {
                this.sessionId = str;
                return this;
            }
            throw new NullPointerException("Null sessionId");
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder suppressions(Suppressions suppressions2) {
            if (suppressions2 != null) {
                this.suppressions = suppressions2;
                return this;
            }
            throw new NullPointerException("Null suppressions");
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder timestamp(long j) {
            this.timestamp = Long.valueOf(j);
            return this;
        }

        @Override // com.spotify.player.model.PlayerState.Builder
        public PlayerState.Builder track(ContextTrack contextTrack) {
            this.track = Optional.of(contextTrack);
            return this;
        }

        Builder() {
            this.index = Optional.absent();
            this.track = Optional.absent();
            this.playbackId = Optional.absent();
            this.playbackQuality = Optional.absent();
            this.playbackSpeed = Optional.absent();
            this.positionAsOfTimestamp = Optional.absent();
            this.duration = Optional.absent();
        }

        private Builder(PlayerState playerState) {
            this.index = Optional.absent();
            this.track = Optional.absent();
            this.playbackId = Optional.absent();
            this.playbackQuality = Optional.absent();
            this.playbackSpeed = Optional.absent();
            this.positionAsOfTimestamp = Optional.absent();
            this.duration = Optional.absent();
            this.timestamp = Long.valueOf(playerState.timestamp());
            this.contextUri = playerState.contextUri();
            this.contextUrl = playerState.contextUrl();
            this.contextRestrictions = playerState.contextRestrictions();
            this.playOrigin = playerState.playOrigin();
            this.index = playerState.index();
            this.track = playerState.track();
            this.playbackId = playerState.playbackId();
            this.playbackQuality = playerState.playbackQuality();
            this.playbackSpeed = playerState.playbackSpeed();
            this.positionAsOfTimestamp = playerState.positionAsOfTimestamp();
            this.duration = playerState.duration();
            this.isPlaying = Boolean.valueOf(playerState.isPlaying());
            this.isPaused = Boolean.valueOf(playerState.isPaused());
            this.isBuffering = Boolean.valueOf(playerState.isBuffering());
            this.isSystemInitiated = Boolean.valueOf(playerState.isSystemInitiated());
            this.options = playerState.options();
            this.restrictions = playerState.restrictions();
            this.suppressions = playerState.suppressions();
            this.prevTracks = playerState.prevTracks();
            this.nextTracks = playerState.nextTracks();
            this.contextMetadata = playerState.contextMetadata();
            this.pageMetadata = playerState.pageMetadata();
            this.sessionId = playerState.sessionId();
            this.queueRevision = playerState.queueRevision();
            this.audioStream = playerState.audioStream();
        }
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("audio_stream")
    public AudioStream audioStream() {
        return this.audioStream;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("context_metadata")
    public ImmutableMap<String, String> contextMetadata() {
        return this.contextMetadata;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("context_restrictions")
    public Restrictions contextRestrictions() {
        return this.contextRestrictions;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("context_uri")
    public String contextUri() {
        return this.contextUri;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("context_url")
    public String contextUrl() {
        return this.contextUrl;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("duration")
    public Optional<Long> duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerState)) {
            return false;
        }
        PlayerState playerState = (PlayerState) obj;
        if (this.timestamp != playerState.timestamp() || !this.contextUri.equals(playerState.contextUri()) || !this.contextUrl.equals(playerState.contextUrl()) || !this.contextRestrictions.equals(playerState.contextRestrictions()) || !this.playOrigin.equals(playerState.playOrigin()) || !this.index.equals(playerState.index()) || !this.track.equals(playerState.track()) || !this.playbackId.equals(playerState.playbackId()) || !this.playbackQuality.equals(playerState.playbackQuality()) || !this.playbackSpeed.equals(playerState.playbackSpeed()) || !this.positionAsOfTimestamp.equals(playerState.positionAsOfTimestamp()) || !this.duration.equals(playerState.duration()) || this.isPlaying != playerState.isPlaying() || this.isPaused != playerState.isPaused() || this.isBuffering != playerState.isBuffering() || this.isSystemInitiated != playerState.isSystemInitiated() || !this.options.equals(playerState.options()) || !this.restrictions.equals(playerState.restrictions()) || !this.suppressions.equals(playerState.suppressions()) || !this.prevTracks.equals(playerState.prevTracks()) || !this.nextTracks.equals(playerState.nextTracks()) || !this.contextMetadata.equals(playerState.contextMetadata()) || !this.pageMetadata.equals(playerState.pageMetadata()) || !this.sessionId.equals(playerState.sessionId()) || !this.queueRevision.equals(playerState.queueRevision()) || !this.audioStream.equals(playerState.audioStream())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.timestamp;
        int i = 1231;
        int hashCode = (((((((((((((((((((((((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.contextUri.hashCode()) * 1000003) ^ this.contextUrl.hashCode()) * 1000003) ^ this.contextRestrictions.hashCode()) * 1000003) ^ this.playOrigin.hashCode()) * 1000003) ^ this.index.hashCode()) * 1000003) ^ this.track.hashCode()) * 1000003) ^ this.playbackId.hashCode()) * 1000003) ^ this.playbackQuality.hashCode()) * 1000003) ^ this.playbackSpeed.hashCode()) * 1000003) ^ this.positionAsOfTimestamp.hashCode()) * 1000003) ^ this.duration.hashCode()) * 1000003) ^ (this.isPlaying ? 1231 : 1237)) * 1000003) ^ (this.isPaused ? 1231 : 1237)) * 1000003) ^ (this.isBuffering ? 1231 : 1237)) * 1000003;
        if (!this.isSystemInitiated) {
            i = 1237;
        }
        return this.audioStream.hashCode() ^ ((((((((((((((((((((hashCode ^ i) * 1000003) ^ this.options.hashCode()) * 1000003) ^ this.restrictions.hashCode()) * 1000003) ^ this.suppressions.hashCode()) * 1000003) ^ this.prevTracks.hashCode()) * 1000003) ^ this.nextTracks.hashCode()) * 1000003) ^ this.contextMetadata.hashCode()) * 1000003) ^ this.pageMetadata.hashCode()) * 1000003) ^ this.sessionId.hashCode()) * 1000003) ^ this.queueRevision.hashCode()) * 1000003);
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("index")
    public Optional<ContextIndex> index() {
        return this.index;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("is_buffering")
    public boolean isBuffering() {
        return this.isBuffering;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("is_paused")
    public boolean isPaused() {
        return this.isPaused;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("is_playing")
    public boolean isPlaying() {
        return this.isPlaying;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("is_system_initiated")
    public boolean isSystemInitiated() {
        return this.isSystemInitiated;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("future")
    public ImmutableList<ContextTrack> nextTracks() {
        return this.nextTracks;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("options")
    public PlayerOptions options() {
        return this.options;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("page_metadata")
    public ImmutableMap<String, String> pageMetadata() {
        return this.pageMetadata;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("play_origin")
    public PlayOrigin playOrigin() {
        return this.playOrigin;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
    public Optional<String> playbackId() {
        return this.playbackId;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("playback_quality")
    public Optional<PlaybackQuality> playbackQuality() {
        return this.playbackQuality;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty(ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
    public Optional<Double> playbackSpeed() {
        return this.playbackSpeed;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("position_as_of_timestamp")
    public Optional<Long> positionAsOfTimestamp() {
        return this.positionAsOfTimestamp;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("reverse")
    public ImmutableList<ContextTrack> prevTracks() {
        return this.prevTracks;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("queue_revision")
    public String queueRevision() {
        return this.queueRevision;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("restrictions")
    public Restrictions restrictions() {
        return this.restrictions;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("session_id")
    public String sessionId() {
        return this.sessionId;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("suppressions")
    public Suppressions suppressions() {
        return this.suppressions;
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty("timestamp")
    public long timestamp() {
        return this.timestamp;
    }

    @Override // com.spotify.player.model.PlayerState
    public PlayerState.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerState{timestamp=");
        V0.append(this.timestamp);
        V0.append(", contextUri=");
        V0.append(this.contextUri);
        V0.append(", contextUrl=");
        V0.append(this.contextUrl);
        V0.append(", contextRestrictions=");
        V0.append(this.contextRestrictions);
        V0.append(", playOrigin=");
        V0.append(this.playOrigin);
        V0.append(", index=");
        V0.append(this.index);
        V0.append(", track=");
        V0.append(this.track);
        V0.append(", playbackId=");
        V0.append(this.playbackId);
        V0.append(", playbackQuality=");
        V0.append(this.playbackQuality);
        V0.append(", playbackSpeed=");
        V0.append(this.playbackSpeed);
        V0.append(", positionAsOfTimestamp=");
        V0.append(this.positionAsOfTimestamp);
        V0.append(", duration=");
        V0.append(this.duration);
        V0.append(", isPlaying=");
        V0.append(this.isPlaying);
        V0.append(", isPaused=");
        V0.append(this.isPaused);
        V0.append(", isBuffering=");
        V0.append(this.isBuffering);
        V0.append(", isSystemInitiated=");
        V0.append(this.isSystemInitiated);
        V0.append(", options=");
        V0.append(this.options);
        V0.append(", restrictions=");
        V0.append(this.restrictions);
        V0.append(", suppressions=");
        V0.append(this.suppressions);
        V0.append(", prevTracks=");
        V0.append(this.prevTracks);
        V0.append(", nextTracks=");
        V0.append(this.nextTracks);
        V0.append(", contextMetadata=");
        V0.append(this.contextMetadata);
        V0.append(", pageMetadata=");
        V0.append(this.pageMetadata);
        V0.append(", sessionId=");
        V0.append(this.sessionId);
        V0.append(", queueRevision=");
        V0.append(this.queueRevision);
        V0.append(", audioStream=");
        V0.append(this.audioStream);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.player.model.PlayerState
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public Optional<ContextTrack> track() {
        return this.track;
    }

    private AutoValue_PlayerState(long j, String str, String str2, Restrictions restrictions2, PlayOrigin playOrigin2, Optional<ContextIndex> optional, Optional<ContextTrack> optional2, Optional<String> optional3, Optional<PlaybackQuality> optional4, Optional<Double> optional5, Optional<Long> optional6, Optional<Long> optional7, boolean z, boolean z2, boolean z3, boolean z4, PlayerOptions playerOptions, Restrictions restrictions3, Suppressions suppressions2, ImmutableList<ContextTrack> immutableList, ImmutableList<ContextTrack> immutableList2, ImmutableMap<String, String> immutableMap, ImmutableMap<String, String> immutableMap2, String str3, String str4, AudioStream audioStream2) {
        this.timestamp = j;
        this.contextUri = str;
        this.contextUrl = str2;
        this.contextRestrictions = restrictions2;
        this.playOrigin = playOrigin2;
        this.index = optional;
        this.track = optional2;
        this.playbackId = optional3;
        this.playbackQuality = optional4;
        this.playbackSpeed = optional5;
        this.positionAsOfTimestamp = optional6;
        this.duration = optional7;
        this.isPlaying = z;
        this.isPaused = z2;
        this.isBuffering = z3;
        this.isSystemInitiated = z4;
        this.options = playerOptions;
        this.restrictions = restrictions3;
        this.suppressions = suppressions2;
        this.prevTracks = immutableList;
        this.nextTracks = immutableList2;
        this.contextMetadata = immutableMap;
        this.pageMetadata = immutableMap2;
        this.sessionId = str3;
        this.queueRevision = str4;
        this.audioStream = audioStream2;
    }
}
