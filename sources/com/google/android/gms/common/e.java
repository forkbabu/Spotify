package com.google.android.gms.common;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.a1;

public class e {
    public static final int a = 12451000;
    private static final e b = new e();

    static {
        int i = g.e;
    }

    e() {
    }

    @RecentlyNonNull
    public static e b() {
        return b;
    }

    @RecentlyNullable
    public Intent a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context == null || !com.google.android.gms.common.util.e.g(context)) {
                StringBuilder V0 = je.V0("gcore_");
                V0.append(a);
                V0.append("-");
                if (!TextUtils.isEmpty(str)) {
                    V0.append(str);
                }
                V0.append("-");
                if (context != null) {
                    V0.append(context.getPackageName());
                }
                V0.append("-");
                if (context != null) {
                    try {
                        V0.append(xr.a(context).e(context.getPackageName(), 0).versionCode);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                String sb = V0.toString();
                int i2 = a1.a;
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri.Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
                if (!TextUtils.isEmpty(sb)) {
                    appendQueryParameter.appendQueryParameter("pcampaignid", sb);
                }
                intent.setData(appendQueryParameter.build());
                intent.setPackage("com.android.vending");
                intent.addFlags(524288);
                return intent;
            }
            int i3 = a1.a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        } else if (i != 3) {
            return null;
        } else {
            int i4 = a1.a;
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent3.setData(fromParts);
            return intent3;
        }
    }

    public int c(@RecentlyNonNull Context context, int i) {
        int b2 = g.b(context, i);
        boolean z = true;
        if (b2 != 18) {
            z = b2 == 1 ? g.c(context, "com.google.android.gms") : false;
        }
        if (z) {
            return 18;
        }
        return b2;
    }
}
