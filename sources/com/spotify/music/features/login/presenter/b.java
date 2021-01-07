package com.spotify.music.features.login.presenter;

import com.spotify.base.java.logging.Logger;
import com.spotify.login.w0;
import com.spotify.music.features.login.presenter.LoginPresenter;

public final /* synthetic */ class b implements si0 {
    public final /* synthetic */ LoginPresenter.a a;
    public final /* synthetic */ String b;

    public /* synthetic */ b(LoginPresenter.a aVar, String str) {
        this.a = aVar;
        this.b = str;
    }

    @Override // defpackage.si0
    public final void accept(Object obj) {
        LoginPresenter.a aVar = this.a;
        String str = this.b;
        w0.a aVar2 = (w0.a) obj;
        aVar.getClass();
        Logger.d("Could not login because AuthErrorCode: %s", Integer.valueOf(aVar2.c()));
        LoginPresenter.this.w(aVar2.c(), str);
    }
}
