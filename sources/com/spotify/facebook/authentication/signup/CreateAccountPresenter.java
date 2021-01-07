package com.spotify.facebook.authentication.signup;

import android.content.DialogInterface;
import android.widget.Toast;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.android.gms.auth.api.credentials.Credential;
import com.spotify.facebook.authentication.signup.model.Failure;
import com.spotify.facebook.authentication.signup.model.a;
import com.spotify.facebook.authentication.signup.model.b;
import com.spotify.facebook.authentication.tracker.FacebookTracker;
import com.spotify.login.r0;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.d;
import com.spotify.music.C0707R;
import com.spotify.music.connection.n;
import com.spotify.rxjava2.p;
import com.spotify.signup.api.services.model.FacebookSignupRequest;
import com.spotify.signup.api.services.model.SignupConfigurationResponse;
import com.spotify.smartlock.store.SmartlockProviderCallback;
import com.spotify.smartlock.store.f;
import com.spotify.smartlock.store.j;
import com.spotify.termsandconditions.l;
import defpackage.he0;
import defpackage.je0;
import io.reactivex.disposables.b;
import io.reactivex.disposables.c;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.operators.single.SingleCache;
import io.reactivex.s;
import io.reactivex.v;
import io.reactivex.y;
import io.reactivex.z;

public class CreateAccountPresenter implements s, SmartlockProviderCallback, m {
    private b A = c.a();
    private b B = c.a();
    private t C;
    boolean D;
    l.b E = new a();
    private final zl0 a;
    private final iae b;
    private final com.spotify.loginflow.navigation.a c;
    private final l f;
    private final d n;
    private final r0 o;
    private final i31 p;
    private final FacebookTracker q;
    private final y r;
    s<Boolean> s;
    private final j t;
    private final xd0 u;
    private final f v;
    private b w = EmptyDisposable.INSTANCE;
    private final p x = new p();
    z<SignupConfigurationResponse> y;
    private b z = c.a();

    class a implements l.b {
        a() {
        }

        @Override // com.spotify.termsandconditions.l.b
        public void a() {
            CreateAccountPresenter.l(CreateAccountPresenter.this);
        }

        @Override // com.spotify.termsandconditions.l.b
        public void b() {
            CreateAccountPresenter.k(CreateAccountPresenter.this);
        }

        @Override // com.spotify.termsandconditions.l.b
        public void c() {
            CreateAccountPresenter.l(CreateAccountPresenter.this);
        }
    }

    public CreateAccountPresenter(y yVar, iae iae, zl0 zl0, com.spotify.loginflow.navigation.a aVar, l lVar, n nVar, Lifecycle lifecycle, f fVar, j jVar, xd0 xd0, d dVar, r0 r0Var, i31 i31, FacebookTracker facebookTracker) {
        this.r = yVar;
        this.a = zl0;
        this.b = iae;
        z<SignupConfigurationResponse> b2 = iae.b();
        b2.getClass();
        this.y = new SingleCache(b2);
        this.c = aVar;
        this.f = lVar;
        this.s = nVar.b();
        this.t = jVar;
        this.u = xd0;
        this.v = fVar;
        this.n = dVar;
        this.o = r0Var;
        this.p = i31;
        this.q = facebookTracker;
        lifecycle.a(this);
    }

    static void k(CreateAccountPresenter createAccountPresenter) {
        createAccountPresenter.D = true;
        createAccountPresenter.x.b(createAccountPresenter.s.N0(1).W(new m(createAccountPresenter), false, Integer.MAX_VALUE).o0(io.reactivex.android.schedulers.a.b()).subscribe(new p(createAccountPresenter), new n(createAccountPresenter)));
    }

    static void l(CreateAccountPresenter createAccountPresenter) {
        ((CreateAccountFragment) createAccountPresenter.C).K4();
    }

    /* access modifiers changed from: private */
    public void y(boolean z2) {
        ((CreateAccountFragment) this.C).N4(!z2);
        ((CreateAccountFragment) this.C).M4(!z2);
        ((CreateAccountFragment) this.C).P4(z2);
    }

    @Override // com.spotify.facebook.authentication.signup.s
    public void a(t tVar) {
        this.q.c(FacebookTracker.Screen.FACEBOOK_ACCOUNT_CREATION);
        this.C = tVar;
    }

    @Override // com.spotify.facebook.authentication.signup.s
    public void b() {
        this.q.e();
        ((CreateAccountFragment) this.C).K4();
    }

    @Override // com.spotify.smartlock.store.SmartlockProviderCallback
    public void c() {
        this.n.b(new Destination.f(true));
    }

    @Override // com.spotify.facebook.authentication.signup.s
    public void d() {
        this.q.b();
        this.z.dispose();
        this.z = this.s.N0(1).W(new j(this), false, Integer.MAX_VALUE).o0(io.reactivex.android.schedulers.a.b()).subscribe(new h(this), new i(this));
    }

    @Override // com.spotify.smartlock.store.SmartlockProviderCallback
    public void e() {
    }

    @Override // com.spotify.smartlock.store.SmartlockProviderCallback
    public void f(Credential credential, SmartlockProviderCallback.CredentialType credentialType) {
    }

    public /* synthetic */ void m(SignupConfigurationResponse signupConfigurationResponse) {
        ((CreateAccountFragment) this.C).O4(signupConfigurationResponse.requiresMarketingOptInText);
    }

    public /* synthetic */ void o(String str) {
        ((CreateAccountFragment) this.C).L4(str);
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_START)
    public void onStart() {
        this.A.dispose();
        this.A = this.y.B(io.reactivex.android.schedulers.a.b()).subscribe(new f(this));
        if (this.w.d()) {
            this.w = this.a.d().o0(this.r).subscribe(new g(this));
        }
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.B.dispose();
        this.w.dispose();
        this.A.dispose();
        this.z.dispose();
        this.x.a();
    }

    public void q(com.spotify.facebook.authentication.signup.model.b bVar) {
        if (bVar instanceof b.C0155b) {
            y(true);
        } else if (bVar instanceof b.c) {
            SignupConfigurationResponse a2 = ((b.c) bVar).a();
            this.p.a(a2.requiresMarketingOptIn, a2.country.equals("KR"));
            this.f.k(com.spotify.termsandconditions.model.b.c(a2.canImplicitlyAcceptTermsAndCondition, a2.canAcceptLicensesInOneStep, a2.requiresSpecificLicenses), this.E);
        } else if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            if (aVar.a() == Failure.NO_CONNECTION || aVar.a() == Failure.OFFLINE) {
                this.q.a(FacebookTracker.Screen.FACEBOOK_ACCOUNT_CREATION, null);
                this.u.j(je0.m.b);
            } else {
                this.u.l();
            }
            y(false);
        }
    }

    public /* synthetic */ void r(Throwable th) {
        this.u.l();
        y(false);
    }

    public /* synthetic */ v s(Boolean bool) {
        if (!bool.booleanValue()) {
            return s.i0(new a.C0154a(Failure.OFFLINE));
        }
        return this.b.d(FacebookSignupRequest.create(this.c.e(), this.c.a())).P().j0(k.a).G0((R) a.b.a).r0(l.a);
    }

    public void t(com.spotify.facebook.authentication.signup.model.a aVar) {
        if (aVar instanceof a.b) {
            y(true);
        } else if (aVar instanceof a.c) {
            this.o.a(this.c.e(), this.c.a(), true).B(this.r).subscribe(new v(this));
        } else if (aVar instanceof a.C0154a) {
            a.C0154a aVar2 = (a.C0154a) aVar;
            if (aVar2.a() == Failure.OFFLINE || aVar2.a() == Failure.NO_CONNECTION) {
                this.u.j(je0.m.b);
            } else if (aVar2.a() == Failure.EMAIL_ALREADY_EXIST) {
                this.u.b(new o(this), he0.f.b);
            } else {
                CreateAccountFragment createAccountFragment = (CreateAccountFragment) this.C;
                createAccountFragment.n0.f(new c(createAccountFragment));
            }
            y(false);
        }
    }

    public /* synthetic */ void u(Throwable th) {
        this.u.l();
        y(false);
    }

    public /* synthetic */ void v(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.n.b(new Destination.e(this.c.b(), null));
        }
    }

    /* access modifiers changed from: package-private */
    public void w() {
        this.q.d(FacebookTracker.Screen.FACEBOOK_ACCOUNT_CREATION);
        this.t.j(je0.g.b);
        f fVar = this.v;
        String name = this.c.getName();
        name.getClass();
        fVar.l(name, null, "https://www.facebook.com", this);
    }

    public void x(int i) {
        y(false);
        if (this.D) {
            this.q.h(FacebookTracker.Screen.FACEBOOK_ACCOUNT_CREATION, String.valueOf(i));
            int i2 = C0707R.string.signup_confirm_fb_account_error_login_bad_credentials;
            if (!(i == 2 || i == 3)) {
                if (i != 4) {
                    if (!(i == 11 || i == 19)) {
                        if (i != 23) {
                            if (!(i == 29 || i == 31 || i == 16)) {
                                if (i != 17) {
                                    switch (i) {
                                        case 37:
                                            break;
                                        case 38:
                                            break;
                                        case 39:
                                            i2 = C0707R.string.signup_confirm_fb_account_error_ap;
                                            break;
                                        default:
                                            i2 = C0707R.string.signup_confirm_fb_account_error_unknown_error;
                                            break;
                                    }
                                } else {
                                    i2 = C0707R.string.signup_confirm_fb_account_error_login_region_mismatch;
                                }
                            }
                            i2 = C0707R.string.signup_confirm_fb_account_error_connection;
                        }
                    }
                }
                i2 = C0707R.string.signup_confirm_fb_account_error_login_account_no_credentials;
            }
            Toast.makeText(((CreateAccountFragment) this.C).B2(), i2, 1).show();
            ((CreateAccountFragment) this.C).K4();
        }
    }
}
