package com.spotify.music.freetiercommon.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RemainingSkips implements JacksonModel {
    private final int mRemainingSkips;

    public RemainingSkips(@JsonProperty("remaining_skips") int i) {
        this.mRemainingSkips = i;
    }

    public int getRemainingSkips() {
        return this.mRemainingSkips;
    }
}
