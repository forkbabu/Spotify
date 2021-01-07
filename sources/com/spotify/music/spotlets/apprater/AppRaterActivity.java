package com.spotify.music.spotlets.apprater;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.t;
import com.spotify.music.C0707R;
import com.spotify.music.libs.viewuri.ViewUris;

public class AppRaterActivity extends ss2 {
    public static final /* synthetic */ int H = 0;
    t G;

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.app_rater_dialog);
        setResult(-1);
        findViewById(C0707R.id.app_rater_dialog_button_accept).setOnClickListener(new b(this, new Intent("android.intent.action.VIEW", this.G.b())));
        findViewById(C0707R.id.app_rater_dialog_button_dismiss).setOnClickListener(new a(this));
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.APPRATER, ViewUris.Z1.toString());
    }
}
