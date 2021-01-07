package com.spotify.music.features.login.presenter;

import com.spotify.login.w0;
import com.spotify.music.features.login.LoginFragment;
import com.spotify.music.features.login.presenter.LoginPresenter;

public final /* synthetic */ class c implements si0 {
    public final /* synthetic */ LoginPresenter.a a;

    public /* synthetic */ c(LoginPresenter.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        LoginPresenter.a aVar = this.a;
        w0.b bVar = (w0.b) obj;
        LoginPresenter loginPresenter = LoginPresenter.this;
        loginPresenter.x(((LoginFragment) loginPresenter.a).L4(), ((LoginFragment) LoginPresenter.this.a).M4());
    }
}
