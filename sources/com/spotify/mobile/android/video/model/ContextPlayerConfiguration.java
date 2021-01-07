package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.video.i0;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContextPlayerConfiguration implements JacksonModel {
    public static final String PREFS_KEY_PLAYBACK_SPEED = "audio.episode.speed";
    public static final String PREFS_KEY_VIDEO_SUBTITLES = "video.subtitles";
    public static final String PREFS_KEY_VIDEO_SUBTITLES_CC = "video.subtitles_cc";
    private final Boolean mIsClosedCaption;
    private final String mLocale;
    private final Float mPlaybackSpeed;

    @JsonCreator
    public ContextPlayerConfiguration(@JsonProperty(defaultValue = "", value = "video.subtitles") String str, @JsonProperty("video.subtitles_cc") Boolean bool, @JsonProperty("audio.episode.speed") Float f) {
        this.mLocale = str;
        this.mIsClosedCaption = bool;
        this.mPlaybackSpeed = f;
    }

    public static ContextPlayerConfiguration fromSubtitle(Optional<i0> optional) {
        if (optional.isPresent()) {
            return new ContextPlayerConfiguration(optional.get().c(), Boolean.valueOf(optional.get().d()), null);
        }
        return new ContextPlayerConfiguration("", Boolean.FALSE, null);
    }

    @JsonProperty(defaultValue = "", value = PREFS_KEY_VIDEO_SUBTITLES)
    public String getLocale() {
        String str = this.mLocale;
        return str != null ? str : "";
    }

    @JsonProperty(PREFS_KEY_PLAYBACK_SPEED)
    public Optional<Float> getPlaybackSpeed() {
        return Optional.fromNullable(this.mPlaybackSpeed);
    }

    @JsonIgnore
    public Optional<i0> getSubtitle() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mLocale);
        sb.append(this.mIsClosedCaption.booleanValue() ? "-x-cc" : "");
        String sb2 = sb.toString();
        return sb2.isEmpty() ? Optional.absent() : Optional.of(new i0(sb2));
    }

    @JsonIgnore
    public boolean hasSubtitle() {
        return (this.mLocale == null || this.mIsClosedCaption == null) ? false : true;
    }

    @JsonProperty(PREFS_KEY_VIDEO_SUBTITLES_CC)
    public boolean isClosedCaption() {
        return this.mIsClosedCaption.booleanValue();
    }
}
