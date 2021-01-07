package com.spotify.music.libs.facebook;

import com.spotify.music.libs.facebook.PermissionRequestResponse;

final class AutoValue_PermissionRequestResponse extends PermissionRequestResponse {
    private final String authSuccessUrl;
    private final String missingPermissions;
    private final String requestPermissionsUrl;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PermissionRequestResponse.Builder {
        private String authSuccessUrl;
        private String missingPermissions;
        private String requestPermissionsUrl;

        @Override // com.spotify.music.libs.facebook.PermissionRequestResponse.Builder
        public PermissionRequestResponse.Builder authSuccessUrl(String str) {
            if (str != null) {
                this.authSuccessUrl = str;
                return this;
            }
            throw new NullPointerException("Null authSuccessUrl");
        }

        @Override // com.spotify.music.libs.facebook.PermissionRequestResponse.Builder
        public PermissionRequestResponse build() {
            String str = this.missingPermissions == null ? " missingPermissions" : "";
            if (this.requestPermissionsUrl == null) {
                str = je.x0(str, " requestPermissionsUrl");
            }
            if (this.authSuccessUrl == null) {
                str = je.x0(str, " authSuccessUrl");
            }
            if (str.isEmpty()) {
                return new AutoValue_PermissionRequestResponse(this.missingPermissions, this.requestPermissionsUrl, this.authSuccessUrl);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.facebook.PermissionRequestResponse.Builder
        public PermissionRequestResponse.Builder missingPermissions(String str) {
            if (str != null) {
                this.missingPermissions = str;
                return this;
            }
            throw new NullPointerException("Null missingPermissions");
        }

        @Override // com.spotify.music.libs.facebook.PermissionRequestResponse.Builder
        public PermissionRequestResponse.Builder requestPermissionsUrl(String str) {
            if (str != null) {
                this.requestPermissionsUrl = str;
                return this;
            }
            throw new NullPointerException("Null requestPermissionsUrl");
        }

        Builder() {
        }

        private Builder(PermissionRequestResponse permissionRequestResponse) {
            this.missingPermissions = permissionRequestResponse.missingPermissions();
            this.requestPermissionsUrl = permissionRequestResponse.requestPermissionsUrl();
            this.authSuccessUrl = permissionRequestResponse.authSuccessUrl();
        }
    }

    @Override // com.spotify.music.libs.facebook.PermissionRequestResponse
    public String authSuccessUrl() {
        return this.authSuccessUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PermissionRequestResponse)) {
            return false;
        }
        PermissionRequestResponse permissionRequestResponse = (PermissionRequestResponse) obj;
        if (!this.missingPermissions.equals(permissionRequestResponse.missingPermissions()) || !this.requestPermissionsUrl.equals(permissionRequestResponse.requestPermissionsUrl()) || !this.authSuccessUrl.equals(permissionRequestResponse.authSuccessUrl())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.missingPermissions.hashCode() ^ 1000003) * 1000003) ^ this.requestPermissionsUrl.hashCode()) * 1000003) ^ this.authSuccessUrl.hashCode();
    }

    @Override // com.spotify.music.libs.facebook.PermissionRequestResponse
    public String missingPermissions() {
        return this.missingPermissions;
    }

    @Override // com.spotify.music.libs.facebook.PermissionRequestResponse
    public String requestPermissionsUrl() {
        return this.requestPermissionsUrl;
    }

    @Override // com.spotify.music.libs.facebook.PermissionRequestResponse
    public PermissionRequestResponse.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PermissionRequestResponse{missingPermissions=");
        V0.append(this.missingPermissions);
        V0.append(", requestPermissionsUrl=");
        V0.append(this.requestPermissionsUrl);
        V0.append(", authSuccessUrl=");
        return je.I0(V0, this.authSuccessUrl, "}");
    }

    private AutoValue_PermissionRequestResponse(String str, String str2, String str3) {
        this.missingPermissions = str;
        this.requestPermissionsUrl = str2;
        this.authSuccessUrl = str3;
    }
}
