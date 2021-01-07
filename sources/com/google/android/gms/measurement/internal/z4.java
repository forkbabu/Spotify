package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.g;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.r0;
import com.google.android.gms.internal.measurement.s0;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.w7;
import com.google.android.gms.internal.measurement.y6;
import com.google.android.gms.internal.measurement.zzig;
import java.util.ArrayList;
import java.util.Map;

public final class z4 extends p9 implements b {
    private final Map<String, Map<String, String>> d = new m1();
    private final Map<String, Map<String, Boolean>> e = new m1();
    private final Map<String, Map<String, Boolean>> f = new m1();
    private final Map<String, s0> g = new m1();
    private final Map<String, Map<String, Integer>> h = new m1();
    private final Map<String, String> i = new m1();

    z4(r9 r9Var) {
        super(r9Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void J(java.lang.String r13) {
        /*
            r12 = this;
            r12.o()
            super.b()
            com.google.android.exoplayer2.util.g.i(r13)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.s0> r0 = r12.g
            java.lang.Object r0 = r0.get(r13)
            if (r0 != 0) goto L_0x00e4
            com.google.android.gms.measurement.internal.d r0 = super.s()
            r0.getClass()
            com.google.android.exoplayer2.util.g.i(r13)
            r0.b()
            r0.o()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.v()     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            java.lang.String r3 = "apps"
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            java.lang.String r6 = "remote_config"
            r10 = 0
            r5[r10] = r6     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            java.lang.String r6 = "app_id=?"
            java.lang.String[] r7 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            r7[r10] = r13     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            r8 = 0
            r9 = 0
            r11 = 0
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r11
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0070, all -> 0x006e }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x006c }
            if (r3 != 0) goto L_0x004d
            r2.close()
            goto L_0x0089
        L_0x004d:
            byte[] r3 = r2.getBlob(r10)
            boolean r4 = r2.moveToNext()
            if (r4 == 0) goto L_0x0068
            com.google.android.gms.measurement.internal.a4 r4 = r0.l()
            com.google.android.gms.measurement.internal.c4 r4 = r4.E()
            java.lang.String r5 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r6 = com.google.android.gms.measurement.internal.a4.w(r13)
            r4.b(r5, r6)
        L_0x0068:
            r2.close()
            goto L_0x008a
        L_0x006c:
            r3 = move-exception
            goto L_0x0073
        L_0x006e:
            r13 = move-exception
            goto L_0x00de
        L_0x0070:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x0073:
            com.google.android.gms.measurement.internal.a4 r0 = r0.l()     // Catch:{ all -> 0x00dc }
            com.google.android.gms.measurement.internal.c4 r0 = r0.E()     // Catch:{ all -> 0x00dc }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.a4.w(r13)     // Catch:{ all -> 0x00dc }
            r0.c(r4, r5, r3)     // Catch:{ all -> 0x00dc }
            if (r2 == 0) goto L_0x0089
            r2.close()
        L_0x0089:
            r3 = r1
        L_0x008a:
            if (r3 != 0) goto L_0x00ab
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r12.d
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.e
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r12.f
            r0.put(r13, r1)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.s0> r0 = r12.g
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.i
            r0.put(r13, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r12.h
            r0.put(r13, r1)
            return
        L_0x00ab:
            com.google.android.gms.internal.measurement.s0 r0 = r12.v(r13, r3)
            com.google.android.gms.internal.measurement.f4$b r0 = r0.t()
            com.google.android.gms.internal.measurement.s0$a r0 = (com.google.android.gms.internal.measurement.s0.a) r0
            r12.x(r13, r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r12.d
            com.google.android.gms.internal.measurement.l5 r3 = r0.s()
            com.google.android.gms.internal.measurement.f4 r3 = (com.google.android.gms.internal.measurement.f4) r3
            com.google.android.gms.internal.measurement.s0 r3 = (com.google.android.gms.internal.measurement.s0) r3
            java.util.Map r3 = w(r3)
            r2.put(r13, r3)
            java.util.Map<java.lang.String, com.google.android.gms.internal.measurement.s0> r2 = r12.g
            com.google.android.gms.internal.measurement.l5 r0 = r0.s()
            com.google.android.gms.internal.measurement.f4 r0 = (com.google.android.gms.internal.measurement.f4) r0
            com.google.android.gms.internal.measurement.s0 r0 = (com.google.android.gms.internal.measurement.s0) r0
            r2.put(r13, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r12.i
            r0.put(r13, r1)
            goto L_0x00e4
        L_0x00dc:
            r13 = move-exception
            r1 = r2
        L_0x00de:
            if (r1 == 0) goto L_0x00e3
            r1.close()
        L_0x00e3:
            throw r13
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z4.J(java.lang.String):void");
    }

    private final s0 v(String str, byte[] bArr) {
        if (bArr == null) {
            return s0.G();
        }
        try {
            s0 s0Var = (s0) ((f4) ((s0.a) v9.z(s0.F(), bArr)).s());
            c4 M = super.l().M();
            String str2 = null;
            Long valueOf = s0Var.x() ? Long.valueOf(s0Var.y()) : null;
            if (s0Var.z()) {
                str2 = s0Var.A();
            }
            M.c("Parsed config. version, gmp_app_id", valueOf, str2);
            return s0Var;
        } catch (zzig e2) {
            super.l().H().c("Unable to merge remote config. appId", a4.w(str), e2);
            return s0.G();
        } catch (RuntimeException e3) {
            super.l().H().c("Unable to merge remote config. appId", a4.w(str), e3);
            return s0.G();
        }
    }

    private static Map<String, String> w(s0 s0Var) {
        m1 m1Var = new m1();
        for (t0 t0Var : s0Var.B()) {
            m1Var.put(t0Var.u(), t0Var.v());
        }
        return m1Var;
    }

    private final void x(String str, s0.a aVar) {
        m1 m1Var = new m1();
        m1 m1Var2 = new m1();
        m1 m1Var3 = new m1();
        for (int i2 = 0; i2 < aVar.t(); i2++) {
            r0.a aVar2 = (r0.a) aVar.u(i2).t();
            if (TextUtils.isEmpty(aVar2.u())) {
                super.l().H().a("EventConfig contained null event name");
            } else {
                String u = aVar2.u();
                String m = f.m(aVar2.u(), c6.a, c6.c);
                if (!TextUtils.isEmpty(m)) {
                    aVar2.t(m);
                    aVar.v(i2, aVar2);
                }
                if (!y6.b() || !super.j().r(t.U0)) {
                    m1Var.put(aVar2.u(), Boolean.valueOf(aVar2.v()));
                } else {
                    m1Var.put(u, Boolean.valueOf(aVar2.v()));
                }
                m1Var2.put(aVar2.u(), Boolean.valueOf(aVar2.w()));
                if (aVar2.x()) {
                    if (aVar2.y() < 2 || aVar2.y() > 65535) {
                        super.l().H().c("Invalid sampling rate. Event name, sample rate", aVar2.u(), Integer.valueOf(aVar2.y()));
                    } else {
                        m1Var3.put(aVar2.u(), Integer.valueOf(aVar2.y()));
                    }
                }
            }
        }
        this.e.put(str, m1Var);
        this.f.put(str, m1Var2);
        this.h.put(str, m1Var3);
    }

    /* access modifiers changed from: package-private */
    public final boolean A(String str, String str2) {
        Boolean bool;
        super.b();
        J(str);
        if ("1".equals(g(str, "measurement.upload.blacklist_internal")) && z9.w0(str2)) {
            return true;
        }
        if ("1".equals(g(str, "measurement.upload.blacklist_public")) && z9.Z(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.e.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: protected */
    public final void B(String str) {
        super.b();
        this.i.put(str, null);
    }

    /* access modifiers changed from: package-private */
    public final boolean C(String str, String str2) {
        Boolean bool;
        super.b();
        J(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (w7.b() && super.j().r(t.D0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map<String, Boolean> map = this.f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public final int D(String str, String str2) {
        Integer num;
        super.b();
        J(str);
        Map<String, Integer> map = this.h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* access modifiers changed from: package-private */
    public final void E(String str) {
        super.b();
        this.g.remove(str);
    }

    /* access modifiers changed from: package-private */
    public final boolean F(String str) {
        super.b();
        s0 u = u(str);
        if (u == null) {
            return false;
        }
        return u.E();
    }

    /* access modifiers changed from: package-private */
    public final long G(String str) {
        String g2 = g(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(g2)) {
            return 0;
        }
        try {
            return Long.parseLong(g2);
        } catch (NumberFormatException e2) {
            super.l().H().c("Unable to parse timezone offset. appId", a4.w(str), e2);
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean H(String str) {
        return "1".equals(g(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean I(String str) {
        return "1".equals(g(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.b
    public final String g(String str, String str2) {
        super.b();
        J(str);
        Map<String, String> map = this.d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.p9
    public final boolean r() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final s0 u(String str) {
        o();
        super.b();
        g.i(str);
        J(str);
        return this.g.get(str);
    }

    /* access modifiers changed from: protected */
    public final boolean y(String str, byte[] bArr, String str2) {
        o();
        super.b();
        g.i(str);
        s0.a aVar = (s0.a) v(str, bArr).t();
        x(str, aVar);
        this.g.put(str, (s0) ((f4) aVar.s()));
        this.i.put(str, str2);
        this.d.put(str, w((s0) ((f4) aVar.s())));
        super.s().N(str, new ArrayList(aVar.w()));
        try {
            aVar.x();
            bArr = ((s0) ((f4) aVar.s())).i();
        } catch (RuntimeException e2) {
            super.l().H().c("Unable to serialize reduced-size config. Storing full config instead. appId", a4.w(str), e2);
        }
        d s = super.s();
        g.i(str);
        s.b();
        s.o();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (((long) s.v().update("apps", contentValues, "app_id = ?", new String[]{str})) == 0) {
                s.l().E().b("Failed to update remote config (got 0). appId", a4.w(str));
            }
        } catch (SQLiteException e3) {
            s.l().E().c("Error storing remote config. appId", a4.w(str), e3);
        }
        this.g.put(str, (s0) ((f4) aVar.s()));
        return true;
    }

    /* access modifiers changed from: protected */
    public final String z(String str) {
        super.b();
        return this.i.get(str);
    }
}
