package com.spotify.mobile.android.ui.fragments;

import android.net.Uri;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ NotificationWebViewFragment a;
    public final /* synthetic */ Uri b;

    public /* synthetic */ i(NotificationWebViewFragment notificationWebViewFragment, Uri uri) {
        this.a = notificationWebViewFragment;
        this.b = uri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.k5(this.b);
    }
}
