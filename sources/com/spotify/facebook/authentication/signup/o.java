package com.spotify.facebook.authentication.signup;

import android.content.DialogInterface;

public final /* synthetic */ class o implements DialogInterface.OnClickListener {
    public final /* synthetic */ CreateAccountPresenter a;

    public /* synthetic */ o(CreateAccountPresenter createAccountPresenter) {
        this.a = createAccountPresenter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.v(dialogInterface, i);
    }
}
