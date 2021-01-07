package com.spotify.libs.pse.model;

import com.spotify.base.java.logging.Logger;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import kotlin.jvm.internal.h;

public class e {
    private final ConfigurationResponse a;

    public e(ConfigurationResponse configurationResponse) {
        h.e(configurationResponse, "response");
        this.a = configurationResponse;
        Logger.b("PsesConfiguration from ConfigurationResponse", new Object[0]);
    }

    private final boolean b(String str) {
        for (String str2 : this.a.n()) {
            if (kotlin.text.e.f(str2, str, true)) {
                return true;
            }
        }
        return false;
    }

    public final a a() {
        return qy0.c(this, this.a);
    }

    public final boolean c() {
        return b(FlagKeys.ENABLE_RECAPTCHA);
    }

    public final boolean d() {
        return !b(FlagKeys.MOBILE_DISABLE_FACEBOOK_LOGIN);
    }

    public final boolean e() {
        return !b(FlagKeys.MOBILE_DISABLE_FACEBOOK_SIGNUP);
    }

    public final boolean f() {
        return b(FlagKeys.ENABLE_GOOGLE_LOGIN);
    }

    public final boolean g() {
        return b(FlagKeys.ENABLE_GOOGLE_REGISTRATION);
    }

    public final boolean h() {
        return b(FlagKeys.ENABLE_MANDATORY_BOOTSTRAP);
    }

    public final boolean i() {
        return b(FlagKeys.ENABLE_PHONE_NUMBER_WITH_NEW_TC);
    }

    public final boolean j() {
        return b(FlagKeys.ENABLE_REMEMBER_ME);
    }

    public final boolean k() {
        return b(FlagKeys.ENABLE_SAMSUNG_LOGIN);
    }

    public final boolean l() {
        return b(FlagKeys.ENABLE_SAMSUNG_LOGIN_USING_SAMSUNG_SIGN_IN);
    }

    public final boolean m() {
        return b(FlagKeys.ENABLE_SOUTH_KOREA_EXPERIENCE);
    }

    public final boolean n() {
        return b(FlagKeys.MOBILE_ENABLE_FACEBOOK_SIGNUP_TO_SPLIT_FLOW);
    }
}
