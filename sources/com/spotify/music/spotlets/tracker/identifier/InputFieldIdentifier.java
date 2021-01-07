package com.spotify.music.spotlets.tracker.identifier;

public enum InputFieldIdentifier {
    EMAIL("email"),
    PASSWORD("password"),
    USERNAME("username"),
    AGE("birth_date"),
    GENDER("gender"),
    DISPLAY_NAME("display_name"),
    NONE("none"),
    CALLING_CODE("calling_code"),
    PHONE_NUMBER("phone_number"),
    OTP("otp"),
    GOOGLE("google_auth_button"),
    THIRD_PARTY_POLICY("third_party_data_provision_link"),
    PERSONAL_INFORMATION_POLICY("personal_information_collection_link");
    
    private final String mType;

    private InputFieldIdentifier(String str) {
        this.mType = str;
    }

    public String d() {
        return this.mType;
    }
}
