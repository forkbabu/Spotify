package com.spotify.facebook.authentication.login;

import android.content.DialogInterface;

public final /* synthetic */ class b implements DialogInterface.OnClickListener {
    public final /* synthetic */ FacebookSSOFragment a;

    public /* synthetic */ b(FacebookSSOFragment facebookSSOFragment) {
        this.a = facebookSSOFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.M4();
    }
}
