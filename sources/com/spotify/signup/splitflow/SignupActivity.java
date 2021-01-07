package com.spotify.signup.splitflow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.g;
import com.spotify.android.recaptcha.m;
import com.spotify.android.recaptcha.n;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.libs.signup.validators.PasswordValidator;
import com.spotify.libs.signup.validators.c;
import com.spotify.login.AuthenticationMetadata;
import com.spotify.login.r0;
import com.spotify.loginflow.navigation.a;
import com.spotify.mobile.android.util.connectivity.e0;
import com.spotify.mobile.android.util.ui.Lifecycle$Listeners;
import com.spotify.mobile.android.util.ui.k;
import com.spotify.mobius.MobiusLoop;
import com.spotify.termsandconditions.l;
import defpackage.ij9;
import io.reactivex.subjects.PublishSubject;

public class SignupActivity extends g implements ij9.b, k {
    private boolean A;
    iae B;
    PasswordValidator C;
    c D;
    l E;
    w1 F;
    ae0 G;
    r0 H;
    a2 I;
    i31 J;
    e0 K;
    m L;
    private final PublishSubject<Boolean> M = PublishSubject.h1();
    private MobiusLoop.g<kee, iee> N;
    private final Lifecycle$Listeners O = new Lifecycle$Listeners();

    enum SignupType {
        EMAIL,
        IDENTIFIER_TOKEN,
        FACEBOOK
    }

    private static Intent N0(Context context, boolean z, String str, String str2, a aVar, AuthenticationMetadata.AuthSource authSource) {
        Intent intent = new Intent(context, SignupActivity.class);
        intent.putExtra("internal_build", z);
        if (str != null) {
            intent.putExtra("identifier_token", str);
        }
        if (str2 != null) {
            intent.putExtra("email", str2);
        }
        if (authSource != null) {
            intent.putExtra("auth_source", authSource);
        }
        if (aVar != null) {
            intent.putExtra("facebook", aVar);
        }
        return intent;
    }

    public static Intent O0(Context context, boolean z) {
        return N0(context, z, null, null, null, null);
    }

    public static Intent P0(Context context, boolean z, a aVar) {
        return N0(context, z, null, null, aVar, AuthenticationMetadata.AuthSource.FACEBOOK);
    }

    public static Intent R0(Context context, boolean z, String str, String str2, AuthenticationMetadata.AuthSource authSource) {
        return N0(context, z, str, str2, null, authSource);
    }

    @Override // com.spotify.mobile.android.util.ui.k
    public boolean e1(com.spotify.mobile.android.util.ui.l lVar) {
        return this.O.e1(lVar);
    }

    @Override // androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.F.b(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.M.onNext(Boolean.TRUE);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x010f  */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r21) {
        /*
        // Method dump skipped, instructions count: 290
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.signup.splitflow.SignupActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.O.e();
        ((n) this.L).i(this);
        this.N.d();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.O.f();
        this.N.stop();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.O.h();
        this.N.start();
    }

    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("KEY_SIGNUP_MODEL", this.N.b());
        bundle.putBoolean("com.spotify.signup.splitflow.smartlock_credentials_have_been_requested", this.A);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        ((n) this.L).h(this);
        this.O.j();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.O.k();
    }

    @Override // defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SIGNUP, null);
    }

    @Override // com.spotify.mobile.android.util.ui.k
    public boolean y0(com.spotify.mobile.android.util.ui.l lVar) {
        Lifecycle$Listeners lifecycle$Listeners = this.O;
        lVar.getClass();
        return lifecycle$Listeners.y0(lVar);
    }
}
