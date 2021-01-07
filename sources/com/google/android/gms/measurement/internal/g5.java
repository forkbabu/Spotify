package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.f;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import com.google.android.gms.common.util.d;
import com.google.android.gms.internal.measurement.g9;
import com.google.android.gms.internal.measurement.q7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public final class g5 extends r3 {
    private final r9 a;
    private Boolean b;
    private String c;

    public g5(r9 r9Var) {
        if (r9Var != null) {
            this.a = r9Var;
            this.c = null;
            return;
        }
        throw new NullPointerException("null reference");
    }

    private final void I3(Runnable runnable) {
        if (this.a.k().G()) {
            runnable.run();
        } else {
            this.a.k().y(runnable);
        }
    }

    private final void J3(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.b == null) {
                        if (!"com.google.android.gms".equals(this.c) && !f.e(this.a.i(), Binder.getCallingUid())) {
                            if (!h.a(this.a.i()).c(Binder.getCallingUid())) {
                                z2 = false;
                                this.b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.b = Boolean.valueOf(z2);
                    }
                    if (this.b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.a.l().E().b("Measurement Service called with invalid calling package. appId", a4.w(str));
                    throw e;
                }
            }
            if (this.c == null) {
                Context i = this.a.i();
                int callingUid = Binder.getCallingUid();
                int i2 = g.e;
                if (f.h(i, callingUid, str)) {
                    this.c = str;
                }
            }
            if (!str.equals(this.c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
            }
            return;
        }
        this.a.l().E().a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    private final void L3(fa faVar) {
        if (faVar != null) {
            J3(faVar.a, false);
            this.a.a0().e0(faVar.b, faVar.A, faVar.E);
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final List<oa> B0(String str, String str2, String str3) {
        J3(str, true);
        try {
            return (List) ((FutureTask) this.a.k().v(new o5(this, str, str2, str3))).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.l().E().b("Failed to get conditional user properties as", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final List<oa> D0(String str, String str2, fa faVar) {
        L3(faVar);
        try {
            return (List) ((FutureTask) this.a.k().v(new p5(this, faVar, str, str2))).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.l().E().b("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void E2(fa faVar) {
        J3(faVar.a, false);
        I3(new r5(this, faVar));
    }

    public final List<y9> E3(fa faVar, boolean z) {
        L3(faVar);
        try {
            List<aa> list = (List) ((FutureTask) this.a.k().v(new x5(this, faVar))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !z9.w0(aaVar.c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.l().E().c("Failed to get user properties. appId", a4.w(faVar.a), e);
            return null;
        }
    }

    public final void F3(r rVar, String str, String str2) {
        if (rVar != null) {
            com.google.android.exoplayer2.util.g.i(str);
            J3(str, true);
            I3(new s5(this, rVar, str));
            return;
        }
        throw new NullPointerException("null reference");
    }

    /* access modifiers changed from: package-private */
    public final void G3(fa faVar, Bundle bundle) {
        d U = this.a.U();
        String str = faVar.a;
        U.b();
        U.o();
        byte[] i = U.m().x(new k(U.a, "", str, "dep", 0, 0, bundle)).i();
        U.l().M().c("Saving default event parameters, appId, data size", U.e().v(str), Integer.valueOf(i.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", i);
        try {
            if (U.v().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                U.l().E().b("Failed to insert default event parameters (got -1). appId", a4.w(str));
            }
        } catch (SQLiteException e) {
            U.l().E().c("Error storing default event parameters. appId", a4.w(str), e);
        }
    }

    public final void H3(oa oaVar) {
        if (oaVar != null) {
            com.google.android.exoplayer2.util.g.l(oaVar.c);
            J3(oaVar.a, true);
            I3(new k5(this, new oa(oaVar)));
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void J(oa oaVar, fa faVar) {
        if (oaVar != null) {
            com.google.android.exoplayer2.util.g.l(oaVar.c);
            L3(faVar);
            oa oaVar2 = new oa(oaVar);
            oaVar2.a = faVar.a;
            I3(new l5(this, oaVar2, faVar));
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void J0(fa faVar) {
        L3(faVar);
        I3(new w5(this, faVar));
    }

    /* access modifiers changed from: package-private */
    public final r K3(r rVar, fa faVar) {
        m mVar;
        boolean z = false;
        if (!(!"_cmp".equals(rVar.a) || (mVar = rVar.b) == null || mVar.I1() == 0)) {
            String s2 = rVar.b.s2("_cis");
            if (!TextUtils.isEmpty(s2) && (("referrer broadcast".equals(s2) || "referrer API".equals(s2)) && this.a.G().x(faVar.a, t.S))) {
                z = true;
            }
        }
        if (!z) {
            return rVar;
        }
        this.a.l().K().b("Event has been filtered ", rVar.toString());
        return new r("_cmpx", rVar.b, rVar.c, rVar.f);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final List<y9> O2(String str, String str2, boolean z, fa faVar) {
        L3(faVar);
        try {
            List<aa> list = (List) ((FutureTask) this.a.k().v(new n5(this, faVar, str, str2))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !z9.w0(aaVar.c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.l().E().c("Failed to query user properties. appId", a4.w(faVar.a), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void P1(fa faVar) {
        if (q7.b() && this.a.G().r(t.Q0)) {
            com.google.android.exoplayer2.util.g.i(faVar.a);
            com.google.android.exoplayer2.util.g.l(faVar.F);
            q5 q5Var = new q5(this, faVar);
            if (this.a.k().G()) {
                q5Var.run();
            } else {
                this.a.k().B(q5Var);
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void U(y9 y9Var, fa faVar) {
        if (y9Var != null) {
            L3(faVar);
            I3(new u5(this, y9Var, faVar));
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final List<y9> Y(String str, String str2, String str3, boolean z) {
        J3(str, true);
        try {
            List<aa> list = (List) ((FutureTask) this.a.k().v(new m5(this, str, str2, str3))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (aa aaVar : list) {
                if (z || !z9.w0(aaVar.c)) {
                    arrayList.add(new y9(aaVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            this.a.l().E().c("Failed to get user properties as. appId", a4.w(str), e);
            return Collections.emptyList();
        }
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void Z0(fa faVar) {
        L3(faVar);
        I3(new i5(this, faVar));
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final byte[] c1(r rVar, String str) {
        com.google.android.exoplayer2.util.g.i(str);
        if (rVar != null) {
            J3(str, true);
            this.a.l().L().b("Log and bundle. event", this.a.Z().v(rVar.a));
            ((d) this.a.d()).getClass();
            long nanoTime = System.nanoTime() / 1000000;
            try {
                byte[] bArr = (byte[]) ((FutureTask) this.a.k().A(new v5(this, rVar, str))).get();
                if (bArr == null) {
                    this.a.l().E().b("Log and bundle returned null. appId", a4.w(str));
                    bArr = new byte[0];
                }
                ((d) this.a.d()).getClass();
                this.a.l().L().d("Log and bundle processed. event, size, time_ms", this.a.Z().v(rVar.a), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - nanoTime));
                return bArr;
            } catch (InterruptedException | ExecutionException e) {
                this.a.l().E().d("Failed to log and bundle. appId, event, error", a4.w(str), this.a.Z().v(rVar.a), e);
                return null;
            }
        } else {
            throw new NullPointerException("null reference");
        }
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void d1(r rVar, fa faVar) {
        if (rVar != null) {
            L3(faVar);
            I3(new t5(this, rVar, faVar));
            return;
        }
        throw new NullPointerException("null reference");
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final String p2(fa faVar) {
        L3(faVar);
        return this.a.T(faVar);
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void x1(Bundle bundle, fa faVar) {
        if (g9.b() && this.a.G().r(t.I0)) {
            L3(faVar);
            I3(new j5(this, faVar, bundle));
        }
    }

    @Override // com.google.android.gms.measurement.internal.s3
    public final void z0(long j, String str, String str2, String str3) {
        I3(new z5(this, str2, str3, str, j));
    }
}
