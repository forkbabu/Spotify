package com.spotify.loginflow;

import androidx.lifecycle.v;
import com.spotify.loginflow.navigation.Destination;

public final /* synthetic */ class f implements v {
    public final /* synthetic */ LoginActivity a;

    public /* synthetic */ f(LoginActivity loginActivity) {
        this.a = loginActivity;
    }

    @Override // androidx.lifecycle.v
    public final void a(Object obj) {
        LoginActivity loginActivity = this.a;
        int i = LoginActivity.X;
        loginActivity.getClass();
        Destination destination = (Destination) ((p) obj).a();
        if (destination != null) {
            loginActivity.H.b(destination);
        }
    }
}
