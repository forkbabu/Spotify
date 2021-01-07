package com.spotify.mobile.android.ui.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.spotify.glue.dialogs.f;
import com.spotify.glue.dialogs.g;
import com.spotify.mobile.android.rx.x;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences;
import com.spotify.mobile.android.util.prefs.i;
import com.spotify.music.C0707R;
import com.spotify.music.features.ads.model.Ad;

public class MarketingOptInActivity extends ss2 {
    public static final /* synthetic */ int J = 0;
    x G;
    i H;
    g I;

    private void W0(boolean z) {
        this.G.a("send-email", z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        SpSharedPreferences.a<Object> b = this.H.d(this).b();
        b.a(i31.b, false);
        b.i();
    }

    public /* synthetic */ void U0(DialogInterface dialogInterface, int i) {
        W0(true);
        finish();
    }

    public /* synthetic */ void V0(DialogInterface dialogInterface, int i) {
        W0(false);
        finish();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        SpSharedPreferences.a<Object> b = this.H.d(this).b();
        b.a(i31.b, false);
        b.i();
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        setContentView(new View(this));
        setResult(-1);
        boolean booleanExtra = getIntent().getBooleanExtra("use-new-marketing-opt-in", false);
        g gVar = this.I;
        if (booleanExtra) {
            str = getString(C0707R.string.marketing_opt_in_updated_dialog_content);
        } else {
            str = getString(C0707R.string.marketing_opt_in_dialog_content);
        }
        f b = gVar.b(str);
        b.f(getString(C0707R.string.marketing_opt_in_dialog_accept_button), new b(this));
        b.e(getString(C0707R.string.marketing_opt_in_dialog_cancel_button), new a(this));
        b.a(false);
        b.b().a();
    }
}
