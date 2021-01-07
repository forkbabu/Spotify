package com.spotify.music.builtinauth.authenticator;

import com.spotify.mobile.android.sso.AuthorizationRequest;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.music.builtinauth.cache.OfflineAuthCacheException;
import com.spotify.music.builtinauth.cache.a0;
import com.spotify.music.builtinauth.cache.j0;
import com.spotify.music.builtinauth.cache.l0;
import io.reactivex.a;
import io.reactivex.d0;
import io.reactivex.internal.operators.maybe.c;
import io.reactivex.internal.operators.maybe.j;
import io.reactivex.z;

public class i0 {
    private final l0 a;
    private final j0 b;
    private final cqe c;

    i0(l0 l0Var, j0 j0Var, cqe cqe) {
        this.a = l0Var;
        this.b = j0Var;
        this.c = cqe;
    }

    public static boolean c(i0 i0Var, a0 a0Var) {
        i0Var.getClass();
        return a0Var.i() >= i0Var.c.d() - 86400000;
    }

    /* access modifiers changed from: package-private */
    public a a() {
        return this.a.clear().t(new r(new OfflineAuthCacheException(OfflineAuthCacheException.ErrorMessage.CACHE_CLEAR_ERROR)));
    }

    /* access modifiers changed from: package-private */
    public a b(AuthorizationRequest authorizationRequest) {
        BuiltInAuthException builtInAuthException = new BuiltInAuthException(BuiltInAuthException.AuthError.ERROR_OFFLINE_MODE_ACTIVE, "Spotify must be online to verify this authorization request. Spotify can authorize requests offline only for a limited period of time");
        return z.z(Boolean.FALSE).s(new o(this, this.b.a(authorizationRequest))).E(q.a).t(new s(builtInAuthException));
    }

    public d0 d(a0 a0Var, Boolean bool) {
        return new j(new c(this.a.a(a0Var).r(new p(this)), new t(a0Var)));
    }

    /* access modifiers changed from: package-private */
    public a e(AuthorizationRequest authorizationRequest) {
        return this.a.b(this.b.a(authorizationRequest));
    }

    /* access modifiers changed from: package-private */
    public a f(AuthorizationRequest authorizationRequest) {
        return this.a.d(this.b.a(authorizationRequest));
    }
}
