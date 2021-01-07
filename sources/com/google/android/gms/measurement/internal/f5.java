package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.common.util.b;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.b2;
import com.google.android.gms.internal.measurement.c8;
import com.google.android.gms.internal.measurement.f;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.q7;
import java.net.URL;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class f5 implements a6 {
    private static volatile f5 H;
    private volatile Boolean A;
    private Boolean B;
    private Boolean C;
    private volatile boolean D;
    private int E;
    private AtomicInteger F = new AtomicInteger(0);
    final long G;
    private final Context a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;
    private final pa f;
    private final qa g;
    private final n4 h;
    private final a4 i;
    private final y4 j;
    private final e9 k;
    private final z9 l;
    private final y3 m;
    private final b n;
    private final o7 o;
    private final i6 p;
    private final a q;
    private final k7 r;
    private w3 s;
    private x7 t;
    private l u;
    private t3 v;
    private s4 w;
    private boolean x = false;
    private Boolean y;
    private long z;

    private f5(j6 j6Var) {
        long j2;
        Bundle bundle;
        boolean z2 = false;
        Context context = j6Var.a;
        pa paVar = new pa();
        this.f = paVar;
        g.a = paVar;
        this.a = context;
        this.b = j6Var.b;
        this.c = j6Var.c;
        this.d = j6Var.d;
        this.e = j6Var.h;
        this.A = j6Var.e;
        this.D = true;
        f fVar = j6Var.g;
        if (!(fVar == null || (bundle = fVar.p) == null)) {
            Object obj = bundle.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.B = (Boolean) obj;
            }
            Object obj2 = fVar.p.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.C = (Boolean) obj2;
            }
        }
        b2.d(context);
        this.n = d.b();
        Long l2 = j6Var.i;
        if (l2 != null) {
            j2 = l2.longValue();
        } else {
            j2 = System.currentTimeMillis();
        }
        this.G = j2;
        this.g = new qa(this);
        n4 n4Var = new n4(this);
        n4Var.o();
        this.h = n4Var;
        a4 a4Var = new a4(this);
        a4Var.o();
        this.i = a4Var;
        z9 z9Var = new z9(this);
        z9Var.o();
        this.l = z9Var;
        y3 y3Var = new y3(this);
        y3Var.o();
        this.m = y3Var;
        this.q = new a(this);
        o7 o7Var = new o7(this);
        o7Var.x();
        this.o = o7Var;
        i6 i6Var = new i6(this);
        i6Var.x();
        this.p = i6Var;
        e9 e9Var = new e9(this);
        e9Var.x();
        this.k = e9Var;
        k7 k7Var = new k7(this);
        k7Var.o();
        this.r = k7Var;
        y4 y4Var = new y4(this);
        y4Var.o();
        this.j = y4Var;
        f fVar2 = j6Var.g;
        if (!(fVar2 == null || fVar2.b == 0)) {
            z2 = true;
        }
        boolean z3 = !z2;
        if (context.getApplicationContext() instanceof Application) {
            i6 E2 = E();
            if (E2.i().getApplicationContext() instanceof Application) {
                Application application = (Application) E2.i().getApplicationContext();
                if (E2.c == null) {
                    E2.c = new g7(E2, null);
                }
                if (z3) {
                    application.unregisterActivityLifecycleCallbacks(E2.c);
                    application.registerActivityLifecycleCallbacks(E2.c);
                    E2.l().M().a("Registered activity lifecycle callback");
                }
            }
        } else {
            l().H().a("Application context is not an Application");
        }
        y4Var.y(new h5(this, j6Var));
    }

    public static f5 a(Context context, f fVar, Long l2) {
        Bundle bundle;
        if (fVar != null && (fVar.n == null || fVar.o == null)) {
            fVar = new f(fVar.a, fVar.b, fVar.c, fVar.f, null, null, fVar.p);
        }
        if (context != null) {
            g.l(context.getApplicationContext());
            if (H == null) {
                synchronized (f5.class) {
                    if (H == null) {
                        H = new f5(new j6(context, fVar, l2));
                    }
                }
            } else if (!(fVar == null || (bundle = fVar.p) == null || !bundle.containsKey("dataCollectionDefaultEnabled"))) {
                H.A = Boolean.valueOf(fVar.p.getBoolean("dataCollectionDefaultEnabled"));
            }
            return H;
        }
        throw new NullPointerException("null reference");
    }

    static void g(f5 f5Var, j6 j6Var) {
        c4 c4Var;
        String str;
        f5Var.k().b();
        l lVar = new l(f5Var);
        lVar.o();
        f5Var.u = lVar;
        t3 t3Var = new t3(f5Var, j6Var.f);
        t3Var.x();
        f5Var.v = t3Var;
        w3 w3Var = new w3(f5Var);
        w3Var.x();
        f5Var.s = w3Var;
        x7 x7Var = new x7(f5Var);
        x7Var.x();
        f5Var.t = x7Var;
        f5Var.l.p();
        f5Var.h.p();
        f5Var.w = new s4(f5Var);
        f5Var.v.y();
        f5Var.l().K().b("App measurement initialized, version", 31049L);
        f5Var.l().K().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String C2 = t3Var.C();
        if (TextUtils.isEmpty(f5Var.b)) {
            if (f5Var.F().x0(C2)) {
                c4Var = f5Var.l().K();
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                c4 K = f5Var.l().K();
                String valueOf = String.valueOf(C2);
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                c4Var = K;
            }
            c4Var.a(str);
        }
        f5Var.l().L().a("Debug-level message logging enabled");
        if (f5Var.E != f5Var.F.get()) {
            f5Var.l().E().c("Not all components initialized", Integer.valueOf(f5Var.E), Integer.valueOf(f5Var.F.get()));
        }
        f5Var.x = true;
    }

    private static void h(y5 y5Var) {
        if (y5Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private final k7 v() {
        y(this.r);
        return this.r;
    }

    private static void x(d5 d5Var) {
        if (d5Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!d5Var.v()) {
            String valueOf = String.valueOf(d5Var.getClass());
            throw new IllegalStateException(je.i0(valueOf.length() + 27, "Component not initialized: ", valueOf));
        }
    }

    private static void y(b6 b6Var) {
        if (b6Var == null) {
            throw new IllegalStateException("Component not created");
        } else if (!b6Var.s()) {
            String valueOf = String.valueOf(b6Var.getClass());
            throw new IllegalStateException(je.i0(valueOf.length() + 27, "Component not initialized: ", valueOf));
        }
    }

    public final a4 A() {
        a4 a4Var = this.i;
        if (a4Var == null || !a4Var.s()) {
            return null;
        }
        return this.i;
    }

    public final e9 B() {
        x(this.k);
        return this.k;
    }

    public final s4 C() {
        return this.w;
    }

    /* access modifiers changed from: package-private */
    public final y4 D() {
        return this.j;
    }

    public final i6 E() {
        x(this.p);
        return this.p;
    }

    public final z9 F() {
        h(this.l);
        return this.l;
    }

    public final y3 G() {
        h(this.m);
        return this.m;
    }

    public final w3 H() {
        x(this.s);
        return this.s;
    }

    public final boolean I() {
        return TextUtils.isEmpty(this.b);
    }

    public final String J() {
        return this.b;
    }

    public final String K() {
        return this.c;
    }

    public final String L() {
        return this.d;
    }

    public final boolean M() {
        return this.e;
    }

    public final o7 N() {
        x(this.o);
        return this.o;
    }

    public final x7 O() {
        x(this.t);
        return this.t;
    }

    public final l P() {
        y(this.u);
        return this.u;
    }

    public final t3 Q() {
        x(this.v);
        return this.v;
    }

    public final a R() {
        a aVar = this.q;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public final boolean S() {
        return this.A != null && this.A.booleanValue();
    }

    public final qa b() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.E++;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final b d() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void e(int i2, Throwable th, byte[] bArr) {
        List<ResolveInfo> queryIntentActivities;
        boolean z2 = true;
        if (!((i2 == 200 || i2 == 204 || i2 == 304) && th == null)) {
            l().H().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i2), th);
            return;
        }
        w().x.a(true);
        if (bArr.length == 0) {
            l().L().a("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString(Constants.DEEPLINK, "");
            String optString2 = jSONObject.optString("gclid", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            if (TextUtils.isEmpty(optString)) {
                l().L().a("Deferred Deep Link is empty.");
                return;
            }
            z9 F2 = F();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = F2.i().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                l().H().c("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            this.p.W("auto", "_cmp", bundle);
            z9 F3 = F();
            if (!TextUtils.isEmpty(optString) && F3.a0(optString, optDouble)) {
                F3.i().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
            }
        } catch (JSONException e2) {
            l().E().b("Failed to parse the Deferred Deep Link response. exception", e2);
        }
    }

    /* access modifiers changed from: protected */
    public final void f(f fVar) {
        k().b();
        if (q7.b() && this.g.r(t.P0)) {
            e z2 = w().z();
            if (!(fVar == null || fVar.p == null || !e.f(30, w().x().getInt("consent_source", 100)))) {
                e h2 = e.h(fVar.p);
                if (!h2.equals(e.c)) {
                    E().J(h2, 30, this.G);
                    z2 = h2;
                }
            }
            E().I(z2);
        }
        if (w().e.a() == 0) {
            r4 r4Var = w().e;
            ((d) this.n).getClass();
            r4Var.b(System.currentTimeMillis());
        }
        if (Long.valueOf(w().j.a()).longValue() == 0) {
            l().M().b("Persisting first open", Long.valueOf(this.G));
            w().j.b(this.G);
        }
        if (this.g.r(t.L0)) {
            E().n.c();
        }
        if (t()) {
            if (!TextUtils.isEmpty(Q().D()) || !TextUtils.isEmpty(Q().E())) {
                F();
                String D2 = Q().D();
                n4 w2 = w();
                w2.b();
                String string = w2.x().getString("gmp_app_id", null);
                String E2 = Q().E();
                n4 w3 = w();
                w3.b();
                if (z9.f0(D2, string, E2, w3.x().getString("admob_app_id", null))) {
                    l().K().a("Rechecking which service to use due to a GMP App Id change");
                    n4 w4 = w();
                    w4.b();
                    Boolean y2 = w4.y();
                    SharedPreferences.Editor edit = w4.x().edit();
                    edit.clear();
                    edit.apply();
                    if (y2 != null) {
                        w4.u(y2);
                    }
                    x(this.s);
                    this.s.H();
                    this.t.a0();
                    this.t.Y();
                    w().j.b(this.G);
                    w().l.b(null);
                }
                n4 w5 = w();
                String D3 = Q().D();
                w5.b();
                SharedPreferences.Editor edit2 = w5.x().edit();
                edit2.putString("gmp_app_id", D3);
                edit2.apply();
                n4 w6 = w();
                String E3 = Q().E();
                w6.b();
                SharedPreferences.Editor edit3 = w6.x().edit();
                edit3.putString("admob_app_id", E3);
                edit3.apply();
            }
            if (q7.b() && this.g.r(t.P0) && !w().z().o()) {
                w().l.b(null);
            }
            E().S(w().l.a());
            if (c8.b() && this.g.r(t.r0) && !F().G0() && !TextUtils.isEmpty(w().z.a())) {
                l().H().a("Remote config removed with active feature rollouts");
                w().z.b(null);
            }
            if (!TextUtils.isEmpty(Q().D()) || !TextUtils.isEmpty(Q().E())) {
                boolean n2 = n();
                if (!w().A() && !this.g.B()) {
                    w().w(!n2);
                }
                if (n2) {
                    E().j0();
                }
                B().d.a();
                O().Q(new AtomicReference<>());
                if (g9.b() && this.g.r(t.H0)) {
                    O().D(w().C.a());
                }
            }
        } else if (n()) {
            if (!F().u0("android.permission.INTERNET")) {
                l().E().a("App is missing INTERNET permission");
            }
            if (!F().u0("android.permission.ACCESS_NETWORK_STATE")) {
                l().E().a("App is missing ACCESS_NETWORK_STATE permission");
            }
            if (!xr.a(this.a).f() && !this.g.L()) {
                if (!x4.b(this.a)) {
                    l().E().a("AppMeasurementReceiver not registered/enabled");
                }
                if (!z9.W(this.a)) {
                    l().E().a("AppMeasurementService not registered/enabled");
                }
            }
            l().E().a("Uploading is not possible. App measurement disabled");
        }
        w().t.a(this.g.r(t.Z));
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final Context i() {
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final void j(boolean z2) {
        this.A = Boolean.valueOf(z2);
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final y4 k() {
        y(this.j);
        return this.j;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final a4 l() {
        y(this.i);
        return this.i;
    }

    /* access modifiers changed from: package-private */
    public final void m() {
        this.E++;
    }

    public final boolean n() {
        return o() == 0;
    }

    public final int o() {
        k().b();
        if (this.g.B()) {
            return 1;
        }
        Boolean bool = this.C;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (q7.b() && this.g.r(t.P0) && !p()) {
            return 8;
        }
        Boolean y2 = w().y();
        if (y2 == null) {
            Boolean A2 = this.g.A("firebase_analytics_collection_enabled");
            if (A2 == null) {
                Boolean bool2 = this.B;
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        return 0;
                    }
                    return 5;
                } else if (h.d()) {
                    return 6;
                } else {
                    if (!this.g.r(t.T) || this.A == null || this.A.booleanValue()) {
                        return 0;
                    }
                    return 7;
                }
            } else if (A2.booleanValue()) {
                return 0;
            } else {
                return 4;
            }
        } else if (y2.booleanValue()) {
            return 0;
        } else {
            return 3;
        }
    }

    public final boolean p() {
        k().b();
        return this.D;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final pa q() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* access modifiers changed from: package-private */
    public final void s() {
        this.F.incrementAndGet();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        if (java.lang.Math.abs(android.os.SystemClock.elapsedRealtime() - r6.z) > 1000) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t() {
        /*
            r6 = this;
            boolean r0 = r6.x
            if (r0 == 0) goto L_0x00d0
            com.google.android.gms.measurement.internal.y4 r0 = r6.k()
            r0.b()
            java.lang.Boolean r0 = r6.y
            if (r0 == 0) goto L_0x0037
            long r1 = r6.z
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0037
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x00c9
            com.google.android.gms.common.util.b r0 = r6.n
            com.google.android.gms.common.util.d r0 = (com.google.android.gms.common.util.d) r0
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r6.z
            long r0 = r0 - r2
            long r0 = java.lang.Math.abs(r0)
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x00c9
        L_0x0037:
            com.google.android.gms.common.util.b r0 = r6.n
            com.google.android.gms.common.util.d r0 = (com.google.android.gms.common.util.d) r0
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            r6.z = r0
            com.google.android.gms.measurement.internal.z9 r0 = r6.F()
            java.lang.String r1 = "android.permission.INTERNET"
            boolean r0 = r0.u0(r1)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0084
            com.google.android.gms.measurement.internal.z9 r0 = r6.F()
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r0 = r0.u0(r3)
            if (r0 == 0) goto L_0x0084
            android.content.Context r0 = r6.a
            wr r0 = defpackage.xr.a(r0)
            boolean r0 = r0.f()
            if (r0 != 0) goto L_0x0082
            com.google.android.gms.measurement.internal.qa r0 = r6.g
            boolean r0 = r0.L()
            if (r0 != 0) goto L_0x0082
            android.content.Context r0 = r6.a
            boolean r0 = com.google.android.gms.measurement.internal.x4.b(r0)
            if (r0 == 0) goto L_0x0084
            android.content.Context r0 = r6.a
            boolean r0 = com.google.android.gms.measurement.internal.z9.W(r0)
            if (r0 == 0) goto L_0x0084
        L_0x0082:
            r0 = 1
            goto L_0x0085
        L_0x0084:
            r0 = 0
        L_0x0085:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.y = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00c9
            com.google.android.gms.measurement.internal.z9 r0 = r6.F()
            com.google.android.gms.measurement.internal.t3 r3 = r6.Q()
            java.lang.String r3 = r3.D()
            com.google.android.gms.measurement.internal.t3 r4 = r6.Q()
            java.lang.String r4 = r4.E()
            com.google.android.gms.measurement.internal.t3 r5 = r6.Q()
            java.lang.String r5 = r5.F()
            boolean r0 = r0.e0(r3, r4, r5)
            if (r0 != 0) goto L_0x00c3
            com.google.android.gms.measurement.internal.t3 r0 = r6.Q()
            java.lang.String r0 = r0.E()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r1 = 0
        L_0x00c3:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.y = r0
        L_0x00c9:
            java.lang.Boolean r0 = r6.y
            boolean r0 = r0.booleanValue()
            return r0
        L_0x00d0:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "AppMeasurement is not initialized"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.f5.t():boolean");
    }

    public final void u() {
        k().b();
        y(v());
        String C2 = Q().C();
        Pair<String, Boolean> t2 = w().t(C2);
        if (!this.g.C().booleanValue() || ((Boolean) t2.second).booleanValue() || TextUtils.isEmpty((CharSequence) t2.first)) {
            l().L().a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
        } else if (!v().v()) {
            l().H().a("Network is not available for Deferred Deep Link request. Skipping");
        } else {
            z9 F2 = F();
            Q();
            URL I = F2.I(31049, C2, (String) t2.first, w().y.a() - 1);
            k7 v2 = v();
            e5 e5Var = new e5(this);
            v2.b();
            v2.n();
            g.l(I);
            v2.k().D(new m7(v2, C2, I, e5Var));
        }
    }

    public final n4 w() {
        h(this.h);
        return this.h;
    }

    public final void z(boolean z2) {
        k().b();
        this.D = z2;
    }
}
