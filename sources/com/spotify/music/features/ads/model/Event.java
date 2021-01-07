package com.spotify.music.features.ads.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Event implements JacksonModel {
    private final Ad mAd;
    private final String mType;

    public Event(@JsonProperty("ad") Ad ad, @JsonProperty("event_type") String str) {
        this.mAd = ad;
        this.mType = str;
    }

    public Ad getAd() {
        return this.mAd;
    }

    public String getType() {
        return this.mType;
    }
}
