package com.spotify.mobile.android.cosmos.player.v2;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.video.model.PlayerError;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
public class PlayOptions implements JacksonModel {
    @JsonProperty("allow_seeking")
    private final boolean mAllowSeeking;
    @JsonProperty("always_play_something")
    private final boolean mAlwaysPlaySomething;
    @JsonProperty("audio_stream")
    private final AudioStream mAudioStream;
    @JsonProperty("configuration_override")
    private final Map<String, JsonNode> mConfigurationOverride;
    @JsonProperty("initially_paused")
    private final boolean mInitiallyPaused;
    @JsonProperty("operation")
    private final Operation mOperation;
    @JsonProperty("override_restrictions")
    private final boolean mOverrideRestrictions;
    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
    private final String mPlaybackId;
    @JsonProperty("player_options_override")
    private final PlayerOptionsOverrides mPlayerOptionsOverride;
    @JsonProperty("seek_to")
    private final Long mSeekTo;
    @JsonProperty("skip_to")
    private final PlayOptionsSkipTo mSkipTo;
    @JsonProperty("suppressions")
    private final PlayerSuppressions mSuppressions;
    @JsonProperty("system_initiated")
    private final boolean mSystemInitiated;
    @JsonProperty("trigger")
    private final Trigger mTrigger;

    public enum AudioStream {
        DEFAULT,
        ALARM;

        @JsonCreator
        public static AudioStream fromString(String str) {
            if (str != null) {
                if (str.equals("alarm")) {
                    return ALARM;
                }
                if (str.equals("default")) {
                    return DEFAULT;
                }
            }
            return DEFAULT;
        }

        public int getStreamType() {
            return this == ALARM ? 4 : 3;
        }

        public int getUsage() {
            return this == ALARM ? 4 : 1;
        }
    }

    public static final class Builder {
        private boolean mAllowSeeking;
        private boolean mAlwaysPlaySomething;
        private AudioStream mAudioStream;
        private Map<String, JsonNode> mConfigurationOverride;
        private boolean mInitiallyPaused;
        private Operation mOperation;
        private boolean mOverrideRestrictions;
        private String mPlaybackId;
        private PlayerOptionsOverrides mPlayerOptionsOverride;
        private Long mSeekTo;
        private PlayOptionsSkipTo mSkipTo;
        private PlayerSuppressions mSuppressions;
        private boolean mSystemInitiated;
        private Trigger mTrigger;

        public Builder allowSeeking(boolean z) {
            this.mAllowSeeking = z;
            return this;
        }

        public Builder alwaysPlaySomething(boolean z) {
            this.mAlwaysPlaySomething = z;
            return this;
        }

        public Builder audioStream(AudioStream audioStream) {
            this.mAudioStream = audioStream;
            return this;
        }

        public PlayOptions build() {
            return new PlayOptions(this.mSkipTo, this.mAlwaysPlaySomething, this.mSeekTo, this.mInitiallyPaused, this.mPlayerOptionsOverride, this.mSuppressions, this.mAllowSeeking, this.mOperation, this.mTrigger, this.mPlaybackId, this.mSystemInitiated, this.mAudioStream, this.mConfigurationOverride, this.mOverrideRestrictions);
        }

        public Builder configurationOverride(Map<String, JsonNode> map) {
            this.mConfigurationOverride = map;
            return this;
        }

        public Builder initiallyPaused(boolean z) {
            this.mInitiallyPaused = z;
            return this;
        }

        public Builder operation(Operation operation) {
            this.mOperation = operation;
            return this;
        }

        public Builder overrideRestrictions(boolean z) {
            this.mOverrideRestrictions = z;
            return this;
        }

        public Builder playbackId(String str) {
            this.mPlaybackId = str;
            return this;
        }

        public Builder playerOptionsOverride(PlayerOptionsOverrides playerOptionsOverrides) {
            this.mPlayerOptionsOverride = playerOptionsOverrides;
            return this;
        }

        public Builder seekTo(Long l) {
            this.mSeekTo = l;
            return this;
        }

        public Builder skipTo(PlayOptionsSkipTo playOptionsSkipTo) {
            this.mSkipTo = playOptionsSkipTo;
            return this;
        }

        public Builder skipToIndex(int i, int i2) {
            return skipTo(new PlayOptionsSkipTo(null, Integer.valueOf(i), null, null, i2));
        }

        public Builder suppressions(PlayerSuppressions playerSuppressions) {
            this.mSuppressions = playerSuppressions;
            return this;
        }

        public Builder systemInitiated(boolean z) {
            this.mSystemInitiated = z;
            return this;
        }

        public Builder trigger(Trigger trigger) {
            this.mTrigger = trigger;
            return this;
        }

        public Builder playerOptionsOverride(Boolean bool, Boolean bool2, Boolean bool3) {
            this.mPlayerOptionsOverride = PlayerOptionsOverrides.create(bool, bool2, bool3);
            return this;
        }

        public Builder skipTo(String str, int i, String str2, String str3, int i2) {
            return skipTo(new PlayOptionsSkipTo(str, Integer.valueOf(i), str2, str3, i2));
        }

        public Builder suppressions(String... strArr) {
            this.mSuppressions = new PlayerSuppressions(Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr))));
            return this;
        }
    }

    public enum Operation {
        REPLACE,
        ENQUEUE,
        PUSH;

        @JsonCreator
        public static Operation fromString(String str) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1594257912:
                        if (str.equals("enqueue")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3452698:
                        if (str.equals(Constants.PUSH)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1094496948:
                        if (str.equals("replace")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return ENQUEUE;
                    case 1:
                        return PUSH;
                    case 2:
                        return REPLACE;
                }
            }
            return REPLACE;
        }
    }

    public enum Trigger {
        IMMEDIATELY,
        ADVANCE_PAST_TRACK,
        ADVANCE_PAST_CONTEXT;

        @JsonCreator
        public static Trigger fromString(String str) {
            if (str != null) {
                char c = 65535;
                switch (str.hashCode()) {
                    case -1800037122:
                        if (str.equals("immediately")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 123455259:
                        if (str.equals("advanced_past_track")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 400349055:
                        if (str.equals("advanced_past_context")) {
                            c = 2;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        return IMMEDIATELY;
                    case 1:
                        return ADVANCE_PAST_TRACK;
                    case 2:
                        return ADVANCE_PAST_CONTEXT;
                }
            }
            return IMMEDIATELY;
        }
    }

    public boolean allowSeeking() {
        return this.mAllowSeeking;
    }

    public boolean alwaysPlaySomething() {
        return this.mAlwaysPlaySomething;
    }

    public AudioStream audioStream() {
        return this.mAudioStream;
    }

    public Map<String, JsonNode> configurationOverride() {
        return this.mConfigurationOverride;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayOptions)) {
            return false;
        }
        PlayOptions playOptions = (PlayOptions) obj;
        if (this.mInitiallyPaused != playOptions.mInitiallyPaused || this.mSystemInitiated != playOptions.mSystemInitiated || this.mAllowSeeking != playOptions.mAllowSeeking || this.mOverrideRestrictions != playOptions.mOverrideRestrictions) {
            return false;
        }
        PlayOptionsSkipTo playOptionsSkipTo = this.mSkipTo;
        if (playOptionsSkipTo == null ? playOptions.mSkipTo != null : !playOptionsSkipTo.equals(playOptions.mSkipTo)) {
            return false;
        }
        if (this.mAlwaysPlaySomething != playOptions.mAlwaysPlaySomething) {
            return false;
        }
        Long l = this.mSeekTo;
        if (l == null ? playOptions.mSeekTo != null : !l.equals(playOptions.mSeekTo)) {
            return false;
        }
        String str = this.mPlaybackId;
        if (str == null ? playOptions.mPlaybackId != null : !str.equals(playOptions.mPlaybackId)) {
            return false;
        }
        PlayerOptionsOverrides playerOptionsOverrides = this.mPlayerOptionsOverride;
        if (playerOptionsOverrides == null ? playOptions.mPlayerOptionsOverride != null : !playerOptionsOverrides.equals(playOptions.mPlayerOptionsOverride)) {
            return false;
        }
        PlayerSuppressions playerSuppressions = this.mSuppressions;
        if (playerSuppressions == null ? playOptions.mSuppressions != null : !playerSuppressions.equals(playOptions.mSuppressions)) {
            return false;
        }
        Map<String, JsonNode> map = this.mConfigurationOverride;
        if (map == null ? playOptions.mConfigurationOverride != null : !map.equals(playOptions.mConfigurationOverride)) {
            return false;
        }
        Operation operation = this.mOperation;
        if (operation == null ? playOptions.mOperation != null : operation != playOptions.mOperation) {
            return false;
        }
        AudioStream audioStream = this.mAudioStream;
        if (audioStream == null ? playOptions.mAudioStream != null : audioStream != playOptions.mAudioStream) {
            return false;
        }
        Trigger trigger = this.mTrigger;
        Trigger trigger2 = playOptions.mTrigger;
        if (trigger != null) {
            if (trigger == trigger2) {
                return true;
            }
        } else if (trigger2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        PlayOptionsSkipTo playOptionsSkipTo = this.mSkipTo;
        int i = 0;
        int hashCode = (((playOptionsSkipTo != null ? playOptionsSkipTo.hashCode() : 0) * 31) + (this.mAlwaysPlaySomething ? 1 : 0)) * 31;
        Long l = this.mSeekTo;
        int hashCode2 = (((hashCode + (l != null ? l.hashCode() : 0)) * 31) + (this.mInitiallyPaused ? 1 : 0)) * 31;
        PlayerOptionsOverrides playerOptionsOverrides = this.mPlayerOptionsOverride;
        int hashCode3 = (hashCode2 + (playerOptionsOverrides != null ? playerOptionsOverrides.hashCode() : 0)) * 31;
        PlayerSuppressions playerSuppressions = this.mSuppressions;
        int hashCode4 = (((hashCode3 + (playerSuppressions != null ? playerSuppressions.hashCode() : 0)) * 31) + (this.mAllowSeeking ? 1 : 0)) * 31;
        Operation operation = this.mOperation;
        int hashCode5 = (hashCode4 + (operation != null ? operation.hashCode() : 0)) * 31;
        Trigger trigger = this.mTrigger;
        int hashCode6 = (hashCode5 + (trigger != null ? trigger.hashCode() : 0)) * 31;
        String str = this.mPlaybackId;
        int hashCode7 = (hashCode6 + (str != null ? str.hashCode() : 0)) * 31;
        AudioStream audioStream = this.mAudioStream;
        int hashCode8 = (((hashCode7 + (audioStream != null ? audioStream.hashCode() : 0)) * 31) + (this.mSystemInitiated ? 1 : 0)) * 31;
        Map<String, JsonNode> map = this.mConfigurationOverride;
        if (map != null) {
            i = map.hashCode();
        }
        return ((hashCode8 + i) * 31) + (this.mOverrideRestrictions ? 1 : 0);
    }

    public boolean initiallyPaused() {
        return this.mInitiallyPaused;
    }

    public Operation operation() {
        return this.mOperation;
    }

    public boolean overrideRestrictions() {
        return this.mOverrideRestrictions;
    }

    public String playbackId() {
        return this.mPlaybackId;
    }

    public PlayerOptionsOverrides playerOptionsOverride() {
        return this.mPlayerOptionsOverride;
    }

    public Long seekTo() {
        return this.mSeekTo;
    }

    public PlayOptionsSkipTo skipTo() {
        return this.mSkipTo;
    }

    public PlayerSuppressions suppressions() {
        return this.mSuppressions;
    }

    public boolean systemInitiated() {
        return this.mSystemInitiated;
    }

    public Trigger trigger() {
        return this.mTrigger;
    }

    @JsonCreator
    private PlayOptions(@JsonProperty("skip_to") PlayOptionsSkipTo playOptionsSkipTo, @JsonProperty("always_play_something") boolean z, @JsonProperty("seek_to") Long l, @JsonProperty("initially_paused") boolean z2, @JsonProperty("player_options_override") PlayerOptionsOverrides playerOptionsOverrides, @JsonProperty("suppressions") PlayerSuppressions playerSuppressions, @JsonProperty("allow_seeking") boolean z3, @JsonProperty("operation") Operation operation, @JsonProperty("trigger") Trigger trigger, @JsonProperty("playback_id") String str, @JsonProperty("system_initiated") boolean z4, @JsonProperty("audio_stream") AudioStream audioStream, @JsonProperty("configuration_override") Map<String, JsonNode> map, @JsonProperty("override_restrictions") boolean z5) {
        this.mSkipTo = playOptionsSkipTo;
        this.mAlwaysPlaySomething = z;
        this.mSeekTo = l;
        this.mInitiallyPaused = z2;
        this.mPlayerOptionsOverride = playerOptionsOverrides;
        this.mSuppressions = playerSuppressions;
        this.mAllowSeeking = z3;
        this.mOperation = operation;
        this.mTrigger = trigger;
        this.mPlaybackId = str;
        this.mSystemInitiated = z4;
        this.mAudioStream = audioStream;
        this.mConfigurationOverride = map;
        this.mOverrideRestrictions = z5;
    }
}
