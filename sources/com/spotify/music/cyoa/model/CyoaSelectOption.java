package com.spotify.music.cyoa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CyoaSelectOption implements JacksonModel {
    @JsonProperty("optionId")
    private int mOptionId;

    public CyoaSelectOption(int i) {
        this.mOptionId = i;
    }

    public int getOptionId() {
        return this.mOptionId;
    }

    public void setOptionId(int i) {
        this.mOptionId = i;
    }
}
