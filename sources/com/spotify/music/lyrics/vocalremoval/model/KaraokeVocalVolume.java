package com.spotify.music.lyrics.vocalremoval.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class KaraokeVocalVolume implements JacksonModel, Parcelable {
    @JsonCreator
    public static KaraokeVocalVolume create(@JsonProperty("volume") Double d) {
        return new AutoValue_KaraokeVocalVolume(d);
    }

    @JsonProperty("volume")
    public abstract Double vocalVolume();
}
