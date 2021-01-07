package com.spotify.music.builtinauth.cache;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import java.util.Arrays;

public class j0 {
    private final cqe a;

    public j0(cqe cqe) {
        this.a = cqe;
    }

    public a0 a(AuthorizationRequest authorizationRequest) {
        ClientIdentity c = authorizationRequest.c();
        c.getClass();
        return a0.a(authorizationRequest.b(), authorizationRequest.e(), Arrays.toString(authorizationRequest.g()), this.a.d(), c.f(), c.g(), this.a.d());
    }
}
