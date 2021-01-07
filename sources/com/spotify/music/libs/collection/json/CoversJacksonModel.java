package com.spotify.music.libs.collection.json;

import com.adjust.sdk.Constants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.playlist.models.Covers;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CoversJacksonModel implements JacksonModel {
    @JsonProperty(Constants.LARGE)
    private final String mLargeUri;
    @JsonProperty(Constants.SMALL)
    private final String mSmallUri;
    @JsonProperty("default")
    private final String mUri;
    @JsonProperty(Constants.XLARGE)
    private final String mXlargeUri;

    public CoversJacksonModel(@JsonProperty("default") String str, @JsonProperty("small") String str2, @JsonProperty("large") String str3, @JsonProperty("xlarge") String str4) {
        this.mUri = str;
        this.mSmallUri = str2;
        this.mLargeUri = str3;
        this.mXlargeUri = str4;
    }

    private static String emptyIfNull(String str) {
        return str == null ? "" : str;
    }

    @JsonIgnore
    public Covers getCovers() {
        Covers.a a = Covers.a();
        a.d(this.mUri);
        a.c(this.mSmallUri);
        a.b(this.mLargeUri);
        a.e(this.mXlargeUri);
        return a.a();
    }

    @JsonIgnore
    public String getLargeUri() {
        return emptyIfNull(this.mLargeUri);
    }

    @JsonIgnore
    public String getSmallUri() {
        return emptyIfNull(this.mSmallUri);
    }

    @JsonIgnore
    public String getUri() {
        return emptyIfNull(this.mUri);
    }

    @JsonIgnore
    public String getXlargeUri() {
        return emptyIfNull(this.mXlargeUri);
    }
}
