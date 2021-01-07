package com.spotify.music.features.pushnotifications.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class PushkaMetadata implements JacksonModel {
    @JsonCreator
    public static PushkaMetadata create(@JsonProperty("messageId") String str, @JsonProperty("campaignId") String str2, @JsonProperty("appDeviceId") String str3) {
        return new AutoValue_PushkaMetadata(str, str2, str3);
    }

    public abstract String getAppDeviceId();

    public abstract String getCampaignId();

    public abstract String getMessageId();
}
