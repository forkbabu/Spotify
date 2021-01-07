package com.spotify.mobile.android.video.exo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EncryptionInfo implements JacksonModel {
    public String encryptionData;
    public String keySystem;

    @JsonCreator
    public EncryptionInfo(@JsonProperty("key_system") String str, @JsonProperty("encryption_data") String str2) {
        this.keySystem = str;
        this.encryptionData = str2;
    }
}
