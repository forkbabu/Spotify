package com.spotify.facebook.authentication.login;

import android.content.DialogInterface;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ FacebookSSOFragment a;

    public /* synthetic */ c(FacebookSSOFragment facebookSSOFragment) {
        this.a = facebookSSOFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FacebookSSOFragment facebookSSOFragment = this.a;
        if (i == -1) {
            facebookSSOFragment.l0.b(facebookSSOFragment, facebookSSOFragment.g0);
        } else {
            facebookSSOFragment.M4();
        }
    }
}
