package com.spotify.music.features.findfriends;

import android.content.DialogInterface;

public final /* synthetic */ class q implements DialogInterface.OnClickListener {
    public final /* synthetic */ w0 a;

    public /* synthetic */ q(w0 w0Var) {
        this.a = w0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.o(dialogInterface, i);
    }
}
