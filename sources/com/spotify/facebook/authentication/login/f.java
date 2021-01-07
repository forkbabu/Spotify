package com.spotify.facebook.authentication.login;

import com.spotify.login.w0;
import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ FacebookSSOPresenter a;

    public /* synthetic */ f(FacebookSSOPresenter facebookSSOPresenter) {
        this.a = facebookSSOPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        FacebookSSOPresenter facebookSSOPresenter = this.a;
        facebookSSOPresenter.getClass();
        ((w0) obj).b(new k(facebookSSOPresenter), new i(facebookSSOPresenter));
    }
}
