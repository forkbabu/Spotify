package com.spotify.mobile.android.sso.util;

import android.app.Activity;

public class AfterLoginDummyActivity extends Activity {
    public static final /* synthetic */ int a = 0;

    /* access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        finish();
    }
}