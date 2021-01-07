package com.spotify.cosmos.session.impl;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spotify.cosmos.session.impl.AutoValue_SetConnectivityRequest;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.connectivity.ConnectionType;

abstract class SetConnectivityRequest implements JacksonModel {

    static abstract class Builder {
        Builder() {
        }

        /* access modifiers changed from: package-private */
        public abstract SetConnectivityRequest build();

        /* access modifiers changed from: package-private */
        public abstract Builder connectionType(ConnectionType connectionType);
    }

    SetConnectivityRequest() {
    }

    static Builder builder() {
        return new AutoValue_SetConnectivityRequest.Builder();
    }

    /* access modifiers changed from: package-private */
    @JsonIgnore
    public abstract ConnectionType connectionType();

    @JsonGetter("type")
    public String getTypeString() {
        return connectionType().toString();
    }
}
