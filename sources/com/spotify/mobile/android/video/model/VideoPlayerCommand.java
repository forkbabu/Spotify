package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JacksonSerializer;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = VideoPlayerCommand_Deserializer.class)
public class VideoPlayerCommand implements JacksonModel {
    private static final kg0<Type> TYPE_PARSER = kg0.a(Type.class);
    public ContextPlayerConfiguration configuration;
    public TrackWithPlayOrigin[] futureTrackWithPlayOrigins;
    public boolean initiallyPaused;
    public LoggingParameters loggingParameters;
    public float playbackSpeed;
    public PlayerTrack[] prefetchTracks;
    public long seekToInMs;
    public String startReason;
    public Long stopPositionInMs;
    public boolean systemInitiated;
    public TrackWithPlayOrigin trackWithPlayOrigin;
    public Type type;

    public enum Type {
        SUBSCRIBED,
        START,
        STOP,
        PAUSE,
        RESUME,
        SEEK_TO,
        SET_STOP_POSITION,
        PREFETCH_TRACKS,
        CONFIG,
        UNKNOWN
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.fasterxml.jackson.annotation.JsonCreator
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public VideoPlayerCommand(@com.fasterxml.jackson.annotation.JsonProperty("type") java.lang.String r15, @com.fasterxml.jackson.annotation.JsonProperty("seek_to") long r16, @com.fasterxml.jackson.annotation.JsonProperty("track") com.spotify.mobile.android.video.model.TrackWithPlayOrigin r18, @com.fasterxml.jackson.annotation.JsonProperty("future") com.spotify.mobile.android.video.model.TrackWithPlayOrigin[] r19, @com.fasterxml.jackson.annotation.JsonProperty("initially_paused") boolean r20, @com.fasterxml.jackson.annotation.JsonProperty("system_initiated") boolean r21, @com.fasterxml.jackson.annotation.JsonProperty("start_reason") java.lang.String r22, @com.fasterxml.jackson.annotation.JsonProperty("logging_params") com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters r23, @com.fasterxml.jackson.annotation.JsonProperty("tracks") com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[] r24, @com.fasterxml.jackson.annotation.JsonProperty("position") java.lang.Long r25, @com.fasterxml.jackson.annotation.JsonProperty("stop_position") java.lang.Long r26, @com.fasterxml.jackson.annotation.JsonProperty("config") com.spotify.mobile.android.video.model.ContextPlayerConfiguration r27) {
        /*
            r14 = this;
            kg0<com.spotify.mobile.android.video.model.VideoPlayerCommand$Type> r0 = com.spotify.mobile.android.video.model.VideoPlayerCommand.TYPE_PARSER
            r1 = r15
            com.google.common.base.Optional r0 = r0.f(r15)
            com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r1 = com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.UNKNOWN
            java.lang.Object r0 = r0.or(r1)
            r2 = r0
            com.spotify.mobile.android.video.model.VideoPlayerCommand$Type r2 = (com.spotify.mobile.android.video.model.VideoPlayerCommand.Type) r2
            if (r25 != 0) goto L_0x0015
            r3 = r16
            goto L_0x001a
        L_0x0015:
            long r0 = r25.longValue()
            r3 = r0
        L_0x001a:
            r1 = r14
            r5 = r26
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r27
            r1.<init>(r2, r3, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.mobile.android.video.model.VideoPlayerCommand.<init>(java.lang.String, long, com.spotify.mobile.android.video.model.TrackWithPlayOrigin, com.spotify.mobile.android.video.model.TrackWithPlayOrigin[], boolean, boolean, java.lang.String, com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters, com.spotify.mobile.android.cosmos.player.v2.PlayerTrack[], java.lang.Long, java.lang.Long, com.spotify.mobile.android.video.model.ContextPlayerConfiguration):void");
    }

    public static VideoPlayerCommand createConfigCommand(ContextPlayerConfiguration contextPlayerConfiguration) {
        return new VideoPlayerCommand(Type.CONFIG, 0, null, null, null, false, false, null, null, null, contextPlayerConfiguration);
    }

    public static VideoPlayerCommand createEmptyCommand(Type type2) {
        return new VideoPlayerCommand(type2, 0, null, null, null, false, false, null, null, null, null);
    }

    public static VideoPlayerCommand createSeekCommand(long j) {
        return new VideoPlayerCommand(Type.SEEK_TO, j, null, null, null, false, false, null, null, null, null);
    }

    public static VideoPlayerCommand createStartCommand(long j, TrackWithPlayOrigin trackWithPlayOrigin2, TrackWithPlayOrigin[] trackWithPlayOriginArr, boolean z, boolean z2, String str, LoggingParameters loggingParameters2, ContextPlayerConfiguration contextPlayerConfiguration) {
        return new VideoPlayerCommand(Type.START, j, null, trackWithPlayOrigin2, trackWithPlayOriginArr, z, z2, str, loggingParameters2, null, contextPlayerConfiguration);
    }

    public boolean testIsEqualTo(VideoPlayerCommand videoPlayerCommand) {
        return Arrays.equals(JacksonSerializer.toBytes(this), JacksonSerializer.toBytes(videoPlayerCommand));
    }

    public String toString() {
        StringBuilder V0 = je.V0("VideoPlayerCommand{type=");
        V0.append(this.type);
        V0.append('}');
        return V0.toString();
    }

    VideoPlayerCommand(Type type2, long j, Long l, TrackWithPlayOrigin trackWithPlayOrigin2, TrackWithPlayOrigin[] trackWithPlayOriginArr, boolean z, boolean z2, String str, LoggingParameters loggingParameters2, PlayerTrack[] playerTrackArr, ContextPlayerConfiguration contextPlayerConfiguration) {
        this.type = type2;
        this.stopPositionInMs = l;
        this.seekToInMs = j;
        this.trackWithPlayOrigin = trackWithPlayOrigin2;
        this.futureTrackWithPlayOrigins = trackWithPlayOriginArr;
        this.initiallyPaused = z;
        this.systemInitiated = z2;
        this.startReason = str == null ? "unknown" : str;
        this.loggingParameters = loggingParameters2;
        this.prefetchTracks = playerTrackArr;
        this.configuration = contextPlayerConfiguration;
    }
}
