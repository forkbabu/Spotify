package com.spotify.facebook.authentication.signup;

import io.reactivex.functions.l;

public final /* synthetic */ class m implements l {
    public final /* synthetic */ CreateAccountPresenter a;

    public /* synthetic */ m(CreateAccountPresenter createAccountPresenter) {
        this.a = createAccountPresenter;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return this.a.s((Boolean) obj);
    }
}
