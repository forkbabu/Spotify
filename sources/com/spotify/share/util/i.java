package com.spotify.share.util;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;

public class i {
    private final Context a;

    public i(Application application) {
        this.a = application.getApplicationContext();
    }

    public void a(Uri uri, int i) {
        this.a.revokeUriPermission(uri, i);
    }

    public void b(Uri uri, Intent intent, int i) {
        for (ResolveInfo resolveInfo : this.a.getPackageManager().queryIntentActivities(intent, 65536)) {
            this.a.grantUriPermission(resolveInfo.activityInfo.packageName, uri, i);
        }
    }
}
