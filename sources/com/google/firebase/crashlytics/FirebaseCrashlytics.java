package com.google.firebase.crashlytics;

import com.google.android.gms.tasks.g;
import com.google.firebase.crashlytics.internal.common.c0;
import com.google.firebase.crashlytics.internal.settings.c;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class FirebaseCrashlytics {
    private final c0 a;

    class a implements Callable<Void> {
        final /* synthetic */ wy a;
        final /* synthetic */ ExecutorService b;
        final /* synthetic */ c c;
        final /* synthetic */ boolean f;
        final /* synthetic */ c0 n;

        a(wy wyVar, ExecutorService executorService, c cVar, boolean z, c0 c0Var) {
            this.a = wyVar;
            this.b = executorService;
            this.c = cVar;
            this.f = z;
            this.n = c0Var;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Void call() {
            this.a.c(this.b, this.c);
            if (!this.f) {
                return null;
            }
            this.n.g(this.c);
            return null;
        }
    }

    private FirebaseCrashlytics(c0 c0Var) {
        this.a = c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [oy] */
    /* JADX WARN: Type inference failed for: r1v6, types: [cz] */
    /* JADX WARN: Type inference failed for: r1v8, types: [bz] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.firebase.crashlytics.a, oy$b] */
    /* JADX WARN: Type inference failed for: r0v15, types: [yy, az] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c3  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.crashlytics.FirebaseCrashlytics a(com.google.firebase.c r16, com.google.firebase.installations.g r17, defpackage.sy r18, defpackage.oy r19) {
        /*
            r8 = r16
            r0 = r19
            android.content.Context r9 = r16.g()
            java.lang.String r1 = r9.getPackageName()
            com.google.firebase.crashlytics.internal.common.n0 r2 = new com.google.firebase.crashlytics.internal.common.n0
            r3 = r17
            r2.<init>(r9, r1, r3)
            com.google.firebase.crashlytics.internal.common.i0 r4 = new com.google.firebase.crashlytics.internal.common.i0
            r4.<init>(r8)
            if (r18 != 0) goto L_0x0021
            uy r1 = new uy
            r1.<init>()
            r3 = r1
            goto L_0x0023
        L_0x0021:
            r3 = r18
        L_0x0023:
            wy r11 = new wy
            r11.<init>(r8, r9, r2, r4)
            if (r0 == 0) goto L_0x008f
            ty r1 = defpackage.ty.f()
            java.lang.String r5 = "Firebase Analytics is available."
            r1.b(r5)
            bz r1 = new bz
            r1.<init>(r0)
            com.google.firebase.crashlytics.a r5 = new com.google.firebase.crashlytics.a
            r5.<init>()
            java.lang.String r6 = "clx"
            oy$a r6 = r0.c(r6, r5)
            if (r6 != 0) goto L_0x005f
            ty r6 = defpackage.ty.f()
            java.lang.String r7 = "Could not register AnalyticsConnectorListener with Crashlytics origin."
            r6.b(r7)
            java.lang.String r6 = "crash"
            oy$a r6 = r0.c(r6, r5)
            if (r6 == 0) goto L_0x005f
            ty r0 = defpackage.ty.f()
            java.lang.String r7 = "A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version."
            r0.h(r7)
        L_0x005f:
            if (r6 == 0) goto L_0x0080
            ty r0 = defpackage.ty.f()
            java.lang.String r6 = "Firebase Analytics listener registered successfully."
            r0.b(r6)
            az r0 = new az
            r0.<init>()
            zy r6 = new zy
            r7 = 500(0x1f4, float:7.0E-43)
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r6.<init>(r1, r7, r10)
            r5.b(r0)
            r5.c(r6)
            r5 = r0
            goto L_0x00a4
        L_0x0080:
            ty r0 = defpackage.ty.f()
            java.lang.String r5 = "Firebase Analytics listener registration failed."
            r0.b(r5)
            fz r0 = new fz
            r0.<init>()
            goto L_0x00a2
        L_0x008f:
            ty r0 = defpackage.ty.f()
            java.lang.String r1 = "Firebase Analytics is unavailable."
            r0.b(r1)
            fz r0 = new fz
            r0.<init>()
            cz r1 = new cz
            r1.<init>()
        L_0x00a2:
            r5 = r0
            r6 = r1
        L_0x00a4:
            java.lang.String r0 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r7 = com.google.firebase.crashlytics.internal.common.l0.a(r0)
            com.google.firebase.crashlytics.internal.common.c0 r15 = new com.google.firebase.crashlytics.internal.common.c0
            r0 = r15
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = r11.e()
            if (r0 != 0) goto L_0x00c3
            ty r0 = defpackage.ty.f()
            java.lang.String r1 = "Unable to start Crashlytics."
            r0.d(r1)
            r0 = 0
            return r0
        L_0x00c3:
            java.lang.String r0 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r0 = com.google.firebase.crashlytics.internal.common.l0.a(r0)
            com.google.firebase.crashlytics.internal.settings.c r13 = r11.f(r9, r8, r0)
            boolean r14 = r15.l(r13)
            com.google.firebase.crashlytics.FirebaseCrashlytics$a r1 = new com.google.firebase.crashlytics.FirebaseCrashlytics$a
            r10 = r1
            r12 = r0
            r2 = r15
            r10.<init>(r11, r12, r13, r14, r15)
            com.google.android.gms.tasks.j.c(r0, r1)
            com.google.firebase.crashlytics.FirebaseCrashlytics r0 = new com.google.firebase.crashlytics.FirebaseCrashlytics
            r0.<init>(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.FirebaseCrashlytics.a(com.google.firebase.c, com.google.firebase.installations.g, sy, oy):com.google.firebase.crashlytics.FirebaseCrashlytics");
    }

    public static FirebaseCrashlytics getInstance() {
        FirebaseCrashlytics firebaseCrashlytics = (FirebaseCrashlytics) com.google.firebase.c.h().f(FirebaseCrashlytics.class);
        if (firebaseCrashlytics != null) {
            return firebaseCrashlytics;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public g<Boolean> checkForUnsentReports() {
        return this.a.d();
    }

    public void deleteUnsentReports() {
        this.a.e();
    }

    public boolean didCrashOnPreviousExecution() {
        return this.a.f();
    }

    public void log(String str) {
        this.a.i(str);
    }

    public void recordException(Throwable th) {
        if (th == null) {
            ty.f().h("Crashlytics is ignoring a request to log a null exception.");
        } else {
            this.a.j(th);
        }
    }

    public void sendUnsentReports() {
        this.a.m();
    }

    public void setCrashlyticsCollectionEnabled(boolean z) {
        this.a.n(Boolean.valueOf(z));
    }

    public void setCustomKey(String str, boolean z) {
        this.a.o(str, Boolean.toString(z));
    }

    public void setUserId(String str) {
        this.a.p(str);
    }

    public void setCrashlyticsCollectionEnabled(Boolean bool) {
        this.a.n(bool);
    }

    public void setCustomKey(String str, double d) {
        this.a.o(str, Double.toString(d));
    }

    public void setCustomKey(String str, float f) {
        this.a.o(str, Float.toString(f));
    }

    public void setCustomKey(String str, int i) {
        this.a.o(str, Integer.toString(i));
    }

    public void setCustomKey(String str, long j) {
        this.a.o(str, Long.toString(j));
    }

    public void setCustomKey(String str, String str2) {
        this.a.o(str, str2);
    }
}
