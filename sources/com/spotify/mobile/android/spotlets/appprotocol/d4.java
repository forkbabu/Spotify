package com.spotify.mobile.android.spotlets.appprotocol;

import com.google.common.collect.ImmutableList;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;
import com.spotify.mobile.android.spotlets.appprotocol.service.k0;
import com.spotify.mobile.android.util.t;
import com.spotify.mobile.android.util.u;
import com.spotify.music.appprotocol.api.model.AppProtocolBase;
import com.spotify.music.appprotocol.api.session.HelloDetailsAppProtocol$HelloDetails;
import com.spotify.music.builtinauth.authenticator.BuiltInAuthException;
import com.spotify.music.builtinauth.authenticator.h0;
import com.spotify.music.builtinauth.model.FieldValidator;
import io.reactivex.disposables.b;
import io.reactivex.internal.disposables.EmptyDisposable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;

public class d4 implements c4 {
    private final w3 a;
    private final t3 b;
    private final k0 c;
    private final a d;
    private final t e;
    private final cqe f;
    private b g = EmptyDisposable.INSTANCE;

    public interface a {
        void a(w3 w3Var);

        void b(w3 w3Var, boolean z);
    }

    public d4(w3 w3Var, t3 t3Var, k0 k0Var, a aVar, t tVar, cqe cqe) {
        this.a = w3Var;
        this.b = t3Var;
        this.c = k0Var;
        this.d = aVar;
        this.e = tVar;
        this.f = cqe;
    }

    public static void a(d4 d4Var, Throwable th) {
        d4Var.getClass();
        String str = "com.spotify.error.client_authentication_failed";
        if (th instanceof BuiltInAuthException) {
            BuiltInAuthException builtInAuthException = (BuiltInAuthException) th;
            int i = IapException.a;
            String a2 = builtInAuthException.a();
            BuiltInAuthException.AuthError b2 = builtInAuthException.b();
            int ordinal = b2.ordinal();
            if (ordinal == 0) {
                str = "com.spotify.error.user_not_authorized";
            } else if (ordinal == 1) {
                str = "com.spotify.error.not_logged_in";
            } else if (ordinal == 2) {
                str = "com.spotify.error.offline_mode_active";
            } else if (!(ordinal == 3 || ordinal == 4)) {
                throw new IllegalStateException("Unknown AuthError: " + b2);
            }
            IapException a3 = IapException.a(a2, str);
            d4Var.b.h((AppProtocol.Message) a3.reason, a3.errorUri);
        } else {
            d4Var.b.h(new AppProtocol.Message(th.toString()), str);
        }
        d4Var.c(false);
    }

    private void c(boolean z) {
        this.d.b(this.a, z);
    }

    /* access modifiers changed from: private */
    public void e() {
        this.a.p(1);
        e4 l = this.a.l();
        int c2 = this.a.c();
        w3 w3Var = this.a;
        l.s0(c2, w3Var, w3Var.b(), this.a.m(), this.a.k(), this.a.i());
        String c3 = this.e.c();
        int indexOf = c3.indexOf(45);
        if (indexOf > 0) {
            c3 = c3.substring(0, indexOf);
        }
        Calendar e2 = this.f.e();
        e2.setTimeZone(TimeZone.getTimeZone("UTC"));
        this.b.f(this.a.c(), new AppProtocol.WelcomeDetails(c3, u.a(e2)));
        this.c.e(this.a);
        c(true);
    }

    public void d(String str) {
        try {
            this.a.n().d(str, "signature");
            e();
        } catch (FieldValidator.ValidationException e2) {
            this.b.h(AppProtocol.Message.fromValidationException(e2), "wamp.error");
        }
    }

    public void f(String str) {
        this.a.r(str);
        this.g.dispose();
        this.d.a(this.a);
        this.c.d(this.a);
    }

    public void g(String str, HelloDetailsAppProtocol$HelloDetails helloDetailsAppProtocol$HelloDetails) {
        boolean z;
        com.spotify.music.builtinauth.model.a aVar;
        try {
            this.a.n().g(str, helloDetailsAppProtocol$HelloDetails);
            if (this.a.o()) {
                this.a.n().h(helloDetailsAppProtocol$HelloDetails);
            }
            com.spotify.mobile.android.spotlets.appprotocol.model.b n = this.a.n();
            List<String> list = helloDetailsAppProtocol$HelloDetails.info.requiredFeatures;
            ImmutableList<String> immutableList = h4.a;
            n.getClass();
            boolean z2 = true;
            if (list == null) {
                z = true;
            } else {
                z = immutableList.containsAll(list);
            }
            if (!z) {
                this.b.h(new AppProtocol.Message("Feature mismatch"), "com.spotify.error.unsupported_version");
                c(false);
                return;
            }
            this.a.f(helloDetailsAppProtocol$HelloDetails);
            String[] strArr = helloDetailsAppProtocol$HelloDetails.authmethods;
            if (!(strArr == null || strArr.length == 0)) {
                z2 = false;
            }
            if (!z2) {
                h0 h0Var = this.a.h().get(helloDetailsAppProtocol$HelloDetails.authmethods[0]);
                if (h0Var == null) {
                    this.b.h(new AppProtocol.Message("Unsupported authentication method"), "wamp.error");
                    c(false);
                } else {
                    if (this.a.j().isPresent()) {
                        aVar = com.spotify.music.builtinauth.model.a.b(helloDetailsAppProtocol$HelloDetails.authid, helloDetailsAppProtocol$HelloDetails.extras, Arrays.asList(helloDetailsAppProtocol$HelloDetails.authmethods), this.a.j().get());
                    } else {
                        aVar = com.spotify.music.builtinauth.model.a.a(helloDetailsAppProtocol$HelloDetails.authid, helloDetailsAppProtocol$HelloDetails.extras, Arrays.asList(helloDetailsAppProtocol$HelloDetails.authmethods));
                    }
                    try {
                        h0Var.a(aVar);
                        this.g = h0Var.b(aVar).subscribe(new x0(this), new w0(this));
                    } catch (FieldValidator.ValidationException e2) {
                        Logger.d(e2.getMessage(), new Object[0]);
                        this.b.h(AppProtocol.Message.fromValidationException(e2), "wamp.error.invalid_argument");
                        c(false);
                    }
                }
            } else {
                e();
            }
            this.c.e(this.a);
        } catch (FieldValidator.ValidationException e3) {
            Logger.d(e3.getMessage(), new Object[0]);
            this.b.h(AppProtocol.Message.fromValidationException(e3), "wamp.error.invalid_argument");
            c(false);
        }
    }

    public void h(df2 df2) {
        this.a.g();
        try {
            int v0 = this.a.l().v0(df2.g(), df2.h());
            this.c.e(this.a);
            this.b.c(df2.g(), v0);
            try {
                this.a.l().b0(df2, v0);
            } catch (FieldValidator.ValidationException unused) {
            }
        } catch (FieldValidator.ValidationException e2) {
            this.b.b(32, df2.g(), AppProtocol.Message.fromValidationException(e2), "wamp.error.invalid_argument");
        }
    }

    public void i(int i, int i2) {
        this.a.g();
        try {
            if (this.a.l().y0(i, i2)) {
                this.c.e(this.a);
                this.b.d(i);
                return;
            }
            this.b.b(34, i, AppProtocolBase.a, "wamp.error.no_such_subscription");
        } catch (FieldValidator.ValidationException e2) {
            this.b.b(34, i, AppProtocol.Message.fromValidationException(e2), "wamp.error.invalid_argument");
        }
    }
}
