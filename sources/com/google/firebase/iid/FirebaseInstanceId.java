package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.tasks.j;
import com.google.firebase.c;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.iid.q0;
import com.google.firebase.installations.g;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

public class FirebaseInstanceId {
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static q0 j;
    private static final Pattern k = Pattern.compile("\\AA[\\w-]{38}\\z");
    static ScheduledExecutorService l;
    final Executor a;
    private final c b;
    private final e0 c;
    private final s d;
    private final i0 e;
    private final g f;
    private boolean g = false;
    private final a h;

    /* access modifiers changed from: private */
    public class a {
        private boolean a;
        private final r10 b;
        private boolean c;
        private p10<com.google.firebase.a> d;
        private Boolean e;

        a(r10 r10) {
            this.b = r10;
        }

        private Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context g = FirebaseInstanceId.this.b.g();
            SharedPreferences sharedPreferences = g.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = g.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(g.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
            if (r1.serviceInfo != null) goto L_0x000d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void a() {
            /*
                r4 = this;
                monitor-enter(r4)
                boolean r0 = r4.c     // Catch:{ all -> 0x0057 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r4)
                return
            L_0x0007:
                r0 = 1
                java.lang.String r1 = "com.google.firebase.messaging.FirebaseMessaging"
                java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x000f }
            L_0x000d:
                r3 = 1
                goto L_0x0037
            L_0x000f:
                com.google.firebase.iid.FirebaseInstanceId r1 = com.google.firebase.iid.FirebaseInstanceId.this
                com.google.firebase.c r1 = com.google.firebase.iid.FirebaseInstanceId.a(r1)
                android.content.Context r1 = r1.g()
                android.content.Intent r2 = new android.content.Intent
                java.lang.String r3 = "com.google.firebase.MESSAGING_EVENT"
                r2.<init>(r3)
                java.lang.String r3 = r1.getPackageName()
                r2.setPackage(r3)
                android.content.pm.PackageManager r1 = r1.getPackageManager()
                r3 = 0
                android.content.pm.ResolveInfo r1 = r1.resolveService(r2, r3)
                if (r1 == 0) goto L_0x0037
                android.content.pm.ServiceInfo r1 = r1.serviceInfo
                if (r1 == 0) goto L_0x0037
                goto L_0x000d
            L_0x0037:
                r4.a = r3
                java.lang.Boolean r1 = r4.c()
                r4.e = r1
                if (r1 != 0) goto L_0x0053
                boolean r1 = r4.a
                if (r1 == 0) goto L_0x0053
                com.google.firebase.iid.p r1 = new com.google.firebase.iid.p
                r1.<init>(r4)
                r4.d = r1
                r10 r2 = r4.b
                java.lang.Class<com.google.firebase.a> r3 = com.google.firebase.a.class
                r2.a(r3, r1)
            L_0x0053:
                r4.c = r0
                monitor-exit(r4)
                return
            L_0x0057:
                r0 = move-exception
                monitor-exit(r4)
                goto L_0x005b
            L_0x005a:
                throw r0
            L_0x005b:
                goto L_0x005a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceId.a.a():void");
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean b() {
            a();
            Boolean bool = this.e;
            if (bool == null) {
                return this.a && FirebaseInstanceId.this.b.o();
            }
            return bool.booleanValue();
        }
    }

    FirebaseInstanceId(c cVar, r10 r10, b20 b20, HeartBeatInfo heartBeatInfo, g gVar) {
        e0 e0Var = new e0(cVar.g());
        ExecutorService a2 = h.a();
        ExecutorService a3 = h.a();
        if (e0.c(cVar) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (j == null) {
                    j = new q0(cVar.g());
                }
            }
            this.b = cVar;
            this.c = e0Var;
            this.d = new s(cVar, e0Var, b20, heartBeatInfo, gVar);
            this.a = a3;
            this.h = new a(r10);
            this.e = new i0(a2);
            this.f = gVar;
            ((ThreadPoolExecutor) a3).execute(new j(this));
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    private static <T> T c(com.google.android.gms.tasks.g<T> gVar) {
        com.google.android.exoplayer2.util.g.k(gVar, "Task must not be null");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        gVar.c(l.a, new m(countDownLatch));
        countDownLatch.await(30000, TimeUnit.MILLISECONDS);
        if (gVar.r()) {
            return gVar.n();
        }
        if (gVar.p()) {
            throw new CancellationException("Task is already canceled");
        } else if (gVar.q()) {
            throw new IllegalStateException(gVar.m());
        } else {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    private static void e(c cVar) {
        com.google.android.exoplayer2.util.g.h(cVar.j().e(), "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        com.google.android.exoplayer2.util.g.h(cVar.j().c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        com.google.android.exoplayer2.util.g.h(cVar.j().b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        com.google.android.exoplayer2.util.g.d(cVar.j().c().contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.exoplayer2.util.g.d(k.matcher(cVar.j().b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Keep
    public static FirebaseInstanceId getInstance(c cVar) {
        e(cVar);
        return (FirebaseInstanceId) cVar.f(FirebaseInstanceId.class);
    }

    public static FirebaseInstanceId k() {
        return getInstance(c.h());
    }

    private com.google.android.gms.tasks.g<w> m(String str, String str2) {
        if (str2.isEmpty() || str2.equalsIgnoreCase("fcm") || str2.equalsIgnoreCase("gcm")) {
            str2 = "*";
        }
        return j.e(null).l(this.a, new k(this, str, str2));
    }

    private String n() {
        if ("[DEFAULT]".equals(this.b.i())) {
            return "";
        }
        return this.b.k();
    }

    static boolean p() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void z() {
        if (B(j.d(n(), e0.c(this.b), "*"))) {
            y();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void A(long j2) {
        f(new r0(this, Math.min(Math.max(30L, j2 << 1), i)), j2);
        this.g = true;
    }

    /* access modifiers changed from: package-private */
    public boolean B(q0.a aVar) {
        return aVar == null || aVar.a(this.c.a());
    }

    /* access modifiers changed from: package-private */
    public String d() {
        String c2 = e0.c(this.b);
        e(this.b);
        if (Looper.getMainLooper() != Looper.myLooper()) {
            try {
                return ((w) j.b(m(c2, "*"), 30000, TimeUnit.MILLISECONDS)).getToken();
            } catch (ExecutionException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof IOException) {
                    if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                        w();
                    }
                    throw ((IOException) cause);
                } else if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                } else {
                    throw new IOException(e2);
                }
            } catch (InterruptedException | TimeoutException unused) {
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("MAIN_THREAD");
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (l == null) {
                l = new ScheduledThreadPoolExecutor(1, new tr("FirebaseInstanceId"));
            }
            l.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        q0 q0Var = j;
        String n = n();
        synchronized (q0Var) {
            String concat = String.valueOf(n).concat("|T|");
            SharedPreferences.Editor edit = q0Var.a.edit();
            for (String str : q0Var.a.getAll().keySet()) {
                if (str.startsWith(concat)) {
                    edit.remove(str);
                }
            }
            edit.commit();
        }
        y();
    }

    /* access modifiers changed from: package-private */
    public c h() {
        return this.b;
    }

    public String i() {
        e(this.b);
        z();
        return j();
    }

    /* access modifiers changed from: package-private */
    public String j() {
        try {
            j.f(this.b.k());
            return (String) c(this.f.getId());
        } catch (InterruptedException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public com.google.android.gms.tasks.g<w> l() {
        e(this.b);
        return m(e0.c(this.b), "*");
    }

    /* access modifiers changed from: package-private */
    public q0.a o() {
        return j.d(n(), e0.c(this.b), "*");
    }

    public boolean q() {
        return this.h.b();
    }

    public boolean r() {
        return this.c.g();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ com.google.android.gms.tasks.g s(String str, String str2, String str3, String str4) {
        j.e(n(), str, str2, str4, this.c.a());
        return j.e(new x(str3, str4));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ com.google.android.gms.tasks.g t(String str, String str2, String str3) {
        return this.d.b(str, str2, str3).t(this.a, new o(this, str2, str3, str));
    }

    /* access modifiers changed from: package-private */
    public final com.google.android.gms.tasks.g u(String str, String str2) {
        String j2 = j();
        q0.a d2 = j.d(n(), str, str2);
        if (!B(d2)) {
            return j.e(new x(j2, d2.a));
        }
        return this.e.a(str, str2, new n(this, j2, str, str2));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void v() {
        if (q()) {
            z();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void w() {
        j.c();
        if (q()) {
            y();
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void x(boolean z) {
        this.g = z;
    }

    /* access modifiers changed from: package-private */
    public synchronized void y() {
        if (!this.g) {
            A(0);
        }
    }
}
