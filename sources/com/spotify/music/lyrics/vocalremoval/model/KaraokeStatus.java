package com.spotify.music.lyrics.vocalremoval.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class KaraokeStatus implements JacksonModel, Parcelable {
    @JsonCreator
    public static KaraokeStatus create(@JsonProperty("status") String str) {
        return new AutoValue_KaraokeStatus(str);
    }

    @JsonProperty("status")
    public abstract String status();
}
