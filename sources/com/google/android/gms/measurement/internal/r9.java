package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.common.util.b;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.c1;
import com.google.android.gms.internal.measurement.f1;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.y6;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class r9 implements a6 {
    private static volatile r9 z;
    private z4 a;
    private e4 b;
    private d c;
    private l4 d;
    private o9 e;
    private ga f;
    private final v9 g;
    private n7 h;
    private x8 i;
    private final f5 j;
    private boolean k = false;
    private boolean l;
    private long m;
    private List<Runnable> n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private FileLock t;
    private FileChannel u;
    private List<Long> v;
    private List<Long> w;
    private long x;
    private final Map<String, e> y;

    /* access modifiers changed from: package-private */
    public class a {
        c1 a;
        List<Long> b;
        List<y0> c;
        private long d;

        a(r9 r9Var, q9 q9Var) {
        }

        public final void a(c1 c1Var) {
            this.a = c1Var;
        }

        public final boolean b(long j, y0 y0Var) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && ((this.c.get(0).H() / 1000) / 60) / 60 != ((y0Var.H() / 1000) / 60) / 60) {
                return false;
            }
            long c2 = this.d + ((long) y0Var.c());
            if (c2 >= ((long) Math.max(0, t.i.a(null).intValue()))) {
                return false;
            }
            this.d = c2;
            this.c.add(y0Var);
            this.b.add(Long.valueOf(j));
            if (this.c.size() >= Math.max(1, t.j.a(null).intValue())) {
                return false;
            }
            return true;
        }
    }

    private r9(w9 w9Var) {
        f5 a2 = f5.a(w9Var.a, null, null);
        this.j = a2;
        this.x = -1;
        v9 v9Var = new v9(this);
        v9Var.p();
        this.g = v9Var;
        e4 e4Var = new e4(this);
        e4Var.p();
        this.b = e4Var;
        z4 z4Var = new z4(this);
        z4Var.p();
        this.a = z4Var;
        this.y = new HashMap();
        a2.k().y(new q9(this, w9Var));
    }

    private final boolean C() {
        i0();
        b0();
        return U().y0() || !TextUtils.isEmpty(U().w());
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void D() {
        /*
        // Method dump skipped, instructions count: 647
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.D():void");
    }

    private final void E() {
        i0();
        if (this.q || this.r || this.s) {
            this.j.l().M().d("Not stopping services. fetch, network, upload", Boolean.valueOf(this.q), Boolean.valueOf(this.r), Boolean.valueOf(this.s));
            return;
        }
        this.j.l().M().a("Stopping uploading service(s)");
        List<Runnable> list = this.n;
        if (list != null) {
            for (Runnable runnable : list) {
                runnable.run();
            }
            this.n.clear();
        }
    }

    private final fa F(String str) {
        d4 g0 = U().g0(str);
        if (g0 == null || TextUtils.isEmpty(g0.T())) {
            this.j.l().L().b("No app data available; dropping", str);
            return null;
        }
        Boolean H = H(g0);
        if (H == null || H.booleanValue()) {
            return new fa(str, g0.A(), g0.T(), g0.V(), g0.X(), g0.Z(), g0.b0(), (String) null, g0.e0(), false, g0.M(), g0.k(), 0L, 0, g0.l(), g0.m(), false, g0.D(), g0.n(), g0.d0(), g0.o(), (!f9.b() || !this.j.b().x(str, t.k0)) ? null : g0.G(), (!q7.b() || !this.j.b().r(t.Q0)) ? "" : a(str).d());
        }
        this.j.l().E().b("App version does not match; dropping. appId", a4.w(str));
        return null;
    }

    private final Boolean H(d4 d4Var) {
        Boolean bool = Boolean.TRUE;
        try {
            if (d4Var.V() != -2147483648L) {
                if (d4Var.V() == ((long) xr.a(this.j.i()).e(d4Var.t(), 0).versionCode)) {
                    return bool;
                }
            } else {
                String str = xr.a(this.j.i()).e(d4Var.t(), 0).versionName;
                if (d4Var.T() != null && d4Var.T().equals(str)) {
                    return bool;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final void I(y0.a aVar, y0.a aVar2) {
        g.c("_e".equals(aVar.G()));
        Y();
        a1 y2 = v9.y((y0) ((f4) aVar.s()), "_et");
        if (y2.I() && y2.J() > 0) {
            long J = y2.J();
            Y();
            a1 y3 = v9.y((y0) ((f4) aVar2.s()), "_et");
            if (y3 != null && y3.J() > 0) {
                J += y3.J();
            }
            Y().H(aVar2, "_et", Long.valueOf(J));
            Y().H(aVar, "_fr", 1L);
        }
    }

    private final void J(r rVar, fa faVar) {
        if (g9.b() && this.j.b().r(t.I0)) {
            f4 b2 = f4.b(rVar);
            this.j.F().L(b2.d, U().u0(faVar.a));
            this.j.F().U(b2, this.j.b().m(faVar.a));
            rVar = b2.a();
        }
        if (this.j.b().r(t.f0) && "_cmp".equals(rVar.a) && "referrer API v2".equals(rVar.b.s2("_cis"))) {
            String s2 = rVar.b.s2("gclid");
            if (!TextUtils.isEmpty(s2)) {
                r(new y9("_lgclid", rVar.f, s2, "auto"), faVar);
            }
        }
        m(rVar, faVar);
    }

    private static void K(p9 p9Var) {
        if (p9Var == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!p9Var.n()) {
            String valueOf = String.valueOf(p9Var.getClass());
            throw new IllegalStateException(je.i0(valueOf.length() + 27, "Component not initialized: ", valueOf));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0999, code lost:
        if (r8.e < ((long) r28.j.b().v(r4.a))) goto L_0x099b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x099b, code lost:
        r6 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void R(com.google.android.gms.measurement.internal.r r29, com.google.android.gms.measurement.internal.fa r30) {
        /*
        // Method dump skipped, instructions count: 2557
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.R(com.google.android.gms.measurement.internal.r, com.google.android.gms.measurement.internal.fa):void");
    }

    private final boolean V(fa faVar) {
        return (!f9.b() || !this.j.b().x(faVar.a, t.k0)) ? !TextUtils.isEmpty(faVar.b) || !TextUtils.isEmpty(faVar.A) : !TextUtils.isEmpty(faVar.b) || !TextUtils.isEmpty(faVar.E) || !TextUtils.isEmpty(faVar.A);
    }

    public static r9 b(Context context) {
        if (context != null) {
            g.l(context.getApplicationContext());
            if (z == null) {
                synchronized (r9.class) {
                    if (z == null) {
                        z = new r9(new w9(context));
                    }
                }
            }
            return z;
        }
        throw new NullPointerException("null reference");
    }

    private final String c(e eVar) {
        if (!q7.b() || !this.j.b().r(t.Q0) || eVar.o()) {
            return k0();
        }
        return null;
    }

    private static void g(y0.a aVar, int i2, String str) {
        List<a1> B = aVar.B();
        for (int i3 = 0; i3 < B.size(); i3++) {
            if ("_err".equals(B.get(i3).B())) {
                return;
            }
        }
        a1.a Q = a1.Q();
        Q.y("_err");
        Q.v(Long.valueOf((long) i2).longValue());
        a1.a Q2 = a1.Q();
        Q2.y("_ev");
        Q2.A(str);
        aVar.x((a1) ((f4) Q.s()));
        aVar.x((a1) ((f4) Q2.s()));
    }

    private final l4 g0() {
        l4 l4Var = this.d;
        if (l4Var != null) {
            return l4Var;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private static void h(y0.a aVar, String str) {
        List<a1> B = aVar.B();
        for (int i2 = 0; i2 < B.size(); i2++) {
            if (str.equals(B.get(i2).B())) {
                aVar.D(i2);
                return;
            }
        }
    }

    private final o9 h0() {
        K(this.e);
        return this.e;
    }

    private final void i0() {
        this.j.k().b();
    }

    private final void j(c1.a aVar, long j2, boolean z2) {
        aa aaVar;
        String str = z2 ? "_se" : "_lte";
        aa l0 = U().l0(aVar.q0(), str);
        if (l0 == null || l0.e == null) {
            String q0 = aVar.q0();
            ((d) this.j.d()).getClass();
            aaVar = new aa(q0, "auto", str, System.currentTimeMillis(), Long.valueOf(j2));
        } else {
            String q02 = aVar.q0();
            ((d) this.j.d()).getClass();
            aaVar = new aa(q02, "auto", str, System.currentTimeMillis(), Long.valueOf(((Long) l0.e).longValue() + j2));
        }
        f1.a L = f1.L();
        L.w(str);
        ((d) this.j.d()).getClass();
        L.v(System.currentTimeMillis());
        L.y(((Long) aaVar.e).longValue());
        f1 f1Var = (f1) ((f4) L.s());
        boolean z3 = false;
        int u2 = v9.u(aVar, str);
        if (u2 >= 0) {
            aVar.v(u2, f1Var);
            z3 = true;
        }
        if (!z3) {
            aVar.z(f1Var);
        }
        if (j2 > 0) {
            U().R(aaVar);
            this.j.l().M().c("Updated engagement user property. scope, value", z2 ? "session-scoped" : "lifetime", aaVar.e);
        }
    }

    private final long j0() {
        ((d) this.j.d()).getClass();
        long currentTimeMillis = System.currentTimeMillis();
        n4 w2 = this.j.w();
        w2.n();
        w2.b();
        long a2 = w2.i.a();
        if (a2 == 0) {
            a2 = 1 + ((long) w2.f().B0().nextInt(86400000));
            w2.i.b(a2);
        }
        return ((((currentTimeMillis + a2) / 1000) / 60) / 60) / 24;
    }

    @Deprecated
    private final String k0() {
        byte[] bArr = new byte[16];
        this.j.F().B0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    private final void o(d4 d4Var) {
        m1 m1Var;
        i0();
        if (!f9.b() || !this.j.b().x(d4Var.t(), t.k0)) {
            if (TextUtils.isEmpty(d4Var.A()) && TextUtils.isEmpty(d4Var.D())) {
                w(d4Var.t(), 204, null, null, null);
                return;
            }
        } else if (TextUtils.isEmpty(d4Var.A()) && TextUtils.isEmpty(d4Var.G()) && TextUtils.isEmpty(d4Var.D())) {
            w(d4Var.t(), 204, null, null, null);
            return;
        }
        String o2 = this.j.b().o(d4Var);
        try {
            URL url = new URL(o2);
            this.j.l().M().b("Fetching remote configuration", d4Var.t());
            s0 u2 = Q().u(d4Var.t());
            String z2 = Q().z(d4Var.t());
            if (u2 == null || TextUtils.isEmpty(z2)) {
                m1Var = null;
            } else {
                m1 m1Var2 = new m1();
                m1Var2.put("If-Modified-Since", z2);
                m1Var = m1Var2;
            }
            this.q = true;
            e4 S = S();
            String t2 = d4Var.t();
            s9 s9Var = new s9(this);
            S.b();
            S.o();
            S.k().D(new i4(S, t2, url, null, m1Var, s9Var));
        } catch (MalformedURLException unused) {
            this.j.l().E().c("Failed to parse config URL. Not fetching. appId", a4.w(d4Var.t()), o2);
        }
    }

    static void p(r9 r9Var, w9 w9Var) {
        r9Var.j.k().b();
        d dVar = new d(r9Var);
        dVar.p();
        r9Var.c = dVar;
        r9Var.j.b().p(r9Var.a);
        x8 x8Var = new x8(r9Var);
        x8Var.p();
        r9Var.i = x8Var;
        ga gaVar = new ga(r9Var);
        gaVar.p();
        r9Var.f = gaVar;
        n7 n7Var = new n7(r9Var);
        n7Var.p();
        r9Var.h = n7Var;
        o9 o9Var = new o9(r9Var);
        o9Var.p();
        r9Var.e = o9Var;
        r9Var.d = new l4(r9Var);
        if (r9Var.o != r9Var.p) {
            r9Var.j.l().E().c("Not all upload components initialized", Integer.valueOf(r9Var.o), Integer.valueOf(r9Var.p));
        }
        r9Var.k = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0273, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0292, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0294, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0295, code lost:
        r2 = r0;
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0299, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x029a, code lost:
        r29 = "_si";
        r30 = "_sc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x029e, code lost:
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x029f, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02b0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02b1, code lost:
        r29 = "_si";
        r30 = "_sc";
        r28 = "_npa";
        r9 = r6;
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02bf, code lost:
        r9 = r7;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d0, code lost:
        r2 = r0;
        r9 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d4, code lost:
        r29 = "_si";
        r30 = "_sc";
        r28 = "_npa";
        r9 = r6;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02dd, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02de, code lost:
        r29 = "_si";
        r30 = "_sc";
        r28 = "_npa";
        r9 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02e7, code lost:
        r2 = r0;
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ec, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ed, code lost:
        r29 = "_si";
        r30 = "_sc";
        r28 = "_npa";
        r9 = r6;
        r27 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f6, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x030d, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a4, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a8, code lost:
        r27 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x10de, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0198, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0199, code lost:
        r29 = "_si";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x019b, code lost:
        r30 = "_sc";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0294 A[ExcHandler: all (r0v15 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:58:0x0144] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02ae A[ExcHandler: all (r0v10 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:53:0x011e] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02cf A[ExcHandler: all (r0v28 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:21:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02e6 A[ExcHandler: all (r0v8 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:4:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x04ee  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0518  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x0576 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x05ab  */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0609  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0669  */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x0690 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0699  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x06b6  */
    /* JADX WARNING: Removed duplicated region for block: B:288:0x07aa  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x097d  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x09a2  */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x09bc  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0d35  */
    /* JADX WARNING: Removed duplicated region for block: B:474:0x0d48  */
    /* JADX WARNING: Removed duplicated region for block: B:476:0x0d4b  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0d72  */
    /* JADX WARNING: Removed duplicated region for block: B:585:0x10c7  */
    /* JADX WARNING: Removed duplicated region for block: B:590:0x10de  */
    /* JADX WARNING: Removed duplicated region for block: B:607:0x0573 A[EDGE_INSN: B:607:0x0573->B:219:0x0573 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014a A[Catch:{ SQLiteException -> 0x0299, all -> 0x0294 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0163  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean y(long r47) {
        /*
        // Method dump skipped, instructions count: 4339
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.y(long):boolean");
    }

    private final boolean z(y0.a aVar, y0.a aVar2) {
        String str;
        g.c("_e".equals(aVar.G()));
        Y();
        a1 y2 = v9.y((y0) ((f4) aVar.s()), "_sc");
        String str2 = null;
        if (y2 == null) {
            str = null;
        } else {
            str = y2.G();
        }
        Y();
        a1 y3 = v9.y((y0) ((f4) aVar2.s()), "_pc");
        if (y3 != null) {
            str2 = y3.G();
        }
        if (str2 == null || !str2.equals(str)) {
            return false;
        }
        I(aVar, aVar2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void A() {
        this.o++;
    }

    /* access modifiers changed from: package-private */
    public final void B() {
        D();
    }

    public final qa G() {
        return this.j.b();
    }

    /* access modifiers changed from: package-private */
    public final void L(y9 y9Var, fa faVar) {
        i0();
        b0();
        if (V(faVar)) {
            if (!faVar.q) {
                P(faVar);
            } else if (!"_npa".equals(y9Var.b) || faVar.B == null) {
                this.j.l().L().b("Removing user property", this.j.G().z(y9Var.b));
                U().o0();
                try {
                    P(faVar);
                    U().i0(faVar.a, y9Var.b);
                    U().u();
                    this.j.l().L().b("User property removed", this.j.G().z(y9Var.b));
                } finally {
                    U().r0();
                }
            } else {
                this.j.l().L().a("Falling back to manifest metadata value for ad personalization");
                ((d) this.j.d()).getClass();
                r(new y9("_npa", System.currentTimeMillis(), Long.valueOf(faVar.B.booleanValue() ? 1 : 0), "auto"), faVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03bd  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0493  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011d A[Catch:{ all -> 0x04bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x020e  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0257  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M(com.google.android.gms.measurement.internal.fa r22) {
        /*
        // Method dump skipped, instructions count: 1234
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.M(com.google.android.gms.measurement.internal.fa):void");
    }

    /* access modifiers changed from: package-private */
    public final void N(oa oaVar) {
        fa F = F(oaVar.a);
        if (F != null) {
            O(oaVar, F);
        }
    }

    /* access modifiers changed from: package-private */
    public final void O(oa oaVar, fa faVar) {
        if (oaVar != null) {
            g.i(oaVar.a);
            g.l(oaVar.c);
            g.i(oaVar.c.b);
            i0();
            b0();
            if (V(faVar)) {
                if (!faVar.q) {
                    P(faVar);
                    return;
                }
                U().o0();
                try {
                    P(faVar);
                    oa m0 = U().m0(oaVar.a, oaVar.c.b);
                    if (m0 != null) {
                        this.j.l().L().c("Removing conditional user property", oaVar.a, this.j.G().z(oaVar.c.b));
                        U().n0(oaVar.a, oaVar.c.b);
                        if (m0.n) {
                            U().i0(oaVar.a, oaVar.c.b);
                        }
                        r rVar = oaVar.t;
                        if (rVar != null) {
                            Bundle bundle = null;
                            m mVar = rVar.b;
                            if (mVar != null) {
                                bundle = mVar.p2();
                            }
                            z9 F = this.j.F();
                            String str = oaVar.a;
                            r rVar2 = oaVar.t;
                            R(F.E(str, rVar2.a, bundle, m0.b, rVar2.f, y6.b() && this.j.b().r(t.T0)), faVar);
                        }
                    } else {
                        this.j.l().H().c("Conditional user property doesn't exist", a4.w(oaVar.a), this.j.G().z(oaVar.c.b));
                    }
                    U().u();
                } finally {
                    U().r0();
                }
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0379  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0387  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.measurement.internal.d4 P(com.google.android.gms.measurement.internal.fa r11) {
        /*
        // Method dump skipped, instructions count: 962
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.P(com.google.android.gms.measurement.internal.fa):com.google.android.gms.measurement.internal.d4");
    }

    public final z4 Q() {
        K(this.a);
        return this.a;
    }

    public final e4 S() {
        K(this.b);
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final String T(fa faVar) {
        try {
            return (String) ((FutureTask) this.j.k().v(new u9(this, faVar))).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.j.l().E().c("Failed to get app instance id. appId", a4.w(faVar.a), e2);
            return null;
        }
    }

    public final d U() {
        K(this.c);
        return this.c;
    }

    public final ga W() {
        K(this.f);
        return this.f;
    }

    public final n7 X() {
        K(this.h);
        return this.h;
    }

    public final v9 Y() {
        K(this.g);
        return this.g;
    }

    public final y3 Z() {
        return this.j.G();
    }

    /* access modifiers changed from: package-private */
    public final e a(String str) {
        String str2;
        e eVar = e.c;
        if (!q7.b() || !this.j.b().r(t.Q0)) {
            return eVar;
        }
        i0();
        b0();
        e eVar2 = this.y.get(str);
        if (eVar2 != null) {
            return eVar2;
        }
        d U = U();
        if (str != null) {
            U.b();
            U.o();
            Cursor cursor = null;
            try {
                Cursor rawQuery = U.v().rawQuery("select consent_state from consent_settings where app_id=? limit 1;", new String[]{str});
                if (rawQuery.moveToFirst()) {
                    str2 = rawQuery.getString(0);
                    rawQuery.close();
                } else {
                    rawQuery.close();
                    str2 = "G1";
                }
                e b2 = e.b(str2);
                x(str, b2);
                return b2;
            } catch (SQLiteException e2) {
                U.l().E().c("Database error", "select consent_state from consent_settings where app_id=? limit 1;", e2);
                throw e2;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    public final z9 a0() {
        return this.j.F();
    }

    /* access modifiers changed from: package-private */
    public final void b0() {
        if (!this.k) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* access modifiers changed from: package-private */
    public final void c0() {
        d4 g0;
        String str;
        i0();
        b0();
        this.s = true;
        try {
            Boolean Z = this.j.O().Z();
            if (Z == null) {
                this.j.l().H().a("Upload data called on the client side before use of service was decided");
            } else if (Z.booleanValue()) {
                this.j.l().E().a("Upload called in the client side when service should be used");
                this.s = false;
                E();
            } else if (this.m > 0) {
                D();
                this.s = false;
                E();
            } else {
                i0();
                if (this.v != null) {
                    this.j.l().M().a("Uploading requested multiple times");
                    this.s = false;
                    E();
                } else if (!S().w()) {
                    this.j.l().M().a("Network not connected, ignoring upload request");
                    D();
                    this.s = false;
                    E();
                } else {
                    ((d) this.j.d()).getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    int t2 = this.j.b().t(null, t.Q);
                    long longValue = currentTimeMillis - t.d.a(null).longValue();
                    for (int i2 = 0; i2 < t2 && y(longValue); i2++) {
                    }
                    long a2 = this.j.w().e.a();
                    if (a2 != 0) {
                        this.j.l().L().b("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - a2)));
                    }
                    String w2 = U().w();
                    if (!TextUtils.isEmpty(w2)) {
                        if (this.x == -1) {
                            this.x = U().A0();
                        }
                        List<Pair<c1, Long>> H = U().H(w2, this.j.b().t(w2, t.g), Math.max(0, this.j.b().t(w2, t.h)));
                        if (!H.isEmpty()) {
                            if (!q7.b() || !this.j.b().r(t.Q0) || a(w2).m()) {
                                Iterator<Pair<c1, Long>> it = H.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        str = null;
                                        break;
                                    }
                                    c1 c1Var = (c1) it.next().first;
                                    if (!TextUtils.isEmpty(c1Var.J())) {
                                        str = c1Var.J();
                                        break;
                                    }
                                }
                                if (str != null) {
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= H.size()) {
                                            break;
                                        }
                                        c1 c1Var2 = (c1) H.get(i3).first;
                                        if (!(TextUtils.isEmpty(c1Var2.J()) || c1Var2.J().equals(str))) {
                                            H = H.subList(0, i3);
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                            }
                            b1.a x2 = b1.x();
                            int size = H.size();
                            ArrayList arrayList = new ArrayList(H.size());
                            boolean z2 = this.j.b().F(w2) && (!q7.b() || !this.j.b().r(t.Q0) || a(w2).m());
                            boolean z3 = !q7.b() || !this.j.b().r(t.Q0) || a(w2).m();
                            boolean z4 = !q7.b() || !this.j.b().r(t.Q0) || a(w2).o();
                            int i4 = 0;
                            while (i4 < size) {
                                c1.a aVar = (c1.a) ((c1) H.get(i4).first).t();
                                arrayList.add((Long) H.get(i4).second);
                                aVar.e0(31049);
                                aVar.w(currentTimeMillis);
                                aVar.I(false);
                                if (!z2) {
                                    aVar.H0();
                                }
                                if (q7.b() && this.j.b().r(t.Q0)) {
                                    if (!z3) {
                                        aVar.r0();
                                        aVar.u0();
                                    }
                                    if (!z4) {
                                        aVar.x0();
                                    }
                                }
                                if (this.j.b().x(w2, t.Y)) {
                                    aVar.v0(Y().v(((c1) ((f4) aVar.s())).i()));
                                }
                                x2.t(aVar);
                                i4++;
                                arrayList = arrayList;
                            }
                            String C = this.j.l().B(2) ? Y().C((b1) ((f4) x2.s())) : null;
                            Y();
                            byte[] i5 = ((b1) ((f4) x2.s())).i();
                            String a3 = t.q.a(null);
                            try {
                                URL url = new URL(a3);
                                g.c(!arrayList.isEmpty());
                                if (this.v != null) {
                                    this.j.l().E().a("Set uploading progress before finishing the previous upload");
                                } else {
                                    this.v = new ArrayList(arrayList);
                                }
                                this.j.w().f.b(currentTimeMillis);
                                String str2 = "?";
                                if (size > 0) {
                                    str2 = x2.u().G1();
                                }
                                this.j.l().M().d("Uploading data. app, uncompressed size, data", str2, Integer.valueOf(i5.length), C);
                                this.r = true;
                                e4 S = S();
                                t9 t9Var = new t9(this, w2);
                                S.b();
                                S.o();
                                S.k().D(new i4(S, w2, url, i5, null, t9Var));
                            } catch (MalformedURLException unused) {
                                this.j.l().E().c("Failed to parse upload URL. Not uploading. appId", a4.w(w2), a3);
                            }
                        }
                    } else {
                        this.x = -1;
                        String F = U().F(currentTimeMillis - t.d.a(null).longValue());
                        if (!TextUtils.isEmpty(F) && (g0 = U().g0(F)) != null) {
                            o(g0);
                        }
                    }
                    this.s = false;
                    E();
                }
            }
        } finally {
            this.s = false;
            E();
        }
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final b d() {
        return this.j.d();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d0() {
        /*
        // Method dump skipped, instructions count: 488
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.d0():void");
    }

    /* access modifiers changed from: protected */
    public final void e() {
        this.j.k().b();
        U().v0();
        if (this.j.w().e.a() == 0) {
            r4 r4Var = this.j.w().e;
            ((d) this.j.d()).getClass();
            r4Var.b(System.currentTimeMillis());
        }
        D();
    }

    /* access modifiers changed from: package-private */
    public final void e0() {
        this.p++;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public final void f(int i2, Throwable th, byte[] bArr) {
        i0();
        b0();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.r = false;
                E();
                throw th2;
            }
        }
        List<Long> list = this.v;
        this.v = null;
        boolean z2 = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                r4 r4Var = this.j.w().e;
                ((d) this.j.d()).getClass();
                r4Var.b(System.currentTimeMillis());
                this.j.w().f.b(0);
                D();
                this.j.l().M().c("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                U().o0();
                try {
                    for (Long l2 : list) {
                        try {
                            d U = U();
                            long longValue = l2.longValue();
                            U.b();
                            U.o();
                            try {
                                if (U.v().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                                }
                            } catch (SQLiteException e2) {
                                U.l().E().b("Failed to delete a bundle in a queue table", e2);
                                throw e2;
                            }
                        } catch (SQLiteException e3) {
                            List<Long> list2 = this.w;
                            if (list2 == null || !list2.contains(l2)) {
                                throw e3;
                            }
                        }
                    }
                    U().u();
                    U().r0();
                    this.w = null;
                    if (!S().w() || !C()) {
                        this.x = -1;
                        D();
                    } else {
                        c0();
                    }
                    this.m = 0;
                } catch (Throwable th3) {
                    U().r0();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                this.j.l().E().b("Database error while trying to delete uploaded bundles", e4);
                ((d) this.j.d()).getClass();
                this.m = SystemClock.elapsedRealtime();
                this.j.l().M().b("Disable upload, time", Long.valueOf(this.m));
            }
        } else {
            this.j.l().M().c("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            r4 r4Var2 = this.j.w().f;
            ((d) this.j.d()).getClass();
            r4Var2.b(System.currentTimeMillis());
            if (!(i2 == 503 || i2 == 429)) {
                z2 = false;
            }
            if (z2) {
                r4 r4Var3 = this.j.w().g;
                ((d) this.j.d()).getClass();
                r4Var3.b(System.currentTimeMillis());
            }
            U().O(list);
            D();
        }
        this.r = false;
        E();
    }

    /* access modifiers changed from: package-private */
    public final f5 f0() {
        return this.j;
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final Context i() {
        return this.j.i();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final y4 k() {
        return this.j.k();
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final a4 l() {
        return this.j.l();
    }

    /* access modifiers changed from: package-private */
    public final void m(r rVar, fa faVar) {
        List<oa> list;
        List<oa> list2;
        List<oa> list3;
        r rVar2 = rVar;
        if (faVar != null) {
            g.i(faVar.a);
            i0();
            b0();
            String str = faVar.a;
            long j2 = rVar2.f;
            Y();
            if (v9.R(rVar, faVar)) {
                if (!faVar.q) {
                    P(faVar);
                    return;
                }
                List<String> list4 = faVar.D;
                if (list4 != null) {
                    if (list4.contains(rVar2.a)) {
                        Bundle p2 = rVar2.b.p2();
                        p2.putLong("ga_safelisted", 1);
                        rVar2 = new r(rVar2.a, new m(p2), rVar2.c, rVar2.f);
                    } else {
                        this.j.l().L().d("Dropping non-safelisted event. appId, event name, origin", str, rVar2.a, rVar2.c);
                        return;
                    }
                }
                U().o0();
                try {
                    d U = U();
                    g.i(str);
                    U.b();
                    U.o();
                    if (j2 < 0) {
                        U.l().H().c("Invalid time querying timed out conditional properties", a4.w(str), Long.valueOf(j2));
                        list = Collections.emptyList();
                    } else {
                        list = U.J("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                    }
                    for (oa oaVar : list) {
                        if (oaVar != null) {
                            this.j.l().M().d("User property timed out", oaVar.a, this.j.G().z(oaVar.c.b), oaVar.c.I1());
                            r rVar3 = oaVar.p;
                            if (rVar3 != null) {
                                R(new r(rVar3, j2), faVar);
                            }
                            U().n0(str, oaVar.c.b);
                        }
                    }
                    d U2 = U();
                    g.i(str);
                    U2.b();
                    U2.o();
                    if (j2 < 0) {
                        U2.l().H().c("Invalid time querying expired conditional properties", a4.w(str), Long.valueOf(j2));
                        list2 = Collections.emptyList();
                    } else {
                        list2 = U2.J("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                    }
                    ArrayList arrayList = new ArrayList(list2.size());
                    for (oa oaVar2 : list2) {
                        if (oaVar2 != null) {
                            this.j.l().M().d("User property expired", oaVar2.a, this.j.G().z(oaVar2.c.b), oaVar2.c.I1());
                            U().i0(str, oaVar2.c.b);
                            r rVar4 = oaVar2.t;
                            if (rVar4 != null) {
                                arrayList.add(rVar4);
                            }
                            U().n0(str, oaVar2.c.b);
                        }
                    }
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        R(new r((r) obj, j2), faVar);
                    }
                    d U3 = U();
                    String str2 = rVar2.a;
                    g.i(str);
                    g.i(str2);
                    U3.b();
                    U3.o();
                    if (j2 < 0) {
                        U3.l().H().d("Invalid time querying triggered conditional properties", a4.w(str), U3.e().v(str2), Long.valueOf(j2));
                        list3 = Collections.emptyList();
                    } else {
                        list3 = U3.J("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                    }
                    ArrayList arrayList2 = new ArrayList(list3.size());
                    for (oa oaVar3 : list3) {
                        if (oaVar3 != null) {
                            y9 y9Var = oaVar3.c;
                            aa aaVar = new aa(oaVar3.a, oaVar3.b, y9Var.b, j2, y9Var.I1());
                            if (U().R(aaVar)) {
                                this.j.l().M().d("User property triggered", oaVar3.a, this.j.G().z(aaVar.c), aaVar.e);
                            } else {
                                this.j.l().E().d("Too many active user properties, ignoring", a4.w(oaVar3.a), this.j.G().z(aaVar.c), aaVar.e);
                            }
                            r rVar5 = oaVar3.r;
                            if (rVar5 != null) {
                                arrayList2.add(rVar5);
                            }
                            oaVar3.c = new y9(aaVar);
                            oaVar3.n = true;
                            U().S(oaVar3);
                        }
                    }
                    R(rVar2, faVar);
                    int size2 = arrayList2.size();
                    int i3 = 0;
                    while (i3 < size2) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        R(new r((r) obj2, j2), faVar);
                    }
                    U().u();
                } finally {
                    U().r0();
                }
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* access modifiers changed from: package-private */
    public final void n(r rVar, String str) {
        boolean z2;
        String str2;
        d4 g0 = U().g0(str);
        if (g0 == null || TextUtils.isEmpty(g0.T())) {
            this.j.l().L().b("No app data available; dropping event", str);
            return;
        }
        Boolean H = H(g0);
        if (H == null) {
            if (!"_ui".equals(rVar.a)) {
                this.j.l().H().b("Could not find package. appId", a4.w(str));
            }
        } else if (!H.booleanValue()) {
            this.j.l().E().b("App version does not match; dropping event. appId", a4.w(str));
            return;
        }
        String A = g0.A();
        String T = g0.T();
        long V = g0.V();
        String X = g0.X();
        long Z = g0.Z();
        long b0 = g0.b0();
        boolean e0 = g0.e0();
        String M = g0.M();
        long k2 = g0.k();
        boolean l2 = g0.l();
        boolean m2 = g0.m();
        String D = g0.D();
        Boolean n2 = g0.n();
        long d0 = g0.d0();
        List<String> o2 = g0.o();
        if (f9.b()) {
            z2 = e0;
            if (this.j.b().x(g0.t(), t.k0)) {
                str2 = g0.G();
                J(rVar, new fa(str, A, T, V, X, Z, b0, (String) null, z2, false, M, k2, 0L, 0, l2, m2, false, D, n2, d0, o2, str2, (q7.b() || !this.j.b().r(t.Q0)) ? "" : a(str).d()));
            }
        } else {
            z2 = e0;
        }
        str2 = null;
        J(rVar, new fa(str, A, T, V, X, Z, b0, (String) null, z2, false, M, k2, 0L, 0, l2, m2, false, D, n2, d0, o2, str2, (q7.b() || !this.j.b().r(t.Q0)) ? "" : a(str).d()));
    }

    @Override // com.google.android.gms.measurement.internal.a6
    public final pa q() {
        return this.j.q();
    }

    /* access modifiers changed from: package-private */
    public final void r(y9 y9Var, fa faVar) {
        i0();
        b0();
        if (V(faVar)) {
            if (!faVar.q) {
                P(faVar);
                return;
            }
            int k0 = this.j.F().k0(y9Var.b);
            int i2 = 0;
            if (k0 != 0) {
                this.j.F();
                String H = z9.H(y9Var.b, 24, true);
                String str = y9Var.b;
                if (str != null) {
                    i2 = str.length();
                }
                this.j.F().j0(k0, "_ev", H, i2);
                return;
            }
            int l0 = this.j.F().l0(y9Var.b, y9Var.I1());
            if (l0 != 0) {
                this.j.F();
                String H2 = z9.H(y9Var.b, 24, true);
                Object I1 = y9Var.I1();
                if (I1 != null && ((I1 instanceof String) || (I1 instanceof CharSequence))) {
                    i2 = String.valueOf(I1).length();
                }
                this.j.F().j0(l0, "_ev", H2, i2);
                return;
            }
            Object s0 = this.j.F().s0(y9Var.b, y9Var.I1());
            if (s0 != null) {
                if ("_sid".equals(y9Var.b)) {
                    long j2 = y9Var.c;
                    String str2 = y9Var.o;
                    long j3 = 0;
                    aa l02 = U().l0(faVar.a, "_sno");
                    if (l02 != null) {
                        Object obj = l02.e;
                        if (obj instanceof Long) {
                            j3 = ((Long) obj).longValue();
                            r(new y9("_sno", j2, Long.valueOf(j3 + 1), str2), faVar);
                        }
                    }
                    if (l02 != null) {
                        this.j.l().H().b("Retrieved last session number from database does not contain a valid (long) value", l02.e);
                    }
                    n C = U().C(faVar.a, "_s");
                    if (C != null) {
                        j3 = C.c;
                        this.j.l().M().b("Backfill the session number. Last used session number", Long.valueOf(j3));
                    }
                    r(new y9("_sno", j2, Long.valueOf(j3 + 1), str2), faVar);
                }
                aa aaVar = new aa(faVar.a, y9Var.o, y9Var.b, y9Var.c, s0);
                this.j.l().M().c("Setting user property", this.j.G().z(aaVar.c), s0);
                U().o0();
                try {
                    P(faVar);
                    boolean R = U().R(aaVar);
                    U().u();
                    if (!R) {
                        this.j.l().E().c("Too many unique user properties are set. Ignoring user property", this.j.G().z(aaVar.c), aaVar.e);
                        this.j.F().j0(9, null, null, 0);
                    }
                } finally {
                    U().r0();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void s(fa faVar) {
        if (this.v != null) {
            ArrayList arrayList = new ArrayList();
            this.w = arrayList;
            arrayList.addAll(this.v);
        }
        d U = U();
        String str = faVar.a;
        g.i(str);
        U.b();
        U.o();
        try {
            SQLiteDatabase v2 = U.v();
            String[] strArr = {str};
            int delete = v2.delete("apps", "app_id=?", strArr) + 0 + v2.delete("events", "app_id=?", strArr) + v2.delete("user_attributes", "app_id=?", strArr) + v2.delete("conditional_properties", "app_id=?", strArr) + v2.delete("raw_events", "app_id=?", strArr) + v2.delete("raw_events_metadata", "app_id=?", strArr) + v2.delete("queue", "app_id=?", strArr) + v2.delete("audience_filter_values", "app_id=?", strArr) + v2.delete("main_event_params", "app_id=?", strArr) + v2.delete("default_event_params", "app_id=?", strArr);
            if (delete > 0) {
                U.l().M().c("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            U.l().E().c("Error resetting analytics data. appId, error", a4.w(str), e2);
        }
        if (faVar.q) {
            M(faVar);
        }
    }

    /* access modifiers changed from: package-private */
    public final void t(oa oaVar) {
        fa F = F(oaVar.a);
        if (F != null) {
            u(oaVar, F);
        }
    }

    /* access modifiers changed from: package-private */
    public final void u(oa oaVar, fa faVar) {
        r rVar;
        boolean z2;
        if (oaVar != null) {
            g.i(oaVar.a);
            g.l(oaVar.b);
            g.l(oaVar.c);
            g.i(oaVar.c.b);
            i0();
            b0();
            if (V(faVar)) {
                if (!faVar.q) {
                    P(faVar);
                    return;
                }
                oa oaVar2 = new oa(oaVar);
                boolean z3 = false;
                oaVar2.n = false;
                U().o0();
                try {
                    oa m0 = U().m0(oaVar2.a, oaVar2.c.b);
                    if (m0 != null && !m0.b.equals(oaVar2.b)) {
                        this.j.l().H().d("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.j.G().z(oaVar2.c.b), oaVar2.b, m0.b);
                    }
                    if (m0 != null && (z2 = m0.n)) {
                        oaVar2.b = m0.b;
                        oaVar2.f = m0.f;
                        oaVar2.q = m0.q;
                        oaVar2.o = m0.o;
                        oaVar2.r = m0.r;
                        oaVar2.n = z2;
                        y9 y9Var = oaVar2.c;
                        oaVar2.c = new y9(y9Var.b, m0.c.c, y9Var.I1(), m0.c.o);
                    } else if (TextUtils.isEmpty(oaVar2.o)) {
                        y9 y9Var2 = oaVar2.c;
                        oaVar2.c = new y9(y9Var2.b, oaVar2.f, y9Var2.I1(), oaVar2.c.o);
                        oaVar2.n = true;
                        z3 = true;
                    }
                    if (oaVar2.n) {
                        y9 y9Var3 = oaVar2.c;
                        aa aaVar = new aa(oaVar2.a, oaVar2.b, y9Var3.b, y9Var3.c, y9Var3.I1());
                        if (U().R(aaVar)) {
                            this.j.l().L().d("User property updated immediately", oaVar2.a, this.j.G().z(aaVar.c), aaVar.e);
                        } else {
                            this.j.l().E().d("(2)Too many active user properties, ignoring", a4.w(oaVar2.a), this.j.G().z(aaVar.c), aaVar.e);
                        }
                        if (z3 && (rVar = oaVar2.r) != null) {
                            R(new r(rVar, oaVar2.f), faVar);
                        }
                    }
                    if (U().S(oaVar2)) {
                        this.j.l().L().d("Conditional property added", oaVar2.a, this.j.G().z(oaVar2.c.b), oaVar2.c.I1());
                    } else {
                        this.j.l().E().d("Too many conditional properties, ignoring", a4.w(oaVar2.a), this.j.G().z(oaVar2.c.b), oaVar2.c.I1());
                    }
                    U().u();
                } finally {
                    U().r0();
                }
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    /* access modifiers changed from: package-private */
    public final void v(Runnable runnable) {
        i0();
        if (this.n == null) {
            this.n = new ArrayList();
        }
        this.n.add(runnable);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0130 A[Catch:{ all -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0140 A[Catch:{ all -> 0x0183 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
        // Method dump skipped, instructions count: 403
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.r9.w(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: package-private */
    public final void x(String str, e eVar) {
        if (q7.b() && this.j.b().r(t.Q0)) {
            i0();
            b0();
            this.y.put(str, eVar);
            d U = U();
            if (q7.b() && U.j().r(t.Q0)) {
                if (str != null) {
                    U.b();
                    U.o();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("consent_state", eVar.d());
                    try {
                        if (U.v().insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                            U.l().E().b("Failed to insert/update consent setting (got -1). appId", a4.w(str));
                        }
                    } catch (SQLiteException e2) {
                        U.l().E().c("Error storing consent setting. appId, error", a4.w(str), e2);
                    }
                } else {
                    throw new NullPointerException("null reference");
                }
            }
        }
    }
}
