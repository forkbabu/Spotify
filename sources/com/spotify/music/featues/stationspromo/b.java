package com.spotify.music.featues.stationspromo;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

class b {
    private final PackageManager a;

    public b(PackageManager packageManager) {
        this.a = packageManager;
    }

    /* access modifiers changed from: package-private */
    public Intent a() {
        Intent launchIntentForPackage = this.a.getLaunchIntentForPackage("com.spotify.zerotap");
        if (launchIntentForPackage != null) {
            return launchIntentForPackage;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://play.google.com/store/apps/details?id=com.spotify.zerotap"));
        intent.setPackage("com.android.vending");
        return intent;
    }
}
