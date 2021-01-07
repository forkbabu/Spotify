package com.spotify.music.appprotocol.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public class OtaAppProtocol$TransferData implements JacksonModel {
    @JsonProperty("data")
    public byte[] data;

    public OtaAppProtocol$TransferData(byte[] bArr) {
        this.data = bArr;
    }
}
