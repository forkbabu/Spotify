package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.internal.b;
import com.google.android.gms.internal.cast.o3;
import com.google.android.gms.internal.cast.r3;
import com.google.android.gms.internal.cast.w3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class k7 {
    private static final b i = new b("FeatureUsageAnalytics");
    private static final String j = "19.0.0";
    private static k7 k;
    private final p0 a;
    private final SharedPreferences b;
    private final String c;
    private final Runnable d;
    private final Handler e;
    private long f;
    private Set<zzkj> g = new HashSet();
    private Set<zzkj> h = new HashSet();

    private k7(SharedPreferences sharedPreferences, p0 p0Var, String str) {
        zzkj zzkj;
        zzkj zzkj2;
        zzkj zzkj3 = zzkj.DEVELOPER_FEATURE_FLAG_UNKNOWN;
        this.b = sharedPreferences;
        this.a = p0Var;
        this.c = str;
        this.e = new o0(Looper.getMainLooper());
        this.d = new l6(this);
        String string = sharedPreferences.getString("feature_usage_sdk_version", null);
        String string2 = sharedPreferences.getString("feature_usage_package_name", null);
        this.g = new HashSet();
        this.h = new HashSet();
        this.f = 0;
        if (!j.equals(string) || !str.equals(string2)) {
            HashSet hashSet = new HashSet();
            for (String str2 : sharedPreferences.getAll().keySet()) {
                if (str2.startsWith("feature_usage_timestamp_")) {
                    hashSet.add(str2);
                }
            }
            hashSet.add("feature_usage_last_report_time");
            c(hashSet);
            this.b.edit().putString("feature_usage_sdk_version", j).putString("feature_usage_package_name", this.c).apply();
            return;
        }
        this.f = sharedPreferences.getLong("feature_usage_last_report_time", 0);
        long currentTimeMillis = System.currentTimeMillis();
        HashSet hashSet2 = new HashSet();
        for (String str3 : sharedPreferences.getAll().keySet()) {
            if (str3.startsWith("feature_usage_timestamp_")) {
                long j2 = this.b.getLong(str3, 0);
                if (j2 != 0 && currentTimeMillis - j2 > 1209600000) {
                    hashSet2.add(str3);
                } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                    try {
                        zzkj2 = zzkj.d(Integer.parseInt(str3.substring(41)));
                    } catch (NumberFormatException unused) {
                        zzkj2 = zzkj3;
                    }
                    this.h.add(zzkj2);
                    this.g.add(zzkj2);
                } else if (str3.startsWith("feature_usage_timestamp_detected_feature_")) {
                    try {
                        zzkj = zzkj.d(Integer.parseInt(str3.substring(41)));
                    } catch (NumberFormatException unused2) {
                        zzkj = zzkj3;
                    }
                    this.g.add(zzkj);
                }
            }
        }
        c(hashSet2);
        this.e.post(this.d);
    }

    public static synchronized k7 a(SharedPreferences sharedPreferences, p0 p0Var, String str) {
        k7 k7Var;
        synchronized (k7.class) {
            if (k == null) {
                k = new k7(sharedPreferences, p0Var, str);
            }
            k7Var = k;
        }
        return k7Var;
    }

    public static void b(zzkj zzkj) {
        k7 k7Var = k;
        if (k7Var != null) {
            k7Var.b.edit().putLong(k7Var.f(Integer.toString(zzkj.j())), System.currentTimeMillis()).apply();
            k7Var.g.add(zzkj);
            k7Var.e.post(k7Var.d);
        }
    }

    private final void c(Set<String> set) {
        if (!set.isEmpty()) {
            SharedPreferences.Editor edit = this.b.edit();
            for (String str : set) {
                edit.remove(str);
            }
            edit.apply();
        }
    }

    private static String e(String str, String str2) {
        return String.format("%s%s", str, str2);
    }

    private final String f(String str) {
        String e2 = e("feature_usage_timestamp_reported_feature_", str);
        if (this.b.contains(e2)) {
            return e2;
        }
        return e("feature_usage_timestamp_detected_feature_", str);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        if (!this.g.isEmpty()) {
            long j2 = this.h.equals(this.g) ? 172800000 : 86400000;
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.f;
            if (j3 == 0 || currentTimeMillis - j3 >= j2) {
                i.a("Upload the feature usage report.", new Object[0]);
                r3.a p = r3.p();
                String str = j;
                if (p.c) {
                    p.k();
                    p.c = false;
                }
                r3.o((r3) p.b, str);
                String str2 = this.c;
                if (p.c) {
                    p.k();
                    p.c = false;
                }
                r3.n((r3) p.b, str2);
                r3 r3Var = (r3) ((r5) p.n());
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.g);
                o3.a p2 = o3.p();
                if (p2.c) {
                    p2.k();
                    p2.c = false;
                }
                o3.o((o3) p2.b, arrayList);
                if (p2.c) {
                    p2.k();
                    p2.c = false;
                }
                o3.n((o3) p2.b, r3Var);
                o3 o3Var = (o3) ((r5) p2.n());
                w3.a w = w3.w();
                if (w.c) {
                    w.k();
                    w.c = false;
                }
                w3.q((w3) w.b, o3Var);
                this.a.b((w3) ((r5) w.n()), zzia.API_USAGE_REPORT);
                SharedPreferences.Editor edit = this.b.edit();
                if (!this.h.equals(this.g)) {
                    HashSet hashSet = new HashSet(this.g);
                    this.h = hashSet;
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        String num = Integer.toString(((zzkj) it.next()).j());
                        String f2 = f(num);
                        String e2 = e("feature_usage_timestamp_reported_feature_", num);
                        if (!TextUtils.equals(f2, e2)) {
                            long j4 = this.b.getLong(f2, 0);
                            edit.remove(f2);
                            if (j4 != 0) {
                                edit.putLong(e2, j4);
                            }
                        }
                    }
                }
                this.f = currentTimeMillis;
                edit.putLong("feature_usage_last_report_time", currentTimeMillis).apply();
            }
        }
    }
}
