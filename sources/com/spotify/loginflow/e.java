package com.spotify.loginflow;

import com.spotify.loginflow.navigation.Destination;
import io.reactivex.functions.g;

public final /* synthetic */ class e implements g {
    public final /* synthetic */ LoginActivity a;

    public /* synthetic */ e(LoginActivity loginActivity) {
        this.a = loginActivity;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        LoginActivity.W0(this.a, (Destination) obj);
    }
}
