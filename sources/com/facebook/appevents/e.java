package com.facebook.appevents;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.f0;
import com.facebook.internal.h0;
import com.facebook.internal.m;
import com.facebook.internal.y;
import com.facebook.k;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* access modifiers changed from: package-private */
public class e {
    private static ScheduledThreadPoolExecutor c;
    private static final Object d = new Object();
    private static String e;
    private static boolean f;
    public static final /* synthetic */ int g = 0;
    private final String a;
    private final AccessTokenAppIdPair b;

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ e b;

        a(Context context, e eVar) {
            this.a = context;
            this.b = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    Bundle bundle = new Bundle();
                    String[] strArr = {"com.facebook.core.Core", "com.facebook.login.Login", "com.facebook.share.Share", "com.facebook.places.Places", "com.facebook.messenger.Messenger", "com.facebook.applinks.AppLinks", "com.facebook.marketing.Marketing", "com.facebook.gamingservices.GamingServices", "com.facebook.all.All", "com.android.billingclient.api.BillingClient", "com.android.vending.billing.IInAppBillingService"};
                    String[] strArr2 = {"core_lib_included", "login_lib_included", "share_lib_included", "places_lib_included", "messenger_lib_included", "applinks_lib_included", "marketing_lib_included", "gamingservices_lib_included", "all_lib_included", "billing_client_lib_included", "billing_service_lib_included"};
                    int i = 0;
                    for (int i2 = 0; i2 < 11; i2++) {
                        String str = strArr[i2];
                        String str2 = strArr2[i2];
                        try {
                            Class.forName(str);
                            bundle.putInt(str2, 1);
                            i |= 1 << i2;
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                    SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
                    if (sharedPreferences.getInt("kitsBitmask", 0) != i) {
                        sharedPreferences.edit().putInt("kitsBitmask", i).apply();
                        this.b.j("fb_sdk_initialize", null, bundle);
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
                    HashSet hashSet = new HashSet();
                    for (AccessTokenAppIdPair accessTokenAppIdPair : c.l()) {
                        hashSet.add(accessTokenAppIdPair.b());
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        FetchedAppSettingsManager.n((String) it.next(), true);
                    }
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    e(Context context, String str, com.facebook.a aVar) {
        this(f0.k(context), str, aVar);
    }

    static Executor a() {
        if (uf.c(e.class)) {
            return null;
        }
        try {
            if (c == null) {
                f();
            }
            return c;
        } catch (Throwable th) {
            uf.b(th, e.class);
            return null;
        }
    }

    static String b(Context context) {
        if (uf.c(e.class)) {
            return null;
        }
        try {
            if (e == null) {
                synchronized (d) {
                    if (e == null) {
                        String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                        e = string;
                        if (string == null) {
                            e = "XZ" + UUID.randomUUID().toString();
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", e).apply();
                        }
                    }
                }
            }
            return e;
        } catch (Throwable th) {
            uf.b(th, e.class);
            return null;
        }
    }

    static AppEventsLogger.FlushBehavior c() {
        AppEventsLogger.FlushBehavior flushBehavior;
        if (uf.c(e.class)) {
            return null;
        }
        try {
            synchronized (d) {
                flushBehavior = AppEventsLogger.FlushBehavior.AUTO;
            }
            return flushBehavior;
        } catch (Throwable th) {
            uf.b(th, e.class);
            return null;
        }
    }

    static String d() {
        if (uf.c(e.class)) {
            return null;
        }
        try {
            synchronized (d) {
            }
            return null;
        } catch (Throwable th) {
            uf.b(th, e.class);
            return null;
        }
    }

    static void e(Context context, String str) {
        if (!uf.c(e.class)) {
            try {
                if (k.g()) {
                    c.execute(new a(context, new e(context, str, (com.facebook.a) null)));
                }
            } catch (Throwable th) {
                uf.b(th, e.class);
            }
        }
    }

    private static void f() {
        if (!uf.c(e.class)) {
            try {
                synchronized (d) {
                    if (c == null) {
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                        c = scheduledThreadPoolExecutor;
                        scheduledThreadPoolExecutor.scheduleAtFixedRate(new b(), 0, 86400, TimeUnit.SECONDS);
                    }
                }
            } catch (Throwable th) {
                uf.b(th, e.class);
            }
        }
    }

    private static void g(AppEvent appEvent, AccessTokenAppIdPair accessTokenAppIdPair) {
        if (!uf.c(e.class)) {
            try {
                c.h(accessTokenAppIdPair, appEvent);
                if (!appEvent.b() && !f) {
                    if (appEvent.d().equals("fb_mobile_activate_app")) {
                        f = true;
                        return;
                    }
                    LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                    int i = y.e;
                    k.v(loggingBehavior);
                }
            } catch (Throwable th) {
                uf.b(th, e.class);
            }
        }
    }

    private static void l(String str) {
        if (!uf.c(e.class)) {
            try {
                LoggingBehavior loggingBehavior = LoggingBehavior.DEVELOPER_ERRORS;
                int i = y.e;
                k.v(loggingBehavior);
            } catch (Throwable th) {
                uf.b(th, e.class);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(String str, Bundle bundle) {
        if (!uf.c(this)) {
            try {
                i(str, null, bundle, false, com.facebook.appevents.internal.a.o());
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
        if (!uf.c(this) && str != null) {
            try {
                if (!str.isEmpty()) {
                    if (m.g("app_events_killswitch", k.e(), false)) {
                        int i = y.e;
                        k.v(loggingBehavior);
                        return;
                    }
                    try {
                        g(new AppEvent(this.a, str, d2, bundle, z, com.facebook.appevents.internal.a.p(), uuid), this.b);
                    } catch (JSONException e2) {
                        e2.toString();
                        int i2 = y.e;
                        k.v(loggingBehavior);
                    } catch (FacebookException e3) {
                        e3.toString();
                        int i3 = y.e;
                        k.v(loggingBehavior);
                    }
                }
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(String str, Double d2, Bundle bundle) {
        if (!uf.c(this)) {
            try {
                i(str, d2, bundle, true, com.facebook.appevents.internal.a.o());
            } catch (Throwable th) {
                uf.b(th, this);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z) {
        if (!uf.c(this)) {
            if (bigDecimal == null) {
                try {
                    l("purchaseAmount cannot be null");
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            } else if (currency == null) {
                l("currency cannot be null");
            } else {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString("fb_currency", currency.getCurrencyCode());
                i("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle, z, com.facebook.appevents.internal.a.o());
                if (!uf.c(e.class)) {
                    try {
                        if (c() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                            c.j(FlushReason.EAGER_FLUSHING_EVENT);
                        }
                    } catch (Throwable th2) {
                        uf.b(th2, e.class);
                    }
                }
            }
        }
    }

    e(String str, String str2, com.facebook.a aVar) {
        h0.h();
        this.a = str;
        aVar = aVar == null ? com.facebook.a.e() : aVar;
        if (aVar == null || aVar.q() || (str2 != null && !str2.equals(aVar.c()))) {
            this.b = new AccessTokenAppIdPair(null, str2 == null ? f0.q(k.d()) : str2);
        } else {
            this.b = new AccessTokenAppIdPair(aVar.n(), k.e());
        }
        f();
    }
}
