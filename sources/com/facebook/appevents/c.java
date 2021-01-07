package com.facebook.appevents;

import android.content.Context;
import android.content.Intent;
import com.facebook.FacebookRequestError;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.h0;
import com.facebook.internal.y;
import com.facebook.k;
import com.facebook.m;
import com.facebook.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* access modifiers changed from: package-private */
public class c {
    private static volatile b a = new b();
    private static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    private static ScheduledFuture c;
    private static final Runnable d = new a();

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    c.b(null);
                    if (e.c() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                        c.k(FlushReason.TIMER);
                    }
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    d.b(c.c());
                    c.d(new b());
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.appevents.c$c  reason: collision with other inner class name */
    public static class RunnableC0066c implements Runnable {
        final /* synthetic */ FlushReason a;

        RunnableC0066c(FlushReason flushReason) {
            this.a = flushReason;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    c.k(this.a);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    static class d implements Runnable {
        final /* synthetic */ AccessTokenAppIdPair a;
        final /* synthetic */ AppEvent b;

        d(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
            this.a = accessTokenAppIdPair;
            this.b = appEvent;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    c.c().a(this.a, this.b);
                    if (e.c() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY && c.c().d() > 100) {
                        c.k(FlushReason.EVENT_THRESHOLD);
                    } else if (c.a() == null) {
                        c.b(c.f().schedule(c.e(), 15, TimeUnit.SECONDS));
                    }
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class e implements m.c {
        final /* synthetic */ AccessTokenAppIdPair a;
        final /* synthetic */ m b;
        final /* synthetic */ j c;
        final /* synthetic */ h d;

        e(AccessTokenAppIdPair accessTokenAppIdPair, m mVar, j jVar, h hVar) {
            this.a = accessTokenAppIdPair;
            this.b = mVar;
            this.c = jVar;
            this.d = hVar;
        }

        @Override // com.facebook.m.c
        public void b(q qVar) {
            c.g(this.a, this.b, qVar, this.c, this.d);
        }
    }

    /* access modifiers changed from: package-private */
    public static class f implements Runnable {
        final /* synthetic */ AccessTokenAppIdPair a;
        final /* synthetic */ j b;

        f(AccessTokenAppIdPair accessTokenAppIdPair, j jVar) {
            this.a = accessTokenAppIdPair;
            this.b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    d.a(this.a, this.b);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    c() {
    }

    static /* synthetic */ ScheduledFuture a() {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            return c;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    static /* synthetic */ ScheduledFuture b(ScheduledFuture scheduledFuture) {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            c = scheduledFuture;
            return scheduledFuture;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    static /* synthetic */ b c() {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            return a;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    static /* synthetic */ b d(b bVar) {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            a = bVar;
            return bVar;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    static /* synthetic */ Runnable e() {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    static /* synthetic */ ScheduledExecutorService f() {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            return b;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    static /* synthetic */ void g(AccessTokenAppIdPair accessTokenAppIdPair, m mVar, q qVar, j jVar, h hVar) {
        if (!uf.c(c.class)) {
            try {
                m(accessTokenAppIdPair, mVar, qVar, jVar, hVar);
            } catch (Throwable th) {
                uf.b(th, c.class);
            }
        }
    }

    public static void h(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        if (!uf.c(c.class)) {
            try {
                b.execute(new d(accessTokenAppIdPair, appEvent));
            } catch (Throwable th) {
                uf.b(th, c.class);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.m i(com.facebook.appevents.AccessTokenAppIdPair r10, com.facebook.appevents.j r11, boolean r12, com.facebook.appevents.h r13) {
        /*
            java.lang.Class<com.facebook.appevents.c> r0 = com.facebook.appevents.c.class
            boolean r1 = defpackage.uf.c(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = r10.b()     // Catch:{ all -> 0x0087 }
            r3 = 0
            com.facebook.internal.n r4 = com.facebook.internal.FetchedAppSettingsManager.n(r1, r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r5 = "%s/activities"
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0087 }
            r6[r3] = r1     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x0087 }
            com.facebook.m r1 = com.facebook.m.s(r2, r1, r2, r2)     // Catch:{ all -> 0x0087 }
            android.os.Bundle r5 = r1.n()     // Catch:{ all -> 0x0087 }
            if (r5 != 0) goto L_0x002d
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x0087 }
            r5.<init>()     // Catch:{ all -> 0x0087 }
        L_0x002d:
            java.lang.String r6 = "access_token"
            java.lang.String r7 = r10.a()     // Catch:{ all -> 0x0087 }
            r5.putString(r6, r7)     // Catch:{ all -> 0x0087 }
            com.facebook.appevents.e.d()     // Catch:{ all -> 0x0087 }
            java.lang.Class<com.facebook.appevents.e> r6 = com.facebook.appevents.e.class
            boolean r7 = defpackage.uf.c(r6)     // Catch:{ all -> 0x0087 }
            java.lang.String r8 = "install_referrer"
            if (r7 == 0) goto L_0x0044
            goto L_0x005f
        L_0x0044:
            com.facebook.appevents.f r7 = new com.facebook.appevents.f     // Catch:{ all -> 0x005b }
            r7.<init>()     // Catch:{ all -> 0x005b }
            com.facebook.internal.w.b(r7)     // Catch:{ all -> 0x005b }
            android.content.Context r7 = com.facebook.k.d()     // Catch:{ all -> 0x005b }
            java.lang.String r9 = "com.facebook.sdk.appEventPreferences"
            android.content.SharedPreferences r7 = r7.getSharedPreferences(r9, r3)     // Catch:{ all -> 0x005b }
            java.lang.String r6 = r7.getString(r8, r2)     // Catch:{ all -> 0x005b }
            goto L_0x0060
        L_0x005b:
            r7 = move-exception
            defpackage.uf.b(r7, r6)
        L_0x005f:
            r6 = r2
        L_0x0060:
            if (r6 == 0) goto L_0x0065
            r5.putString(r8, r6)
        L_0x0065:
            r1.C(r5)
            if (r4 == 0) goto L_0x006e
            boolean r3 = r4.p()
        L_0x006e:
            android.content.Context r4 = com.facebook.k.d()
            int r12 = r11.e(r1, r4, r3, r12)
            if (r12 != 0) goto L_0x0079
            return r2
        L_0x0079:
            int r3 = r13.a
            int r3 = r3 + r12
            r13.a = r3
            com.facebook.appevents.c$e r12 = new com.facebook.appevents.c$e
            r12.<init>(r10, r1, r11, r13)
            r1.A(r12)
            return r1
        L_0x0087:
            r10 = move-exception
            defpackage.uf.b(r10, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.c.i(com.facebook.appevents.AccessTokenAppIdPair, com.facebook.appevents.j, boolean, com.facebook.appevents.h):com.facebook.m");
    }

    public static void j(FlushReason flushReason) {
        if (!uf.c(c.class)) {
            try {
                b.execute(new RunnableC0066c(flushReason));
            } catch (Throwable th) {
                uf.b(th, c.class);
            }
        }
    }

    static void k(FlushReason flushReason) {
        if (!uf.c(c.class)) {
            try {
                a.b(d.c());
                try {
                    h o = o(flushReason, a);
                    if (o != null) {
                        Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                        intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", o.a);
                        intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", o.b);
                        e6.b(k.d()).d(intent);
                    }
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                uf.b(th, c.class);
            }
        }
    }

    public static Set<AccessTokenAppIdPair> l() {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            return a.f();
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }

    private static void m(AccessTokenAppIdPair accessTokenAppIdPair, m mVar, q qVar, j jVar, h hVar) {
        FlushResult flushResult;
        FlushResult flushResult2 = FlushResult.NO_CONNECTIVITY;
        if (!uf.c(c.class)) {
            try {
                FacebookRequestError e2 = qVar.e();
                FlushResult flushResult3 = FlushResult.SUCCESS;
                boolean z = true;
                if (e2 == null) {
                    flushResult = flushResult3;
                } else if (e2.b() == -1) {
                    flushResult = flushResult2;
                } else {
                    String.format("Failed:\n  Response: %s\n  Error %s", qVar.toString(), e2.toString());
                    flushResult = FlushResult.SERVER_ERROR;
                }
                k.v(LoggingBehavior.APP_EVENTS);
                if (e2 == null) {
                    z = false;
                }
                jVar.b(z);
                if (flushResult == flushResult2) {
                    k.l().execute(new f(accessTokenAppIdPair, jVar));
                }
                if (flushResult != flushResult3 && hVar.b != flushResult2) {
                    hVar.b = flushResult;
                }
            } catch (Throwable th) {
                uf.b(th, c.class);
            }
        }
    }

    public static void n() {
        if (!uf.c(c.class)) {
            try {
                b.execute(new b());
            } catch (Throwable th) {
                uf.b(th, c.class);
            }
        }
    }

    private static h o(FlushReason flushReason, b bVar) {
        if (uf.c(c.class)) {
            return null;
        }
        try {
            h hVar = new h();
            Context d2 = k.d();
            h0.h();
            boolean z = d2.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
            ArrayList arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : bVar.f()) {
                m i = i(accessTokenAppIdPair, bVar.c(accessTokenAppIdPair), z, hVar);
                if (i != null) {
                    arrayList.add(i);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            flushReason.toString();
            int i2 = y.e;
            k.v(loggingBehavior);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((m) it.next()).g();
            }
            return hVar;
        } catch (Throwable th) {
            uf.b(th, c.class);
            return null;
        }
    }
}
