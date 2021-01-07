package com.spotify.facebook.authentication.login;

import android.content.DialogInterface;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {
    public final /* synthetic */ FacebookSSOPresenter a;

    public /* synthetic */ l(FacebookSSOPresenter facebookSSOPresenter) {
        this.a = facebookSSOPresenter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.h(dialogInterface, i);
    }
}
