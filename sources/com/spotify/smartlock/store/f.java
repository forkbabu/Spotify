package com.spotify.smartlock.store;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.view.WindowManager;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.a;
import com.google.android.gms.auth.api.credentials.b;
import com.google.android.gms.auth.api.credentials.g;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import com.google.android.gms.common.internal.n;
import com.google.common.base.MoreObjects;
import com.spotify.base.java.logging.Logger;
import com.spotify.glue.dialogs.m;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.smartlock.store.SmartlockProviderCallback;

public class f {
    private final Activity a;
    private final j b;
    private final d c;
    com.google.android.gms.auth.api.credentials.f d;
    private SmartlockProviderCallback e;

    public f(Activity activity, d dVar, j jVar) {
        this.a = activity;
        this.c = dVar;
        this.b = jVar;
        int c2 = dVar.c(activity, e.a);
        jVar.c(c2);
        if (c2 == 0) {
            g.a aVar = new g.a();
            aVar.d();
            this.d = com.google.android.gms.auth.api.credentials.d.a(activity, aVar.b());
        }
    }

    public static boolean c(int i) {
        return i == 1003 || i == 1001 || i == 1002;
    }

    private void k(SmartlockProviderCallback smartlockProviderCallback, Credential credential, boolean z) {
        boolean z2 = false;
        if (credential != null && !MoreObjects.isNullOrEmpty(credential.Q1()) && ((MoreObjects.isNullOrEmpty(credential.I1()) && !MoreObjects.isNullOrEmpty(credential.o2())) || "https://www.facebook.com".equals(credential.I1()))) {
            z2 = true;
        }
        if (z2) {
            this.b.q();
            smartlockProviderCallback.f(credential, z ? SmartlockProviderCallback.CredentialType.REQUIRED_RESOLUTION : SmartlockProviderCallback.CredentialType.SINGLE);
            return;
        }
        this.b.d();
        smartlockProviderCallback.e();
        if (credential != null) {
            a(credential);
        }
    }

    public void a(Credential credential) {
        com.google.android.gms.auth.api.credentials.f fVar = this.d;
        if (fVar != null) {
            fVar.getClass();
            n.b(((ws) oq.g).a(fVar.c(), credential)).b(new b(this));
        }
    }

    public boolean b(SmartlockProviderCallback smartlockProviderCallback) {
        if (this.d == null) {
            return false;
        }
        HintRequest.a aVar = new HintRequest.a();
        CredentialPickerConfig.a aVar2 = new CredentialPickerConfig.a();
        aVar2.b(true);
        aVar.c(aVar2.a());
        aVar.b(true);
        HintRequest a2 = aVar.a();
        try {
            this.e = smartlockProviderCallback;
            this.b.e();
            this.a.startIntentSenderForResult(this.d.u(a2).getIntentSender(), ContentMediaFormat.FULL_CONTENT_MOVIE, null, 0, 0, 0);
            return true;
        } catch (ActivityNotFoundException | IntentSender.SendIntentException e2) {
            this.b.k();
            Assertion.i("Could not start email picker Intent", e2);
            return false;
        }
    }

    public /* synthetic */ void d(com.google.android.gms.tasks.g gVar) {
        if (gVar.r()) {
            this.b.h();
        } else {
            this.b.i();
        }
    }

    public void e(SmartlockProviderCallback smartlockProviderCallback, boolean z, com.google.android.gms.tasks.g gVar) {
        if (gVar.r()) {
            b bVar = (b) gVar.n();
            k(smartlockProviderCallback, bVar != null ? bVar.c() : null, false);
            return;
        }
        Exception m = gVar.m();
        if (!(m instanceof ResolvableApiException)) {
            smartlockProviderCallback.e();
            this.b.u();
        } else if (!z) {
            Logger.e(m, "Smartlock - failed to retrieve credentials", new Object[0]);
            this.b.f();
            smartlockProviderCallback.e();
        } else {
            ResolvableApiException resolvableApiException = (ResolvableApiException) m;
            if (resolvableApiException.b() == 6) {
                try {
                    this.e = smartlockProviderCallback;
                    resolvableApiException.c(this.a, ContentMediaFormat.FULL_CONTENT_GENERIC);
                    this.b.a();
                } catch (IntentSender.SendIntentException e2) {
                    this.b.u();
                    smartlockProviderCallback.e();
                    Assertion.w("Failed to start smartlock save credentials resolution", e2);
                }
            } else if (resolvableApiException.b() == 4) {
                this.b.l();
                smartlockProviderCallback.e();
            } else {
                StringBuilder V0 = je.V0("Unhandled smartlock resolution: ");
                V0.append(resolvableApiException.b());
                Assertion.w(V0.toString(), m);
                this.b.u();
                smartlockProviderCallback.e();
            }
        }
    }

    public /* synthetic */ void f(ResolvableApiException resolvableApiException, SmartlockProviderCallback smartlockProviderCallback, DialogInterface dialogInterface, int i) {
        this.b.g();
        try {
            resolvableApiException.c(this.a, ContentMediaFormat.FULL_CONTENT_EPISODE);
            this.b.s();
        } catch (IntentSender.SendIntentException e2) {
            this.b.t();
            smartlockProviderCallback.c();
            Assertion.w("Failed to start smartlock save credentials resolution", e2);
        }
    }

    public void g(String[] strArr, SmartlockProviderCallback smartlockProviderCallback, boolean z, com.google.android.gms.tasks.g gVar) {
        if (gVar.r()) {
            a.C0090a aVar = new a.C0090a();
            aVar.b(strArr);
            aVar.c(true);
            a a2 = aVar.a();
            com.google.android.gms.auth.api.credentials.f fVar = this.d;
            fVar.getClass();
            n.a(((ws) oq.g).c(fVar.c(), a2), new b()).b(new d(this, smartlockProviderCallback, z));
            return;
        }
        this.b.b();
        smartlockProviderCallback.e();
    }

    public void h(SmartlockProviderCallback smartlockProviderCallback, String str, com.google.android.gms.tasks.g gVar) {
        com.spotify.glue.dialogs.f fVar;
        if (gVar.r()) {
            smartlockProviderCallback.c();
            this.b.n();
            return;
        }
        Exception m = gVar.m();
        if (m instanceof ResolvableApiException) {
            ResolvableApiException resolvableApiException = (ResolvableApiException) m;
            this.e = smartlockProviderCallback;
            if (resolvableApiException.b() == 6) {
                try {
                    if (!this.a.isFinishing()) {
                        if ("https://www.facebook.com".equals(str)) {
                            Activity activity = this.a;
                            fVar = m.c(activity, activity.getString(C0707R.string.smartlock_nudge_heading_facebook), this.a.getString(C0707R.string.smartlock_nudge_body_facebook));
                        } else {
                            Activity activity2 = this.a;
                            fVar = m.c(activity2, activity2.getString(C0707R.string.smartlock_nudge_heading_spotify), this.a.getString(C0707R.string.smartlock_nudge_body_spotify));
                        }
                        this.b.m();
                        fVar.a(false);
                        fVar.f(this.a.getString(C0707R.string.smartlock_nudge_cta), new e(this, resolvableApiException, smartlockProviderCallback));
                        fVar.b().a();
                    }
                } catch (WindowManager.BadTokenException e2) {
                    Assertion.w("Failed to show smartlock nudge dialog as Activity is dead", e2);
                }
            } else {
                try {
                    resolvableApiException.c(this.a, ContentMediaFormat.FULL_CONTENT_EPISODE);
                    this.b.s();
                } catch (IntentSender.SendIntentException e3) {
                    this.b.t();
                    smartlockProviderCallback.c();
                    Assertion.w("Failed to start smartlock save credentials resolution", e3);
                }
            }
        } else {
            smartlockProviderCallback.c();
            this.b.t();
        }
    }

    public void i(int i, int i2, Intent intent) {
        SmartlockProviderCallback smartlockProviderCallback = this.e;
        if (smartlockProviderCallback != null) {
            switch (i) {
                case ContentMediaFormat.FULL_CONTENT_GENERIC /* 1001 */:
                    if (i2 == -1) {
                        k(smartlockProviderCallback, (Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential"), true);
                        return;
                    }
                    this.b.u();
                    this.e.e();
                    return;
                case ContentMediaFormat.FULL_CONTENT_EPISODE /* 1002 */:
                    if (i2 == -1) {
                        this.b.r();
                    } else {
                        this.b.p();
                    }
                    this.e.c();
                    return;
                case ContentMediaFormat.FULL_CONTENT_MOVIE /* 1003 */:
                    if (i2 == -1) {
                        smartlockProviderCallback.f((Credential) intent.getParcelableExtra("com.google.android.gms.credentials.Credential"), SmartlockProviderCallback.CredentialType.EMAIL_HINT);
                        this.b.o();
                        return;
                    }
                    smartlockProviderCallback.e();
                    this.b.k();
                    return;
                default:
                    Assertion.v("Unknown requestCode: " + i);
                    return;
            }
        }
    }

    public void j(SmartlockProviderCallback smartlockProviderCallback, boolean z, String... strArr) {
        com.google.android.gms.auth.api.credentials.f fVar = this.d;
        if (fVar == null) {
            smartlockProviderCallback.e();
        } else {
            this.c.d(fVar, new com.google.android.gms.common.api.b[0]).b(new c(this, strArr, smartlockProviderCallback, z));
        }
    }

    public void l(String str, String str2, String str3, SmartlockProviderCallback smartlockProviderCallback) {
        Credential credential;
        if (this.d == null) {
            smartlockProviderCallback.c();
            return;
        }
        Credential.a aVar = new Credential.a(str);
        if ("".equalsIgnoreCase(str3)) {
            aVar.c(str2);
            credential = aVar.a();
        } else {
            aVar.b(str3);
            credential = aVar.a();
        }
        com.google.android.gms.auth.api.credentials.f fVar = this.d;
        fVar.getClass();
        n.b(((ws) oq.g).d(fVar.c(), credential)).b(new a(this, smartlockProviderCallback, str3));
    }

    public void m(SmartlockProviderCallback smartlockProviderCallback) {
        this.e = smartlockProviderCallback;
    }
}
