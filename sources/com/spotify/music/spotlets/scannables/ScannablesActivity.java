package com.spotify.music.spotlets.scannables;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.pageloader.PageLoaderView;
import com.spotify.pageloader.n0;
import com.spotify.pageloader.t0;

public class ScannablesActivity extends ss2 {
    public static final /* synthetic */ int K = 0;
    zac G;
    kgd H;
    jgd I;
    private t0<Boolean> J;

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        jgd jgd = this.I;
        if (jgd != null) {
            jgd.a(i, i2, intent);
        }
        super.onActivityResult(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.J = this.G.a(n0.c(Boolean.valueOf(getIntent().getBooleanExtra("EXTRA_SOCIAL_LISTENING", false))));
        PageLoaderView.a b = this.G.b(ViewUris.k2, u0());
        b.e(new a(this));
        PageLoaderView a = b.a(this);
        a.j0(this, this.J);
        setContentView(a);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.J.stop();
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.J.start();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.SCANNABLES_SCANNER, null);
    }
}
