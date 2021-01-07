package com.facebook.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.facebook.k;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class m {
    private static final AtomicBoolean a = new AtomicBoolean(false);
    private static final ConcurrentLinkedQueue<c> b = new ConcurrentLinkedQueue<>();
    private static final Map<String, JSONObject> c = new ConcurrentHashMap();
    private static Long d;

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        final /* synthetic */ String a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        a(String str, Context context, String str2) {
            this.a = str;
            this.b = context;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    JSONObject f = m.f(this.a);
                    if (f != null) {
                        m.i(this.a, f);
                        this.b.getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(this.c, f.toString()).apply();
                        Long unused = m.d = Long.valueOf(System.currentTimeMillis());
                    }
                    m.j();
                    m.a.set(false);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements Runnable {
        final /* synthetic */ c a;

        b(c cVar) {
            this.a = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    this.a.a();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    public interface c {
        void a();
    }

    /* access modifiers changed from: private */
    public static JSONObject f(String str) {
        Bundle E = je.E("platform", "android");
        boolean z = k.n;
        E.putString("sdk_version", "7.1.0");
        E.putString("fields", "gatekeepers");
        com.facebook.m r = com.facebook.m.r(null, String.format("%s/%s", str, "mobile_sdk_gk"), null);
        r.D(true);
        r.C(E);
        return r.g().f();
    }

    public static boolean g(String str, String str2, boolean z) {
        h(null);
        if (str2 != null) {
            Map<String, JSONObject> map = c;
            if (map.containsKey(str2)) {
                return map.get(str2).optBoolean(str, z);
            }
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void h(com.facebook.internal.m.c r8) {
        /*
            java.lang.Class<com.facebook.internal.m> r0 = com.facebook.internal.m.class
            monitor-enter(r0)
            if (r8 == 0) goto L_0x000a
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.m$c> r1 = com.facebook.internal.m.b     // Catch:{ all -> 0x007c }
            r1.add(r8)     // Catch:{ all -> 0x007c }
        L_0x000a:
            java.lang.Long r8 = com.facebook.internal.m.d     // Catch:{ all -> 0x007c }
            r1 = 0
            r2 = 1
            if (r8 != 0) goto L_0x0011
            goto L_0x0023
        L_0x0011:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007c }
            long r5 = r8.longValue()     // Catch:{ all -> 0x007c }
            long r3 = r3 - r5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0023
            r8 = 1
            goto L_0x0024
        L_0x0023:
            r8 = 0
        L_0x0024:
            if (r8 == 0) goto L_0x002b
            j()     // Catch:{ all -> 0x007c }
            monitor-exit(r0)
            return
        L_0x002b:
            android.content.Context r8 = com.facebook.k.d()
            java.lang.String r3 = com.facebook.k.e()
            java.lang.String r4 = "com.facebook.internal.APP_GATEKEEPERS.%s"
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r3
            java.lang.String r4 = java.lang.String.format(r4, r5)
            if (r8 != 0) goto L_0x0041
            monitor-exit(r0)
            return
        L_0x0041:
            java.lang.String r5 = "com.facebook.internal.preferences.APP_GATEKEEPERS"
            android.content.SharedPreferences r5 = r8.getSharedPreferences(r5, r1)
            r6 = 0
            java.lang.String r5 = r5.getString(r4, r6)
            boolean r7 = com.facebook.internal.f0.C(r5)
            if (r7 != 0) goto L_0x0060
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0059 }
            r7.<init>(r5)     // Catch:{ JSONException -> 0x0059 }
            r6 = r7
            goto L_0x005b
        L_0x0059:
            boolean r5 = com.facebook.k.n
        L_0x005b:
            if (r6 == 0) goto L_0x0060
            i(r3, r6)
        L_0x0060:
            java.util.concurrent.Executor r5 = com.facebook.k.l()
            if (r5 != 0) goto L_0x0068
            monitor-exit(r0)
            return
        L_0x0068:
            java.util.concurrent.atomic.AtomicBoolean r6 = com.facebook.internal.m.a
            boolean r1 = r6.compareAndSet(r1, r2)
            if (r1 != 0) goto L_0x0072
            monitor-exit(r0)
            return
        L_0x0072:
            com.facebook.internal.m$a r1 = new com.facebook.internal.m$a
            r1.<init>(r3, r8, r4)
            r5.execute(r1)
            monitor-exit(r0)
            return
        L_0x007c:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.m.h(com.facebook.internal.m$c):void");
    }

    /* access modifiers changed from: private */
    public static synchronized JSONObject i(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (m.class) {
            Map<String, JSONObject> map = c;
            if (map.containsKey(str)) {
                jSONObject2 = map.get(str);
            } else {
                jSONObject2 = new JSONObject();
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("data");
            JSONObject jSONObject3 = null;
            if (optJSONArray != null) {
                jSONObject3 = optJSONArray.optJSONObject(0);
            }
            if (!(jSONObject3 == null || jSONObject3.optJSONArray("gatekeepers") == null)) {
                JSONArray optJSONArray2 = jSONObject3.optJSONArray("gatekeepers");
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                        jSONObject2.put(jSONObject4.getString("key"), jSONObject4.getBoolean("value"));
                    } catch (JSONException unused) {
                        boolean z = k.n;
                    }
                }
            }
            c.put(str, jSONObject2);
        }
        return jSONObject2;
    }

    /* access modifiers changed from: private */
    public static void j() {
        Handler handler = new Handler(Looper.getMainLooper());
        while (true) {
            ConcurrentLinkedQueue<c> concurrentLinkedQueue = b;
            if (!concurrentLinkedQueue.isEmpty()) {
                c poll = concurrentLinkedQueue.poll();
                if (poll != null) {
                    handler.post(new b(poll));
                }
            } else {
                return;
            }
        }
    }

    static JSONObject k(String str, boolean z) {
        if (!z) {
            Map<String, JSONObject> map = c;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        JSONObject f = f(str);
        if (f == null) {
            return null;
        }
        k.d().getSharedPreferences("com.facebook.internal.preferences.APP_GATEKEEPERS", 0).edit().putString(String.format("com.facebook.internal.APP_GATEKEEPERS.%s", str), f.toString()).apply();
        return i(str, f);
    }
}
