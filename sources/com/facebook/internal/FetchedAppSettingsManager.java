package com.facebook.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.e;
import com.facebook.appevents.internal.j;
import com.facebook.internal.n;
import com.facebook.k;
import com.facebook.m;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class FetchedAppSettingsManager {
    private static final String a = "FetchedAppSettingsManager";
    private static final String[] b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting"};
    private static final Map<String, n> c = new ConcurrentHashMap();
    private static final AtomicReference<FetchAppSettingState> d = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);
    private static final ConcurrentLinkedQueue<d> e = new ConcurrentLinkedQueue<>();
    private static boolean f = false;
    private static JSONArray g = null;

    /* access modifiers changed from: package-private */
    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    /* access modifiers changed from: package-private */
    public static class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        a(Context context, String str, String str2) {
            this.a = context;
            this.b = str;
            this.c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            if (!uf.c(this)) {
                try {
                    SharedPreferences sharedPreferences = this.a.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    n nVar = null;
                    String string = sharedPreferences.getString(this.b, null);
                    if (!f0.C(string)) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException unused) {
                            boolean z = k.n;
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            nVar = FetchedAppSettingsManager.l(this.c, jSONObject);
                        }
                    }
                    JSONObject i = FetchedAppSettingsManager.i(this.c);
                    if (i != null) {
                        FetchedAppSettingsManager.l(this.c, i);
                        sharedPreferences.edit().putString(this.b, i.toString()).apply();
                    }
                    if (nVar != null) {
                        String l = nVar.l();
                        if (!FetchedAppSettingsManager.f && l != null && l.length() > 0) {
                            boolean unused2 = FetchedAppSettingsManager.f = true;
                            String unused3 = FetchedAppSettingsManager.a;
                        }
                    }
                    m.k(this.c, true);
                    int i2 = e.c;
                    Context d = k.d();
                    String e = k.e();
                    boolean g = k.g();
                    h0.f(d, "context");
                    if (g && (d instanceof Application)) {
                        AppEventsLogger.a((Application) d, e);
                    }
                    j.e();
                    FetchedAppSettingsManager.d.set(FetchedAppSettingsManager.c.containsKey(this.c) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
                    FetchedAppSettingsManager.m();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class b implements Runnable {
        final /* synthetic */ d a;

        b(d dVar) {
            this.a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    this.a.b();
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class c implements Runnable {
        final /* synthetic */ d a;
        final /* synthetic */ n b;

        c(d dVar, n nVar) {
            this.a = dVar;
            this.b = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!uf.c(this)) {
                try {
                    this.a.c(this.b);
                } catch (Throwable th) {
                    uf.b(th, this);
                }
            }
        }
    }

    public interface d {
        void b();

        void c(n nVar);
    }

    /* access modifiers changed from: private */
    public static JSONObject i(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(b))));
        m r = m.r(null, str, null);
        r.D(true);
        r.C(bundle);
        return r.g().f();
    }

    public static n j(String str) {
        if (str != null) {
            return c.get(str);
        }
        return null;
    }

    public static void k() {
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.ERROR;
        Context d2 = k.d();
        String e2 = k.e();
        if (f0.C(e2)) {
            d.set(fetchAppSettingState);
            m();
        } else if (c.containsKey(e2)) {
            d.set(FetchAppSettingState.SUCCESS);
            m();
        } else {
            AtomicReference<FetchAppSettingState> atomicReference = d;
            FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.NOT_LOADED;
            FetchAppSettingState fetchAppSettingState3 = FetchAppSettingState.LOADING;
            if (!(atomicReference.compareAndSet(fetchAppSettingState2, fetchAppSettingState3) || atomicReference.compareAndSet(fetchAppSettingState, fetchAppSettingState3))) {
                m();
            } else {
                k.l().execute(new a(d2, String.format("com.facebook.internal.APP_SETTINGS.%s", e2), e2));
            }
        }
    }

    /* access modifiers changed from: private */
    public static n l(String str, JSONObject jSONObject) {
        j jVar;
        JSONArray optJSONArray;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        Map map;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        if (optJSONArray2 == null) {
            jVar = j.c();
        } else {
            jVar = j.b(optJSONArray2);
        }
        int i = 0;
        int optInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        boolean z5 = (optInt & 16384) != 0;
        JSONArray optJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        g = optJSONArray3;
        boolean optBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String optString = jSONObject.optString("gdpv4_nux_content", "");
        boolean optBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = jSONObject.optInt("app_events_session_timeout", 60);
        EnumSet<SmartLoginOption> d2 = SmartLoginOption.d(jSONObject.optLong("seamless_login"));
        JSONObject optJSONObject = jSONObject.optJSONObject("android_dialog_configs");
        HashMap hashMap = new HashMap();
        if (!(optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("data")) == null)) {
            while (i < optJSONArray.length()) {
                n.a d3 = n.a.d(optJSONArray.optJSONObject(i));
                if (d3 == null) {
                    jSONArray2 = optJSONArray;
                    jSONArray = optJSONArray3;
                } else {
                    jSONArray2 = optJSONArray;
                    String a2 = d3.a();
                    Map map2 = (Map) hashMap.get(a2);
                    jSONArray = optJSONArray3;
                    if (map2 == null) {
                        map = new HashMap();
                        hashMap.put(a2, map);
                    } else {
                        map = map2;
                    }
                    map.put(d3.b(), d3);
                }
                i++;
                optJSONArray = jSONArray2;
                optJSONArray3 = jSONArray;
            }
        }
        n nVar = new n(optBoolean, optString, optBoolean2, optInt2, d2, hashMap, z, jVar, jSONObject.optString("smart_login_bookmark_icon_url"), jSONObject.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray3, jSONObject.optString("sdk_update_message"), z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        c.put(str, nVar);
        return nVar;
    }

    /* access modifiers changed from: private */
    public static synchronized void m() {
        synchronized (FetchedAppSettingsManager.class) {
            FetchAppSettingState fetchAppSettingState = d.get();
            if (!FetchAppSettingState.NOT_LOADED.equals(fetchAppSettingState)) {
                if (!FetchAppSettingState.LOADING.equals(fetchAppSettingState)) {
                    n nVar = c.get(k.e());
                    Handler handler = new Handler(Looper.getMainLooper());
                    if (FetchAppSettingState.ERROR.equals(fetchAppSettingState)) {
                        while (true) {
                            ConcurrentLinkedQueue<d> concurrentLinkedQueue = e;
                            if (!concurrentLinkedQueue.isEmpty()) {
                                handler.post(new b(concurrentLinkedQueue.poll()));
                            } else {
                                return;
                            }
                        }
                    } else {
                        while (true) {
                            ConcurrentLinkedQueue<d> concurrentLinkedQueue2 = e;
                            if (!concurrentLinkedQueue2.isEmpty()) {
                                handler.post(new c(concurrentLinkedQueue2.poll(), nVar));
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    public static n n(String str, boolean z) {
        if (!z) {
            Map<String, n> map = c;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        JSONObject i = i(str);
        if (i == null) {
            return null;
        }
        n l = l(str, i);
        if (str.equals(k.e())) {
            d.set(FetchAppSettingState.SUCCESS);
            m();
        }
        return l;
    }
}
