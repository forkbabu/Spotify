package com.spotify.facebook.authentication.signup;

import com.spotify.facebook.authentication.signup.model.Failure;
import com.spotify.facebook.authentication.signup.model.a;
import com.spotify.signup.api.services.model.FacebookSignupResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class k implements l {
    public static final /* synthetic */ k a = new k();

    private /* synthetic */ k() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Failure failure;
        FacebookSignupResponse facebookSignupResponse = (FacebookSignupResponse) obj;
        if (facebookSignupResponse.status().isOk()) {
            return a.c.a;
        }
        int statusCode = facebookSignupResponse.status().asError().statusCode();
        if (statusCode == 5) {
            failure = Failure.SPOTIFY_IS_DOWN;
        } else if (statusCode != 21) {
            failure = Failure.UNKNOWN;
        } else {
            failure = Failure.EMAIL_ALREADY_EXIST;
        }
        return new a.C0154a(failure);
    }
}
