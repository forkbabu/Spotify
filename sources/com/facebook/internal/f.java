package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import com.facebook.k;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class f {
    private static final String[] a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    public static String a() {
        Context d = k.d();
        List<ResolveInfo> queryIntentServices = d.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices == null) {
            return null;
        }
        HashSet hashSet = new HashSet(Arrays.asList(a));
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                return serviceInfo.packageName;
            }
        }
        return null;
    }

    public static String b() {
        StringBuilder V0 = je.V0("fbconnect://cct.");
        V0.append(k.d().getPackageName());
        return V0.toString();
    }
}
