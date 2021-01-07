package com.spotify.music.emailverify;

import android.content.Intent;
import android.os.IBinder;
import com.spotify.base.java.logging.Logger;
import com.spotify.encore.mobile.snackbar.SnackbarConfiguration;
import com.spotify.encore.mobile.snackbar.SnackbarManager;
import com.spotify.music.C0707R;
import com.spotify.music.email.EmailVerifyResponse;
import com.spotify.music.email.d;
import com.spotify.rxjava2.q;
import dagger.android.g;
import io.reactivex.b0;
import io.reactivex.disposables.b;
import io.reactivex.y;
import io.reactivex.z;
import kotlin.jvm.internal.h;

public final class EmailVerifyDispatcherService extends g {
    public static final /* synthetic */ int o = 0;
    public d a;
    public SnackbarManager b;
    public y c;
    public y f;
    public a n;

    public static final class a implements b0<EmailVerifyResponse> {
        private final q a = new q();
        final /* synthetic */ EmailVerifyDispatcherService b;
        final /* synthetic */ int c;

        a(EmailVerifyDispatcherService emailVerifyDispatcherService, int i) {
            this.b = emailVerifyDispatcherService;
            this.c = i;
        }

        @Override // io.reactivex.b0
        public void onError(Throwable th) {
            h.e(th, "e");
            Logger.d("Error: " + th, new Object[0]);
            a e = this.b.e();
            StringBuilder V0 = je.V0("Verification Email could not be sent: ");
            V0.append(th.getMessage());
            e.a(V0.toString());
            this.a.c();
            this.b.stopSelf(this.c);
        }

        @Override // io.reactivex.b0
        public void onSubscribe(b bVar) {
            h.e(bVar, "d");
            this.a.a(bVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // io.reactivex.b0
        public void onSuccess(EmailVerifyResponse emailVerifyResponse) {
            EmailVerifyResponse emailVerifyResponse2 = emailVerifyResponse;
            h.e(emailVerifyResponse2, "response");
            if (emailVerifyResponse2.getText()) {
                SnackbarConfiguration build = SnackbarConfiguration.builder((int) C0707R.string.verification_email_sent).actionText(null).onClickListener(null).build();
                if (this.b.f().isAttached()) {
                    SnackbarManager f = this.b.f();
                    h.d(build, "configuration");
                    f.show(build);
                } else {
                    this.b.f().showOnNextAttach(build);
                }
                this.b.e().b();
            } else {
                this.b.e().a("Verification Email could not be sent");
            }
            this.a.c();
            this.b.stopSelf(this.c);
        }
    }

    public final a e() {
        a aVar = this.n;
        if (aVar != null) {
            return aVar;
        }
        h.k("logger");
        throw null;
    }

    public final SnackbarManager f() {
        SnackbarManager snackbarManager = this.b;
        if (snackbarManager != null) {
            return snackbarManager;
        }
        h.k("snackbarManager");
        throw null;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        d dVar = this.a;
        if (dVar != null) {
            z<EmailVerifyResponse> a2 = dVar.a();
            y yVar = this.c;
            if (yVar != null) {
                z<EmailVerifyResponse> H = a2.H(yVar);
                y yVar2 = this.f;
                if (yVar2 != null) {
                    H.B(yVar2).subscribe(new a(this, i2));
                    return 2;
                }
                h.k("observeScheduler");
                throw null;
            }
            h.k("subscribeScheduler");
            throw null;
        }
        h.k("endpoint");
        throw null;
    }
}
