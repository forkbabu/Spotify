package com.spotify.music.appprotocol.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

public abstract class OtaAppProtocol$CheckForUpdatesResponse implements JacksonModel {
    @JsonCreator
    public static OtaAppProtocol$CheckForUpdatesResponse create(List<OtaAppProtocol$CheckForUpdatesResponseItem> list) {
        return new AutoValue_OtaAppProtocol_CheckForUpdatesResponse(list);
    }

    @JsonProperty("result")
    public abstract List<OtaAppProtocol$CheckForUpdatesResponseItem> result();
}
