package com.spotify.music.lyrics.vocalremoval.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.video.model.PlayerError;

public abstract class KaraokeState implements JacksonModel, Parcelable {
    @JsonCreator
    public static KaraokeState create(@JsonProperty("track_uri") String str, @JsonProperty("event_id") String str2, @JsonProperty("error_message") String str3, @JsonProperty("error_code") Integer num) {
        return new AutoValue_KaraokeState(str, str2, str3, num);
    }

    @JsonProperty("error_code")
    public abstract Integer errorCode();

    @JsonProperty("error_message")
    public abstract String errorMessage();

    @JsonProperty("event_id")
    public abstract String eventId();

    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_TRACK_URI_KEY)
    public abstract String trackUri();
}
