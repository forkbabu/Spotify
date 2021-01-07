package io.branch.referral;

import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Iterator;
import java.util.UUID;

/* access modifiers changed from: package-private */
public abstract class g0 {
    private String a = null;
    private int b = 0;
    private String c;

    /* access modifiers changed from: package-private */
    public interface a {
    }

    /* access modifiers changed from: package-private */
    public static class b {
        private String a = "bnc_no_value";
        private boolean b;

        b(Context context, boolean z) {
            this.b = !z;
            String str = null;
            if (context != null && !z) {
                str = Settings.Secure.getString(context.getContentResolver(), "android_id");
            }
            if (str == null) {
                str = UUID.randomUUID().toString();
                this.b = false;
            }
            this.a = str;
        }

        /* access modifiers changed from: package-private */
        public String a() {
            return this.a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (!this.a.equals(bVar.a) || this.b != bVar.b) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = ((this.b ? 1 : 0) + 1) * 31;
            String str = this.a;
            return i + (str == null ? 0 : str.hashCode());
        }
    }

    g0() {
    }

    static String c(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context == null || context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0 || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return null;
        }
        return activeNetworkInfo.getType() == 1 ? "wifi" : "mobile";
    }

    static String d(Context context) {
        String A = r.r(context).A(Defines$ModuleNameKeys.imei.d());
        if (!TextUtils.isEmpty(A)) {
            return A;
        }
        return null;
    }

    static String f() {
        String str = "";
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                Iterator it = Collections.list(networkInterface.getInetAddresses()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    InetAddress inetAddress = (InetAddress) it.next();
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (hostAddress.indexOf(58) < 0) {
                            str = hostAddress;
                            break;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    static String g(Context context) {
        if (k()) {
            return context == null ? Build.MODEL.contains("AFT") ? "AMAZON_FIRE_TV" : "AMAZON_FIRE" : context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv") ? "AMAZON_FIRE_TV" : "AMAZON_FIRE";
        }
        return "Android";
    }

    static String h(Context context) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            } catch (Exception e) {
                r.a("Error obtaining PackageName", e);
            }
        }
        return "";
    }

    static DisplayMetrics i(Context context) {
        WindowManager windowManager;
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (!(context == null || (windowManager = (WindowManager) context.getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null)) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    static String j(Context context) {
        UiModeManager uiModeManager;
        String str;
        if (context != null) {
            try {
                uiModeManager = (UiModeManager) context.getSystemService("uimode");
            } catch (Exception unused) {
                return "UI_MODE_TYPE_UNDEFINED";
            }
        } else {
            uiModeManager = null;
        }
        if (uiModeManager == null) {
            return "UI_MODE_TYPE_UNDEFINED";
        }
        switch (uiModeManager.getCurrentModeType()) {
            case 1:
                str = "UI_MODE_TYPE_NORMAL";
                break;
            case 2:
                str = "UI_MODE_TYPE_DESK";
                break;
            case 3:
                str = "UI_MODE_TYPE_CAR";
                break;
            case 4:
                str = "UI_MODE_TYPE_TELEVISION";
                break;
            case 5:
                str = "UI_MODE_TYPE_APPLIANCE";
                break;
            case 6:
                str = "UI_MODE_TYPE_WATCH";
                break;
            default:
                return "UI_MODE_TYPE_UNDEFINED";
        }
        return str;
    }

    static boolean k() {
        return Build.MANUFACTURER.equalsIgnoreCase("amazon");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static boolean l(android.content.Context r7) {
        /*
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "huawei"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "com.google.android.gms.common.d"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r3 = "getInstance"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0043 }
            java.lang.reflect.Method r3 = r0.getDeclaredMethod(r3, r4)     // Catch:{ Exception -> 0x0043 }
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0043 }
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch:{ Exception -> 0x0043 }
            java.lang.String r4 = "isGooglePlayServicesAvailable"
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0043 }
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r1] = r6     // Catch:{ Exception -> 0x0043 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0043 }
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0043 }
            r4[r1] = r7     // Catch:{ Exception -> 0x0043 }
            java.lang.Object r7 = r0.invoke(r3, r4)     // Catch:{ Exception -> 0x0043 }
            boolean r0 = r7 instanceof java.lang.Integer     // Catch:{ Exception -> 0x0043 }
            if (r0 == 0) goto L_0x0043
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x0043 }
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x0043 }
            if (r7 != 0) goto L_0x0043
            r7 = 1
            goto L_0x0044
        L_0x0043:
            r7 = 0
        L_0x0044:
            if (r7 != 0) goto L_0x0047
            r1 = 1
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.g0.l(android.content.Context):boolean");
    }

    /* access modifiers changed from: package-private */
    public String a() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public String b() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public boolean m(Context context, a aVar) {
        this.c = r.r(context).B();
        if (k()) {
            if (context != null) {
                try {
                    ContentResolver contentResolver = context.getContentResolver();
                    this.b = Settings.Secure.getInt(contentResolver, "limit_ad_tracking");
                    String string = Settings.Secure.getString(contentResolver, "advertising_id");
                    this.a = string;
                    if (TextUtils.isEmpty(string) || this.a.equals("00000000-0000-0000-0000-000000000000") || this.b == 1) {
                        this.a = null;
                    }
                } catch (Settings.SettingNotFoundException unused) {
                }
            }
            ((Branch) aVar).R();
            return false;
        }
        if (l(context)) {
            new q(context, aVar).a(new Void[0]);
        } else {
            new n(context, aVar).a(new Void[0]);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void n(String str) {
        this.a = str;
    }

    /* access modifiers changed from: package-private */
    public void o(int i) {
        this.b = i;
    }
}
