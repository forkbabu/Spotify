package com.spotify.music.notification;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class NotificationV2 implements JacksonModel {
    @JsonCreator
    public static NotificationV2 create(@JsonProperty("name") String str, @JsonProperty("description") String str2, @JsonProperty("key") String str3, @JsonProperty("email") boolean z, @JsonProperty("push") boolean z2) {
        return new AutoValue_NotificationV2(str, str2, str3, z, z2);
    }

    public abstract String getDescription();

    public abstract String getKey();

    public abstract String getName();

    public abstract boolean isEmailEnabled();

    public abstract boolean isPushEnabled();
}
