package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.c;
import androidx.loader.content.b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import defpackage.c6;

@KeepName
public class SignInHubActivity extends c {
    private static boolean E = false;
    private SignInConfiguration A;
    private boolean B;
    private int C;
    private Intent D;
    private boolean z = false;

    private class a implements c6.a<Void> {
        a(w wVar) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.loader.content.b, java.lang.Object] */
        @Override // defpackage.c6.a
        public final /* synthetic */ void a(b<Void> bVar, Void r3) {
            SignInHubActivity signInHubActivity = SignInHubActivity.this;
            signInHubActivity.setResult(signInHubActivity.C, SignInHubActivity.this.D);
            SignInHubActivity.this.finish();
        }

        @Override // defpackage.c6.a
        public final b<Void> b(int i, Bundle bundle) {
            return new h(SignInHubActivity.this, com.google.android.gms.common.api.c.c());
        }

        @Override // defpackage.c6.a
        public final void c(b<Void> bVar) {
        }
    }

    private final void I0(int i) {
        Status status = new Status(i, (String) null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        E = false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.z) {
            setResult(0);
            if (i == 40962) {
                if (intent != null) {
                    SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
                    if (signInAccount != null && signInAccount.d0() != null) {
                        GoogleSignInAccount d0 = signInAccount.d0();
                        o c = o.c(this);
                        GoogleSignInOptions I1 = this.A.I1();
                        d0.getClass();
                        c.b(I1, d0);
                        intent.removeExtra("signInAccount");
                        intent.putExtra("googleSignInAccount", d0);
                        this.B = true;
                        this.C = i2;
                        this.D = intent;
                        c6.c(this).d(0, null, new a(null));
                        E = false;
                        return;
                    } else if (intent.hasExtra("errorCode")) {
                        int intExtra = intent.getIntExtra("errorCode", 8);
                        if (intExtra == 13) {
                            intExtra = 12501;
                        }
                        I0(intExtra);
                        return;
                    }
                }
                I0(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            I0(12500);
        } else if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") || action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Bundle bundleExtra = intent.getBundleExtra("config");
            bundleExtra.getClass();
            SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
            if (signInConfiguration == null) {
                Log.e("AuthSignInClient", "Activity started with invalid configuration.");
                setResult(0);
                finish();
                return;
            }
            this.A = signInConfiguration;
            if (bundle != null) {
                boolean z2 = bundle.getBoolean("signingInGoogleApiClients");
                this.B = z2;
                if (z2) {
                    this.C = bundle.getInt("signInResultCode");
                    Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                    intent2.getClass();
                    this.D = intent2;
                    c6.c(this).d(0, null, new a(null));
                    E = false;
                }
            } else if (E) {
                setResult(0);
                I0(12502);
            } else {
                E = true;
                Intent intent3 = new Intent(action);
                if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
                    intent3.setPackage("com.google.android.gms");
                } else {
                    intent3.setPackage(getPackageName());
                }
                intent3.putExtra("config", this.A);
                try {
                    startActivityForResult(intent3, 40962);
                } catch (ActivityNotFoundException unused) {
                    this.z = true;
                    I0(17);
                }
            }
        } else {
            String valueOf = String.valueOf(intent.getAction());
            Log.e("AuthSignInClient", valueOf.length() != 0 ? "Unknown action: ".concat(valueOf) : new String("Unknown action: "));
            finish();
        }
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        E = false;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.B);
        if (this.B) {
            bundle.putInt("signInResultCode", this.C);
            bundle.putParcelable("signInResultData", this.D);
        }
    }
}
