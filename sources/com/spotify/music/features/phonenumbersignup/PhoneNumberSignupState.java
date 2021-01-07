package com.spotify.music.features.phonenumbersignup;

public enum PhoneNumberSignupState {
    REQUEST_OTP,
    VALIDATE_OTP;
    
    public static final PhoneNumberSignupState[] c = values();
}
