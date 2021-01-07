package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* access modifiers changed from: package-private */
public class p0 {
    private String a;

    p0() {
    }

    /* access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        if (this.a == null) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            if (installerPackageName == null) {
                installerPackageName = "";
            }
            this.a = installerPackageName;
        }
        return "".equals(this.a) ? null : this.a;
    }
}
