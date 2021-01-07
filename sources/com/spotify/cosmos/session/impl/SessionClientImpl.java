package com.spotify.cosmos.session.impl;

import com.spotify.cosmos.android.TypedResponse;
import com.spotify.cosmos.android.cosmonaut.Cosmonaut;
import com.spotify.cosmos.router.Response;
import com.spotify.cosmos.router.RxRouter;
import com.spotify.cosmos.session.SessionClient;
import com.spotify.cosmos.session.model.BootstrapRequired;
import com.spotify.cosmos.session.model.CodeRequired;
import com.spotify.cosmos.session.model.CodeSuccess;
import com.spotify.cosmos.session.model.LoginRequest;
import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.cosmos.session.model.LoginResponseBody;
import com.spotify.cosmos.session.model.ProductStateWrapper;
import com.spotify.cosmos.session.model.SessionInfo;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import io.reactivex.a;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.Collections;

public class SessionClientImpl implements SessionClient {
    private final LoginResponseFunction mResponseFunction;
    private final SessionCosmosClient mSessionCosmosClient;

    /* access modifiers changed from: private */
    public static class LoginResponseFunction implements l<TypedResponse<LoginResponseBody>, LoginResponse> {
        private LoginResponseFunction() {
        }

        public LoginResponse apply(TypedResponse<LoginResponseBody> typedResponse) {
            int status = typedResponse.status();
            if (status >= 400) {
                return LoginResponse.error(SessionClientImpl.parseErrorCode(typedResponse.headers().get(AppProtocol.LogMessage.SEVERITY_ERROR), status), typedResponse.headers().get("message"));
            }
            LoginResponseBody body = typedResponse.body();
            if (body instanceof SessionInfo) {
                return LoginResponse.success((SessionInfo) body);
            }
            if (body instanceof CodeSuccess) {
                CodeSuccess codeSuccess = (CodeSuccess) body;
                return LoginResponse.codeSuccess(codeSuccess.identifierToken(), codeSuccess.email(), codeSuccess.emailAlreadyRegistered());
            } else if (body instanceof CodeRequired) {
                CodeRequired codeRequired = (CodeRequired) body;
                return LoginResponse.codeRequired(codeRequired.challengeId(), codeRequired.method(), codeRequired.codeLength(), codeRequired.canonicalPhoneNumber(), codeRequired.expiresIn(), codeRequired.retryNumber());
            } else if (body instanceof BootstrapRequired) {
                return LoginResponse.bootstrapRequired(((BootstrapRequired) body).accessToken());
            } else {
                return LoginResponse.error(500, "unsupported_response_type");
            }
        }
    }

    public SessionClientImpl(Cosmonaut cosmonaut, RxRouter rxRouter) {
        this((SessionCosmosClient) cosmonaut.createCosmosService(SessionCosmosClient.class, rxRouter));
    }

    /* access modifiers changed from: private */
    public static int parseErrorCode(String str, int i) {
        if (str == null) {
            return i;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public a cancel() {
        return this.mSessionCosmosClient.cancel();
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public z<Response> disableProductStateFromUcs() {
        return this.mSessionCosmosClient.disableProductStateFromUcs();
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public z<LoginResponse> login(LoginRequest loginRequest) {
        return this.mSessionCosmosClient.login(loginRequest).A(this.mResponseFunction);
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public a logout() {
        return this.mSessionCosmosClient.logout(false);
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public a logoutAndForgetCredentials() {
        return this.mSessionCosmosClient.logout(true);
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public z<LoginResponse> notifyBootstrapCompleted(byte[] bArr) {
        return notifyBootstrapCompleted(ProductStateWrapper.create(Collections.emptyMap()));
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public z<LoginResponse> notifyBootstrapFailed() {
        return this.mSessionCosmosClient.notifyBootstrapCompleted(ProductStateWrapper.create(Collections.emptyMap()), false).A(this.mResponseFunction);
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public z<LoginResponse> resendCode(String str) {
        return this.mSessionCosmosClient.resendCode(str).A(this.mResponseFunction);
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public z<Response> updateProductState(ProductStateWrapper productStateWrapper) {
        return this.mSessionCosmosClient.updateProductState(productStateWrapper);
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public z<LoginResponse> verifyCode(String str, String str2) {
        return this.mSessionCosmosClient.verifyCode(str, str2).A(this.mResponseFunction);
    }

    SessionClientImpl(SessionCosmosClient sessionCosmosClient) {
        this.mSessionCosmosClient = sessionCosmosClient;
        this.mResponseFunction = new LoginResponseFunction();
    }

    @Override // com.spotify.cosmos.session.SessionClient
    public z<LoginResponse> notifyBootstrapCompleted(ProductStateWrapper productStateWrapper) {
        return this.mSessionCosmosClient.notifyBootstrapCompleted(productStateWrapper, true).A(this.mResponseFunction);
    }
}
