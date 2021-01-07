package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
public final class c {
    protected static final Class<?> a;
    protected static final Field b;
    protected static final Field c;
    protected static final Method d;
    protected static final Method e;
    protected static final Method f;
    private static final Handler g = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: package-private */
    public class a implements Runnable {
        final /* synthetic */ d a;
        final /* synthetic */ Object b;

        a(d dVar, Object obj) {
            this.a = dVar;
            this.b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.a = this.b;
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        final /* synthetic */ Application a;
        final /* synthetic */ d b;

        b(Application application, d dVar) {
            this.a = application;
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.a.unregisterActivityLifecycleCallbacks(this.b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.core.app.c$c  reason: collision with other inner class name */
    public class RunnableC0026c implements Runnable {
        final /* synthetic */ Object a;
        final /* synthetic */ Object b;

        RunnableC0026c(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool = Boolean.FALSE;
            try {
                Method method = c.d;
                if (method != null) {
                    method.invoke(this.a, this.b, bool, "AppCompat recreation");
                } else {
                    c.e.invoke(this.a, this.b, bool);
                }
            } catch (RuntimeException e) {
                if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                    throw e;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* access modifiers changed from: private */
    public static final class d implements Application.ActivityLifecycleCallbacks {
        Object a;
        private Activity b;
        private boolean c = false;
        private boolean f = false;
        private boolean n = false;

        d(Activity activity) {
            this.b = activity;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.b == activity) {
                this.b = null;
                this.f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (this.f && !this.n && !this.c && c.b(this.a, activity)) {
                this.n = true;
                this.a = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.b == activity) {
                this.c = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005d A[SYNTHETIC, Splitter:B:25:0x005d] */
    static {
        /*
            java.lang.Class r0 = java.lang.Boolean.TYPE
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            androidx.core.app.c.g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0015 }
            goto L_0x0016
        L_0x0015:
            r2 = r1
        L_0x0016:
            androidx.core.app.c.a = r2
            r2 = 1
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.String r4 = "mMainThread"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ all -> 0x0025 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0025 }
            goto L_0x0026
        L_0x0025:
            r3 = r1
        L_0x0026:
            androidx.core.app.c.b = r3
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            java.lang.String r4 = "mToken"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch:{ all -> 0x0034 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0034 }
            goto L_0x0035
        L_0x0034:
            r3 = r1
        L_0x0035:
            androidx.core.app.c.c = r3
            java.lang.Class<?> r3 = androidx.core.app.c.a
            r4 = 3
            java.lang.String r5 = "performStopActivity"
            r6 = 2
            r7 = 0
            if (r3 != 0) goto L_0x0042
        L_0x0040:
            r3 = r1
            goto L_0x0055
        L_0x0042:
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x0040 }
            java.lang.Class<android.os.IBinder> r9 = android.os.IBinder.class
            r8[r7] = r9     // Catch:{ all -> 0x0040 }
            r8[r2] = r0     // Catch:{ all -> 0x0040 }
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r6] = r9     // Catch:{ all -> 0x0040 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r8)     // Catch:{ all -> 0x0040 }
            r3.setAccessible(r2)     // Catch:{ all -> 0x0040 }
        L_0x0055:
            androidx.core.app.c.d = r3
            java.lang.Class<?> r3 = androidx.core.app.c.a
            if (r3 != 0) goto L_0x005d
        L_0x005b:
            r3 = r1
            goto L_0x006c
        L_0x005d:
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch:{ all -> 0x005b }
            java.lang.Class<android.os.IBinder> r9 = android.os.IBinder.class
            r8[r7] = r9     // Catch:{ all -> 0x005b }
            r8[r2] = r0     // Catch:{ all -> 0x005b }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r8)     // Catch:{ all -> 0x005b }
            r3.setAccessible(r2)     // Catch:{ all -> 0x005b }
        L_0x006c:
            androidx.core.app.c.e = r3
            java.lang.Class<?> r3 = androidx.core.app.c.a
            boolean r5 = a()
            if (r5 == 0) goto L_0x00ab
            if (r3 != 0) goto L_0x0079
            goto L_0x00ab
        L_0x0079:
            java.lang.String r5 = "requestRelaunchActivity"
            r8 = 9
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ all -> 0x00ab }
            java.lang.Class<android.os.IBinder> r9 = android.os.IBinder.class
            r8[r7] = r9     // Catch:{ all -> 0x00ab }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r8[r2] = r7     // Catch:{ all -> 0x00ab }
            java.lang.Class<java.util.List> r7 = java.util.List.class
            r8[r6] = r7     // Catch:{ all -> 0x00ab }
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00ab }
            r8[r4] = r6     // Catch:{ all -> 0x00ab }
            r4 = 4
            r8[r4] = r0     // Catch:{ all -> 0x00ab }
            r4 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r8[r4] = r6     // Catch:{ all -> 0x00ab }
            r4 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r8[r4] = r6     // Catch:{ all -> 0x00ab }
            r4 = 7
            r8[r4] = r0     // Catch:{ all -> 0x00ab }
            r4 = 8
            r8[r4] = r0     // Catch:{ all -> 0x00ab }
            java.lang.reflect.Method r0 = r3.getDeclaredMethod(r5, r8)     // Catch:{ all -> 0x00ab }
            r0.setAccessible(r2)     // Catch:{ all -> 0x00ab }
            r1 = r0
        L_0x00ab:
            androidx.core.app.c.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.c.<clinit>():void");
    }

    private static boolean a() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    protected static boolean b(Object obj, Activity activity) {
        try {
            Object obj2 = c.get(activity);
            if (obj2 != obj) {
                return false;
            }
            g.postAtFrontOfQueue(new RunnableC0026c(b.get(activity), obj2));
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean c(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f == null) {
            return false;
        } else {
            if (e == null && d == null) {
                return false;
            }
            try {
                Object obj2 = c.get(activity);
                if (obj2 == null || (obj = b.get(activity)) == null) {
                    return false;
                }
                Application application = activity.getApplication();
                d dVar = new d(activity);
                application.registerActivityLifecycleCallbacks(dVar);
                Handler handler = g;
                handler.post(new a(dVar, obj2));
                try {
                    if (a()) {
                        Method method = f;
                        Boolean bool = Boolean.FALSE;
                        method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                    } else {
                        activity.recreate();
                    }
                    handler.post(new b(application, dVar));
                    return true;
                } catch (Throwable th) {
                    g.post(new b(application, dVar));
                    throw th;
                }
            } catch (Throwable unused) {
                return false;
            }
        }
    }
}
