package com.spotify.facebook.authentication.login;

import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ FacebookSSOPresenter a;

    public /* synthetic */ h(FacebookSSOPresenter facebookSSOPresenter) {
        this.a = facebookSSOPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.k((Throwable) obj);
    }
}
