package com.spotify.music.spotlets.scannables.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IdModel implements JacksonModel {
    @JsonProperty("mTarget")
    private String mTarget;

    public String getTarget() {
        return this.mTarget;
    }

    public void setTarget(String str) {
        this.mTarget = str;
    }
}
