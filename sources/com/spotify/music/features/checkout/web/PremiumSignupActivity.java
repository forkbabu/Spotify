package com.spotify.music.features.checkout.web;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.x;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;

public class PremiumSignupActivity extends ss2 {
    public static Intent U0(Context context, i iVar) {
        Intent intent = new Intent(context, PremiumSignupActivity.class);
        intent.putExtra("premium_signup_configuration", iVar);
        return intent;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        PremiumSignupFragment premiumSignupFragment = (PremiumSignupFragment) v0().U("premium_signup");
        if (premiumSignupFragment != null) {
            premiumSignupFragment.b();
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_premium_signup);
        if (!(((PremiumSignupFragment) v0().U("premium_signup")) != null)) {
            x i = v0().i();
            int i2 = PremiumSignupFragment.D0;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("premium_signup_configuration", (i) getIntent().getParcelableExtra("premium_signup_configuration"));
            PremiumSignupFragment premiumSignupFragment = new PremiumSignupFragment();
            premiumSignupFragment.r4(bundle2);
            i.c(C0707R.id.fragment_premium_signup, premiumSignupFragment, "premium_signup");
            i.i();
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.PREMIUM_SIGNUP, ViewUris.j1.toString());
    }
}
