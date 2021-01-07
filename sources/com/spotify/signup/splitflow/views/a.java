package com.spotify.signup.splitflow.views;

import android.content.DialogInterface;

public final /* synthetic */ class a implements DialogInterface.OnClickListener {
    public final /* synthetic */ j a;
    public final /* synthetic */ iee b;

    public /* synthetic */ a(j jVar, iee iee) {
        this.a = jVar;
        this.b = iee;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.e(this.b, dialogInterface, i);
    }
}
