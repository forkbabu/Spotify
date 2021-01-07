package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.gms.common.g;

public final class b {
    private SharedPreferences a;

    public b(Context context) {
        Context context2;
        SharedPreferences sharedPreferences;
        try {
            int i = g.e;
            try {
                context2 = context.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
                context2 = null;
            }
            if (context2 == null) {
                sharedPreferences = null;
            } else {
                sharedPreferences = context2.getSharedPreferences("google_ads_flags", 0);
            }
            this.a = sharedPreferences;
        } catch (Throwable unused2) {
            this.a = null;
        }
    }

    public final boolean a(String str) {
        try {
            SharedPreferences sharedPreferences = this.a;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final float b(String str) {
        try {
            SharedPreferences sharedPreferences = this.a;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    /* access modifiers changed from: package-private */
    public final String c(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.a;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }
}
