package com.spotify.facebook.authentication.signup;

import com.spotify.facebook.authentication.signup.model.Failure;
import com.spotify.facebook.authentication.signup.model.b;
import io.reactivex.functions.l;
import java.io.IOException;

public final /* synthetic */ class q implements l {
    public static final /* synthetic */ q a = new q();

    private /* synthetic */ q() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        if (((Throwable) obj) instanceof IOException) {
            return new b.a(Failure.NO_CONNECTION);
        }
        return new b.a(Failure.SPOTIFY_IS_DOWN);
    }
}
