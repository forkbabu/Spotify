package com.spotify.mobile.android.spotlets.bixbyhomecards;

import android.content.Context;
import android.content.pm.PackageManager;
import com.samsung.android.sdk.SsdkUnsupportedException;

public class h {
    private final Context a;
    u60 b = new u60();

    public h(Context context) {
        this.a = context;
    }

    public boolean a() {
        try {
            if (this.a.getPackageManager().getPackageInfo("com.samsung.android.app.spage", 0).versionCode < 220400000) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public boolean b() {
        try {
            this.b.a(this.a);
            if (!this.b.b(1)) {
                return false;
            }
            return true;
        } catch (SsdkUnsupportedException unused) {
            return false;
        }
    }
}
