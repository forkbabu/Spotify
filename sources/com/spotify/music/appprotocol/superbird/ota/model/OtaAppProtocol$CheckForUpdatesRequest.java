package com.spotify.music.appprotocol.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.superbird.ota.model.VersionedPackage;
import java.util.List;

public abstract class OtaAppProtocol$CheckForUpdatesRequest implements JacksonModel {
    @JsonCreator
    public static OtaAppProtocol$CheckForUpdatesRequest create(@JsonProperty("serial") String str, @JsonProperty("packages") List<VersionedPackage> list, @JsonProperty("first_time") boolean z) {
        return new AutoValue_OtaAppProtocol_CheckForUpdatesRequest(str, list, z);
    }

    public abstract boolean firstTime();

    public abstract List<VersionedPackage> packages();

    public abstract String serial();
}
