package com.spotify.cosmos.session.model;

import com.spotify.cosmos.session.model.AutoValue_LoginOptions;

public abstract class LoginOptions {

    public interface Builder {
        Builder authOnlySetting(Boolean bool);

        Builder bootstrapRequired(Boolean bool);

        LoginOptions build();

        Builder preAuthenticationSetting(PreAuthenticationSetting preAuthenticationSetting);
    }

    public enum PreAuthenticationSetting {
        NEVER("never"),
        PERFORMBUTIGNORE("perform_but_ignore_result"),
        REQUIRESUCCESS("require_success");
        
        private final String mValue;

        private PreAuthenticationSetting(String str) {
            this.mValue = str;
        }

        @Override // java.lang.Enum, java.lang.Object
        public String toString() {
            return this.mValue;
        }
    }

    public static Builder builder() {
        return new AutoValue_LoginOptions.Builder();
    }

    /* access modifiers changed from: package-private */
    public abstract Boolean authOnlySetting();

    /* access modifiers changed from: package-private */
    public abstract Boolean bootstrapRequired();

    /* access modifiers changed from: package-private */
    public abstract PreAuthenticationSetting preAuthenticationSetting();
}
