package com.spotify.mobile.android.video.drm;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = WidevineLicenseUrl_Deserializer.class)
public class WidevineLicenseUrl implements JacksonModel {
    @JsonProperty("expires")
    public long expires;
    @JsonProperty("uri")
    public String uri;

    @JsonCreator
    public WidevineLicenseUrl(@JsonProperty("uri") String str, @JsonProperty("expires") long j) {
        this.uri = str;
        this.expires = j;
    }
}
