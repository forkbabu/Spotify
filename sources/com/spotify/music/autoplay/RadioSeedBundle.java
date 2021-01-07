package com.spotify.music.autoplay;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.video.model.PlayerError;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RadioSeedBundle implements Parcelable, JacksonModel {
    @JsonCreator
    public static RadioSeedBundle create(@JsonProperty("radio_seed") String str, @JsonProperty("playback_id") String str2, @JsonProperty("play_origin") PlayOrigin playOrigin) {
        return new AutoValue_RadioSeedBundle(str, str2, playOrigin);
    }

    @JsonProperty("play_origin")
    public abstract PlayOrigin getPlayOrigin();

    @JsonProperty(PlayerError.CONTEXT_PLAYER_ERROR_PLAYBACK_ID_KEY)
    public abstract String getPlaybackId();

    @JsonProperty("radio_seed")
    public abstract String getRadioSeed();
}
