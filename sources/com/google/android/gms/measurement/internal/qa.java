package com.google.android.gms.measurement.internal;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.util.h;
import com.google.android.gms.internal.measurement.p7;
import com.google.android.gms.internal.measurement.s9;
import com.spotify.encore.mobile.snackbar.SnackbarUtilsKt;
import java.lang.reflect.InvocationTargetException;

public final class qa extends y5 {
    private Boolean b;
    private b c = c.a;
    private Boolean d;

    qa(f5 f5Var) {
        super(f5Var);
    }

    public static long G() {
        return t.D.a(null).longValue();
    }

    private final Bundle M() {
        try {
            if (super.i().getPackageManager() == null) {
                super.l().E().a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo c2 = xr.a(super.i()).c(super.i().getPackageName(), 128);
            if (c2 != null) {
                return c2.metaData;
            }
            super.l().E().a("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            super.l().E().b("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    private final String g(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (ClassNotFoundException e) {
            super.l().E().b("Could not find SystemProperties class", e);
            return str2;
        } catch (NoSuchMethodException e2) {
            super.l().E().b("Could not find SystemProperties.get() method", e2);
            return str2;
        } catch (IllegalAccessException e3) {
            super.l().E().b("Could not access SystemProperties.get()", e3);
            return str2;
        } catch (InvocationTargetException e4) {
            super.l().E().b("SystemProperties.get() threw an exception", e4);
            return str2;
        }
    }

    /* access modifiers changed from: package-private */
    public final Boolean A(String str) {
        g.i(str);
        Bundle M = M();
        if (M == null) {
            super.l().E().a("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!M.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(M.getBoolean(str));
        }
    }

    public final boolean B() {
        Boolean A = A("firebase_analytics_collection_deactivated");
        return A != null && A.booleanValue();
    }

    public final Boolean C() {
        Boolean A = A("google_analytics_adid_collection_enabled");
        return Boolean.valueOf(A == null || A.booleanValue());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002b A[SYNTHETIC, Splitter:B:9:0x002b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> D(java.lang.String r4) {
        /*
            r3 = this;
            com.google.android.exoplayer2.util.g.i(r4)
            android.os.Bundle r0 = r3.M()
            r1 = 0
            if (r0 != 0) goto L_0x0018
            com.google.android.gms.measurement.internal.a4 r4 = super.l()
            com.google.android.gms.measurement.internal.c4 r4 = r4.E()
            java.lang.String r0 = "Failed to load metadata: Metadata bundle is null"
            r4.a(r0)
            goto L_0x001e
        L_0x0018:
            boolean r2 = r0.containsKey(r4)
            if (r2 != 0) goto L_0x0020
        L_0x001e:
            r4 = r1
            goto L_0x0028
        L_0x0020:
            int r4 = r0.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
        L_0x0028:
            if (r4 != 0) goto L_0x002b
            return r1
        L_0x002b:
            android.content.Context r0 = super.i()     // Catch:{ NotFoundException -> 0x0043 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0043 }
            int r4 = r4.intValue()     // Catch:{ NotFoundException -> 0x0043 }
            java.lang.String[] r4 = r0.getStringArray(r4)     // Catch:{ NotFoundException -> 0x0043 }
            if (r4 != 0) goto L_0x003e
            return r1
        L_0x003e:
            java.util.List r4 = java.util.Arrays.asList(r4)     // Catch:{ NotFoundException -> 0x0043 }
            return r4
        L_0x0043:
            r4 = move-exception
            com.google.android.gms.measurement.internal.a4 r0 = super.l()
            com.google.android.gms.measurement.internal.c4 r0 = r0.E()
            java.lang.String r2 = "Failed to load string array from metadata: resource not found"
            r0.b(r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.qa.D(java.lang.String):java.util.List");
    }

    public final Boolean E() {
        if (!s9.b() || !r(t.w0)) {
            return Boolean.TRUE;
        }
        Boolean A = A("google_analytics_automatic_screen_reporting_enabled");
        return Boolean.valueOf(A == null || A.booleanValue());
    }

    public final boolean F(String str) {
        return "1".equals(this.c.g(str, "gaia_collection_enabled"));
    }

    public final boolean H(String str) {
        return "1".equals(this.c.g(str, "measurement.event_sampling_enabled"));
    }

    /* access modifiers changed from: package-private */
    public final String I(String str) {
        q3<String> q3Var = t.L;
        if (str == null) {
            return q3Var.a(null);
        }
        return q3Var.a(this.c.g(str, q3Var.b()));
    }

    public final String J() {
        return g("debug.firebase.analytics.app", "");
    }

    public final String K() {
        return g("debug.deferred.deeplink", "");
    }

    /* access modifiers changed from: package-private */
    public final boolean L() {
        if (this.b == null) {
            Boolean A = A("app_measurement_lite");
            this.b = A;
            if (A == null) {
                this.b = Boolean.FALSE;
            }
        }
        return this.b.booleanValue() || !this.a.M();
    }

    public final int m(String str) {
        return Math.max(Math.min(t(str, t.I), 100), 25);
    }

    public final long n(String str, q3<Long> q3Var) {
        if (str == null) {
            return q3Var.a(null).longValue();
        }
        String g = this.c.g(str, q3Var.b());
        if (TextUtils.isEmpty(g)) {
            return q3Var.a(null).longValue();
        }
        try {
            return q3Var.a(Long.valueOf(Long.parseLong(g))).longValue();
        } catch (NumberFormatException unused) {
            return q3Var.a(null).longValue();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String o(com.google.android.gms.measurement.internal.d4 r6) {
        /*
            r5 = this;
            android.net.Uri$Builder r0 = new android.net.Uri$Builder
            r0.<init>()
            java.lang.String r1 = r6.A()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
            boolean r1 = com.google.android.gms.internal.measurement.f9.b()
            if (r1 == 0) goto L_0x002f
            com.google.android.gms.measurement.internal.qa r1 = super.j()
            java.lang.String r2 = r6.t()
            com.google.android.gms.measurement.internal.q3<java.lang.Boolean> r3 = com.google.android.gms.measurement.internal.t.k0
            boolean r1 = r1.x(r2, r3)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = r6.G()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0033
        L_0x002f:
            java.lang.String r1 = r6.D()
        L_0x0033:
            com.google.android.gms.measurement.internal.q3<java.lang.String> r2 = com.google.android.gms.measurement.internal.t.e
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri$Builder r2 = r0.scheme(r2)
            com.google.android.gms.measurement.internal.q3<java.lang.String> r4 = com.google.android.gms.measurement.internal.t.f
            java.lang.Object r3 = r4.a(r3)
            java.lang.String r3 = (java.lang.String) r3
            android.net.Uri$Builder r2 = r2.encodedAuthority(r3)
            java.lang.String r3 = "config/app/"
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x005d
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0062
        L_0x005d:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0062:
            android.net.Uri$Builder r1 = r2.path(r1)
            java.lang.String r6 = r6.x()
            java.lang.String r2 = "app_instance_id"
            android.net.Uri$Builder r6 = r1.appendQueryParameter(r2, r6)
            java.lang.String r1 = "platform"
            java.lang.String r2 = "android"
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r1, r2)
            java.lang.String r1 = "gmp_version"
            java.lang.String r2 = "31049"
            r6.appendQueryParameter(r1, r2)
            android.net.Uri r6 = r0.build()
            java.lang.String r6 = r6.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.qa.o(com.google.android.gms.measurement.internal.d4):java.lang.String");
    }

    /* access modifiers changed from: package-private */
    public final void p(b bVar) {
        this.c = bVar;
    }

    public final boolean r(q3<Boolean> q3Var) {
        return x(null, q3Var);
    }

    /* access modifiers changed from: package-private */
    public final int s(String str) {
        if (!p7.b() || !x(null, t.E0)) {
            return 500;
        }
        return Math.max(Math.min(t(str, t.H), (int) SnackbarUtilsKt.SNACKBAR_ACTION_DURATION), 500);
    }

    public final int t(String str, q3<Integer> q3Var) {
        if (str == null) {
            return q3Var.a(null).intValue();
        }
        String g = this.c.g(str, q3Var.b());
        if (TextUtils.isEmpty(g)) {
            return q3Var.a(null).intValue();
        }
        try {
            return q3Var.a(Integer.valueOf(Integer.parseInt(g))).intValue();
        } catch (NumberFormatException unused) {
            return q3Var.a(null).intValue();
        }
    }

    public final double u(String str, q3<Double> q3Var) {
        if (str == null) {
            return q3Var.a(null).doubleValue();
        }
        String g = this.c.g(str, q3Var.b());
        if (TextUtils.isEmpty(g)) {
            return q3Var.a(null).doubleValue();
        }
        try {
            return q3Var.a(Double.valueOf(Double.parseDouble(g))).doubleValue();
        } catch (NumberFormatException unused) {
            return q3Var.a(null).doubleValue();
        }
    }

    public final int v(String str) {
        return t(str, t.o);
    }

    public final int w() {
        if (p7.b() && super.j().x(null, t.F0)) {
            z9 f = super.f();
            Boolean Z = f.a.O().Z();
            if (f.E0() >= 201500 || (Z != null && !Z.booleanValue())) {
                return 100;
            }
        }
        return 25;
    }

    public final boolean x(String str, q3<Boolean> q3Var) {
        if (str == null) {
            return q3Var.a(null).booleanValue();
        }
        String g = this.c.g(str, q3Var.b());
        if (TextUtils.isEmpty(g)) {
            return q3Var.a(null).booleanValue();
        }
        return q3Var.a(Boolean.valueOf(Boolean.parseBoolean(g))).booleanValue();
    }

    public final boolean y() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    ApplicationInfo applicationInfo = super.i().getApplicationInfo();
                    String a = h.a();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.d = Boolean.valueOf(str != null && str.equals(a));
                    }
                    if (this.d == null) {
                        this.d = Boolean.TRUE;
                        super.l().E().a("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.d.booleanValue();
    }

    public final boolean z(String str, q3<Boolean> q3Var) {
        return x(str, q3Var);
    }
}
