package com.spotify.music.features.pushnotifications.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class RichPushData implements JacksonModel {
    @JsonCreator
    public static RichPushData create(@JsonProperty("type") String str, @JsonProperty("version") String str2, @JsonProperty("fields") RichPushFields richPushFields) {
        return new AutoValue_RichPushData(str, str2, richPushFields);
    }

    public abstract RichPushFields getFields();

    public abstract String getType();

    public abstract String getVersion();
}
