package com.spotify.music.libs.facebook;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.libs.facebook.PermissionsRequest;
import java.util.List;

final class AutoValue_PermissionsRequest extends PermissionsRequest {
    private final List<String> permissions;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PermissionsRequest.Builder {
        private List<String> permissions;

        @Override // com.spotify.music.libs.facebook.PermissionsRequest.Builder
        public PermissionsRequest build() {
            String str = this.permissions == null ? " permissions" : "";
            if (str.isEmpty()) {
                return new AutoValue_PermissionsRequest(this.permissions);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.facebook.PermissionsRequest.Builder
        public PermissionsRequest.Builder permissions(List<String> list) {
            if (list != null) {
                this.permissions = list;
                return this;
            }
            throw new NullPointerException("Null permissions");
        }

        Builder() {
        }

        private Builder(PermissionsRequest permissionsRequest) {
            this.permissions = permissionsRequest.permissions();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PermissionsRequest) {
            return this.permissions.equals(((PermissionsRequest) obj).permissions());
        }
        return false;
    }

    public int hashCode() {
        return this.permissions.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.libs.facebook.PermissionsRequest
    @JsonProperty("permissions")
    public List<String> permissions() {
        return this.permissions;
    }

    @Override // com.spotify.music.libs.facebook.PermissionsRequest
    public PermissionsRequest.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        return je.L0(je.V0("PermissionsRequest{permissions="), this.permissions, "}");
    }

    private AutoValue_PermissionsRequest(List<String> list) {
        this.permissions = list;
    }
}
