package com.spotify.mobile.android.ui.activity;

import android.os.Bundle;
import androidx.fragment.app.x;
import com.spotify.mobile.android.ui.fragments.NotificationWebViewFragment;
import com.spotify.music.C0707R;

public class NotificationWebViewActivity extends ss2 {
    public static final /* synthetic */ int G = 0;

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        NotificationWebViewFragment notificationWebViewFragment = (NotificationWebViewFragment) v0().U("notification_webview");
        if (notificationWebViewFragment == null || !notificationWebViewFragment.b()) {
            super.onBackPressed();
        }
    }

    @Override // defpackage.ss2, defpackage.id0, androidx.appcompat.app.g, androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0707R.layout.activity_notification_webview);
        if (bundle == null) {
            x i = v0().i();
            i.c(C0707R.id.fragment_notification_webview, new NotificationWebViewFragment(), "notification_webview");
            i.i();
        }
    }
}
