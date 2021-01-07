package com.spotify.effortlesslogin;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.spotify.login.AuthenticationMetadata;
import com.spotify.login.r0;
import io.reactivex.z;

public class s {
    private final r0 a;

    public s(r0 r0Var) {
        this.a = r0Var;
    }

    public z<Boolean> a(String str) {
        return this.a.d(str, false, AuthenticationMetadata.AuthSource.SAMSUNG).A(m.a);
    }

    public z<Boolean> b(b2e b2e) {
        return this.a.g(b2e.c(), new Uri.Builder().authority(b2e.a()).scheme(Constants.SCHEME).path("/auth/oauth2/token").build().toString(), false).A(m.a);
    }
}
