package com.spotify.music.cyoa.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CyoaGame implements JacksonModel {
    private static final String JSON_KEY_CONTINUE = "continue";
    private static final String JSON_KEY_DESCRIPTION = "description";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_IMAGE = "image";
    private static final String JSON_KEY_NAME = "name";
    private static final String JSON_KEY_SHOW_URI = "show_uri";
    private final boolean mContinue;
    private final String mDescription;
    private final int mId;
    private final String mImage;
    private final String mName;
    private final String mShowUri;

    @JsonCreator
    public CyoaGame(@JsonProperty("id") int i, @JsonProperty("name") String str, @JsonProperty("description") String str2, @JsonProperty("show_uri") String str3, @JsonProperty("image") String str4, @JsonProperty("continue") boolean z) {
        this.mId = i;
        this.mName = str;
        this.mDescription = str2;
        this.mShowUri = str3;
        this.mImage = str4;
        this.mContinue = z;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public int getId() {
        return this.mId;
    }

    public String getImage() {
        return this.mImage;
    }

    public String getName() {
        return this.mName;
    }

    public String getShowUri() {
        return this.mShowUri;
    }

    public boolean isContinue() {
        return this.mContinue;
    }
}
