package com.spotify.facebook.authentication.login;

import android.content.DialogInterface;

public final /* synthetic */ class a implements DialogInterface.OnCancelListener {
    public final /* synthetic */ FacebookSSOFragment a;

    public /* synthetic */ a(FacebookSSOFragment facebookSSOFragment) {
        this.a = facebookSSOFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.M4();
    }
}
