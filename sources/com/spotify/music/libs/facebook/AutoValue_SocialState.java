package com.spotify.music.libs.facebook;

import com.spotify.music.libs.facebook.SocialState;
import java.util.List;

final class AutoValue_SocialState extends SocialState {
    private final String accessToken;
    private final boolean available;
    private final boolean enabled;
    private final List<String> missingPermissions;

    /* access modifiers changed from: package-private */
    public static final class Builder extends SocialState.Builder {
        private String accessToken;
        private Boolean available;
        private Boolean enabled;
        private List<String> missingPermissions;

        @Override // com.spotify.music.libs.facebook.SocialState.Builder
        public SocialState.Builder accessToken(String str) {
            if (str != null) {
                this.accessToken = str;
                return this;
            }
            throw new NullPointerException("Null accessToken");
        }

        @Override // com.spotify.music.libs.facebook.SocialState.Builder
        public SocialState.Builder available(boolean z) {
            this.available = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.facebook.SocialState.Builder
        public SocialState build() {
            String str = this.missingPermissions == null ? " missingPermissions" : "";
            if (this.accessToken == null) {
                str = je.x0(str, " accessToken");
            }
            if (this.enabled == null) {
                str = je.x0(str, " enabled");
            }
            if (this.available == null) {
                str = je.x0(str, " available");
            }
            if (str.isEmpty()) {
                return new AutoValue_SocialState(this.missingPermissions, this.accessToken, this.enabled.booleanValue(), this.available.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.libs.facebook.SocialState.Builder
        public SocialState.Builder enabled(boolean z) {
            this.enabled = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.libs.facebook.SocialState.Builder
        public SocialState.Builder missingPermissions(List<String> list) {
            if (list != null) {
                this.missingPermissions = list;
                return this;
            }
            throw new NullPointerException("Null missingPermissions");
        }

        Builder() {
        }

        private Builder(SocialState socialState) {
            this.missingPermissions = socialState.missingPermissions();
            this.accessToken = socialState.accessToken();
            this.enabled = Boolean.valueOf(socialState.enabled());
            this.available = Boolean.valueOf(socialState.available());
        }
    }

    @Override // com.spotify.music.libs.facebook.SocialState
    public String accessToken() {
        return this.accessToken;
    }

    @Override // com.spotify.music.libs.facebook.SocialState
    public boolean available() {
        return this.available;
    }

    @Override // com.spotify.music.libs.facebook.SocialState
    public boolean enabled() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SocialState)) {
            return false;
        }
        SocialState socialState = (SocialState) obj;
        if (!this.missingPermissions.equals(socialState.missingPermissions()) || !this.accessToken.equals(socialState.accessToken()) || this.enabled != socialState.enabled() || this.available != socialState.available()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((this.missingPermissions.hashCode() ^ 1000003) * 1000003) ^ this.accessToken.hashCode()) * 1000003) ^ (this.enabled ? 1231 : 1237)) * 1000003;
        if (!this.available) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.music.libs.facebook.SocialState
    public List<String> missingPermissions() {
        return this.missingPermissions;
    }

    @Override // com.spotify.music.libs.facebook.SocialState
    public SocialState.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SocialState{missingPermissions=");
        V0.append(this.missingPermissions);
        V0.append(", accessToken=");
        V0.append(this.accessToken);
        V0.append(", enabled=");
        V0.append(this.enabled);
        V0.append(", available=");
        return je.P0(V0, this.available, "}");
    }

    private AutoValue_SocialState(List<String> list, String str, boolean z, boolean z2) {
        this.missingPermissions = list;
        this.accessToken = str;
        this.enabled = z;
        this.available = z2;
    }
}
