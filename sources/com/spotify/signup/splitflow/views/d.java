package com.spotify.signup.splitflow.views;

import android.content.DialogInterface;

public final /* synthetic */ class d implements DialogInterface.OnCancelListener {
    public final /* synthetic */ j a;
    public final /* synthetic */ iee b;

    public /* synthetic */ d(j jVar, iee iee) {
        this.a = jVar;
        this.b = iee;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.a.f(this.b, dialogInterface);
    }
}
