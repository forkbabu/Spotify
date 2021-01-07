package com.spotify.music.features.login;

import android.view.View;
import com.spotify.music.features.login.presenter.LoginPresenter;

public final /* synthetic */ class g implements View.OnClickListener {
    public final /* synthetic */ LoginFragment a;
    public final /* synthetic */ String b;

    public /* synthetic */ g(LoginFragment loginFragment, String str) {
        this.a = loginFragment;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LoginFragment loginFragment = this.a;
        String str = this.b;
        ((LoginPresenter) loginFragment.k0).y(loginFragment.L4(), loginFragment.M4(), str != null);
    }
}
