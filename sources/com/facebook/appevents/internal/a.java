package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.adjust.sdk.Constants;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f0;
import com.facebook.internal.n;
import com.facebook.internal.y;
import com.facebook.k;
import java.lang.ref.WeakReference;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class a {
    private static final String a = "com.facebook.appevents.internal.a";
    private static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    private static volatile ScheduledFuture c;
    private static final Object d = new Object();
    private static AtomicInteger e = new AtomicInteger(0);
    private static volatile l f;
    private static AtomicBoolean g = new AtomicBoolean(false);
    private static String h;
    private static long i;
    private static int j = 0;
    private static WeakReference<Activity> k;

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.appevents.internal.a$a  reason: collision with other inner class name */
    public static class C0067a implements FeatureManager.b {
        C0067a() {
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                we.h();
            } else {
                we.g();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String unused = a.a;
            int i = y.e;
            k.v(loggingBehavior);
            a.q();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String unused = a.a;
            int i = y.e;
            k.v(loggingBehavior);
            we.k(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String unused = a.a;
            int i = y.e;
            k.v(loggingBehavior);
            a.f(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String unused = a.a;
            int i = y.e;
            k.v(loggingBehavior);
            a.r(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String unused = a.a;
            int i = y.e;
            k.v(loggingBehavior);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            a.c();
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String unused = a.a;
            int i = y.e;
            k.v(loggingBehavior);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String unused = a.a;
            int i = y.e;
            k.v(loggingBehavior);
            AppEventsLogger.h();
            a.d();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements Runnable {
        final /* synthetic */ long a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        c(long j, String str, Context context) {
            this.a = j;
            this.b = str;
            this.c = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            if (!uf.c(this)) {
                try {
                    if (a.f == null) {
                        l unused = a.f = new l(Long.valueOf(this.a), null);
                        m.b(this.b, null, a.h, this.c);
                    } else if (a.f.e() != null) {
                        long longValue = this.a - a.f.e().longValue();
                        n j = FetchedAppSettingsManager.j(k.e());
                        if (j == null) {
                            i = 60;
                        } else {
                            i = j.m();
                        }
                        if (longValue > ((long) (i * Constants.ONE_SECOND))) {
                            m.d(this.b, a.f, a.h);
                            m.b(this.b, null, a.h, this.c);
                            l unused2 = a.f = new l(Long.valueOf(this.a), null);
                        } else if (longValue > 1000) {
                            a.f.i();
                        }
                    }
                    a.f.j(Long.valueOf(this.a));
                    a.f.k();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    static /* synthetic */ int c() {
        int i2 = j;
        j = i2 + 1;
        return i2;
    }

    static /* synthetic */ int d() {
        int i2 = j;
        j = i2 - 1;
        return i2;
    }

    static void f(Activity activity) {
        if (e.decrementAndGet() < 0) {
            e.set(0);
        }
        m();
        long currentTimeMillis = System.currentTimeMillis();
        String k2 = f0.k(activity);
        we.l(activity);
        b.execute(new c(currentTimeMillis, k2));
    }

    private static void m() {
        synchronized (d) {
            if (c != null) {
                c.cancel(false);
            }
            c = null;
        }
    }

    public static Activity n() {
        WeakReference<Activity> weakReference = k;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static UUID o() {
        if (f != null) {
            return f.d();
        }
        return null;
    }

    public static boolean p() {
        return j == 0;
    }

    public static void q() {
        b.execute(new b());
    }

    public static void r(Activity activity) {
        k = new WeakReference<>(activity);
        e.incrementAndGet();
        m();
        long currentTimeMillis = System.currentTimeMillis();
        i = currentTimeMillis;
        String k2 = f0.k(activity);
        we.m(activity);
        re.c(activity);
        lf.e(activity);
        b.execute(new c(currentTimeMillis, k2, activity.getApplicationContext()));
    }

    public static void s(Application application, String str) {
        if (g.compareAndSet(false, true)) {
            FeatureManager.a(FeatureManager.Feature.CodelessEvents, new C0067a());
            h = str;
            application.registerActivityLifecycleCallbacks(new b());
        }
    }
}
