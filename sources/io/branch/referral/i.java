package io.branch.referral;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;

public class i {
    private static boolean a = false;
    private static Boolean b;

    static boolean a(Context context) {
        if (!a && b == null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                Bundle bundle = applicationInfo.metaData;
                if (bundle == null || !bundle.containsKey("io.branch.sdk.TestMode")) {
                    Resources resources = context.getResources();
                    a = Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", "string", context.getPackageName())));
                } else {
                    a = applicationInfo.metaData.getBoolean("io.branch.sdk.TestMode", false);
                }
            } catch (Exception unused) {
            }
            b = Boolean.valueOf(a);
        }
        return a;
    }

    public static boolean b() {
        return a;
    }

    public static String c(Context context) {
        String str = a ? "io.branch.sdk.BranchKey.test" : "io.branch.sdk.BranchKey";
        String str2 = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && (str2 = bundle.getString(str)) == null && a) {
                str2 = applicationInfo.metaData.getString("io.branch.sdk.BranchKey");
            }
        } catch (Exception unused) {
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        try {
            Resources resources = context.getResources();
            return resources.getString(resources.getIdentifier(str, "string", context.getPackageName()));
        } catch (Exception unused2) {
            return str2;
        }
    }

    static void d(boolean z) {
        a = z;
    }
}
