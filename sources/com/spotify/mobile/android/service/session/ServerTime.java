package com.spotify.mobile.android.service.session;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

public abstract class ServerTime implements Parcelable, JacksonModel {
    @JsonCreator
    public static ServerTime create(@JsonProperty("current_time_millis") long j, @JsonProperty("current_server_time") long j2) {
        return new AutoValue_ServerTime(j, j2);
    }

    /* access modifiers changed from: package-private */
    public abstract long currentServerTime();

    /* access modifiers changed from: package-private */
    public abstract long currentTimeMillis();
}
