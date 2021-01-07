package com.spotify.facebook.authentication.login;

import android.content.DialogInterface;
import com.spotify.loginflow.navigation.Destination;

public final /* synthetic */ class d implements DialogInterface.OnClickListener {
    public final /* synthetic */ FacebookSSOFragment a;

    public /* synthetic */ d(FacebookSSOFragment facebookSSOFragment) {
        this.a = facebookSSOFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        FacebookSSOFragment facebookSSOFragment = this.a;
        if (i == -1) {
            facebookSSOFragment.m0.d(45500, Destination.h.a.a);
        }
        facebookSSOFragment.M4();
    }
}
