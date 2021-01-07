package com.spotify.packagevalidator.denylist.data;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class DenylistResponse implements JacksonModel {
    @JsonCreator
    public static DenylistResponse create(@JsonProperty("android") AndroidDenylist androidDenylist) {
        return new AutoValue_DenylistResponse(androidDenylist);
    }

    public abstract AndroidDenylist android();
}
