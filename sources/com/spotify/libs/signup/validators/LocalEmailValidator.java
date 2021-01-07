package com.spotify.libs.signup.validators;

import com.spotify.music.C0707R;
import java.util.regex.Pattern;

public class LocalEmailValidator {

    public enum EmailValidation {
        VALID(false, 0),
        INVALID(true, C0707R.string.email_signup_bad_email),
        NOT_SET(true, 0);
        
        private final boolean mErrorState;
        private final int mMessageResource;

        private EmailValidation(boolean z, int i) {
            this.mErrorState = z;
            this.mMessageResource = i;
        }
    }

    public EmailValidation a(String str) {
        Pattern pattern = v3.i;
        if (str.isEmpty()) {
            return EmailValidation.NOT_SET;
        }
        if (pattern.matcher(str).matches()) {
            return EmailValidation.VALID;
        }
        return EmailValidation.INVALID;
    }
}
