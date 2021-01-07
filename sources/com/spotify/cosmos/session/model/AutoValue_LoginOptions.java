package com.spotify.cosmos.session.model;

import com.spotify.cosmos.session.model.LoginOptions;

final class AutoValue_LoginOptions extends LoginOptions {
    private final Boolean authOnlySetting;
    private final Boolean bootstrapRequired;
    private final LoginOptions.PreAuthenticationSetting preAuthenticationSetting;

    /* access modifiers changed from: package-private */
    public static final class Builder implements LoginOptions.Builder {
        private Boolean authOnlySetting;
        private Boolean bootstrapRequired;
        private LoginOptions.PreAuthenticationSetting preAuthenticationSetting;

        Builder() {
        }

        @Override // com.spotify.cosmos.session.model.LoginOptions.Builder
        public LoginOptions.Builder authOnlySetting(Boolean bool) {
            this.authOnlySetting = bool;
            return this;
        }

        @Override // com.spotify.cosmos.session.model.LoginOptions.Builder
        public LoginOptions.Builder bootstrapRequired(Boolean bool) {
            this.bootstrapRequired = bool;
            return this;
        }

        @Override // com.spotify.cosmos.session.model.LoginOptions.Builder
        public LoginOptions build() {
            return new AutoValue_LoginOptions(this.preAuthenticationSetting, this.authOnlySetting, this.bootstrapRequired);
        }

        @Override // com.spotify.cosmos.session.model.LoginOptions.Builder
        public LoginOptions.Builder preAuthenticationSetting(LoginOptions.PreAuthenticationSetting preAuthenticationSetting2) {
            this.preAuthenticationSetting = preAuthenticationSetting2;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.cosmos.session.model.LoginOptions
    public Boolean authOnlySetting() {
        return this.authOnlySetting;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.cosmos.session.model.LoginOptions
    public Boolean bootstrapRequired() {
        return this.bootstrapRequired;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginOptions)) {
            return false;
        }
        LoginOptions loginOptions = (LoginOptions) obj;
        LoginOptions.PreAuthenticationSetting preAuthenticationSetting2 = this.preAuthenticationSetting;
        if (preAuthenticationSetting2 != null ? preAuthenticationSetting2.equals(loginOptions.preAuthenticationSetting()) : loginOptions.preAuthenticationSetting() == null) {
            Boolean bool = this.authOnlySetting;
            if (bool != null ? bool.equals(loginOptions.authOnlySetting()) : loginOptions.authOnlySetting() == null) {
                Boolean bool2 = this.bootstrapRequired;
                if (bool2 == null) {
                    if (loginOptions.bootstrapRequired() == null) {
                        return true;
                    }
                } else if (bool2.equals(loginOptions.bootstrapRequired())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        LoginOptions.PreAuthenticationSetting preAuthenticationSetting2 = this.preAuthenticationSetting;
        int i = 0;
        int hashCode = ((preAuthenticationSetting2 == null ? 0 : preAuthenticationSetting2.hashCode()) ^ 1000003) * 1000003;
        Boolean bool = this.authOnlySetting;
        int hashCode2 = (hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Boolean bool2 = this.bootstrapRequired;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode2 ^ i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.cosmos.session.model.LoginOptions
    public LoginOptions.PreAuthenticationSetting preAuthenticationSetting() {
        return this.preAuthenticationSetting;
    }

    public String toString() {
        StringBuilder V0 = je.V0("LoginOptions{preAuthenticationSetting=");
        V0.append(this.preAuthenticationSetting);
        V0.append(", authOnlySetting=");
        V0.append(this.authOnlySetting);
        V0.append(", bootstrapRequired=");
        V0.append(this.bootstrapRequired);
        V0.append("}");
        return V0.toString();
    }

    private AutoValue_LoginOptions(LoginOptions.PreAuthenticationSetting preAuthenticationSetting2, Boolean bool, Boolean bool2) {
        this.preAuthenticationSetting = preAuthenticationSetting2;
        this.authOnlySetting = bool;
        this.bootstrapRequired = bool2;
    }
}
