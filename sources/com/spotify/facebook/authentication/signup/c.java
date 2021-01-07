package com.spotify.facebook.authentication.signup;

import android.content.DialogInterface;
import com.spotify.loginflow.navigation.Destination;

public final /* synthetic */ class c implements DialogInterface.OnClickListener {
    public final /* synthetic */ CreateAccountFragment a;

    public /* synthetic */ c(CreateAccountFragment createAccountFragment) {
        this.a = createAccountFragment;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        CreateAccountFragment createAccountFragment = this.a;
        createAccountFragment.getClass();
        if (i == -1) {
            createAccountFragment.K4();
            createAccountFragment.o0.d(45500, Destination.h.a.a);
        }
    }
}
