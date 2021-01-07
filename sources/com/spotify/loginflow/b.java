package com.spotify.loginflow;

import com.spotify.loginflow.navigation.Destination;
import defpackage.t01;
import io.reactivex.functions.g;

public final /* synthetic */ class b implements g {
    public final /* synthetic */ LoginActivity a;
    public final /* synthetic */ Destination b;

    public /* synthetic */ b(LoginActivity loginActivity, Destination destination) {
        this.a = loginActivity;
        this.b = destination;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        LoginActivity loginActivity = this.a;
        Destination destination = this.b;
        loginActivity.getClass();
        if (((t01) obj) instanceof t01.b) {
            loginActivity.H.b(Destination.d.a);
        } else {
            loginActivity.H.c(destination, new com.spotify.loginflow.navigation.b(null));
        }
    }
}
