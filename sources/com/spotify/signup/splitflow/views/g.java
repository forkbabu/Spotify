package com.spotify.signup.splitflow.views;

import android.content.DialogInterface;

public final /* synthetic */ class g implements DialogInterface.OnClickListener {
    public final /* synthetic */ j a;
    public final /* synthetic */ String b;

    public /* synthetic */ g(j jVar, String str) {
        this.a = jVar;
        this.b = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.c(this.b, dialogInterface, i);
    }
}
