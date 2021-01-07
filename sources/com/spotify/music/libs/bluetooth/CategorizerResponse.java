package com.spotify.music.libs.bluetooth;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class CategorizerResponse implements Parcelable, JacksonModel {
    public static final CategorizerResponse DEFAULT_RESPONSE = create("", false);

    @JsonCreator
    public static CategorizerResponse create(@JsonProperty("category") String str, @JsonProperty("company") String str2, @JsonProperty("model") String str3, @JsonProperty("version") String str4, @JsonProperty("interapp") boolean z) {
        return new AutoValue_CategorizerResponse(str, str2, str3, str4, z);
    }

    @JsonProperty("category")
    public abstract String category();

    @JsonProperty("company")
    public abstract String company();

    @JsonProperty("interapp")
    public abstract boolean isInterapp();

    @JsonProperty("model")
    public abstract String model();

    @JsonProperty("version")
    public abstract String version();

    public static CategorizerResponse create(String str, boolean z) {
        return new AutoValue_CategorizerResponse(str, null, null, null, z);
    }

    public static CategorizerResponse create(String str, String str2, boolean z) {
        return new AutoValue_CategorizerResponse(str, str2, null, null, z);
    }
}
