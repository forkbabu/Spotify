package com.spotify.facebook.authentication.signup;

import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public final /* synthetic */ CreateAccountPresenter a;

    public /* synthetic */ i(CreateAccountPresenter createAccountPresenter) {
        this.a = createAccountPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.r((Throwable) obj);
    }
}
