package com.spotify.cosmos.session;

import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.session.model.LoginRequest;
import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.cosmos.session.model.ProductStateWrapper;
import io.reactivex.a;
import io.reactivex.z;

public interface SessionClient {
    a cancel();

    z<Response> disableProductStateFromUcs();

    z<LoginResponse> login(LoginRequest loginRequest);

    a logout();

    a logoutAndForgetCredentials();

    z<LoginResponse> notifyBootstrapCompleted(ProductStateWrapper productStateWrapper);

    z<LoginResponse> notifyBootstrapCompleted(byte[] bArr);

    z<LoginResponse> notifyBootstrapFailed();

    z<LoginResponse> resendCode(String str);

    z<Response> updateProductState(ProductStateWrapper productStateWrapper);

    z<LoginResponse> verifyCode(String str, String str2);
}
