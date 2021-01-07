package com.spotify.libs.signup.validators;

import com.spotify.libs.signup.validators.c;
import com.spotify.signup.api.services.SignupErrorStatus;
import com.spotify.signup.api.services.model.PasswordValidation;
import com.spotify.signup.api.services.model.PasswordValidationResponse;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        c.a aVar;
        PasswordValidationResponse passwordValidationResponse = (PasswordValidationResponse) obj;
        PasswordValidation status = passwordValidationResponse.status();
        if (status.isOk()) {
            return new c.a(true, false, null);
        }
        if (!passwordValidationResponse.status().isError()) {
            return new c.a(false, false, null);
        }
        PasswordValidation.Error asError = status.asError();
        if (asError.status() == SignupErrorStatus.STATUS_INVALID_FORM_DATA.g()) {
            aVar = new c.a(false, false, asError.errors().get("password"));
        } else if (asError.status() != SignupErrorStatus.STATUS_REQUEST_FROM_DATACENTER.g()) {
            return new c.a(false, false, null);
        } else {
            aVar = new c.a(false, false, asError.errors().get("generic_error"));
        }
        return aVar;
    }
}
