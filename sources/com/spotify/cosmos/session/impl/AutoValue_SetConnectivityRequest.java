package com.spotify.cosmos.session.impl;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.spotify.cosmos.session.impl.SetConnectivityRequest;
import com.spotify.mobile.android.util.connectivity.ConnectionType;

final class AutoValue_SetConnectivityRequest extends SetConnectivityRequest {
    private final ConnectionType connectionType;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SetConnectivityRequest.Builder {
        private ConnectionType connectionType;

        Builder() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.cosmos.session.impl.SetConnectivityRequest.Builder
        public SetConnectivityRequest build() {
            String str = this.connectionType == null ? " connectionType" : "";
            if (str.isEmpty()) {
                return new AutoValue_SetConnectivityRequest(this.connectionType);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.cosmos.session.impl.SetConnectivityRequest.Builder
        public SetConnectivityRequest.Builder connectionType(ConnectionType connectionType2) {
            if (connectionType2 != null) {
                this.connectionType = connectionType2;
                return this;
            }
            throw new NullPointerException("Null connectionType");
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.cosmos.session.impl.SetConnectivityRequest
    @JsonIgnore
    public ConnectionType connectionType() {
        return this.connectionType;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SetConnectivityRequest) {
            return this.connectionType.equals(((SetConnectivityRequest) obj).connectionType());
        }
        return false;
    }

    public int hashCode() {
        return this.connectionType.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder V0 = je.V0("SetConnectivityRequest{connectionType=");
        V0.append(this.connectionType);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_SetConnectivityRequest(ConnectionType connectionType2) {
        this.connectionType = connectionType2;
    }
}
