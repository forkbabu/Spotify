package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.FacebookSdkNotInitializedException;
import com.facebook.k;
import java.util.Collection;
import java.util.List;

public final class h0 {
    public static String a() {
        String e = k.e();
        if (e != null) {
            return e;
        }
        throw new IllegalStateException("No App ID found, please set the App ID.");
    }

    public static boolean b(Context context, String str) {
        List<ResolveInfo> list;
        f(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.name.equals("com.facebook.CustomTabActivity") || !activityInfo.packageName.equals(context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public static void c(Context context, boolean z) {
        ActivityInfo activityInfo;
        f(context, "context");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                activityInfo = packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (activityInfo == null && z) {
                throw new IllegalStateException("FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info.");
            }
        }
        activityInfo = null;
        if (activityInfo == null) {
        }
    }

    public static void d(Context context, boolean z) {
        f(context, "context");
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && z) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.");
        }
    }

    public static <T> void e(Collection<T> collection, String str) {
        f(collection, str);
        for (T t : collection) {
            if (t == null) {
                throw new NullPointerException(je.y0("Container '", str, "' cannot contain null values"));
            }
        }
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(je.y0("Container '", str, "' cannot be empty"));
        }
    }

    public static void f(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(je.y0("Argument '", str, "' cannot be null"));
        }
    }

    public static void g(String str, String str2) {
        if (f0.C(str)) {
            throw new IllegalArgumentException(je.y0("Argument '", str2, "' cannot be null or empty"));
        }
    }

    public static void h() {
        if (!k.u()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
