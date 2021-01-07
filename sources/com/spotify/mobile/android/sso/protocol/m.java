package com.spotify.mobile.android.sso.protocol;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;

public interface m {
    String a();

    String b();

    AuthorizationRequest.ResponseType c();

    boolean d();

    ClientIdentity e();

    String[] f();

    String getState();
}
