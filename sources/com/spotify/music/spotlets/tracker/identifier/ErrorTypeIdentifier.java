package com.spotify.music.spotlets.tracker.identifier;

public enum ErrorTypeIdentifier {
    INVALID_USERNAME_OR_PASSWORD("invalid_username_or_password"),
    FACEBOOK_GENERIC("facebook_generic"),
    FACEBOOK_EMAIL_EXISTS("facebook_email_exists"),
    FACEBOOK_NOT_REGISTERED("facebook_not_registered"),
    REGION_MISSMATCH("region_missmatch"),
    GENERIC("generic"),
    MAGIC_LINK_LOGIN_FAILURE("magic_link_login_failure"),
    LOGIN_WHILE_SESSION_ALREADY_EXISTS("login_while_session_already_exists"),
    NOT_ALLOWED_CHARACTER("not_allowed_character"),
    EMAIL_ALREADY_EXIST("email_already_exist"),
    USERNAME_ALREADY_EXIST("username_already_exist"),
    TOO_SHORT_PASSWORD("too_short_password"),
    TOO_WEAK_PASSWORD("too_weak_password"),
    PASSWORD_TOKEN_EXPIRED("password_token_expired"),
    EMAIL_FORMAT_WRONG("email_format_wrong"),
    TOO_YOUNG_AGE("too_young_age"),
    TOO_OLD_AGE("too_old_age"),
    INVALID_COUNTRY("invalid_country"),
    NO_CONNECTION("no_connection"),
    OFFLINE_MODE("network_disabled"),
    RATE_LIMIT("rate_limit"),
    EMAIL_GENERIC("email_generic"),
    USERNAME_GENERIC("username_generic"),
    AGE_GENERIC("age_generic"),
    INVALID_FORM_DATA("invalid_form_data"),
    DISPLAY_NAME_FAILED_TO_SAVE("display_name_failed_to_save"),
    SAMSUNG_EFFORTLESS_LOGIN_FAILURE("samsung_effortless_login_failure"),
    REQUEST_FROM_DATACENTER("request_from_datacenter"),
    THIRD_PARTY_AUTH_FAILED("third_party_auth_failed"),
    THIRD_PARTY_AUTH_NO_EMAIL("third_party_auth_no_email"),
    SIGNUP_CONFIGURATION_FETCH_FAILED("signup_configuration_fetch_failed");
    
    private final String mType;

    private ErrorTypeIdentifier(String str) {
        this.mType = str;
    }

    public String d() {
        return this.mType;
    }
}
