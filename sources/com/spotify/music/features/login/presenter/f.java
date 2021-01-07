package com.spotify.music.features.login.presenter;

import io.reactivex.functions.g;

public final /* synthetic */ class f implements g {
    public final /* synthetic */ LoginPresenter a;

    public /* synthetic */ f(LoginPresenter loginPresenter) {
        this.a = loginPresenter;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.u((Throwable) obj);
    }
}
