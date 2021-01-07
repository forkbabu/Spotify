package com.spotify.signup.splitflow.views;

import android.content.DialogInterface;

public final /* synthetic */ class c implements DialogInterface.OnCancelListener {
    public final /* synthetic */ j a;
    public final /* synthetic */ String b;

    public /* synthetic */ c(j jVar, String str) {
        this.a = jVar;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.d(this.b, dialogInterface);
    }
}
