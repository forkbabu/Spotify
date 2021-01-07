package com.spotify.music.appprotocol.superbird.setup.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.music.superbird.setup.domain.SetupSubscriptionEvent;

public abstract class SetupAppProtocol$SetupEvent implements JacksonModel {
    public static SetupAppProtocol$SetupEvent create(SetupSubscriptionEvent setupSubscriptionEvent) {
        return new AutoValue_SetupAppProtocol_SetupEvent(setupSubscriptionEvent.d());
    }

    @JsonProperty("event")
    public abstract String event();
}
