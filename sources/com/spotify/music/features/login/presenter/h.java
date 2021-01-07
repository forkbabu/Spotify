package com.spotify.music.features.login.presenter;

import android.content.DialogInterface;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {
    public final /* synthetic */ LoginPresenter a;

    public /* synthetic */ h(LoginPresenter loginPresenter) {
        this.a = loginPresenter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.s(dialogInterface, i);
    }
}
