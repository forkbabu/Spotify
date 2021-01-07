package com.spotify.music.features.login;

import android.content.DialogInterface;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {
    public final /* synthetic */ LoginFragment a;

    public /* synthetic */ h(LoginFragment loginFragment) {
        this.a = loginFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        LoginFragment loginFragment = this.a;
        loginFragment.m0.b(false);
        bd0.h(loginFragment.g0);
    }
}
