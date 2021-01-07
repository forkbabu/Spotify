package com.spotify.music.cyoa.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CyoaGameOption implements JacksonModel {
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_TEXT = "text";
    private final int mId;
    private final String mText;

    @JsonCreator
    public CyoaGameOption(@JsonProperty("id") int i, @JsonProperty("text") String str) {
        this.mId = i;
        this.mText = str;
    }

    public int getId() {
        return this.mId;
    }

    public String getText() {
        return this.mText;
    }
}
