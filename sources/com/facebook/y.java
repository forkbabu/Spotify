package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.i;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.n;
import com.spotify.music.features.ads.model.Ad;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class y {
    private static AtomicBoolean a = new AtomicBoolean(false);
    private static AtomicBoolean b = new AtomicBoolean(false);
    private static b c = new b(true, "com.facebook.sdk.AutoInitEnabled");
    private static b d = new b(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    private static b e = new b(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    private static b f = new b(false, "auto_event_setup_enabled");
    private static b g = new b(true, "com.facebook.sdk.MonitorEnabled");
    private static SharedPreferences h;
    public static final /* synthetic */ int i = 0;

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        final /* synthetic */ long a;

        a(long j) {
            this.a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            n n;
            if (!uf.c(this)) {
                try {
                    if (y.e.a() && (n = FetchedAppSettingsManager.n(k.e(), false)) != null && n.b()) {
                        com.facebook.internal.b e = com.facebook.internal.b.e(k.d());
                        if (((e == null || e.b() == null) ? null : e.b()) != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString(Ad.METADATA_ADVERTISER_ID, e.b());
                            bundle.putString("fields", "auto_event_setup_enabled");
                            m r = m.r(null, k.e(), null);
                            r.D(true);
                            r.C(bundle);
                            JSONObject f = r.g().f();
                            if (f != null) {
                                y.f.b = Boolean.valueOf(f.optBoolean("auto_event_setup_enabled", false));
                                y.f.d = this.a;
                                y.o(y.f);
                            }
                        }
                    }
                    y.b.set(false);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class b {
        String a;
        Boolean b;
        boolean c;
        long d;

        b(boolean z, String str) {
            this.c = z;
            this.a = str;
        }

        /* access modifiers changed from: package-private */
        public boolean a() {
            Boolean bool = this.b;
            return bool == null ? this.c : bool.booleanValue();
        }
    }

    public static boolean e() {
        k();
        return e.a();
    }

    public static boolean f() {
        k();
        return c.a();
    }

    public static boolean g() {
        k();
        return d.a();
    }

    public static boolean h() {
        k();
        return f.a();
    }

    public static boolean i() {
        k();
        return g.a();
    }

    private static void j() {
        m(f);
        long currentTimeMillis = System.currentTimeMillis();
        b bVar = f;
        if (bVar.b == null || currentTimeMillis - bVar.d >= 604800000) {
            bVar.b = null;
            bVar.d = 0;
            if (b.compareAndSet(false, true)) {
                k.l().execute(new a(currentTimeMillis));
            }
        }
    }

    public static void k() {
        Bundle bundle;
        Bundle bundle2;
        if (k.u()) {
            if (a.compareAndSet(false, true)) {
                h = k.d().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                b[] bVarArr = {d, e, c};
                for (int i2 = 0; i2 < 3; i2++) {
                    b bVar = bVarArr[i2];
                    if (bVar == f) {
                        j();
                    } else if (bVar.b == null) {
                        m(bVar);
                        if (bVar.b == null) {
                            n();
                            try {
                                Context d2 = k.d();
                                ApplicationInfo applicationInfo = d2.getPackageManager().getApplicationInfo(d2.getPackageName(), 128);
                                if (!(applicationInfo == null || (bundle2 = applicationInfo.metaData) == null || !bundle2.containsKey(bVar.a))) {
                                    bVar.b = Boolean.valueOf(applicationInfo.metaData.getBoolean(bVar.a, bVar.c));
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                                boolean z = k.n;
                            }
                        }
                    } else {
                        o(bVar);
                    }
                }
                j();
                try {
                    Context d3 = k.d();
                    ApplicationInfo applicationInfo2 = d3.getPackageManager().getApplicationInfo(d3.getPackageName(), 128);
                    if (!(applicationInfo2 == null || (bundle = applicationInfo2.metaData) == null)) {
                        bundle.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
                        applicationInfo2.metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
                        k();
                        e.a();
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                l();
            }
        }
    }

    private static void l() {
        int i2;
        if (a.get() && k.u()) {
            Context d2 = k.d();
            int i3 = 0;
            int i4 = ((c.a() ? 1 : 0) << 0) | 0 | ((d.a() ? 1 : 0) << 1) | ((e.a() ? 1 : 0) << 2) | ((g.a() ? 1 : 0) << 3);
            int i5 = h.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
            if (i5 != i4) {
                h.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i4).commit();
                try {
                    ApplicationInfo applicationInfo = d2.getPackageManager().getApplicationInfo(d2.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null)) {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        boolean[] zArr = {true, true, true, true};
                        int i6 = 0;
                        i2 = 0;
                        for (int i7 = 0; i7 < 4; i7++) {
                            try {
                                i2 |= (applicationInfo.metaData.containsKey(strArr[i7]) ? 1 : 0) << i7;
                                i6 |= (applicationInfo.metaData.getBoolean(strArr[i7], zArr[i7]) ? 1 : 0) << i7;
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                        i3 = i6;
                        i iVar = new i(d2);
                        Bundle bundle = new Bundle();
                        bundle.putInt("usage", i2);
                        bundle.putInt("initial", i3);
                        bundle.putInt("previous", i5);
                        bundle.putInt("current", i4);
                        iVar.g("fb_sdk_settings_changed", bundle);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
                i2 = 0;
                i iVar2 = new i(d2);
                Bundle bundle2 = new Bundle();
                bundle2.putInt("usage", i2);
                bundle2.putInt("initial", i3);
                bundle2.putInt("previous", i5);
                bundle2.putInt("current", i4);
                iVar2.g("fb_sdk_settings_changed", bundle2);
            }
        }
    }

    private static void m(b bVar) {
        n();
        try {
            String string = h.getString(bVar.a, "");
            if (!string.isEmpty()) {
                JSONObject jSONObject = new JSONObject(string);
                bVar.b = Boolean.valueOf(jSONObject.getBoolean("value"));
                bVar.d = jSONObject.getLong("last_timestamp");
            }
        } catch (JSONException unused) {
            boolean z = k.n;
        }
    }

    private static void n() {
        if (!a.get()) {
            throw new FacebookSdkNotInitializedException("The UserSettingManager has not been initialized successfully");
        }
    }

    /* access modifiers changed from: private */
    public static void o(b bVar) {
        n();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", bVar.b);
            jSONObject.put("last_timestamp", bVar.d);
            h.edit().putString(bVar.a, jSONObject.toString()).commit();
            l();
        } catch (Exception unused) {
            boolean z = k.n;
        }
    }
}
