package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.common.util.d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.g6;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

public class h {
    private static volatile h i;
    private static Boolean j;
    private final String a;
    protected final com.google.android.gms.common.util.b b;
    private final ExecutorService c;
    private final wu d;
    private List<Pair<g6, c>> e;
    private int f;
    private boolean g;
    private jb h;

    abstract class a implements Runnable {
        final long a = System.currentTimeMillis();
        final long b;
        private final boolean c;

        a(boolean z) {
            ((d) h.this.b).getClass();
            ((d) h.this.b).getClass();
            this.b = SystemClock.elapsedRealtime();
            this.c = z;
        }

        /* access modifiers changed from: package-private */
        public abstract void a();

        /* access modifiers changed from: protected */
        public void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.g) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                h.this.l(e, false, this.c);
                b();
            }
        }
    }

    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            h.i(h.this, new e0(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            h.i(h.this, new j0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            h.i(h.this, new f0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            h.i(h.this, new g0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            hb hbVar = new hb();
            h.i(h.this, new h0(this, activity, hbVar));
            Bundle F3 = hbVar.F3(50);
            if (F3 != null) {
                bundle.putAll(F3);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            h.i(h.this, new d0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            h.i(h.this, new i0(this, activity));
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends b {
        private final g6 a;

        c(g6 g6Var) {
            this.a = g6Var;
        }

        @Override // com.google.android.gms.internal.measurement.c
        public final void V2(String str, String str2, Bundle bundle, long j) {
            this.a.a(str, str2, bundle, j);
        }

        @Override // com.google.android.gms.internal.measurement.c
        public final int a() {
            return System.identityHashCode(this.a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r1 == false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private h(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, android.os.Bundle r13) {
        /*
            r8 = this;
            r8.<init>()
            if (r10 == 0) goto L_0x000f
            boolean r0 = y(r11, r12)
            if (r0 != 0) goto L_0x000c
            goto L_0x000f
        L_0x000c:
            r8.a = r10
            goto L_0x0013
        L_0x000f:
            java.lang.String r10 = "FA"
            r8.a = r10
        L_0x0013:
            com.google.android.gms.common.util.b r10 = com.google.android.gms.common.util.d.b()
            r8.b = r10
            com.google.android.gms.internal.measurement.o r7 = new com.google.android.gms.internal.measurement.o
            r7.<init>()
            java.util.concurrent.ThreadPoolExecutor r10 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r6 = new java.util.concurrent.LinkedBlockingQueue
            r6.<init>()
            r1 = 1
            r2 = 1
            r3 = 60
            r0 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7)
            r0 = 1
            r10.allowCoreThreadTimeOut(r0)
            java.util.concurrent.ExecutorService r10 = java.util.concurrent.Executors.unconfigurableExecutorService(r10)
            r8.c = r10
            wu r10 = new wu
            r10.<init>(r8)
            r8.d = r10
            r10 = 0
            java.lang.String r1 = "google_app_id"
            java.lang.String r1 = com.google.android.gms.cast.framework.f.l(r9, r1)     // Catch:{ IllegalStateException -> 0x004b }
            if (r1 == 0) goto L_0x004b
            r1 = 1
            goto L_0x004c
        L_0x004b:
            r1 = 0
        L_0x004c:
            if (r1 == 0) goto L_0x0058
            java.lang.String r1 = "com.google.firebase.analytics.FirebaseAnalytics"
            java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0055 }
            r1 = 1
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 == 0) goto L_0x0059
        L_0x0058:
            r10 = 1
        L_0x0059:
            if (r10 != 0) goto L_0x005e
            r8.g = r0
            return
        L_0x005e:
            boolean r10 = y(r11, r12)
            com.google.android.gms.internal.measurement.k r10 = new com.google.android.gms.internal.measurement.k
            r0 = r10
            r1 = r8
            r2 = r11
            r3 = r12
            r4 = r9
            r5 = r13
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ExecutorService r11 = r8.c
            r11.execute(r10)
            android.content.Context r9 = r9.getApplicationContext()
            android.app.Application r9 = (android.app.Application) r9
            if (r9 != 0) goto L_0x007b
            return
        L_0x007b:
            com.google.android.gms.internal.measurement.h$b r10 = new com.google.android.gms.internal.measurement.h$b
            r10.<init>()
            r9.registerActivityLifecycleCallbacks(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, android.os.Bundle):void");
    }

    public static h a(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context != null) {
            if (i == null) {
                synchronized (h.class) {
                    if (i == null) {
                        i = new h(context, null, null, null, bundle);
                    }
                }
            }
            return i;
        }
        throw new NullPointerException("null reference");
    }

    static void i(h hVar, a aVar) {
        hVar.c.execute(aVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void l(Exception exc, boolean z, boolean z2) {
        this.g |= z;
        if (!z && z2) {
            this.c.execute(new y(this, "Error with data collection. Data lost.", exc));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void s(android.content.Context r7) {
        /*
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Class<com.google.android.gms.internal.measurement.h> r1 = com.google.android.gms.internal.measurement.h.class
            monitor-enter(r1)
            java.lang.Boolean r2 = com.google.android.gms.internal.measurement.h.j     // Catch:{ Exception -> 0x0053 }
            if (r2 == 0) goto L_0x000b
            monitor-exit(r1)     // Catch:{ all -> 0x0051 }
            goto L_0x005e
        L_0x000b:
            java.lang.String r2 = "app_measurement_internal_disable_startup_flags"
            com.google.android.exoplayer2.util.g.i(r2)
            r3 = 0
            wr r4 = defpackage.xr.a(r7)     // Catch:{ NameNotFoundException -> 0x002b }
            java.lang.String r5 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x002b }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.c(r5, r6)     // Catch:{ NameNotFoundException -> 0x002b }
            if (r4 == 0) goto L_0x002b
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x002b }
            if (r4 != 0) goto L_0x0026
            goto L_0x002b
        L_0x0026:
            boolean r2 = r4.getBoolean(r2)     // Catch:{ NameNotFoundException -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            if (r2 == 0) goto L_0x0032
            com.google.android.gms.internal.measurement.h.j = r0
            monitor-exit(r1)
            goto L_0x005e
        L_0x0032:
            java.lang.String r2 = "com.google.android.gms.measurement.prefs"
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r2, r3)
            java.lang.String r2 = "allow_remote_dynamite"
            boolean r2 = r7.getBoolean(r2, r3)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            com.google.android.gms.internal.measurement.h.j = r2
            android.content.SharedPreferences$Editor r7 = r7.edit()
            java.lang.String r2 = "allow_remote_dynamite"
            r7.remove(r2)
            r7.apply()
            goto L_0x005d
        L_0x0051:
            r7 = move-exception
            goto L_0x005f
        L_0x0053:
            r7 = move-exception
            java.lang.String r2 = "FA"
            java.lang.String r3 = "Exception reading flag from SharedPreferences."
            android.util.Log.e(r2, r3, r7)
            com.google.android.gms.internal.measurement.h.j = r0
        L_0x005d:
            monitor-exit(r1)
        L_0x005e:
            return
        L_0x005f:
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.h.s(android.content.Context):void");
    }

    /* access modifiers changed from: private */
    public static boolean y(String str, String str2) {
        boolean z;
        if (!(str2 == null || str == null)) {
            try {
                Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public final String A() {
        hb hbVar = new hb();
        this.c.execute(new r(this, hbVar));
        return hbVar.E3(50);
    }

    public final long C() {
        hb hbVar = new hb();
        this.c.execute(new u(this, hbVar));
        Long l = (Long) hb.D3(hbVar.F3(500), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long nanoTime = System.nanoTime();
        ((d) this.b).getClass();
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i2 = this.f + 1;
        this.f = i2;
        return nextLong + ((long) i2);
    }

    public final String D() {
        hb hbVar = new hb();
        this.c.execute(new t(this, hbVar));
        return hbVar.E3(500);
    }

    public final String E() {
        hb hbVar = new hb();
        this.c.execute(new x(this, hbVar));
        return hbVar.E3(500);
    }

    /* access modifiers changed from: protected */
    public final jb b(Context context, boolean z) {
        DynamiteModule.a aVar;
        if (z) {
            try {
                aVar = DynamiteModule.m;
            } catch (DynamiteModule.LoadingException e2) {
                l(e2, true, false);
                return null;
            }
        } else {
            aVar = DynamiteModule.k;
        }
        return ib.asInterface(DynamiteModule.c(context, aVar, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
    }

    public final wu d() {
        return this.d;
    }

    public final Map<String, Object> f(String str, String str2, boolean z) {
        hb hbVar = new hb();
        this.c.execute(new w(this, str, str2, z, hbVar));
        Bundle F3 = hbVar.F3(5000);
        if (F3 == null || F3.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(F3.size());
        for (String str3 : F3.keySet()) {
            Object obj = F3.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void g(Activity activity, String str, String str2) {
        this.c.execute(new n(this, activity, str, str2));
    }

    public final void h(Bundle bundle) {
        this.c.execute(new j(this, bundle));
    }

    public final void k(g6 g6Var) {
        if (g6Var != null) {
            this.c.execute(new a0(this, g6Var));
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void m(String str, String str2, Bundle bundle) {
        this.c.execute(new c0(this, null, str, str2, bundle, true, true));
    }

    public final void n(String str, String str2, Object obj) {
        this.c.execute(new b0(this, str, str2, obj, true));
    }

    public final List<Bundle> r(String str, String str2) {
        hb hbVar = new hb();
        this.c.execute(new l(this, str, str2, hbVar));
        List<Bundle> list = (List) hb.D3(hbVar.F3(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final void t(String str) {
        this.c.execute(new q(this, str));
    }

    public final void u(String str, String str2, Bundle bundle) {
        this.c.execute(new m(this, str, str2, bundle));
    }

    public final String w() {
        hb hbVar = new hb();
        this.c.execute(new s(this, hbVar));
        return hbVar.E3(500);
    }

    public final void x(String str) {
        this.c.execute(new p(this, str));
    }

    public final int z(String str) {
        hb hbVar = new hb();
        this.c.execute(new z(this, str, hbVar));
        Integer num = (Integer) hb.D3(hbVar.F3(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }
}
