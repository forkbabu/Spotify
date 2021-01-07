package com.spotify.music.spotlets.tracker.identifier;

public enum EventIdentifier {
    SMARTLOCK_SAVE_CREDENTIALS_ACCEPTED("smartlock_save_credentials_accepted"),
    SMARTLOCK_SAVE_CREDENTIALS_DISMISSED("smartlock_save_credentials_dismissed"),
    SMARTLOCK_SAVE_CREDENTIALS_SUCCESS("smartlock_save_credentials_success"),
    SMARTLOCK_SAVE_CREDENTIALS_FAILURE("smartlock_save_credentials_failure"),
    SMARTLOCK_SAVE_CREDENTIALS_RESOLUTION_STARTED("smartlock_save_credentials_resolution_started"),
    SMARTLOCK_LOAD_CREDENTIALS_SUCCESS("smartlock_load_credentials_success"),
    SMARTLOCK_LOAD_CREDENTIALS_EMPTY("smartlock_load_credentials_empty"),
    SMARTLOCK_LOAD_CREDENTIALS_RESOLUTION_STARTED("smartlock_load_credentials_resolution_started"),
    SMARTLOCK_LOAD_CREDENTIALS_RESOLUTION_STOPPED("smartlock_load_credentials_resolution_stopped"),
    SMARTLOCK_LOAD_CREDENTIALS_FAILURE("smartlock_load_credentials_failed"),
    SMARTLOCK_LOAD_CREDENTIALS_SIGN_IN_REQUIRED("smartlock_load_credentials_sign_in_required"),
    SMARTLOCK_LOAD_HINTS_SUCCESS("smartlock_load_hints_success"),
    SMARTLOCK_LOAD_HINTS_FAILURE("smartlock_load_hints_failure"),
    SMARTLOCK_LOAD_HINTS_STARTED("smartlock_load_hints_started"),
    SMARTLOCK_DELETE_CREDENTIALS_SUCCESS("smartlock_delete_credentials_success"),
    SMARTLOCK_DELETE_CREDENTIALS_FAILURE("smartlock_delete_credentials_failure"),
    SMARTLOCK_MISSING_API_FAILURE("smartlock_missing_api_failure"),
    GOOGLE_PLAY_SERVICES_STATUS("google_play_services_status"),
    RESET_PASSWORD_REQUEST_SUCCESS("reset_password_request_success"),
    RESET_PASSWORD_REQUEST_FAILURE("reset_password_request_failure"),
    RESET_PASSWORD_REQUEST_RATE_LIMIT_FAILURE("reset_password_rate_limit_failure"),
    SET_PASSWORD_REQUEST_SUCCESS("set_password_request_success"),
    SET_PASSWORD_REQUEST_FAILURE("set_password_request_failure"),
    MAGICLINK_TOKEN_RECEIVED_SUCCESS("magiclink_token_received_success"),
    MAGICLINK_TOKEN_RECEIVED_FAILURE("magiclink_token_received_failure"),
    MAGICLINK_LOGIN_SUCCESS("magiclink_login_success"),
    MAGICLINK_LOGIN_FAILURE("magiclink_login_failure"),
    MAGICLINK_LOGIN_ALREADY_LOGGED_IN("magiclink_login_already_logged_in"),
    MAGICLINK_REQUEST_BAD_EMAIL("magiclink_request_bad_email"),
    MAGICLINK_REQUEST_BAD_EMAIL_PREFILLED("magiclink_request_bad_email_prefilled"),
    MAGICLINK_REQUEST_SUCCESS_NOT_PREFILLED("magiclink_request_success_not_prefilled"),
    MAGICLINK_REQUEST_SUCCESS_PREFILLED("magiclink_request_success_prefilled"),
    MAGICLINK_REQUEST_USER_NOT_FOUND("magiclink_request_user_not_found"),
    MAGICLINK_REQUEST_USER_NOT_FOUND_PREFILLED("magiclink_request_user_not_found_prefilled"),
    OTP_REQUEST_SUCCESS("otp_request_success"),
    OTP_REQUEST_FAILURE("otp_request_failure"),
    OTP_SESSION_EXPIRED("otp_session_expired"),
    OTP_VALIDATION_SUCCESS("otp_validation_success"),
    OTP_VALIDATION_FAILURE("otp_validation_failure"),
    SAMSUNG_EFFORTLESS_LOGIN_SUCCESS("samsung_effortless_login_success"),
    LOCAL_VALUE_PROP_LANGUAGE_MISMATCH("local_value_prop_language_mismatch"),
    DEVICE_YEAR_CLASS("device_year_class"),
    SPOTIFY_ID_MAPPING("spotify_id_mapping"),
    RETURN_TO_SCREEN("return_to_screen"),
    CALL_STARTED("call_started"),
    CALL_COMPLETED("call_completed"),
    WELCOME_BACK_FACEBOOK_BUTTON_VISIBLE("welcome_back_facebook_button_visible"),
    ACCESSIBILITY_STATUS("accessibility_status"),
    START_SCREEN_IMAGE("start_screen_image_loading"),
    START_SCREEN_IMAGE_INTERACTION_TAP("screen_image_interaction_tap"),
    START_SCREEN_IMAGE_INTERACTION_SWIPE("screen_image_interaction_swipe");
    
    private final String mType;

    private EventIdentifier(String str) {
        this.mType = str;
    }

    public String d() {
        return this.mType;
    }
}
