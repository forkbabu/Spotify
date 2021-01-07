package com.spotify.googleauth.presenter;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.g;
import com.spotify.googleauth.GoogleLoginFragment;
import com.spotify.libs.pse.model.e;
import com.spotify.login.AuthenticationMetadata;
import com.spotify.login.r0;
import com.spotify.login.u0;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.d;
import com.spotify.rxjava2.p;
import defpackage.ce0;
import defpackage.he0;
import defpackage.ie0;
import defpackage.om0;
import io.reactivex.y;
import kotlin.jvm.internal.h;

public final class GoogleLoginPresenter implements om0.a {
    private final p a = new p();
    private final y b;
    private final om0 c;
    private final r0 f;
    private final ae0 n;

    public GoogleLoginPresenter(y yVar, om0 om0, r0 r0Var, ae0 ae0) {
        h.e(yVar, "mainThread");
        h.e(om0, "viewBinder");
        h.e(r0Var, "authenticator");
        h.e(ae0, "authTracker");
        this.b = yVar;
        this.c = om0;
        this.f = r0Var;
        this.n = ae0;
    }

    public static final void a(GoogleLoginPresenter googleLoginPresenter, GoogleSignInAccount googleSignInAccount, u0 u0Var) {
        googleLoginPresenter.getClass();
        if (u0Var instanceof u0.c) {
            d dVar = ((GoogleLoginFragment) googleLoginPresenter.c).w0;
            if (dVar != null) {
                dVar.b(Destination.d.a);
                ((GoogleLoginFragment) googleLoginPresenter.c).d5();
                return;
            }
            h.k("mZeroNavigator");
            throw null;
        } else if (u0Var instanceof u0.a) {
            u0.a aVar = (u0.a) u0Var;
            ((GoogleLoginFragment) googleLoginPresenter.c).d5();
            if (aVar.a()) {
                ((GoogleLoginFragment) googleLoginPresenter.c).e5(googleSignInAccount);
                return;
            }
            om0 om0 = googleLoginPresenter.c;
            String b2 = aVar.b();
            GoogleLoginFragment googleLoginFragment = (GoogleLoginFragment) om0;
            googleLoginFragment.getClass();
            h.e(googleSignInAccount, "googleAccount");
            h.e(b2, "identifierToken");
            googleLoginFragment.M4();
            e eVar = googleLoginFragment.x0;
            if (eVar == null) {
                h.k("psesConfiguration");
                throw null;
            } else if (eVar.g()) {
                d dVar2 = googleLoginFragment.w0;
                if (dVar2 != null) {
                    dVar2.d(45500, new Destination.h.c(b2, googleSignInAccount.I1(), AuthenticationMetadata.AuthSource.GOOGLE));
                } else {
                    h.k("mZeroNavigator");
                    throw null;
                }
            } else {
                googleLoginFragment.g5();
            }
        } else if (u0Var instanceof u0.b) {
            googleLoginPresenter.d();
        } else {
            throw new IllegalArgumentException("Response type not supported");
        }
    }

    /* access modifiers changed from: private */
    public final void d() {
        ((GoogleLoginFragment) this.c).d5();
        ((GoogleLoginFragment) this.c).f5();
    }

    public void c(g<GoogleSignInAccount> gVar, je0 je0) {
        h.e(gVar, "task");
        h.e(je0, "trackedScreen");
        try {
            GoogleSignInAccount o = gVar.o(ApiException.class);
            if (o == null) {
                ((GoogleLoginFragment) this.c).d5();
                ((GoogleLoginFragment) this.c).f5();
            } else if (o.I1() == null) {
                ((GoogleLoginFragment) this.c).d5();
                ((GoogleLoginFragment) this.c).g5();
                this.n.a(new ce0.f(je0, he0.r.b, ie0.e.b, null));
            } else {
                String o2 = o.o2();
                if (o2 != null) {
                    this.a.b(this.f.f(o2, false).B(this.b).subscribe(new a(this, o), new b(this, o)));
                } else {
                    d();
                }
            }
        } catch (ApiException e) {
            ((GoogleLoginFragment) this.c).d5();
            ((GoogleLoginFragment) this.c).f5();
            this.n.a(new ce0.f(je0, he0.q.b, ie0.e.b, String.valueOf(e.b())));
        }
    }

    public void onPause() {
        this.a.a();
    }
}
