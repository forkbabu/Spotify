package com.spotify.music.spotlets.scannables.view;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;

public class ScannablesOnboardingActivity extends ss2 implements e {
    public static final /* synthetic */ int H = 0;
    vgd G;

    public void U0(int i) {
        ((wgd) this.G).c(i);
        setResult(i);
        finish();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((wgd) this.G).b(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_scannables_onboarding);
        ((wgd) this.G).e(this);
        ((Button) findViewById(C0707R.id.btn_cancel)).setOnClickListener(new b(this));
        ((Button) findViewById(C0707R.id.btn_scan_a_code)).setOnClickListener(new a(this));
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.appcompat.app.g, androidx.fragment.app.c, android.app.Activity
    public void onStop() {
        super.onStop();
        ((wgd) this.G).getClass();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SCANNABLES_SCANNER, null);
    }
}
