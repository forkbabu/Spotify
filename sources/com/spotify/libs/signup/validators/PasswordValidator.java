package com.spotify.libs.signup.validators;

import com.spotify.music.C0707R;

public class PasswordValidator {
    private final zz0 a;

    public enum PasswordValidation {
        VALID(false, 0),
        TOO_SHORT(true, C0707R.string.email_signup_password_too_short_eight_characters),
        TOO_WEAK(true, C0707R.string.email_signup_password_too_weak),
        NOT_SET(true, 0),
        NOT_VALIDATED(true, 0);
        
        private final boolean mErrorState;
        private final int mMessageResource;

        private PasswordValidation(boolean z, int i) {
            this.mErrorState = z;
            this.mMessageResource = i;
        }
    }

    public PasswordValidator(zz0 zz0) {
        this.a = zz0;
    }

    public PasswordValidation a(String str) {
        if (str.isEmpty()) {
            return PasswordValidation.NOT_SET;
        }
        if (str.length() < 8) {
            return PasswordValidation.TOO_SHORT;
        }
        zz0 zz0 = this.a;
        if (zz0 != null && zz0.a(str)) {
            return PasswordValidation.TOO_WEAK;
        }
        return PasswordValidation.VALID;
    }
}
