package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.player.model.ContextTrack;
import java.util.Arrays;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = LegacyPlayerState_Deserializer.class)
@Deprecated
public class LegacyPlayerState implements JacksonModel, Parcelable {
    public static final Parcelable.Creator<LegacyPlayerState> CREATOR = new Parcelable.Creator<LegacyPlayerState>() {
        /* class com.spotify.mobile.android.cosmos.player.v2.LegacyPlayerState.AnonymousClass1 */

        @Override // android.os.Parcelable.Creator
        public LegacyPlayerState createFromParcel(Parcel parcel) {
            return new LegacyPlayerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public LegacyPlayerState[] newArray(int i) {
            return new LegacyPlayerState[i];
        }
    };
    public static final long NO_TIME = -1;
    @JsonProperty("audio_stream")
    private final PlayOptions.AudioStream mAudioStream;
    private cqe mClock;
    @JsonProperty("context_metadata")
    private final ImmutableMap<String, String> mContextMetadata;
    @JsonProperty("context_uri")
    private final String mContextUri;
    @JsonProperty("duration")
    private final long mDuration;
    @JsonProperty("future")
    private final PlayerTrack[] mFuture;
    @JsonProperty("index")
    private final PlayerContextIndex mIndex;
    @JsonProperty("is_paused")
    private final boolean mIsPaused;
    @JsonProperty("is_playing")
    private final boolean mIsPlaying;
    @JsonProperty("options")
    private final PlayerOptions mOptions;
    @JsonProperty("page_metadata")
    private final ImmutableMap<String, String> mPageMetadata;
    @JsonProperty("play_origin")
    private final PlayOrigin mPlayOrigin;
    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
    private final String mPlaybackId;
    @JsonProperty(ContextTrack.Metadata.KEY_PLAYBACK_SPEED)
    private final float mPlaybackSpeed;
    @JsonProperty("position_as_of_timestamp")
    private final long mPositionAsOfTimestamp;
    @JsonProperty("restrictions")
    private final PlayerRestrictions mRestrictions;
    @JsonProperty("reverse")
    private final PlayerTrack[] mReverse;
    @JsonProperty("suppressions")
    private final PlayerSuppressions mSuppressions;
    @JsonProperty("timestamp")
    private final long mTimestamp;
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    private final PlayerTrack mTrack;

    @JsonCreator
    public LegacyPlayerState(@JsonProperty("timestamp") long j, @JsonProperty("context_uri") String str, @JsonProperty("play_origin") PlayOrigin playOrigin, @JsonProperty("track") PlayerTrack playerTrack, @JsonProperty("playback_id") String str2, @JsonProperty("index") PlayerContextIndex playerContextIndex, @JsonProperty("playback_speed") float f, @JsonProperty("position_as_of_timestamp") long j2, @JsonProperty("duration") long j3, @JsonProperty("is_playing") boolean z, @JsonProperty("is_paused") boolean z2, @JsonProperty("options") PlayerOptions playerOptions, @JsonProperty("restrictions") PlayerRestrictions playerRestrictions, @JsonProperty("suppressions") PlayerSuppressions playerSuppressions, @JsonProperty("future") PlayerTrack[] playerTrackArr, @JsonProperty("reverse") PlayerTrack[] playerTrackArr2, @JsonProperty("context_metadata") Map<String, String> map, @JsonProperty("page_metadata") Map<String, String> map2, @JsonProperty("audio_stream") PlayOptions.AudioStream audioStream) {
        this.mTimestamp = j;
        this.mContextUri = str;
        playOrigin.getClass();
        this.mPlayOrigin = playOrigin;
        this.mTrack = playerTrack;
        this.mPlaybackId = str2;
        this.mIndex = playerContextIndex;
        this.mPlaybackSpeed = f;
        this.mPositionAsOfTimestamp = j2;
        this.mDuration = j3;
        this.mIsPlaying = z;
        this.mIsPaused = z2;
        playerOptions.getClass();
        this.mOptions = playerOptions;
        playerRestrictions.getClass();
        this.mRestrictions = playerRestrictions;
        playerSuppressions.getClass();
        this.mSuppressions = playerSuppressions;
        this.mFuture = playerTrackArr != null ? (PlayerTrack[]) Arrays.copyOf(playerTrackArr, playerTrackArr.length) : new PlayerTrack[0];
        this.mReverse = playerTrackArr2 != null ? (PlayerTrack[]) Arrays.copyOf(playerTrackArr2, playerTrackArr2.length) : new PlayerTrack[0];
        this.mClock = fqe.a;
        ImmutableMap.Builder builder = ImmutableMap.builder();
        if (map != null && !map.isEmpty()) {
            builder.putAll(map);
        }
        this.mContextMetadata = builder.build();
        ImmutableMap.Builder builder2 = ImmutableMap.builder();
        if (map2 != null && !map2.isEmpty()) {
            builder2.putAll(map2);
        }
        this.mPageMetadata = builder2.build();
        this.mAudioStream = audioStream == null ? PlayOptions.AudioStream.DEFAULT : audioStream;
    }

    public PlayOptions.AudioStream audioStream() {
        return this.mAudioStream;
    }

    public Map<String, String> contextMetadata() {
        return this.mContextMetadata;
    }

    public String contextUri() {
        String str = this.mContextUri;
        return str == null ? "" : str;
    }

    public long currentPlaybackPosition(long j) {
        long positionAsOfTimestamp = positionAsOfTimestamp();
        if (positionAsOfTimestamp == -1) {
            return -1;
        }
        return Math.min(positionAsOfTimestamp + ((long) (playbackSpeed() * ((float) (j - timestamp())))), duration());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long duration() {
        return this.mDuration;
    }

    public String entityUri() {
        return contextUri();
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyPlayerState)) {
            return false;
        }
        LegacyPlayerState legacyPlayerState = (LegacyPlayerState) obj;
        if (this.mTimestamp != legacyPlayerState.mTimestamp || Float.compare(legacyPlayerState.mPlaybackSpeed, this.mPlaybackSpeed) != 0 || this.mPositionAsOfTimestamp != legacyPlayerState.mPositionAsOfTimestamp || this.mDuration != legacyPlayerState.mDuration || this.mIsPlaying != legacyPlayerState.mIsPlaying || this.mIsPaused != legacyPlayerState.mIsPaused) {
            return false;
        }
        String str = this.mContextUri;
        if (str == null ? legacyPlayerState.mContextUri != null : !str.equals(legacyPlayerState.mContextUri)) {
            return false;
        }
        if (!this.mPlayOrigin.equals(legacyPlayerState.mPlayOrigin)) {
            return false;
        }
        PlayerTrack playerTrack = this.mTrack;
        if (playerTrack == null ? legacyPlayerState.mTrack != null : !playerTrack.equals(legacyPlayerState.mTrack)) {
            return false;
        }
        String str2 = this.mPlaybackId;
        if (str2 == null ? legacyPlayerState.mPlaybackId != null : !str2.equals(legacyPlayerState.mPlaybackId)) {
            return false;
        }
        PlayerContextIndex playerContextIndex = this.mIndex;
        if (playerContextIndex == null ? legacyPlayerState.mIndex != null : !playerContextIndex.equals(legacyPlayerState.mIndex)) {
            return false;
        }
        if (!this.mOptions.equals(legacyPlayerState.mOptions) || !this.mRestrictions.equals(legacyPlayerState.mRestrictions) || !this.mSuppressions.equals(legacyPlayerState.mSuppressions) || !Arrays.equals(this.mFuture, legacyPlayerState.mFuture) || !Arrays.equals(this.mReverse, legacyPlayerState.mReverse) || !MapUtils.areMapsEqual(this.mContextMetadata, legacyPlayerState.mContextMetadata) || !MapUtils.areMapsEqual(this.mPageMetadata, legacyPlayerState.mPageMetadata)) {
            return false;
        }
        PlayOptions.AudioStream audioStream = this.mAudioStream;
        PlayOptions.AudioStream audioStream2 = legacyPlayerState.mAudioStream;
        return audioStream == null ? audioStream2 == null : audioStream == audioStream2;
    }

    public PlayerTrack[] future() {
        return this.mFuture;
    }

    @Override // java.lang.Object
    public int hashCode() {
        long j = this.mTimestamp;
        int i = 0;
        int hashCode = ((((int) (j ^ (j >>> 32))) * 31) + Arrays.hashCode(new Object[]{this.mContextUri, this.mPlayOrigin, this.mTrack, this.mPlaybackId, this.mIndex, this.mOptions, this.mRestrictions, this.mSuppressions})) * 31;
        float f = this.mPlaybackSpeed;
        int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        long j2 = this.mPositionAsOfTimestamp;
        long j3 = this.mDuration;
        int hashCode2 = (((((((((((((((((hashCode + floatToIntBits) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.mIsPlaying ? 1 : 0)) * 31) + (this.mIsPaused ? 1 : 0)) * 31) + Arrays.hashCode(this.mFuture)) * 31) + Arrays.hashCode(this.mReverse)) * 31) + MapUtils.hashOfMap(this.mContextMetadata)) * 31) + MapUtils.hashOfMap(this.mPageMetadata)) * 31;
        PlayOptions.AudioStream audioStream = this.mAudioStream;
        if (audioStream != null) {
            i = audioStream.hashCode();
        }
        return hashCode2 + i;
    }

    public PlayerContextIndex index() {
        return this.mIndex;
    }

    public boolean isPaused() {
        return this.mIsPaused;
    }

    public boolean isPlaying() {
        return this.mIsPlaying;
    }

    public PlayerOptions options() {
        return this.mOptions;
    }

    public Map<String, String> pageMetadata() {
        return this.mPageMetadata;
    }

    public PlayOrigin playOrigin() {
        return this.mPlayOrigin;
    }

    public String playbackId() {
        return this.mPlaybackId;
    }

    public float playbackSpeed() {
        return this.mPlaybackSpeed;
    }

    public long positionAsOfTimestamp() {
        return this.mPositionAsOfTimestamp;
    }

    public PlayerRestrictions restrictions() {
        return this.mRestrictions;
    }

    public PlayerTrack[] reverse() {
        return this.mReverse;
    }

    public void setClock(cqe cqe) {
        this.mClock = cqe;
    }

    public PlayerSuppressions suppressions() {
        return this.mSuppressions;
    }

    public long timestamp() {
        return this.mTimestamp;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("PlayerState{contextUri=");
        V0.append(contextUri());
        V0.append(", isPlaying=");
        V0.append(isPlaying());
        V0.append(", isPaused=");
        V0.append(isPaused());
        V0.append(", playbackSpeed=");
        V0.append(playbackSpeed());
        V0.append(", timestamp=");
        V0.append(timestamp());
        V0.append(", duration=");
        V0.append(duration());
        V0.append(", track=");
        V0.append(track());
        V0.append(", contextMetadata=");
        V0.append(contextMetadata());
        V0.append("}");
        return V0.toString();
    }

    public PlayerTrack track() {
        return this.mTrack;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mTimestamp);
        parcel.writeString(this.mContextUri);
        this.mPlayOrigin.writeToParcel(parcel, 0);
        gf0.v(parcel, this.mTrack, 0);
        parcel.writeString(this.mPlaybackId);
        gf0.v(parcel, this.mIndex, 0);
        parcel.writeFloat(this.mPlaybackSpeed);
        parcel.writeLong(this.mPositionAsOfTimestamp);
        parcel.writeLong(this.mDuration);
        parcel.writeInt(this.mIsPlaying ? 1 : 0);
        parcel.writeInt(this.mIsPaused ? 1 : 0);
        this.mOptions.writeToParcel(parcel, 0);
        this.mRestrictions.writeToParcel(parcel, 0);
        this.mSuppressions.writeToParcel(parcel, 0);
        parcel.writeTypedArray(this.mFuture, 0);
        parcel.writeTypedArray(this.mReverse, 0);
        gf0.t(parcel, this.mContextMetadata);
        gf0.t(parcel, this.mPageMetadata);
        gf0.q(parcel, this.mAudioStream);
    }

    public long currentPlaybackPosition() {
        return currentPlaybackPosition(this.mClock.d());
    }

    protected LegacyPlayerState(Parcel parcel) {
        this.mTimestamp = parcel.readLong();
        this.mContextUri = parcel.readString();
        this.mPlayOrigin = PlayOrigin.CREATOR.createFromParcel(parcel);
        Parcelable.Creator<PlayerTrack> creator = PlayerTrack.CREATOR;
        this.mTrack = (PlayerTrack) gf0.n(parcel, creator);
        this.mPlaybackId = parcel.readString();
        this.mIndex = (PlayerContextIndex) gf0.n(parcel, PlayerContextIndex.CREATOR);
        this.mPlaybackSpeed = parcel.readFloat();
        this.mPositionAsOfTimestamp = parcel.readLong();
        this.mDuration = parcel.readLong();
        boolean z = true;
        this.mIsPlaying = parcel.readInt() != 0;
        this.mIsPaused = parcel.readInt() == 0 ? false : z;
        this.mOptions = AutoValue_PlayerOptions.CREATOR.createFromParcel(parcel);
        this.mRestrictions = PlayerRestrictions.CREATOR.createFromParcel(parcel);
        this.mSuppressions = PlayerSuppressions.CREATOR.createFromParcel(parcel);
        this.mFuture = (PlayerTrack[]) parcel.createTypedArray(creator);
        this.mReverse = (PlayerTrack[]) parcel.createTypedArray(creator);
        this.mContextMetadata = gf0.k(parcel, zf0.b());
        this.mPageMetadata = gf0.k(parcel, zf0.b());
        this.mAudioStream = (PlayOptions.AudioStream) gf0.j(parcel, PlayOptions.AudioStream.class);
        this.mClock = fqe.a;
    }
}
