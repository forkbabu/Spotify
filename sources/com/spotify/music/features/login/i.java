package com.spotify.music.features.login;

import android.view.View;
import com.spotify.music.features.login.presenter.LoginPresenter;

public final /* synthetic */ class i implements View.OnClickListener {
    public final /* synthetic */ LoginFragment a;

    public /* synthetic */ i(LoginFragment loginFragment) {
        this.a = loginFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LoginFragment loginFragment = this.a;
        ((LoginPresenter) loginFragment.k0).z(loginFragment.L4());
    }
}
