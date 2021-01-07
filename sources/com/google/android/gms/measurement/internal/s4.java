package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.List;

public final class s4 {
    final f5 a;

    s4(f5 f5Var) {
        this.a = f5Var;
    }

    private final boolean b() {
        try {
            wr a2 = xr.a(this.a.i());
            if (a2 == null) {
                this.a.l().M().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            } else if (a2.e("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            this.a.l().M().b("Failed to retrieve Play Store version for Install Referrer", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        if (str == null || str.isEmpty()) {
            this.a.l().I().a("Install Referrer Reporter was called with invalid app package name");
            return;
        }
        this.a.k().b();
        if (!b()) {
            this.a.l().K().a("Install Referrer Reporter is not available");
            return;
        }
        v4 v4Var = new v4(this, str);
        this.a.k().b();
        Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
        intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
        PackageManager packageManager = this.a.i().getPackageManager();
        if (packageManager == null) {
            this.a.l().I().a("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
            return;
        }
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            this.a.l().K().a("Play Service for fetching Install Referrer is unavailable on device");
            return;
        }
        ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
        if (serviceInfo != null) {
            String str2 = serviceInfo.packageName;
            if (serviceInfo.name == null || !"com.android.vending".equals(str2) || !b()) {
                this.a.l().H().a("Play Store version 8.3.73 or higher required for Install Referrer");
                return;
            }
            try {
                this.a.l().M().b("Install Referrer Service is", sr.b().a(this.a.i(), new Intent(intent), v4Var, 1) ? "available" : "not available");
            } catch (Exception e) {
                this.a.l().E().b("Exception occurred while binding to Install Referrer Service", e.getMessage());
            }
        }
    }
}
