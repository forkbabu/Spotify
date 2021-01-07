package com.spotify.loginflow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.x;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.g0;
import androidx.lifecycle.m;
import androidx.lifecycle.w;
import com.google.common.base.MoreObjects;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import com.spotify.loginflow.navigation.Destination;
import com.spotify.loginflow.navigation.b;
import com.spotify.loginflow.navigation.d;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.C0707R;
import com.spotify.smartlock.store.f;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.h;
import defpackage.ce0;
import io.reactivex.disposables.a;
import io.reactivex.y;

public class LoginActivity extends jd0 implements m, h {
    public static final /* synthetic */ int X = 0;
    private final a C = new a();
    public ImageView D;
    ajf<f> E;
    hx0 F;
    y G;
    d H;
    v I;
    DispatchingAndroidInjector<Object> J;
    u K;
    boolean L;
    ajf<r01> M;
    ae0 N;
    n O;
    yx0 P;
    com.spotify.music.spotlets.tracker.identifier.a Q;
    private Fragment R;
    private boolean S;
    private boolean T;
    private boolean U;
    private String V;
    private r W;

    private static boolean P0(Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        if (intent2 == null || !intent2.getBooleanExtra("password_reset", false)) {
            return false;
        }
        return true;
    }

    private void R0(Intent intent) {
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        String nullToEmpty = MoreObjects.nullToEmpty(intent2.getStringExtra("password_reset_username"));
        intent2.getBooleanExtra("password_reset_auto_send_email", false);
        T0(nullToEmpty);
    }

    private Fragment U0() {
        return v0().U("flow_fragment");
    }

    public static Intent V0(Context context, Intent intent, int i, boolean z) {
        Intent intent2 = new Intent();
        intent2.setClass(context, LoginActivity.class);
        intent2.putExtra("intent", intent);
        intent2.putExtra("previously_logged_in", z);
        intent2.setFlags(i);
        return intent2;
    }

    public static void W0(LoginActivity loginActivity, Destination destination) {
        loginActivity.getWindow().setBackgroundDrawableResource(C0707R.color.sthlm_blk);
        Intent intent = loginActivity.getIntent();
        if (P0(intent)) {
            loginActivity.R0(intent);
        }
        if (loginActivity.U) {
            loginActivity.H.c(destination, new b(null));
            String str = loginActivity.V;
            ((g11) loginActivity.O).b(str).subscribe(new q(loginActivity, str));
            loginActivity.U = false;
            loginActivity.V = "";
        } else if (!loginActivity.T) {
            loginActivity.T = true;
            loginActivity.C.b(loginActivity.M.get().a().subscribe(new b(loginActivity, destination)));
        } else {
            loginActivity.H.c(destination, new b(null));
        }
    }

    @Override // dagger.android.h
    public dagger.android.b<Object> C() {
        return this.J;
    }

    public void T0(String str) {
        this.U = true;
        this.V = str;
    }

    public void X0() {
        this.D.setVisibility(U0() instanceof w ? 0 : 8);
    }

    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment U0 = U0();
        if (U0 != null) {
            U0.n3(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
        if (f.c(i)) {
            this.E.get().i(i, i2, intent);
        }
        r rVar = this.W;
        Destination destination = null;
        if (i == 45500) {
            if (i2 == -1) {
                destination = new Destination.f(true);
            } else if (i2 == 48000) {
                destination = new Destination.e(intent != null ? intent.getStringExtra("email") : null, null, 2);
            }
        } else if (i == 45501) {
            destination = Destination.d.a;
        }
        rVar.h(destination);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment U0 = U0();
        if (!(U0 instanceof o ? ((o) U0).b() : false)) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (bundle == null) {
            setTheme(C0707R.style.res_2132083519_theme_glue_noactionbarwithlogo);
        } else {
            setTheme(C0707R.style.res_2132083506_theme_glue_noactionbar);
        }
        dagger.android.a.a(this);
        super.onCreate(bundle);
        r rVar = (r) new g0(this).a(r.class);
        this.W = rVar;
        rVar.g().h(this, new f(this));
        if (!this.L) {
            getWindow().setFlags(8192, 8192);
        }
        setContentView(C0707R.layout.activity_login);
        ImageView imageView = (ImageView) findViewById(C0707R.id.back_button);
        this.D = imageView;
        imageView.setOnClickListener(new d(this));
        v0().d(new a(this));
        boolean z = false;
        if (bundle == null) {
            if (getIntent().getBooleanExtra("previously_logged_in", false)) {
                this.P.c();
            }
            this.C.b(this.F.b(SnackbarUtilsKt.SNACKBAR_BASELINE_DURATION).s(new c(this)).B(this.G).subscribe(new e(this)));
        } else {
            this.T = bundle.getBoolean("com.spotify.login.smartlock_credentials_have_been_requested", false);
            bundle.setClassLoader(getClassLoader());
        }
        setVisible(false);
        this.N.a(new ce0.d(qf.c(getApplicationContext())));
        AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
        ae0 ae0 = this.N;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            z = true;
        }
        ae0.a(new ce0.a(z));
        this.N.a(new ce0.n(this.Q.a()));
        A().a(this);
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        if (P0(intent)) {
            R0(intent);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.K.start();
    }

    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.spotify.login.smartlock_credentials_have_been_requested", this.T);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        this.C.f();
        super.onStop();
    }

    /* access modifiers changed from: package-private */
    @w(Lifecycle.Event.ON_RESUME)
    public void swicthFragmentOnResume() {
        Fragment fragment = this.R;
        if (fragment != null) {
            boolean z = this.S;
            boolean z2 = false;
            Assertion.k(true, "Fragment container for the flow activity has not been set", new Object[0]);
            if (A().b().compareTo(Lifecycle.State.RESUMED) >= 0) {
                z2 = true;
            }
            if (!z2) {
                this.R = fragment;
                this.S = z;
                Assertion.v("switchToFragment transactions should not be made in this state");
            } else {
                x i = v0().i();
                if (z) {
                    i.g(null);
                }
                i.q(C0707R.id.zero_navigation_container, fragment, "flow_fragment");
                i.i();
            }
            this.R = null;
        }
    }
}
