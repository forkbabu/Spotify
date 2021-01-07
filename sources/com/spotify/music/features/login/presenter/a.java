package com.spotify.music.features.login.presenter;

import com.spotify.music.features.login.LoginFragment;
import io.reactivex.functions.g;

public final /* synthetic */ class a implements g {
    public final /* synthetic */ tn5 a;

    public /* synthetic */ a(tn5 tn5) {
        this.a = tn5;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        ((LoginFragment) this.a).N4(((Boolean) obj).booleanValue());
    }
}
