package com.spotify.facebook.authentication.signup;

import com.spotify.facebook.authentication.signup.model.a;
import io.reactivex.functions.g;

public final /* synthetic */ class p implements g {
    public final /* synthetic */ CreateAccountPresenter a;

    public /* synthetic */ p(CreateAccountPresenter createAccountPresenter) {
        this.a = createAccountPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.t((a) obj);
    }
}
