package com.spotify.facebook.authentication.login;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.facebook.FacebookException;
import com.facebook.login.q;
import com.google.android.gms.auth.api.credentials.Credential;
import com.spotify.facebook.authentication.tracker.FacebookTracker;
import com.spotify.login.r0;
import com.spotify.login.w0;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.a;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.music.spotlets.offline.util.c;
import com.spotify.rxjava2.p;
import com.spotify.smartlock.store.SmartlockProviderCallback;
import com.spotify.smartlock.store.f;
import com.spotify.smartlock.store.j;
import defpackage.je0;
import defpackage.yl0;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.y;
import java.util.Locale;
import org.json.JSONObject;

public class FacebookSSOPresenter implements m, SmartlockProviderCallback, m {
    private final zl0 a;
    private final y b;
    private final r0 c;
    private final c f;
    private final q n;
    private final f o;
    private final boolean p;
    private b q = EmptyDisposable.INSTANCE;
    private final p r = new p();
    private final j s;
    private final FacebookTracker t;
    private n u;
    a v;

    public FacebookSSOPresenter(c cVar, zl0 zl0, y yVar, r0 r0Var, Lifecycle lifecycle, q qVar, f fVar, j jVar, FacebookTracker facebookTracker, boolean z) {
        this.a = zl0;
        this.b = yVar;
        this.c = r0Var;
        this.f = cVar;
        this.n = qVar;
        this.o = fVar;
        this.s = jVar;
        this.t = facebookTracker;
        this.p = z;
        lifecycle.a(this);
    }

    @Override // com.facebook.i
    public void a(FacebookException facebookException) {
        this.t.h(FacebookTracker.Screen.FACEBOOK_LOGIN, String.format(Locale.US, "A Facebook exception of type %s occurred ", facebookException.getClass().getSimpleName()));
        Assertion.w("A Facebook exception occurred while trying to authenticate: %s", facebookException);
        if ("net::ERR_INTERNET_DISCONNECTED".equals(facebookException.getMessage())) {
            l(31);
        } else {
            l(0);
        }
    }

    @Override // com.facebook.i
    public void b() {
        ((FacebookSSOFragment) this.u).M4();
    }

    @Override // com.spotify.smartlock.store.SmartlockProviderCallback
    public void c() {
        ((FacebookSSOFragment) this.u).m0.b(Destination.d.a);
    }

    @Override // com.spotify.facebook.authentication.login.m
    public void d(n nVar) {
        this.u = nVar;
    }

    @Override // com.spotify.smartlock.store.SmartlockProviderCallback
    public void e() {
    }

    @Override // com.spotify.smartlock.store.SmartlockProviderCallback
    public void f(Credential credential, SmartlockProviderCallback.CredentialType credentialType) {
    }

    public void g(w0.b bVar) {
        this.t.d(FacebookTracker.Screen.FACEBOOK_LOGIN);
        this.s.j(je0.o.b);
        f fVar = this.o;
        String name = this.v.getName();
        name.getClass();
        fVar.l(name, null, "https://www.facebook.com", this);
    }

    public /* synthetic */ void h(DialogInterface dialogInterface, int i) {
        ((FacebookSSOFragment) this.u).M4();
    }

    public /* synthetic */ void i(DialogInterface dialogInterface, int i) {
        this.f.b(false);
    }

    public void j(yl0 yl0) {
        if (yl0 instanceof yl0.b) {
            ((FacebookSSOFragment) this.u).O4();
        } else if (yl0 instanceof yl0.c) {
            JSONObject a2 = ((yl0.c) yl0).a();
            String optString = a2.optString("id");
            String optString2 = a2.optString("first_name");
            String optString3 = a2.optString("name");
            String optString4 = a2.optString("email");
            this.n.getClass();
            String n2 = com.facebook.a.e().n();
            n2.getClass();
            a aVar = new a(optString, n2, optString2, optString3, optString4);
            this.v = aVar;
            this.r.b(this.c.a(aVar.e(), this.v.a(), false).B(this.b).subscribe(new f(this)));
        } else if (yl0 instanceof yl0.a) {
            Assertion.v(String.format("Failed to get facebook me : %s", ((yl0.a) yl0).a()));
            ((FacebookSSOFragment) this.u).N4();
            this.t.h(FacebookTracker.Screen.FACEBOOK_LOGIN, null);
        }
    }

    public /* synthetic */ void k(Throwable th) {
        Assertion.w("Failed to get facebook me", th);
        ((FacebookSSOFragment) this.u).N4();
        this.t.h(FacebookTracker.Screen.FACEBOOK_LOGIN, null);
    }

    public void l(int i) {
        FacebookTracker.Screen screen = FacebookTracker.Screen.FACEBOOK_LOGIN;
        ((FacebookSSOFragment) this.u).K4();
        if (39 == i) {
            this.t.g(screen, String.format(Locale.US, "Error code %d", Integer.valueOf(i)));
            n nVar = this.u;
            l lVar = new l(this);
            g gVar = new g(this);
            FacebookSSOFragment facebookSSOFragment = (FacebookSSOFragment) nVar;
            com.spotify.glue.dialogs.f c2 = facebookSSOFragment.h0.c(facebookSSOFragment.V2(C0707R.string.disable_offline_mode_dialog_title), facebookSSOFragment.V2(C0707R.string.disable_offline_mode_dialog_body));
            c2.e(facebookSSOFragment.V2(C0707R.string.disable_offline_mode_dialog_button_cancel), lVar);
            c2.f(facebookSSOFragment.V2(C0707R.string.disable_offline_mode_dialog_button_connect), gVar);
            c2.b().a();
            return;
        }
        boolean z = i == 23 || i == 4;
        a aVar = this.v;
        if (!(z && (aVar != null))) {
            if (i == 31) {
                FacebookSSOFragment facebookSSOFragment2 = (FacebookSSOFragment) this.u;
                if (facebookSSOFragment2.B2() != null && facebookSSOFragment2.e3()) {
                    facebookSSOFragment2.k0.k(new c(facebookSSOFragment2), je0.o.b);
                }
                this.t.a(screen, String.format(Locale.US, "Error code %d", Integer.valueOf(i)));
            }
            if (i == 17) {
                FacebookSSOFragment facebookSSOFragment3 = (FacebookSSOFragment) this.u;
                if (facebookSSOFragment3.B2() != null && facebookSSOFragment3.e3()) {
                    com.spotify.glue.dialogs.f b2 = facebookSSOFragment3.h0.b(facebookSSOFragment3.V2(C0707R.string.login_error_login_abroad_restriction));
                    b2.f(facebookSSOFragment3.V2(17039370), new e(facebookSSOFragment3));
                    b2.h(new a(facebookSSOFragment3));
                    b2.b().a();
                }
                this.t.f(screen);
                return;
            }
            ((FacebookSSOFragment) this.u).N4();
            this.t.h(screen, String.format(Locale.US, "Error code %d", Integer.valueOf(i)));
        } else if (this.p) {
            FacebookSSOFragment facebookSSOFragment4 = (FacebookSSOFragment) this.u;
            Bundle D2 = facebookSSOFragment4.D2();
            if (D2 == null) {
                D2 = new Bundle();
            }
            D2.putBoolean("popOnReturn", true);
            facebookSSOFragment4.r4(D2);
            if (facebookSSOFragment4.n0) {
                facebookSSOFragment4.m0.a(45500, new Destination.h.b(aVar), new com.spotify.loginflow.navigation.b(null));
            } else {
                facebookSSOFragment4.m0.c(new Destination.b(aVar), new com.spotify.loginflow.navigation.b(null));
            }
        } else {
            FacebookSSOFragment facebookSSOFragment5 = (FacebookSSOFragment) this.u;
            facebookSSOFragment5.k0.e(new d(facebookSSOFragment5));
        }
    }

    public void m() {
        this.q.dispose();
        this.q = this.a.c().o0(this.b).subscribe(new j(this), new h(this));
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_STOP)
    public void onStop() {
        this.q.dispose();
        this.r.a();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.facebook.i
    public /* bridge */ /* synthetic */ void onSuccess(q qVar) {
        m();
    }
}
