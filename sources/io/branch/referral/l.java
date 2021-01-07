package io.branch.referral;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import io.branch.referral.g0;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public class l {
    private static l c;
    private final g0 a = new a(this);
    private final Context b;

    private class a extends g0 {
        public a(l lVar) {
        }
    }

    private l(Context context) {
        this.b = context;
    }

    static l d() {
        return c;
    }

    static l h(Context context) {
        if (c == null) {
            c = new l(context);
        }
        return c;
    }

    public static boolean i(String str) {
        return TextUtils.isEmpty(str) || str.equals("bnc_no_value");
    }

    private void k(ServerRequest serverRequest, JSONObject jSONObject) {
        if (serverRequest.o()) {
            jSONObject.put(Defines$Jsonkey.CPUType.d(), System.getProperty("os.arch"));
            jSONObject.put(Defines$Jsonkey.DeviceBuildId.d(), Build.DISPLAY);
            String d = Defines$Jsonkey.Locale.d();
            jSONObject.put(d, Locale.getDefault().getLanguage() + "_" + Locale.getDefault().getCountry());
            jSONObject.put(Defines$Jsonkey.ConnectionType.d(), g0.c(this.b));
            String d2 = Defines$Jsonkey.DeviceCarrier.d();
            TelephonyManager telephonyManager = (TelephonyManager) this.b.getSystemService("phone");
            String str = null;
            if (telephonyManager != null) {
                String networkOperatorName = telephonyManager.getNetworkOperatorName();
                if (!TextUtils.isEmpty(networkOperatorName)) {
                    str = networkOperatorName;
                }
            }
            jSONObject.put(d2, str);
            jSONObject.put(Defines$Jsonkey.OSVersionAndroid.d(), Build.VERSION.RELEASE);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0022 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a() {
        /*
            r3 = this;
            android.content.Context r0 = r3.b
            if (r0 == 0) goto L_0x001a
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ Exception -> 0x0014 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x0014 }
            r2 = 0
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ Exception -> 0x0014 }
            java.lang.String r0 = r0.versionName     // Catch:{ Exception -> 0x0014 }
            goto L_0x001c
        L_0x0014:
            r0 = move-exception
            java.lang.String r1 = "Error obtaining AppVersion"
            io.branch.referral.r.a(r1, r0)
        L_0x001a:
            java.lang.String r0 = ""
        L_0x001c:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0024
            java.lang.String r0 = "bnc_no_value"
        L_0x0024:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.l.a():java.lang.String");
    }

    public long b() {
        Context context = this.b;
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
            } catch (Exception e) {
                r.a("Error obtaining FirstInstallTime", e);
            }
        }
        return 0;
    }

    public g0.b c() {
        return new g0.b(this.b, false);
    }

    public long e() {
        Context context = this.b;
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
            } catch (Exception e) {
                r.a("Error obtaining LastUpdateTime", e);
            }
        }
        return 0;
    }

    public String f() {
        return g0.g(this.b);
    }

    /* access modifiers changed from: package-private */
    public g0 g() {
        return this.a;
    }

    public boolean j() {
        Context context = this.b;
        if (context == null) {
            return false;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                return false;
            }
            return !packageManager.queryIntentActivities(launchIntentForPackage, 65536).isEmpty();
        } catch (Exception e) {
            r.a("Error obtaining PackageInfo", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void l(ServerRequest serverRequest, JSONObject jSONObject) {
        try {
            g0.b c2 = c();
            if (!i(c2.a())) {
                jSONObject.put(Defines$Jsonkey.HardwareID.d(), c2.a());
                jSONObject.put(Defines$Jsonkey.IsHardwareIDReal.d(), c2.b());
            }
            String str = Build.MANUFACTURER;
            if (!i(str)) {
                jSONObject.put(Defines$Jsonkey.Brand.d(), str);
            }
            String str2 = Build.MODEL;
            if (!i(str2)) {
                jSONObject.put(Defines$Jsonkey.Model.d(), str2);
            }
            DisplayMetrics i = g0.i(this.b);
            jSONObject.put(Defines$Jsonkey.ScreenDpi.d(), i.densityDpi);
            jSONObject.put(Defines$Jsonkey.ScreenHeight.d(), i.heightPixels);
            jSONObject.put(Defines$Jsonkey.ScreenWidth.d(), i.widthPixels);
            jSONObject.put(Defines$Jsonkey.WiFi.d(), "wifi".equalsIgnoreCase(g0.c(this.b)));
            jSONObject.put(Defines$Jsonkey.UIMode.d(), g0.j(this.b));
            String g = g0.g(this.b);
            if (!i(g)) {
                jSONObject.put(Defines$Jsonkey.OS.d(), g);
            }
            jSONObject.put(Defines$Jsonkey.APILevel.d(), Build.VERSION.SDK_INT);
            k(serverRequest, jSONObject);
            String country = Locale.getDefault().getCountry();
            if (!TextUtils.isEmpty(country)) {
                jSONObject.put(Defines$Jsonkey.Country.d(), country);
            }
            String language = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(Defines$Jsonkey.Language.d(), language);
            }
            String f = g0.f();
            if (!TextUtils.isEmpty(f)) {
                jSONObject.put(Defines$Jsonkey.LocalIP.d(), f);
            }
            if (r.r(this.b).P()) {
                String d = g0.d(this.b);
                if (!i(d)) {
                    jSONObject.put(Defines$ModuleNameKeys.imei.d(), d);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(io.branch.referral.ServerRequest r4, android.content.Context r5, io.branch.referral.r r6, org.json.JSONObject r7) {
        /*
        // Method dump skipped, instructions count: 377
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.l.m(io.branch.referral.ServerRequest, android.content.Context, io.branch.referral.r, org.json.JSONObject):void");
    }
}
