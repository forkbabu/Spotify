package com.spotify.effortlesslogin;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.e0;
import androidx.lifecycle.u;
import com.spotify.base.java.logging.Logger;
import com.spotify.effortlesslogin.LoginState;
import com.spotify.effortlesslogin.backend.EffortlessLoginTokenResponse;
import com.spotify.effortlesslogin.backend.e;
import io.reactivex.d0;
import io.reactivex.y;

public class p extends e0 {
    private final u<LoginState> c = new u<>();
    private final s d;
    private final e e;
    private final z1e f;
    private final y g;
    private final y h;
    private final com.spotify.rxjava2.p i = new com.spotify.rxjava2.p();

    public p(s sVar, e eVar, z1e z1e, y yVar, y yVar2) {
        this.d = sVar;
        this.e = eVar;
        this.f = z1e;
        this.g = yVar;
        this.h = yVar2;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.e0
    public void e() {
        this.i.a();
    }

    public LiveData<LoginState> g() {
        return this.c;
    }

    public void h(Throwable th) {
        this.c.n(new n(LoginState.Type.LOGIN_FAILED, "Failed to get One Time Token"));
    }

    public /* synthetic */ d0 i(EffortlessLoginTokenResponse effortlessLoginTokenResponse) {
        return this.d.a(effortlessLoginTokenResponse.token()).m(new i(this));
    }

    public void j(Throwable th) {
        this.c.n(new n(LoginState.Type.LOGIN_FAILED, "Failed to login with Samsung Token"));
    }

    public void k(Throwable th) {
        this.c.n(new n(LoginState.Type.LOGIN_FAILED, "Failed to login with One Time Token"));
    }

    public void l(Throwable th) {
        this.c.n(new n(LoginState.Type.LOGIN_FAILED, "Failed to fetch Samsung Token"));
    }

    public d0 m(boolean z, b2e b2e) {
        if (z) {
            return this.d.b(b2e).m(new e(this));
        }
        return this.e.e(b2e.d()).B0().m(new l(this)).s(new h(this));
    }

    public void n(Boolean bool) {
        this.c.n(new n(bool.booleanValue() ? LoginState.Type.LOGGED_IN : LoginState.Type.LOGIN_FAILED, ""));
    }

    public void o(Throwable th) {
        Logger.e(th, "Failed to do effortless login", new Object[0]);
        this.c.n(new n(LoginState.Type.LOGIN_FAILED, ""));
    }

    public void p(boolean z) {
        this.c.n(new n(LoginState.Type.LOGGING_IN, ""));
        this.i.b(this.f.b().L(new g(this)).a0(new f(this, z)).I0(this.h).o0(this.g).subscribe(new j(this), new k(this)));
    }
}
