package com.spotify.music.features.phonenumbersignup.datasource;

import android.os.Bundle;
import com.spotify.libs.otp.session.d;
import com.spotify.libs.otp.ui.m0;
import com.spotify.login.r0;
import com.spotify.login.x0;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobile.android.util.ui.m;
import com.spotify.music.features.phonenumbersignup.c;
import com.spotify.music.features.phonenumbersignup.f;
import io.reactivex.a;
import io.reactivex.z;

public class AuthenticatorDataSource extends m implements d {
    private final k a;
    private final r0 b;
    private String c;

    public static class SessionError extends RuntimeException {
        private static final long serialVersionUID = 1;
        private final int mStatus;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionError(int i, String str) {
            super(str == null ? "" : str);
            this.mStatus = i;
        }

        public int a() {
            return this.mStatus;
        }
    }

    public AuthenticatorDataSource(k kVar, r0 r0Var) {
        kVar.getClass();
        this.a = kVar;
        r0Var.getClass();
        this.b = r0Var;
        kVar.y0(this);
    }

    public static d.a E2(AuthenticatorDataSource authenticatorDataSource, x0 x0Var) {
        authenticatorDataSource.getClass();
        if (x0Var instanceof x0.a) {
            x0.a aVar = (x0.a) x0Var;
            authenticatorDataSource.c = aVar.b();
            return new d.a(aVar.a(), (int) aVar.c(), (int) aVar.d());
        } else if (x0Var instanceof x0.c) {
            authenticatorDataSource.c = null;
            x0.c cVar = (x0.c) x0Var;
            throw new SessionError(cVar.b(), cVar.a());
        } else {
            authenticatorDataSource.c = null;
            throw new IllegalStateException("unexpected response");
        }
    }

    public m0 F2(x0 x0Var) {
        if (x0Var instanceof x0.d) {
            this.c = null;
            return m0.b(f.a());
        } else if (x0Var instanceof x0.c) {
            this.c = null;
            x0.c cVar = (x0.c) x0Var;
            throw new SessionError(cVar.b(), cVar.a());
        } else if (x0Var instanceof x0.b) {
            this.c = null;
            return m0.b(f.c(((x0.b) x0Var).a()));
        } else if (x0Var instanceof x0.a) {
            this.c = ((x0.a) x0Var).b();
            return m0.a();
        } else {
            throw new AssertionError("should never happend");
        }
    }

    @Override // com.spotify.music.features.phonenumbersignup.datasource.d
    public boolean I0(Throwable th) {
        return (th instanceof SessionError) && ((SessionError) th).a() == 16;
    }

    @Override // com.spotify.music.features.phonenumbersignup.datasource.d
    public boolean J(Throwable th) {
        return th instanceof SessionError;
    }

    /* Return type fixed from 'io.reactivex.z' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.os.Parcelable, java.lang.String] */
    @Override // com.spotify.libs.otp.ui.l0.a
    public z<m0<f>> J0(c cVar, String str) {
        String str2 = this.c;
        str2.getClass();
        this.c = null;
        return this.b.c(str2, str).A(new b(this));
    }

    @Override // com.spotify.libs.otp.session.d.b
    public z<d.a> S0() {
        String str = this.c;
        str.getClass();
        this.c = null;
        return this.b.resendCode(str).A(new a(this));
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.libs.otp.session.d.b
    public z W(c cVar) {
        c cVar2 = cVar;
        this.c = null;
        return this.b.e(cVar2.a().a() + cVar2.c()).A(new a(this));
    }

    @Override // com.spotify.music.features.phonenumbersignup.datasource.d
    public boolean Z0(Throwable th) {
        return (th instanceof SessionError) && ((SessionError) th).a() == 10;
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void b1(Bundle bundle) {
        this.c = bundle == null ? null : bundle.getString("challenge-id");
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void c(Bundle bundle) {
        bundle.putString("challenge-id", this.c);
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void d(Bundle bundle) {
        this.c = bundle == null ? null : bundle.getString("challenge-id");
    }

    @Override // com.spotify.mobile.android.util.ui.m, com.spotify.mobile.android.util.ui.l
    public void onDestroy() {
        this.a.e1(this);
    }

    @Override // com.spotify.music.features.phonenumbersignup.datasource.d
    public boolean s2(Throwable th) {
        return (th instanceof SessionError) && ((SessionError) th).a() == 11;
    }

    @Override // com.spotify.libs.otp.session.d.b
    public a w() {
        return this.b.w();
    }

    @Override // com.spotify.music.features.phonenumbersignup.datasource.d
    public boolean z1(Throwable th) {
        return (th instanceof SessionError) && ((SessionError) th).a() == 7;
    }
}
