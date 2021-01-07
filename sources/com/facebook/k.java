package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.a0;
import com.facebook.internal.d0;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.x;
import com.spotify.music.libs.facebook.n;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {
    private static final HashSet<LoggingBehavior> a = new HashSet<>(Arrays.asList(LoggingBehavior.DEVELOPER_ERRORS));
    private static Executor b;
    private static volatile String c;
    private static volatile String d;
    private static volatile String e;
    private static volatile Boolean f;
    private static volatile String g = "facebook.com";
    private static AtomicLong h = new AtomicLong(65536);
    private static x<File> i;
    private static Context j;
    private static int k = 64206;
    private static final Object l = new Object();
    private static String m = "v6.0";
    public static boolean n = false;
    public static boolean o = false;
    private static Boolean p;
    private static Boolean q;
    private static j r = new a();

    /* access modifiers changed from: package-private */
    public static class a implements j {
        a() {
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements Callable<File> {
        b() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public File call() {
            return k.j.getCacheDir();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements FeatureManager.b {
        c() {
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                InstrumentData.b.h();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class d implements FeatureManager.b {
        d() {
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                com.facebook.appevents.g.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class e implements FeatureManager.b {
        e() {
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                k.n = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class f implements FeatureManager.b {
        f() {
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                k.o = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class g implements FeatureManager.b {
        g() {
        }

        @Override // com.facebook.internal.FeatureManager.b
        public void a(boolean z) {
            if (z) {
                fg.a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class h implements Callable<Void> {
        final /* synthetic */ AbstractC0072k a;
        final /* synthetic */ Context b;

        h(AbstractC0072k kVar, Context context) {
            this.a = kVar;
            this.b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public Void call() {
            Bundle bundle;
            d.f().g();
            t.b().c();
            if (a.p()) {
                Parcelable.Creator<r> creator = r.CREATOR;
                if (t.b().a() == null) {
                    r.b();
                }
            }
            AbstractC0072k kVar = this.a;
            if (kVar != null) {
                ((n) kVar).a.countDown();
            }
            AppEventsLogger.e(k.j, k.c);
            int i = y.i;
            try {
                Context d = k.d();
                ApplicationInfo applicationInfo = d.getPackageManager().getApplicationInfo(d.getPackageName(), 128);
                if (!(applicationInfo == null || (bundle = applicationInfo.metaData) == null || !bundle.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false))) {
                    com.facebook.appevents.i iVar = new com.facebook.appevents.i(d);
                    Bundle bundle2 = new Bundle();
                    if (!f0.x()) {
                        bundle2.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
                    }
                    iVar.d("fb_auto_applink", bundle2);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            AppEventsLogger.g(this.b.getApplicationContext()).b();
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public static class i implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        i(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    k.x(this.a, this.b);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    public interface j {
    }

    /* renamed from: com.facebook.k$k  reason: collision with other inner class name */
    public interface AbstractC0072k {
    }

    static {
        Collection<String> collection = d0.a;
        Boolean bool = Boolean.FALSE;
        p = bool;
        q = bool;
    }

    @Deprecated
    public static synchronized void A(Context context, AbstractC0072k kVar) {
        synchronized (k.class) {
            if (p.booleanValue()) {
                if (kVar != null) {
                    ((n) kVar).a.countDown();
                }
                return;
            }
            h0.f(context, "applicationContext");
            h0.c(context, false);
            h0.d(context, false);
            j = context.getApplicationContext();
            AppEventsLogger.c(context);
            w(j);
            if (!f0.C(c)) {
                Boolean bool = Boolean.TRUE;
                p = bool;
                if (y.f()) {
                    q = bool;
                }
                if ((j instanceof Application) && y.g()) {
                    com.facebook.appevents.internal.a.s((Application) j, c);
                }
                FetchedAppSettingsManager.k();
                a0.t();
                com.facebook.internal.c.a(j);
                i = new x<>(new b());
                FeatureManager.a(FeatureManager.Feature.Instrument, new c());
                FeatureManager.a(FeatureManager.Feature.AppEvents, new d());
                FeatureManager.a(FeatureManager.Feature.ChromeCustomTabsPrefetching, new e());
                FeatureManager.a(FeatureManager.Feature.IgnoreAppSwitchToLoggedOut, new f());
                FeatureManager.a(FeatureManager.Feature.Monitoring, new g());
                l().execute(new FutureTask(new h(kVar, context)));
                return;
            }
            throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
        }
    }

    public static boolean c() {
        return y.e();
    }

    public static Context d() {
        h0.h();
        return j;
    }

    public static String e() {
        h0.h();
        return c;
    }

    public static String f() {
        h0.h();
        return d;
    }

    public static boolean g() {
        return y.g();
    }

    public static File h() {
        h0.h();
        return i.c();
    }

    public static int i() {
        h0.h();
        return k;
    }

    public static String j() {
        h0.h();
        return e;
    }

    public static boolean k() {
        return y.h();
    }

    public static Executor l() {
        synchronized (l) {
            if (b == null) {
                b = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return b;
    }

    public static String m() {
        return g;
    }

    public static String n() {
        String.format("getGraphApiVersion: %s", m);
        return m;
    }

    public static String o() {
        a e2 = a.e();
        String j2 = e2 != null ? e2.j() : null;
        if (j2 == null) {
            return g;
        }
        if (j2.equals("gaming")) {
            return g.replace("facebook.com", "fb.gg");
        }
        return g;
    }

    public static boolean p(Context context) {
        h0.h();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static boolean q() {
        return y.i();
    }

    public static long r() {
        h0.h();
        return h.get();
    }

    public static boolean s(int i2) {
        int i3 = k;
        return i2 >= i3 && i2 < i3 + 100;
    }

    public static synchronized boolean t() {
        boolean booleanValue;
        synchronized (k.class) {
            booleanValue = q.booleanValue();
        }
        return booleanValue;
    }

    public static synchronized boolean u() {
        boolean booleanValue;
        synchronized (k.class) {
            booleanValue = p.booleanValue();
        }
        return booleanValue;
    }

    public static boolean v(LoggingBehavior loggingBehavior) {
        synchronized (a) {
        }
        return false;
    }

    static void w(Context context) {
        if (context != null) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
                if (applicationInfo != null && applicationInfo.metaData != null) {
                    if (c == null) {
                        Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                        if (obj instanceof String) {
                            String str = (String) obj;
                            if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                c = str.substring(2);
                            } else {
                                c = str;
                            }
                        } else if (obj instanceof Number) {
                            throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                        }
                    }
                    if (d == null) {
                        d = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                    }
                    if (e == null) {
                        e = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                    }
                    if (k == 64206) {
                        k = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
                    }
                    if (f == null) {
                        f = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    static void x(Context context, String str) {
        if (!uf.c(k.class)) {
            if (context == null || str == null) {
                throw new IllegalArgumentException("Both context and applicationId must be non-null");
            }
            try {
                com.facebook.internal.b e2 = com.facebook.internal.b.e(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                String str2 = str + "ping";
                long j2 = sharedPreferences.getLong(str2, 0);
                try {
                    JSONObject a2 = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.MOBILE_INSTALL_EVENT, e2, AppEventsLogger.c(context), p(context), context);
                    String format = String.format("%s/activities", str);
                    ((a) r).getClass();
                    m s = m.s(null, format, a2, null);
                    if (j2 == 0 && s.g().e() == null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putLong(str2, System.currentTimeMillis());
                        edit.apply();
                    }
                } catch (JSONException e3) {
                    throw new FacebookException("An error occurred while publishing install.", e3);
                }
            } catch (Exception unused) {
            } catch (Throwable th) {
                uf.b(th, k.class);
            }
        }
    }

    public static void y(Context context, String str) {
        if (!uf.c(k.class)) {
            try {
                l().execute(new i(context.getApplicationContext(), str));
            } catch (Throwable th) {
                uf.b(th, k.class);
            }
        }
    }

    @Deprecated
    public static synchronized void z(Context context) {
        synchronized (k.class) {
            A(context, null);
        }
    }
}
