package com.spotify.facebook.authentication.signup;

import com.spotify.facebook.authentication.signup.model.b;
import io.reactivex.functions.g;

public final /* synthetic */ class h implements g {
    public final /* synthetic */ CreateAccountPresenter a;

    public /* synthetic */ h(CreateAccountPresenter createAccountPresenter) {
        this.a = createAccountPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.q((b) obj);
    }
}
