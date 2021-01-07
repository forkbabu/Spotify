package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.play.core.internal.a;

/* access modifiers changed from: package-private */
public final class c2 {
    private static final a c = new a("PackageStateCache");
    private final Context a;
    private int b = -1;

    c2(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        if (this.b == -1) {
            try {
                this.b = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                c.e("The current version of the app could not be retrieved", new Object[0]);
            }
        }
        return this.b;
    }
}
