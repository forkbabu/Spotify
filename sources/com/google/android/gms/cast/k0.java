package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.c;
import com.google.android.gms.cast.internal.f0;
import com.google.android.gms.cast.internal.h;
import com.google.android.gms.cast.internal.m0;
import com.google.android.gms.common.api.Status;

/* access modifiers changed from: package-private */
public final class k0 extends h {
    final /* synthetic */ z a;

    k0(z zVar) {
        this.a = zVar;
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void C(d dVar, String str, String str2, boolean z) {
        this.a.u = dVar;
        this.a.v = str;
        z.J(this.a, new f0(new Status(0, (String) null), dVar, str, str2, z));
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void E1(int i) {
        this.a.l.post(new q0(this, i));
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void G1(int i) {
        z.Z(this.a, i);
        if (this.a.E != null) {
            this.a.l.post(new p0(this, i));
        }
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void H1(String str, long j) {
        z.I(this.a, j, 0);
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void M(String str, double d, boolean z) {
        z.G.a("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void P(c cVar) {
        this.a.l.post(new r0(this, cVar));
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void S0(int i) {
        z.Z(this.a, i);
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void T0(String str, byte[] bArr) {
        z.G.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void e1(int i) {
        z.Z(this.a, i);
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void f0(int i) {
        this.a.l.post(new m0(this, i));
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void h3(String str, String str2) {
        z.G.a("Receive (type=text, ns=%s) %s", str, str2);
        this.a.l.post(new u0(this, str, str2));
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void l3(m0 m0Var) {
        this.a.l.post(new s0(this, m0Var));
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void r(int i) {
        this.a.l.post(new o0(this, i));
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void v2(String str, long j, int i) {
        z.I(this.a, j, i);
    }

    @Override // com.google.android.gms.cast.internal.i
    public final void z(int i) {
        this.a.e0(i);
    }
}
