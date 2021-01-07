package com.spotify.music.features.tasteonboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.google.common.collect.FluentIterable;
import com.spotify.music.C0707R;
import com.spotify.music.features.tasteonboarding.i;
import com.spotify.music.libs.adaptiveui.di.OrientationMode;

public class TasteOnboardingActivity extends ss2 implements i.a {
    private final cj9 G = new cj9(this);
    k H;
    c I;
    public i J;
    boolean K;
    OrientationMode L;

    public static Intent U0(Context context, boolean z) {
        Intent intent = new Intent(context, TasteOnboardingActivity.class);
        intent.putExtra("update_mode", z);
        return intent;
    }

    public void V0(Fragment fragment) {
        this.G.e(fragment);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment a = this.J.a();
        if (a instanceof ws2) {
            ((ws2) a).b();
        } else if (!this.K) {
            this.H.a();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_free_tier_taste_onboarding);
        setRequestedOrientation(this.L.d());
        this.J.f = this;
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(1280);
        }
        if (bundle == null) {
            this.H.b();
        } else {
            this.I.d(bundle);
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.J.f = null;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.J.e(bundle);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelableArray("entries", (Parcelable[]) FluentIterable.from(this.J.c).transform(a.a).toArray(Bundle.class));
        this.I.e(bundle);
    }

    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStart() {
        super.onStart();
        this.J.i();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.c(this.G);
    }
}
