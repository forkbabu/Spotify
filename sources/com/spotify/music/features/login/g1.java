package com.spotify.music.features.login;

import com.spotify.cosmos.session.BootstrapHandler;
import com.spotify.cosmos.session.model.LoginResponse;
import com.spotify.http.g;
import io.reactivex.functions.l;
import io.reactivex.z;
import java.util.concurrent.Callable;

public class g1 implements BootstrapHandler {
    private final g a;
    private final u2a b;

    g1(g gVar, u2a u2a) {
        this.a = gVar;
        this.b = u2a;
    }

    public z a(l lVar, LoginResponse loginResponse) {
        if (!loginResponse.isBootstrapRequired()) {
            return z.z(loginResponse);
        }
        return this.b.b(this.a.b(loginResponse.asBootstrapRequired().accessToken()).a(), false).s(new e(lVar));
    }

    public z b(l lVar, Callable callable, LoginResponse loginResponse) {
        if (!loginResponse.isBootstrapRequired()) {
            return z.z(loginResponse);
        }
        return this.b.a(this.a.b(loginResponse.asBootstrapRequired().accessToken()).a()).s(new d(lVar)).D(new b(callable));
    }

    @Override // com.spotify.cosmos.session.BootstrapHandler
    public l<LoginResponse, z<LoginResponse>> continueWith(l<byte[], z<LoginResponse>> lVar) {
        return new a(this, lVar);
    }

    @Override // com.spotify.cosmos.session.BootstrapHandler
    public l<LoginResponse, z<LoginResponse>> continueWith(l<byte[], z<LoginResponse>> lVar, Callable<z<LoginResponse>> callable) {
        return new c(this, lVar, callable);
    }
}
