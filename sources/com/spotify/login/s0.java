package com.spotify.login;

import com.spotify.cosmos.session.BootstrapHandler;
import com.spotify.cosmos.session.SessionClient;
import com.spotify.cosmos.session.model.LoginCredentials;
import com.spotify.cosmos.session.model.LoginRequest;
import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.login.AuthenticationMetadata;
import com.spotify.login.w0;
import defpackage.re0;
import io.reactivex.a;
import io.reactivex.disposables.b;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.Set;

public class s0 implements r0 {
    private final v0 a;
    private final SessionClient b;
    private final ajf<Set<o0>> c;
    private final BootstrapHandler d;
    private final ke0 e;
    private final boolean f;

    public s0(v0 v0Var, SessionClient sessionClient, ajf<Set<o0>> ajf, BootstrapHandler bootstrapHandler, ke0 ke0, boolean z) {
        this.a = v0Var;
        this.b = sessionClient;
        this.c = ajf;
        this.d = bootstrapHandler;
        this.e = ke0;
        this.f = z;
    }

    private l<LoginResponse, z<LoginResponse>> i() {
        if (this.f) {
            BootstrapHandler bootstrapHandler = this.d;
            SessionClient sessionClient = this.b;
            sessionClient.getClass();
            n0 n0Var = new n0(sessionClient);
            SessionClient sessionClient2 = this.b;
            sessionClient2.getClass();
            return bootstrapHandler.continueWith(n0Var, new a(sessionClient2));
        }
        BootstrapHandler bootstrapHandler2 = this.d;
        SessionClient sessionClient3 = this.b;
        sessionClient3.getClass();
        return bootstrapHandler2.continueWith(new n0(sessionClient3));
    }

    private z<LoginResponse> q(LoginRequest loginRequest, boolean z, AuthenticationMetadata.AuthSource authSource) {
        return this.b.login(loginRequest).s(i()).j(new w(this, z, (String) loginRequest.credentials().map(i.a, t.a, y.a, i0.a, g0.a, h0.a, s.a, x.a, f0.a, m.a, l.a), authSource));
    }

    private z<w0> r(LoginRequest loginRequest, boolean z, AuthenticationMetadata.AuthSource authSource) {
        return q(loginRequest, z, authSource).A(v.a);
    }

    private LoginRequest s(LoginCredentials loginCredentials) {
        return LoginRequest.create(loginCredentials, this.a.a());
    }

    @Override // com.spotify.login.r0
    public z<w0> a(String str, String str2, boolean z) {
        String a2 = this.e.a();
        return r(s(LoginCredentials.facebook(str, str2)), z, null).o(new c(this, a2)).p(new n(this, a2));
    }

    @Override // com.spotify.login.r0
    public z<w0> b(String str, String str2, boolean z, AuthenticationMetadata.AuthSource authSource) {
        return h(str, str2, z, false, authSource);
    }

    @Override // com.spotify.login.r0
    public z<x0> c(String str, String str2) {
        return this.b.verifyCode(str, str2).s(i()).j(new w(this, false, "phoneNumber", null)).A(m0.a);
    }

    @Override // com.spotify.login.r0
    public z<w0> d(String str, boolean z, AuthenticationMetadata.AuthSource authSource) {
        return r(s(LoginCredentials.oneTimeToken(str)), z, authSource);
    }

    @Override // com.spotify.login.r0
    public z<x0> e(String str) {
        return q(s(LoginCredentials.phoneNumber(str)), false, null).A(m0.a);
    }

    @Override // com.spotify.login.r0
    public z<u0> f(String str, boolean z) {
        return q(LoginRequest.create(LoginCredentials.googleSignIn(str, "")), z, AuthenticationMetadata.AuthSource.GOOGLE).A(b.a);
    }

    @Override // com.spotify.login.r0
    public z<w0> g(String str, String str2, boolean z) {
        return r(LoginRequest.create(LoginCredentials.samsungSignIn(str, "", str2)), z, null);
    }

    @Override // com.spotify.login.r0
    public z<w0> h(String str, String str2, boolean z, boolean z2, AuthenticationMetadata.AuthSource authSource) {
        re0 re0;
        String a2 = this.e.a();
        if (z2) {
            re0 = re0.b.b;
        } else {
            re0 = re0.a.b;
        }
        return r(s(LoginCredentials.password(str, str2)), z, authSource).o(new k(this, re0, a2)).p(new j(this, re0, a2));
    }

    public /* synthetic */ void j(String str, b bVar) {
        this.e.d(re0.c.b, str);
    }

    public /* synthetic */ void k(re0 re0, String str, b bVar) {
        this.e.d(re0, str);
    }

    public /* synthetic */ void l(re0 re0, String str, w0.b bVar) {
        this.e.b(re0, str);
    }

    public /* synthetic */ void m(re0 re0, String str, w0.a aVar) {
        this.e.c(re0, str, aVar.c());
    }

    public /* synthetic */ void n(String str, w0.b bVar) {
        this.e.b(re0.c.b, str);
    }

    public /* synthetic */ void o(String str, w0.a aVar) {
        this.e.c(re0.c.b, str, aVar.c());
    }

    public /* synthetic */ void p(boolean z, String str, AuthenticationMetadata.AuthSource authSource, LoginResponse loginResponse) {
        if (loginResponse.isSuccess()) {
            AuthenticationMetadata authenticationMetadata = new AuthenticationMetadata(z, loginResponse.asSuccess().session().username(), str, authSource);
            for (o0 o0Var : this.c.get()) {
                o0Var.a(authenticationMetadata);
            }
        }
    }

    @Override // com.spotify.login.r0
    public z<x0> resendCode(String str) {
        return this.b.resendCode(str).s(i()).A(m0.a);
    }

    @Override // com.spotify.login.r0
    public a w() {
        return this.b.cancel();
    }
}
