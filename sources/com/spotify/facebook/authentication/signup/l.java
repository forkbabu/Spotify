package com.spotify.facebook.authentication.signup;

import com.spotify.facebook.authentication.signup.model.Failure;
import com.spotify.facebook.authentication.signup.model.a;
import java.io.IOException;

public final /* synthetic */ class l implements io.reactivex.functions.l {
    public static final /* synthetic */ l a = new l();

    private /* synthetic */ l() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        if (((Throwable) obj) instanceof IOException) {
            return new a.C0154a(Failure.NO_CONNECTION);
        }
        return new a.C0154a(Failure.SPOTIFY_IS_DOWN);
    }
}
