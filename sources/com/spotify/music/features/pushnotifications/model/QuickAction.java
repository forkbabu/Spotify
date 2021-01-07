package com.spotify.music.features.pushnotifications.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class QuickAction implements JacksonModel {
    public static final String OPEN_PUSH_SETTINGS = "SETTINGS";
    public static final String OPEN_URL = "URL";
    public static final String SAVE_ENTITY = "SAVE_ENTITY";

    @JsonCreator
    public static QuickAction create(@JsonProperty("actionIdentifier") String str, @JsonProperty("actionTitle") String str2, @JsonProperty("actionData") String str3) {
        return new AutoValue_QuickAction(str, str2, str3);
    }

    public abstract String actionData();

    public abstract String actionIdentifier();

    public abstract String actionTitle();
}
