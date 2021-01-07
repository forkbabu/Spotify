package com.spotify.music.features.login.presenter;

import android.content.DialogInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.login.AuthenticationMetadata;
import com.spotify.login.r0;
import com.spotify.login.w0;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.d;
import com.spotify.music.C0707R;
import com.spotify.music.features.login.LoginFragment;
import com.spotify.smartlock.store.SmartlockProviderCallback;
import com.spotify.smartlock.store.f;
import com.spotify.smartlock.store.j;
import defpackage.ce0;
import defpackage.fe0;
import defpackage.ge0;
import defpackage.he0;
import defpackage.ie0;
import defpackage.je0;
import defpackage.tn5;
import io.reactivex.b0;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.s;
import io.reactivex.y;
import java.util.HashSet;
import java.util.Set;

public class LoginPresenter implements tn5.a, SmartlockProviderCallback, m {
    private final xd0 A;
    private boolean B;
    private final io.reactivex.disposables.a C = new io.reactivex.disposables.a();
    private final tn5 a;
    private final d b;
    private final ae0 c;
    private final y f;
    private final y n;
    private final f o;
    private final io.reactivex.disposables.a p = new io.reactivex.disposables.a();
    private final j q;
    private final r0 r;
    private final com.spotify.login.settings.d s;
    private final f11 t;
    private io.reactivex.disposables.b u = EmptyDisposable.INSTANCE;
    private final Set<ie0> v = new HashSet();
    private int w;
    private Credential x;
    private s<CharSequence> y;
    private s<CharSequence> z;

    /* access modifiers changed from: package-private */
    public class a implements b0<w0> {
        final /* synthetic */ String a;

        a(String str) {
            this.a = str;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            Logger.e(th, "Could not login", new Object[0]);
            LoginPresenter.this.A("Coult not login, request failed");
        }

        @Override // io.reactivex.b0
        public void onSubscribe(io.reactivex.disposables.b bVar) {
            LoginPresenter.this.u.dispose();
            LoginPresenter.this.u = bVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.b0
        public void onSuccess(w0 w0Var) {
            w0Var.b(new c(this), new b(this, this.a));
        }
    }

    /* access modifiers changed from: private */
    public interface b {
    }

    public LoginPresenter(tn5 tn5, d dVar, ae0 ae0, y yVar, y yVar2, f fVar, j jVar, Lifecycle lifecycle, r0 r0Var, f11 f11, xd0 xd0, com.spotify.login.settings.d dVar2) {
        this.a = tn5;
        this.b = dVar;
        this.c = ae0;
        this.f = yVar;
        this.n = yVar2;
        this.o = fVar;
        this.q = jVar;
        this.r = r0Var;
        this.t = f11;
        this.A = xd0;
        this.s = dVar2;
        lifecycle.a(this);
    }

    private io.reactivex.disposables.b C(s<CharSequence> sVar, ie0 ie0) {
        return sVar.C0(1).o0(this.f).subscribe(new i(this, ie0));
    }

    static void a(LoginPresenter loginPresenter) {
        LoginFragment loginFragment = (LoginFragment) loginPresenter.a;
        loginFragment.U4(loginFragment.L4(), new h(loginPresenter));
    }

    /* access modifiers changed from: private */
    public void v(String str, String str2, boolean z2) {
        ((LoginFragment) this.a).O4(C0707R.string.login_spotify_button_logging_in);
        ((LoginFragment) this.a).N4(false);
        ((LoginFragment) this.a).K4();
        this.r.h(str, str2, false, z2, AuthenticationMetadata.AuthSource.EMAIL).B(this.n).subscribe(new a(str));
    }

    public void A(String str) {
        ((LoginFragment) this.a).P4(C0707R.string.login_error_unknown_error);
        this.c.a(new ce0.f(je0.g.b, he0.g.b, ie0.f.b, str));
    }

    public void B(s<CharSequence> sVar, s<CharSequence> sVar2, boolean z2) {
        this.y = sVar;
        this.z = sVar2;
        ((LoginFragment) this.a).N4(false);
        this.q.j(je0.g.b);
        if (z2) {
            this.o.j(this, true, "");
        }
    }

    @Override // com.spotify.smartlock.store.SmartlockProviderCallback
    public void c() {
        this.b.b(Destination.d.a);
    }

    @Override // com.spotify.smartlock.store.SmartlockProviderCallback
    public void e() {
    }

    @Override // com.spotify.smartlock.store.SmartlockProviderCallback
    public void f(Credential credential, SmartlockProviderCallback.CredentialType credentialType) {
        this.x = credential;
        String Q1 = credential.Q1();
        String nullToEmpty = MoreObjects.nullToEmpty(this.x.o2());
        ((LoginFragment) this.a).R4(Q1.trim());
        ((LoginFragment) this.a).Q4(nullToEmpty);
        v(Q1, nullToEmpty, false);
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_START)
    public void onStart() {
        this.p.b(C(this.y, ie0.j.b));
        this.p.b(C(this.z, ie0.g.b));
        io.reactivex.disposables.a aVar = this.p;
        s o0 = s.n(this.y, this.z, e.a).o0(this.n);
        tn5 tn5 = this.a;
        tn5.getClass();
        aVar.b(o0.subscribe(new a(tn5), new f(this)));
        this.p.b(((com.spotify.login.settings.a) this.s).a().subscribe(new g(this)));
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.u.dispose();
        this.p.f();
        this.v.clear();
        this.C.f();
    }

    public void q(int i, boolean z2) {
        ((LoginFragment) this.a).O4(C0707R.string.button_log_in);
        ((LoginFragment) this.a).N4(true);
        if (i != 1) {
            if (!(i == 2 || i == 3 || i == 11 || i == 19)) {
                if (!(i == 29 || i == 31 || i == 16)) {
                    if (i != 17) {
                        switch (i) {
                            case 37:
                                break;
                            case 38:
                                break;
                            case 39:
                                Logger.b("SpotifyError.AP_NETWORK_DISABLED;", new Object[0]);
                                ((LoginFragment) this.a).P4(C0707R.string.login_error_ap);
                                ((LoginFragment) this.a).S4();
                                return;
                            default:
                                A("LoginErrors: " + i);
                                return;
                        }
                    } else {
                        Logger.b("SpotifyError.LOGIN_REGION_MISMATCH;", new Object[0]);
                        ((LoginFragment) this.a).T4();
                        this.c.a(new ce0.f(je0.g.b, he0.m.b, ie0.f.b, je.p0("LoginErrors: ", i)));
                        return;
                    }
                }
                Logger.b("SpotifyError.AP_PROTOCOL;", new Object[0]);
                Logger.b("SpotifyError.AP_SOCKET;", new Object[0]);
                Logger.b("SpotifyError.DNS;", new Object[0]);
                if (this.B) {
                    ((com.spotify.login.settings.a) this.s).b(false).B(this.n).subscribe(new l(this));
                    return;
                }
                xd0 xd0 = this.A;
                je0.g gVar = je0.g.b;
                xd0.g(gVar);
                this.c.a(new ce0.f(gVar, he0.l.b, ie0.f.b, je.p0("LoginErrors: ", i)));
                return;
            }
            Logger.b("SpotifyError.LOGIN_BAD_CREDENTIALS;", new Object[0]);
            Logger.b("SpotifyError.LOGIN_USERPASS;", new Object[0]);
            ((LoginFragment) this.a).P4(C0707R.string.login_error_message_incorrect_credentials);
            ae0 ae0 = this.c;
            je0.g gVar2 = je0.g.b;
            ae0.a(new ce0.f(gVar2, he0.j.b, ie0.f.b, je.p0("LoginErrors: ", i)));
            if (this.x != null) {
                this.q.j(gVar2);
                this.o.a(this.x);
                this.x = null;
                return;
            }
            return;
        }
        this.c.a(new ce0.f(je0.g.b, he0.k.b, ie0.f.b, je.p0("LoginErrors: ", i)));
        x(((LoginFragment) this.a).L4(), ((LoginFragment) this.a).M4());
    }

    public /* synthetic */ void r(Boolean bool) {
        this.B = bool.booleanValue();
    }

    public void s(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            this.c.a(new ce0.c(je0.g.b, fe0.e.b, ge0.g.b));
            String L4 = ((LoginFragment) this.a).L4();
            ((g11) this.t).b(L4).subscribe(new k(this, L4));
        } else if (i == -2) {
            this.c.a(new ce0.c(je0.g.b, fe0.z.b, ge0.g.b));
        }
    }

    public /* synthetic */ void t(ie0 ie0, CharSequence charSequence) {
        if (charSequence.length() > 0 && !this.v.contains(ie0)) {
            this.v.add(ie0);
            this.c.a(new ce0.h(je0.g.b, ie0));
        }
    }

    public /* synthetic */ void u(Throwable th) {
        Logger.e(th, "Failed to observe the input fields.", new Object[0]);
        ((LoginFragment) this.a).N4(false);
    }

    public void w(int i, String str) {
        d dVar = new d(this, i);
        int i2 = this.w + 1;
        this.w = i2;
        if (i2 < 2) {
            dVar.a(false);
            return;
        }
        this.w = 0;
        if (str == null) {
            dVar.a(false);
            return;
        }
        ((g11) this.t).g(str, new j(this, dVar));
    }

    /* access modifiers changed from: package-private */
    public void x(String str, String str2) {
        ae0 ae0 = this.c;
        je0.g gVar = je0.g.b;
        ae0.a(new ce0.b(gVar));
        if (!MoreObjects.isNullOrEmpty(str) && !MoreObjects.isNullOrEmpty(str2)) {
            this.q.j(gVar);
            this.o.l(str, str2, "", this);
            return;
        }
        this.b.b(Destination.d.a);
    }

    public void y(String str, String str2, boolean z2) {
        this.c.a(new ce0.c(je0.g.b, fe0.l.b, ge0.k.b));
        v(str, str2, z2);
    }

    public void z(String str) {
        this.c.a(new ce0.c(je0.g.b, fe0.s.b, ge0.k.b));
        ((g11) this.t).b(str).subscribe(new k(this, str));
    }
}
