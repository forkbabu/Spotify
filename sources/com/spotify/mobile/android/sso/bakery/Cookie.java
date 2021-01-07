package com.spotify.mobile.android.sso.bakery;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Cookie implements JacksonModel {
    @JsonCreator
    public static Cookie create(@JsonProperty("name") String str, @JsonProperty("value") String str2, @JsonProperty("path") String str3, @JsonProperty("domain") String str4, @JsonProperty("maxAge") int i, @JsonProperty("secure") boolean z) {
        return new AutoValue_Cookie(str, str2, str3, str4, i, z);
    }

    public abstract String domain();

    public abstract int maxAge();

    public abstract String name();

    public abstract String path();

    public abstract boolean secure();

    public abstract String value();
}
