package com.spotify.music.builtinauth.authenticator;

import com.google.common.collect.ImmutableSet;
import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.mobile.android.sso.ClientIdentity;
import com.spotify.music.builtinauth.model.FieldValidator;
import com.spotify.remoteconfig.u7;
import io.reactivex.a;
import io.reactivex.e;

public class f0 implements h0 {
    private final FieldValidator a;
    private final l0 b;
    private final u7 c;
    private final n0 d;
    private final i0 e;
    private final jl2 f;

    public f0(u7 u7Var, n0 n0Var, l0 l0Var, i0 i0Var, jl2 jl2, FieldValidator fieldValidator) {
        this.c = u7Var;
        this.d = n0Var;
        this.a = fieldValidator;
        this.b = l0Var;
        this.e = i0Var;
        this.f = jl2;
    }

    private a c(com.spotify.music.builtinauth.model.a aVar) {
        AuthorizationRequest a2 = el2.a(aVar);
        boolean parseBoolean = Boolean.parseBoolean(aVar.f().get("show_auth_view"));
        this.f.b(a2, false, true);
        return this.b.b(a2, parseBoolean).q(new j(this, aVar)).p(new m(this, aVar));
    }

    @Override // com.spotify.music.builtinauth.authenticator.h0
    public void a(com.spotify.music.builtinauth.model.a aVar) {
        this.a.e(aVar.e(), "client identity");
        this.a.e(aVar.f(), "extras");
        this.a.d(aVar.d(), "client-id");
        this.a.d(aVar.f().get("redirect_uri"), "redirect_uri");
        ImmutableSet<String> b2 = el2.b(aVar);
        this.a.getClass();
        if (!b2.contains("app-remote-control")) {
            throw new FieldValidator.ValidationException("\"scopes\" doesn't contain \"app-remote-control\"");
        }
    }

    @Override // com.spotify.music.builtinauth.authenticator.h0
    public a b(com.spotify.music.builtinauth.model.a aVar) {
        if (this.c.a()) {
            return this.d.f().Y(new n(this, aVar));
        }
        return this.e.a().B().d(this.d.e().q(new f(this, aVar)).d(c(aVar)));
    }

    public void d(com.spotify.music.builtinauth.model.a aVar, Throwable th) {
        jl2 jl2 = this.f;
        ClientIdentity e2 = aVar.e();
        e2.getClass();
        jl2.c(e2.f(), th.getMessage());
    }

    public void e(com.spotify.music.builtinauth.model.a aVar) {
        jl2 jl2 = this.f;
        ClientIdentity e2 = aVar.e();
        e2.getClass();
        jl2.a(e2.f());
    }

    public void f(com.spotify.music.builtinauth.model.a aVar, Throwable th) {
        jl2 jl2 = this.f;
        ClientIdentity e2 = aVar.e();
        e2.getClass();
        jl2.c(e2.f(), th.getMessage());
    }

    public void g(com.spotify.music.builtinauth.model.a aVar, Throwable th) {
        jl2 jl2 = this.f;
        ClientIdentity e2 = aVar.e();
        e2.getClass();
        jl2.c(e2.f(), th.getMessage());
    }

    public void h(com.spotify.music.builtinauth.model.a aVar) {
        jl2 jl2 = this.f;
        ClientIdentity e2 = aVar.e();
        e2.getClass();
        jl2.a(e2.f());
    }

    public e i(com.spotify.music.builtinauth.model.a aVar, Boolean bool) {
        if (bool.booleanValue()) {
            return c(aVar).D(new h(this, aVar)).d(a.n(new g(this, aVar)));
        }
        AuthorizationRequest a2 = el2.a(aVar);
        this.f.b(a2, true, true);
        return this.e.b(a2).q(new k(this, aVar)).p(new i(this, aVar));
    }

    public void j(com.spotify.music.builtinauth.model.a aVar, Throwable th) {
        jl2 jl2 = this.f;
        ClientIdentity e2 = aVar.e();
        e2.getClass();
        jl2.c(e2.f(), th.getMessage());
    }

    public e k(com.spotify.music.builtinauth.model.a aVar, Throwable th) {
        return this.e.e(el2.a(aVar)).B().d(a.t(th));
    }

    public e l(com.spotify.music.builtinauth.model.a aVar) {
        return this.e.f(el2.a(aVar)).q(new l(this, aVar)).B();
    }
}
