package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.facebook.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class j {
    private static final String a = "com.facebook.appevents.internal.j";
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static Boolean c = null;
    private static Boolean d = null;
    private static ServiceConnection e;
    private static Application.ActivityLifecycleCallbacks f;
    private static Intent g;
    private static Object h;

    static void c(Context context, ArrayList arrayList, boolean z) {
        if (!arrayList.isEmpty()) {
            HashMap hashMap = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                try {
                    String string = new JSONObject(str).getString("productId");
                    hashMap.put(string, str);
                    arrayList2.add(string);
                } catch (JSONException e2) {
                    Log.e(a, "Error parsing in-app purchase data.", e2);
                }
            }
            for (Map.Entry entry : ((HashMap) k.j(context, arrayList2, h, z)).entrySet()) {
                e.c((String) hashMap.get(entry.getKey()), (String) entry.getValue(), z);
            }
        }
    }

    public static void e() {
        Boolean bool = Boolean.FALSE;
        if (c == null) {
            try {
                Class.forName("com.android.vending.billing.IInAppBillingService$Stub");
                Boolean bool2 = Boolean.TRUE;
                c = bool2;
                try {
                    Class.forName("com.android.billingclient.api.ProxyBillingActivity");
                    d = bool2;
                } catch (ClassNotFoundException unused) {
                    d = bool;
                }
                k.b();
                g = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
                e = new h();
                f = new i();
            } catch (ClassNotFoundException unused2) {
                c = bool;
            }
        }
        if (c.booleanValue() && e.a() && b.compareAndSet(false, true)) {
            Context d2 = k.d();
            if (d2 instanceof Application) {
                ((Application) d2).registerActivityLifecycleCallbacks(f);
                d2.bindService(g, e, 1);
            }
        }
    }
}
