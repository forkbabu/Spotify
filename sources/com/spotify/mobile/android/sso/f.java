package com.spotify.mobile.android.sso;

import android.content.DialogInterface;

public final /* synthetic */ class f implements DialogInterface.OnCancelListener {
    public final /* synthetic */ AuthorizationActivity a;

    public /* synthetic */ f(AuthorizationActivity authorizationActivity) {
        this.a = authorizationActivity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.k1(dialogInterface);
    }
}
