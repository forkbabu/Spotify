package com.spotify.music.libs.collection.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ModificationModel implements JacksonModel {
    @JsonProperty
    private final String mError;
    @JsonProperty
    private final boolean mSuccess;

    public ModificationModel(@JsonProperty("error") String str, @JsonProperty("success") boolean z) {
        this.mError = str;
        this.mSuccess = z;
    }

    @JsonIgnore
    public String getError() {
        return this.mError;
    }

    @JsonIgnore
    public boolean isSuccess() {
        return this.mSuccess;
    }
}
