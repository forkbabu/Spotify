package com.spotify.music.appprotocol.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class OtaAppProtocol$TransferRequest implements JacksonModel {
    @JsonCreator
    public static OtaAppProtocol$TransferRequest create(@JsonProperty("name") String str, @JsonProperty("version") String str2, @JsonProperty("offset") int i, @JsonProperty("size") int i2) {
        return new AutoValue_OtaAppProtocol_TransferRequest(str, str2, i, i2);
    }

    public abstract int offset();

    public abstract String packageName();

    public abstract int size();

    public abstract String version();
}
