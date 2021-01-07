package com.spotify.music.features.quicksilver.v2.inappinternalwebview;

import android.os.Bundle;
import androidx.fragment.app.x;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.C0707R;

public class InAppInternalWebviewActivity extends ss2 {
    public static final /* synthetic */ int G = 0;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        InAppInternalWebviewFragment inAppInternalWebviewFragment = (InAppInternalWebviewFragment) v0().U("inapp_internal_webview");
        if (inAppInternalWebviewFragment == null || !inAppInternalWebviewFragment.b()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_inapp_internal_webview_activity);
        if (!(((InAppInternalWebviewFragment) v0().U("inapp_internal_webview")) != null)) {
            x i = v0().i();
            String stringExtra = getIntent().getStringExtra("inapp_internalwebview_uri");
            int i2 = InAppInternalWebviewFragment.y0;
            Bundle E = je.E("KEY_IN_APP_INTERNAL_WEBVIEW_URI", stringExtra);
            InAppInternalWebviewFragment inAppInternalWebviewFragment = new InAppInternalWebviewFragment();
            inAppInternalWebviewFragment.r4(E);
            i.c(C0707R.id.fragment_inapp_internal_webview, inAppInternalWebviewFragment, "inapp_internal_webview");
            i.i();
        }
    }

    @Override // defpackage.ss2, defpackage.ij9.b
    public ij9 u0() {
        return ij9.b(PageIdentifiers.INAPPMESSAGE_WEBVIEW, getIntent().getStringExtra("inapp_internalwebview_uri"));
    }
}
