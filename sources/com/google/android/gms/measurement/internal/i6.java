package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.i8;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.t8;
import com.google.android.gms.internal.measurement.y6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class i6 extends d5 {
    protected g7 c;
    private h6 d;
    private final Set<g6> e = new CopyOnWriteArraySet();
    private boolean f;
    private final AtomicReference<String> g = new AtomicReference<>();
    private final Object h = new Object();
    private e i = new e(null, null);
    private int j = 100;
    private final AtomicLong k = new AtomicLong(0);
    private long l = -1;
    private int m = 100;
    final ha n;
    private boolean o = true;

    protected i6(f5 f5Var) {
        super(f5Var);
        this.n = new ha(f5Var);
    }

    static void N(i6 i6Var, Bundle bundle) {
        super.b();
        i6Var.w();
        if (bundle != null) {
            g.i(bundle.getString("name"));
            g.i(bundle.getString("origin"));
            g.l(bundle.get("value"));
            if (!i6Var.a.n()) {
                super.l().M().a("Conditional property not set since app measurement is disabled");
                return;
            }
            try {
                super.r().O(new oa(bundle.getString("app_id"), bundle.getString("origin"), new y9(bundle.getString("name"), bundle.getLong("triggered_timestamp"), bundle.get("value"), bundle.getString("origin")), bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), super.f().E(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), bundle.getString("origin"), 0, y6.b() && super.j().r(t.S0)), bundle.getLong("trigger_timeout"), super.f().E(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), bundle.getString("origin"), 0, y6.b() && super.j().r(t.S0)), bundle.getLong("time_to_live"), super.f().E(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), 0, y6.b() && super.j().r(t.S0))));
            } catch (IllegalArgumentException unused) {
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void O(com.google.android.gms.measurement.internal.i6 r4, com.google.android.gms.measurement.internal.e r5, int r6, long r7, boolean r9, boolean r10) {
        /*
            super.b()
            r4.w()
            long r0 = r4.l
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0023
            int r0 = r4.m
            boolean r0 = com.google.android.gms.measurement.internal.e.f(r0, r6)
            if (r0 == 0) goto L_0x0023
            com.google.android.gms.measurement.internal.a4 r4 = super.l()
            com.google.android.gms.measurement.internal.c4 r4 = r4.K()
            java.lang.String r6 = "Dropped out-of-date consent setting, proposed settings"
            r4.b(r6, r5)
            goto L_0x0098
        L_0x0023:
            com.google.android.gms.measurement.internal.n4 r0 = super.h()
            r0.getClass()
            boolean r1 = com.google.android.gms.internal.measurement.q7.b()
            if (r1 == 0) goto L_0x006a
            com.google.android.gms.measurement.internal.qa r1 = r0.j()
            com.google.android.gms.measurement.internal.q3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.t.P0
            boolean r1 = r1.r(r2)
            if (r1 == 0) goto L_0x006a
            r0.b()
            android.content.SharedPreferences r1 = r0.x()
            r2 = 100
            java.lang.String r3 = "consent_source"
            int r1 = r1.getInt(r3, r2)
            boolean r1 = com.google.android.gms.measurement.internal.e.f(r6, r1)
            if (r1 == 0) goto L_0x006a
            android.content.SharedPreferences r0 = r0.x()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r5 = r5.d()
            java.lang.String r1 = "consent_settings"
            r0.putString(r1, r5)
            r0.putInt(r3, r6)
            r0.apply()
            r5 = 1
            goto L_0x006b
        L_0x006a:
            r5 = 0
        L_0x006b:
            if (r5 == 0) goto L_0x0087
            r4.l = r7
            r4.m = r6
            com.google.android.gms.measurement.internal.x7 r5 = super.r()
            r5.T(r9)
            if (r10 == 0) goto L_0x0098
            com.google.android.gms.measurement.internal.x7 r4 = super.r()
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>()
            r4.Q(r5)
            goto L_0x0098
        L_0x0087:
            com.google.android.gms.measurement.internal.a4 r4 = super.l()
            com.google.android.gms.measurement.internal.c4 r4 = r4.K()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            java.lang.String r6 = "Lower precedence consent source ignored, proposed source"
            r4.b(r6, r5)
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i6.O(com.google.android.gms.measurement.internal.i6, com.google.android.gms.measurement.internal.e, int, long, boolean, boolean):void");
    }

    /* access modifiers changed from: private */
    public final void R(Boolean bool, boolean z) {
        super.b();
        w();
        super.l().L().b("Setting app measurement enabled (FE)", bool);
        super.h().u(bool);
        if (q7.b() && super.j().r(t.P0) && z) {
            n4 h2 = super.h();
            h2.getClass();
            if (q7.b() && h2.j().r(t.P0)) {
                h2.b();
                SharedPreferences.Editor edit = h2.x().edit();
                if (bool != null) {
                    edit.putBoolean("measurement_enabled_from_api", bool.booleanValue());
                } else {
                    edit.remove("measurement_enabled_from_api");
                }
                edit.apply();
            }
        }
        if (!q7.b() || !super.j().r(t.P0) || this.a.p() || !bool.booleanValue()) {
            n0();
        }
    }

    private final void V(String str, String str2, long j2, Object obj) {
        super.k().y(new q6(this, str, str2, obj, j2));
    }

    /* access modifiers changed from: private */
    public final void n0() {
        super.b();
        String a = super.h().s.a();
        if (a != null) {
            if ("unset".equals(a)) {
                ((d) super.d()).getClass();
                Z("app", "_npa", null, System.currentTimeMillis());
            } else {
                Long valueOf = Long.valueOf("true".equals(a) ? 1 : 0);
                ((d) super.d()).getClass();
                Z("app", "_npa", valueOf, System.currentTimeMillis());
            }
        }
        if (!this.a.n() || !this.o) {
            super.l().L().a("Updating Scion state (FE)");
            super.r().V();
            return;
        }
        super.l().L().a("Recording app launch after enabling measurement for the first time (FE)");
        j0();
        if (t8.b() && super.j().r(t.s0)) {
            super.u().d.a();
        }
        if (i8.b() && super.j().r(t.v0)) {
            if (!(this.a.C().a.w().k.a() > 0)) {
                s4 C = this.a.C();
                C.a(C.a.i().getPackageName());
            }
        }
        if (super.j().r(t.L0)) {
            super.k().y(new m6(this));
        }
    }

    private final ArrayList<Bundle> o0(String str, String str2, String str3) {
        if (super.k().G()) {
            super.l().E().a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList<>(0);
        } else if (pa.a()) {
            super.l().E().a("Cannot get conditional user properties from main thread");
            return new ArrayList<>(0);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.k().u(atomicReference, 5000, "get conditional user properties", new y6(this, atomicReference, null, str2, str3));
            List list = (List) atomicReference.get();
            if (list != null) {
                return z9.m0(list);
            }
            super.l().E().b("Timed out waiting for get conditional user properties", null);
            return new ArrayList<>();
        }
    }

    private final Map<String, Object> p0(String str, String str2, String str3, boolean z) {
        if (super.k().G()) {
            super.l().E().a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (pa.a()) {
            super.l().E().a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            this.a.k().u(atomicReference, 5000, "get user properties", new x6(this, atomicReference, null, str2, str3, z));
            List<y9> list = (List) atomicReference.get();
            if (list == null) {
                super.l().E().b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
                return Collections.emptyMap();
            }
            m1 m1Var = new m1(list.size());
            for (y9 y9Var : list) {
                m1Var.put(y9Var.b, y9Var.I1());
            }
            return m1Var;
        }
    }

    private final void r0(Bundle bundle, long j2) {
        f.i(bundle, "app_id", String.class, null);
        f.i(bundle, "origin", String.class, null);
        f.i(bundle, "name", String.class, null);
        f.i(bundle, "value", Object.class, null);
        f.i(bundle, "trigger_event_name", String.class, null);
        f.i(bundle, "trigger_timeout", Long.class, 0L);
        f.i(bundle, "timed_out_event_name", String.class, null);
        f.i(bundle, "timed_out_event_params", Bundle.class, null);
        f.i(bundle, "triggered_event_name", String.class, null);
        f.i(bundle, "triggered_event_params", Bundle.class, null);
        f.i(bundle, "time_to_live", Long.class, 0L);
        f.i(bundle, "expired_event_name", String.class, null);
        f.i(bundle, "expired_event_params", Bundle.class, null);
        g.i(bundle.getString("name"));
        g.i(bundle.getString("origin"));
        g.l(bundle.get("value"));
        bundle.putLong("creation_timestamp", j2);
        String string = bundle.getString("name");
        Object obj = bundle.get("value");
        if (super.f().k0(string) != 0) {
            super.l().E().b("Invalid conditional user property name", super.e().z(string));
        } else if (super.f().l0(string, obj) != 0) {
            super.l().E().c("Invalid conditional user property value", super.e().z(string), obj);
        } else {
            Object s0 = super.f().s0(string, obj);
            if (s0 == null) {
                super.l().E().c("Unable to normalize conditional user property value", super.e().z(string), obj);
                return;
            }
            f.n(bundle, s0);
            long j3 = bundle.getLong("trigger_timeout");
            if (TextUtils.isEmpty(bundle.getString("trigger_event_name")) || (j3 <= 15552000000L && j3 >= 1)) {
                long j4 = bundle.getLong("time_to_live");
                if (j4 > 15552000000L || j4 < 1) {
                    super.l().E().c("Invalid conditional user property time to live", super.e().z(string), Long.valueOf(j4));
                } else {
                    super.k().y(new t6(this, bundle));
                }
            } else {
                super.l().E().c("Invalid conditional user property timeout", super.e().z(string), Long.valueOf(j3));
            }
        }
    }

    static void t0(i6 i6Var, Bundle bundle) {
        super.b();
        i6Var.w();
        if (bundle != null) {
            g.i(bundle.getString("name"));
            if (!i6Var.a.n()) {
                super.l().M().a("Conditional property not cleared since app measurement is disabled");
                return;
            }
            try {
                super.r().O(new oa(bundle.getString("app_id"), bundle.getString("origin"), new y9(bundle.getString("name"), 0, null, null), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), super.f().E(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), bundle.getString("origin"), bundle.getLong("creation_timestamp"), y6.b() && super.j().r(t.S0))));
            } catch (IllegalArgumentException unused) {
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    private final void v0(String str, String str2, String str3, Bundle bundle) {
        ((d) super.d()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        g.i(str2);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("creation_timestamp", currentTimeMillis);
        if (str3 != null) {
            bundle2.putString("expired_event_name", str3);
            bundle2.putBundle("expired_event_params", bundle);
        }
        super.k().y(new v6(this, bundle2));
    }

    public final ArrayList<Bundle> B(String str, String str2) {
        return o0(null, str, str2);
    }

    public final ArrayList<Bundle> C(String str, String str2, String str3) {
        g.i(str);
        super.m();
        throw null;
    }

    public final Map<String, Object> D(String str, String str2, String str3, boolean z) {
        g.i(str);
        super.m();
        throw null;
    }

    public final Map<String, Object> E(String str, String str2, boolean z) {
        return p0(null, str, str2, z);
    }

    /* access modifiers changed from: package-private */
    public final void F(long j2, boolean z) {
        super.b();
        w();
        super.l().L().a("Resetting analytics data (FE)");
        e9 u = super.u();
        u.b();
        u.e.a();
        boolean n2 = this.a.n();
        n4 h2 = super.h();
        h2.j.b(j2);
        if (!TextUtils.isEmpty(h2.h().z.a())) {
            h2.z.b(null);
        }
        if (t8.b() && h2.j().r(t.s0)) {
            h2.u.b(0);
        }
        if (!h2.j().B()) {
            h2.w(!n2);
        }
        h2.A.b(null);
        h2.B.b(0);
        h2.C.b(null);
        if (z) {
            super.r().W();
        }
        if (t8.b() && super.j().r(t.s0)) {
            super.u().d.a();
        }
        this.o = !n2;
    }

    public final void G(Bundle bundle) {
        ((d) super.d()).getClass();
        H(bundle, System.currentTimeMillis());
    }

    public final void H(Bundle bundle, long j2) {
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
                super.l().H().a("Package name should be null when calling setConditionalUserProperty");
            }
            bundle2.remove("app_id");
            r0(bundle2, j2);
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: package-private */
    public final void I(e eVar) {
        Boolean bool;
        super.b();
        boolean z = (eVar.o() && eVar.m()) || super.r().c0();
        if (z != this.a.p()) {
            this.a.z(z);
            n4 h2 = super.h();
            h2.getClass();
            if (q7.b() && h2.j().r(t.P0)) {
                h2.b();
                if (h2.x().contains("measurement_enabled_from_api")) {
                    bool = Boolean.valueOf(h2.x().getBoolean("measurement_enabled_from_api", true));
                    if (z || bool == null || bool.booleanValue()) {
                        R(Boolean.valueOf(z), false);
                    }
                    return;
                }
            }
            bool = null;
            if (z) {
            }
            R(Boolean.valueOf(z), false);
        }
    }

    public final void J(e eVar, int i2, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        e eVar2 = eVar;
        if (q7.b() && super.j().r(t.P0)) {
            w();
            if (eVar.j() == null && eVar.n() == null) {
                super.l().J().a("Discarding empty consent settings");
                return;
            }
            synchronized (this.h) {
                z = true;
                z2 = false;
                if (e.f(i2, this.j)) {
                    boolean g2 = eVar.g(this.i);
                    if (eVar.o() && !this.i.o()) {
                        z2 = true;
                    }
                    eVar2 = eVar.l(this.i);
                    this.i = eVar2;
                    z3 = z2;
                    z2 = g2;
                } else {
                    z = false;
                    z3 = false;
                }
            }
            if (!z) {
                super.l().K().b("Ignoring lower-priority consent settings, proposed settings", eVar2);
                return;
            }
            long andIncrement = this.k.getAndIncrement();
            if (z2) {
                this.g.set(null);
                super.k().B(new f7(this, eVar2, j2, i2, andIncrement, z3));
                return;
            }
            super.k().y(new e7(this, eVar2, i2, andIncrement, z3));
        }
    }

    public final void K(g6 g6Var) {
        w();
        if (!this.e.add(g6Var)) {
            super.l().H().a("OnEventListener already registered");
        }
    }

    public final void L(h6 h6Var) {
        h6 h6Var2;
        super.b();
        w();
        if (!(h6Var == null || h6Var == (h6Var2 = this.d))) {
            g.p(h6Var2 == null, "EventInterceptor already set.");
        }
        this.d = h6Var;
    }

    public final void Q(Boolean bool) {
        w();
        super.k().y(new b7(this, bool));
    }

    /* access modifiers changed from: package-private */
    public final void S(String str) {
        this.g.set(str);
    }

    /* access modifiers changed from: package-private */
    public final void T(String str, String str2, long j2, Bundle bundle) {
        super.b();
        U(str, str2, j2, bundle, true, this.d == null || z9.w0(str2), false, null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0420  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0523  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0533  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0158  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
        // Method dump skipped, instructions count: 1496
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i6.U(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    public final void W(String str, String str2, Bundle bundle) {
        ((d) super.d()).getClass();
        X(str, str2, bundle, true, true, System.currentTimeMillis());
    }

    public final void X(String str, String str2, Bundle bundle, boolean z, boolean z2, long j2) {
        String str3 = str == null ? "app" : str;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        if (super.j().r(t.x0)) {
            if (z9.v0(str2, "screen_view")) {
                super.s().I(bundle2, j2);
                return;
            }
        }
        boolean z3 = !z2 || this.d == null || z9.w0(str2);
        boolean z4 = !z;
        Bundle bundle3 = new Bundle(bundle2);
        for (String str4 : bundle3.keySet()) {
            Object obj = bundle3.get(str4);
            if (obj instanceof Bundle) {
                bundle3.putBundle(str4, new Bundle((Bundle) obj));
            } else if (obj instanceof Parcelable[]) {
                Parcelable[] parcelableArr = (Parcelable[]) obj;
                for (int i2 = 0; i2 < parcelableArr.length; i2++) {
                    if (parcelableArr[i2] instanceof Bundle) {
                        parcelableArr[i2] = new Bundle((Bundle) parcelableArr[i2]);
                    }
                }
            } else if (obj instanceof List) {
                List list = (List) obj;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    Object obj2 = list.get(i3);
                    if (obj2 instanceof Bundle) {
                        list.set(i3, new Bundle((Bundle) obj2));
                    }
                }
            }
        }
        super.k().y(new r6(this, str3, str2, j2, bundle3, z2, z3, z4, null));
    }

    public final void Y(String str, String str2, Object obj) {
        ((d) super.d()).getClass();
        a0(str, str2, obj, true, System.currentTimeMillis());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Z(java.lang.String r9, java.lang.String r10, java.lang.Object r11, long r12) {
        /*
            r8 = this;
            com.google.android.exoplayer2.util.g.i(r9)
            com.google.android.exoplayer2.util.g.i(r10)
            super.b()
            r8.w()
            java.lang.String r0 = "allow_personalized_ads"
            boolean r0 = r0.equals(r10)
            java.lang.String r1 = "_npa"
            if (r0 == 0) goto L_0x0060
            boolean r0 = r11 instanceof java.lang.String
            if (r0 == 0) goto L_0x0050
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0050
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.String r10 = r0.toLowerCase(r10)
            java.lang.String r11 = "false"
            boolean r10 = r11.equals(r10)
            r2 = 1
            if (r10 == 0) goto L_0x0035
            r4 = r2
            goto L_0x0037
        L_0x0035:
            r4 = 0
        L_0x0037:
            java.lang.Long r10 = java.lang.Long.valueOf(r4)
            com.google.android.gms.measurement.internal.n4 r0 = super.h()
            com.google.android.gms.measurement.internal.t4 r0 = r0.s
            long r4 = r10.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x004b
            java.lang.String r11 = "true"
        L_0x004b:
            r0.b(r11)
            r6 = r10
            goto L_0x005e
        L_0x0050:
            if (r11 != 0) goto L_0x0060
            com.google.android.gms.measurement.internal.n4 r10 = super.h()
            com.google.android.gms.measurement.internal.t4 r10 = r10.s
            java.lang.String r0 = "unset"
            r10.b(r0)
            r6 = r11
        L_0x005e:
            r3 = r1
            goto L_0x0062
        L_0x0060:
            r3 = r10
            r6 = r11
        L_0x0062:
            com.google.android.gms.measurement.internal.f5 r10 = r8.a
            boolean r10 = r10.n()
            if (r10 != 0) goto L_0x0078
            com.google.android.gms.measurement.internal.a4 r9 = super.l()
            com.google.android.gms.measurement.internal.c4 r9 = r9.M()
            java.lang.String r10 = "User property not set since app measurement is disabled"
            r9.a(r10)
            return
        L_0x0078:
            com.google.android.gms.measurement.internal.f5 r10 = r8.a
            boolean r10 = r10.t()
            if (r10 != 0) goto L_0x0081
            return
        L_0x0081:
            com.google.android.gms.measurement.internal.y9 r10 = new com.google.android.gms.measurement.internal.y9
            r2 = r10
            r4 = r12
            r7 = r9
            r2.<init>(r3, r4, r6, r7)
            com.google.android.gms.measurement.internal.x7 r9 = super.r()
            r9.N(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.i6.Z(java.lang.String, java.lang.String, java.lang.Object, long):void");
    }

    public final void a0(String str, String str2, Object obj, boolean z, long j2) {
        if (str == null) {
            str = "app";
        }
        int i2 = 6;
        int i3 = 0;
        if (z) {
            i2 = super.f().k0(str2);
        } else {
            z9 f2 = super.f();
            if (f2.c0("user property", str2)) {
                if (!f2.h0("user property", e6.a, null, str2)) {
                    i2 = 15;
                } else if (f2.b0("user property", 24, str2)) {
                    i2 = 0;
                }
            }
        }
        if (i2 != 0) {
            super.f();
            String H = z9.H(str2, 24, true);
            if (str2 != null) {
                i3 = str2.length();
            }
            this.a.F().j0(i2, "_ev", H, i3);
        } else if (obj != null) {
            int l0 = super.f().l0(str2, obj);
            if (l0 != 0) {
                super.f();
                String H2 = z9.H(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i3 = String.valueOf(obj).length();
                }
                this.a.F().j0(l0, "_ev", H2, i3);
                return;
            }
            Object s0 = super.f().s0(str2, obj);
            if (s0 != null) {
                V(str, str2, j2, s0);
            }
        } else {
            V(str, str2, j2, null);
        }
    }

    public final void b0(String str, String str2, String str3, Bundle bundle) {
        g.i(str);
        super.m();
        throw null;
    }

    public final void c0() {
        if (super.i().getApplicationContext() instanceof Application) {
            ((Application) super.i().getApplicationContext()).unregisterActivityLifecycleCallbacks(this.c);
        }
    }

    public final Boolean d0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Boolean) super.k().u(atomicReference, 15000, "boolean test flag value", new n6(this, atomicReference));
    }

    public final String e0() {
        AtomicReference atomicReference = new AtomicReference();
        return (String) super.k().u(atomicReference, 15000, "String test flag value", new w6(this, atomicReference));
    }

    public final Long f0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Long) super.k().u(atomicReference, 15000, "long test flag value", new a7(this, atomicReference));
    }

    public final Integer g0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Integer) super.k().u(atomicReference, 15000, "int test flag value", new z6(this, atomicReference));
    }

    public final Double h0() {
        AtomicReference atomicReference = new AtomicReference();
        return (Double) super.k().u(atomicReference, 15000, "double test flag value", new c7(this, atomicReference));
    }

    public final String i0() {
        return this.g.get();
    }

    public final void j0() {
        super.b();
        w();
        if (this.a.t()) {
            if (super.j().r(t.e0)) {
                Boolean A = super.j().A("google_analytics_deferred_deep_link_enabled");
                if (A != null && A.booleanValue()) {
                    super.l().L().a("Deferred Deep Link feature enabled.");
                    super.k().y(new k6(this));
                }
            }
            super.r().X();
            this.o = false;
            n4 h2 = super.h();
            h2.b();
            String string = h2.x().getString("previous_os_version", null);
            h2.c().n();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor edit = h2.x().edit();
                edit.putString("previous_os_version", str);
                edit.apply();
            }
            if (!TextUtils.isEmpty(string)) {
                super.c().n();
                if (!string.equals(str)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", string);
                    W("auto", "_ou", bundle);
                }
            }
        }
    }

    public final String k0() {
        p7 Q = this.a.N().Q();
        if (Q != null) {
            return Q.a;
        }
        return null;
    }

    public final String l0() {
        p7 Q = this.a.N().Q();
        if (Q != null) {
            return Q.b;
        }
        return null;
    }

    public final String m0() {
        if (this.a.J() != null) {
            return this.a.J();
        }
        try {
            return f.l(super.i(), "google_app_id");
        } catch (IllegalStateException e2) {
            this.a.l().E().b("getGoogleAppId failed with exception", e2);
            return null;
        }
    }

    public final void q0(Bundle bundle) {
        g.i(bundle.getString("app_id"));
        super.m();
        throw null;
    }

    public final void s0(g6 g6Var) {
        w();
        if (!this.e.remove(g6Var)) {
            super.l().H().a("OnEventListener had not been registered");
        }
    }

    /* access modifiers changed from: package-private */
    public final void u0(String str, String str2, Bundle bundle) {
        super.b();
        ((d) super.d()).getClass();
        T(str, str2, System.currentTimeMillis(), bundle);
    }

    public final void w0(String str, String str2, Bundle bundle) {
        v0(null, str, str2, bundle);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.d5
    public final boolean z() {
        return false;
    }
}
