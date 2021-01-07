package com.spotify.music.features.waze;

import android.content.Intent;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;

public class WazeReturnActivity extends ss2 {
    qla G;
    String H;

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.jd0, androidx.fragment.app.c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.G.a(ViewUris.E.toString());
        if (!(!isTaskRoot())) {
            Intent intent = new Intent();
            String str = this.H;
            str.getClass();
            intent.setClassName(this, str);
            intent.setFlags(268435456);
            startActivity(intent);
        }
        finish();
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.CARS_WAZE, ViewUris.E.toString());
    }
}
