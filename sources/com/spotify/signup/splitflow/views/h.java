package com.spotify.signup.splitflow.views;

import android.content.DialogInterface;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {
    public final /* synthetic */ j a;
    public final /* synthetic */ iee b;

    public /* synthetic */ h(j jVar, iee iee) {
        this.a = jVar;
        this.b = iee;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.g(this.b, dialogInterface, i);
    }
}
