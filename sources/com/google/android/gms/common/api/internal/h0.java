package com.google.android.gms.common.api.internal;

import com.comscore.util.crashreport.CrashReportManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.c;

/* access modifiers changed from: package-private */
public final class h0<T> implements c<T> {
    private final g a;
    private final int b;
    private final b<?> c;
    private final long d;

    private h0(g gVar, int i, b<?> bVar, long j) {
        this.a = gVar;
        this.b = i;
        this.c = bVar;
        this.d = j;
    }

    static <T> h0<T> b(g gVar, int i, b<?> bVar) {
        if (!gVar.y()) {
            return null;
        }
        boolean z = true;
        p a2 = o.b().a();
        if (a2 != null) {
            if (!a2.o2()) {
                return null;
            }
            z = a2.p2();
            g.a d2 = gVar.d(bVar);
            if (d2 != null && d2.s().h() && (d2.s() instanceof b)) {
                d c2 = c(d2, i);
                if (c2 == null) {
                    return null;
                }
                d2.L();
                z = c2.p2();
            }
        }
        return new h0<>(gVar, i, bVar, z ? System.currentTimeMillis() : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r8 != false) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.google.android.gms.common.internal.d c(com.google.android.gms.common.api.internal.g.a<?> r7, int r8) {
        /*
            com.google.android.gms.common.api.a$f r0 = r7.s()
            com.google.android.gms.common.internal.b r0 = (com.google.android.gms.common.internal.b) r0
            com.google.android.gms.common.internal.d r0 = r0.C()
            if (r0 == 0) goto L_0x0039
            boolean r1 = r0.o2()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002b
            int[] r1 = r0.Q1()
            if (r1 == 0) goto L_0x002a
            int r4 = r1.length
            r5 = 0
        L_0x001c:
            if (r5 >= r4) goto L_0x0027
            r6 = r1[r5]
            if (r6 != r8) goto L_0x0024
            r8 = 1
            goto L_0x0028
        L_0x0024:
            int r5 = r5 + 1
            goto L_0x001c
        L_0x0027:
            r8 = 0
        L_0x0028:
            if (r8 == 0) goto L_0x002b
        L_0x002a:
            r2 = 1
        L_0x002b:
            if (r2 != 0) goto L_0x002e
            goto L_0x0039
        L_0x002e:
            int r7 = r7.K()
            int r8 = r0.I1()
            if (r7 >= r8) goto L_0x0039
            return r0
        L_0x0039:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.h0.c(com.google.android.gms.common.api.internal.g$a, int):com.google.android.gms.common.internal.d");
    }

    @Override // com.google.android.gms.tasks.c
    public final void a(com.google.android.gms.tasks.g<T> gVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        long j;
        long j2;
        int i6;
        if (this.a.y()) {
            boolean z = true;
            boolean z2 = this.d > 0;
            p a2 = o.b().a();
            if (a2 == null) {
                i3 = CrashReportManager.TIME_WINDOW;
                i2 = 0;
                i = 100;
            } else if (a2.o2()) {
                z2 &= a2.p2();
                i3 = a2.I1();
                int Q1 = a2.Q1();
                int q2 = a2.q2();
                g.a d2 = this.a.d(this.c);
                if (d2 != null && d2.s().h() && (d2.s() instanceof b)) {
                    d c2 = c(d2, this.b);
                    if (c2 != null) {
                        if (!c2.p2() || this.d <= 0) {
                            z = false;
                        }
                        Q1 = c2.I1();
                        z2 = z;
                    } else {
                        return;
                    }
                }
                i2 = q2;
                i = Q1;
            } else {
                return;
            }
            g gVar2 = this.a;
            if (gVar.r()) {
                i5 = 0;
                i4 = 0;
            } else {
                if (gVar.p()) {
                    i5 = 100;
                } else {
                    Exception m = gVar.m();
                    if (m instanceof ApiException) {
                        Status a3 = ((ApiException) m).a();
                        int Q12 = a3.Q1();
                        ConnectionResult I1 = a3.I1();
                        if (I1 == null) {
                            i6 = -1;
                        } else {
                            i6 = I1.I1();
                        }
                        i4 = i6;
                        i5 = Q12;
                    } else {
                        i5 = 101;
                    }
                }
                i4 = -1;
            }
            if (z2) {
                j2 = this.d;
                j = System.currentTimeMillis();
            } else {
                j2 = 0;
                j = 0;
            }
            gVar2.n(new f0(this.b, i5, i4, j2, j), i2, (long) i3, i);
        }
    }
}
