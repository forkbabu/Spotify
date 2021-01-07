package com.spotify.signup.api.services;

public enum SignupErrorStatus {
    STATUS_UNKNOWN_ERROR(5),
    STATUS_ALREADY_REGISTERED(10),
    STATUS_EMAIL_ALREADY_EXISTS(20),
    STATUS_INVALID_FORM_DATA(100),
    STATUS_INVALID_COUNTRY(120),
    STATUS_INVALID_EMAIL(130),
    STATUS_VALIDATE_TOO_YOUNG(200),
    STATUS_REQUEST_FROM_DATACENTER(320),
    STATUS_NO_CONNECTION(-1);
    
    final int mValue;

    private SignupErrorStatus(int i) {
        this.mValue = i;
    }

    public static SignupErrorStatus d(int i) {
        SignupErrorStatus[] values = values();
        for (int i2 = 0; i2 < 9; i2++) {
            SignupErrorStatus signupErrorStatus = values[i2];
            if (i == signupErrorStatus.mValue) {
                return signupErrorStatus;
            }
        }
        return STATUS_UNKNOWN_ERROR;
    }

    public int g() {
        return this.mValue;
    }
}
