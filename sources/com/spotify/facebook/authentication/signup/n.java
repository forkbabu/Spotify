package com.spotify.facebook.authentication.signup;

import io.reactivex.functions.g;

public final /* synthetic */ class n implements g {
    public final /* synthetic */ CreateAccountPresenter a;

    public /* synthetic */ n(CreateAccountPresenter createAccountPresenter) {
        this.a = createAccountPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.u((Throwable) obj);
    }
}
