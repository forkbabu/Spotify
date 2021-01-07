package com.spotify.libs.pse.model;

import androidx.annotation.Keep;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Keep
@Retention(RetentionPolicy.SOURCE)
public @interface FlagKeys {
    public static final String ENABLE_GOOGLE_LOGIN = "google_login_enabled";
    public static final String ENABLE_GOOGLE_REGISTRATION = "google_registration_enabled";
    public static final String ENABLE_MANDATORY_BOOTSTRAP = "enable_mandatory_bootstrap";
    public static final String ENABLE_PHONE_NUMBER_WITH_NEW_TC = "enable_phone_number_with_new_tc";
    public static final String ENABLE_RECAPTCHA = "android_enable_recaptcha";
    public static final String ENABLE_REMEMBER_ME = "flag_remember_me";
    public static final String ENABLE_SAMSUNG_LOGIN = "enable_samsung_login";
    public static final String ENABLE_SAMSUNG_LOGIN_USING_SAMSUNG_SIGN_IN = "enable_samsung_login_using_single_sign_in";
    public static final String ENABLE_SOUTH_KOREA_EXPERIENCE = "mobile_enable_south_korea_experience";
    public static final String MOBILE_DISABLE_FACEBOOK_LOGIN = "mobile_disable_facebook_login";
    public static final String MOBILE_DISABLE_FACEBOOK_SIGNUP = "mobile_disable_facebook_signup";
    public static final String MOBILE_ENABLE_FACEBOOK_SIGNUP_TO_SPLIT_FLOW = "mobile_enable_facebook_signup_to_split_flow";
}
