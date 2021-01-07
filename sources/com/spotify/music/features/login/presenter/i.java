package com.spotify.music.features.login.presenter;

import io.reactivex.functions.g;

public final /* synthetic */ class i implements g {
    public final /* synthetic */ LoginPresenter a;
    public final /* synthetic */ ie0 b;

    public /* synthetic */ i(LoginPresenter loginPresenter, ie0 ie0) {
        this.a = loginPresenter;
        this.b = ie0;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.t(this.b, (CharSequence) obj);
    }
}
