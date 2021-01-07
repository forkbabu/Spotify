package com.spotify.facebook.authentication.signup;

import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ CreateAccountPresenter a;

    public /* synthetic */ f(CreateAccountPresenter createAccountPresenter) {
        this.a = createAccountPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.m((SignupConfigurationResponse) obj);
    }
}
