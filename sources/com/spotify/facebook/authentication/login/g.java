package com.spotify.facebook.authentication.login;

import android.content.DialogInterface;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {
    public final /* synthetic */ FacebookSSOPresenter a;

    public /* synthetic */ g(FacebookSSOPresenter facebookSSOPresenter) {
        this.a = facebookSSOPresenter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.i(dialogInterface, i);
    }
}
