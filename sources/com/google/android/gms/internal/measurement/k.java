package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.h;

/* access modifiers changed from: package-private */
public final class k extends h.a {
    private final /* synthetic */ String n;
    private final /* synthetic */ String o;
    private final /* synthetic */ Context p;
    private final /* synthetic */ Bundle q;
    private final /* synthetic */ h r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    k(h hVar, String str, String str2, Context context, Bundle bundle) {
        super(true);
        this.r = hVar;
        this.n = str;
        this.o = str2;
        this.p = context;
        this.q = bundle;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052 A[Catch:{ Exception -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A[Catch:{ Exception -> 0x0098 }] */
    @Override // com.google.android.gms.internal.measurement.h.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r13 = this;
            java.lang.String r0 = "com.google.android.gms.measurement.dynamite"
            r1 = 1
            r2 = 0
            com.google.android.gms.internal.measurement.h r3 = r13.r     // Catch:{ Exception -> 0x0098 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0098 }
            r4.<init>()     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.internal.measurement.h.e(r3, r4)     // Catch:{ Exception -> 0x0098 }
            java.lang.String r3 = r13.n     // Catch:{ Exception -> 0x0098 }
            java.lang.String r4 = r13.o     // Catch:{ Exception -> 0x0098 }
            boolean r3 = com.google.android.gms.internal.measurement.h.p(r3, r4)     // Catch:{ Exception -> 0x0098 }
            r4 = 0
            if (r3 == 0) goto L_0x0027
            java.lang.String r4 = r13.o     // Catch:{ Exception -> 0x0098 }
            java.lang.String r3 = r13.n     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.internal.measurement.h r5 = r13.r     // Catch:{ Exception -> 0x0098 }
            java.lang.String r5 = com.google.android.gms.internal.measurement.h.q(r5)     // Catch:{ Exception -> 0x0098 }
            r10 = r3
            r11 = r4
            r9 = r5
            goto L_0x002a
        L_0x0027:
            r9 = r4
            r10 = r9
            r11 = r10
        L_0x002a:
            android.content.Context r3 = r13.p     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.internal.measurement.h.s(r3)     // Catch:{ Exception -> 0x0098 }
            java.lang.Boolean r3 = com.google.android.gms.internal.measurement.h.F()     // Catch:{ Exception -> 0x0098 }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0098 }
            if (r3 != 0) goto L_0x003e
            if (r10 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r3 = 0
            goto L_0x003f
        L_0x003e:
            r3 = 1
        L_0x003f:
            com.google.android.gms.internal.measurement.h r4 = r13.r     // Catch:{ Exception -> 0x0098 }
            android.content.Context r5 = r13.p     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.internal.measurement.jb r5 = r4.b(r5, r3)     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.internal.measurement.h.c(r4, r5)     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.internal.measurement.h r4 = r13.r     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.internal.measurement.jb r4 = com.google.android.gms.internal.measurement.h.v(r4)     // Catch:{ Exception -> 0x0098 }
            if (r4 != 0) goto L_0x0058
            com.google.android.gms.internal.measurement.h r0 = r13.r     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.internal.measurement.h.q(r0)     // Catch:{ Exception -> 0x0098 }
            return
        L_0x0058:
            android.content.Context r4 = r13.p     // Catch:{ Exception -> 0x0098 }
            int r4 = com.google.android.gms.dynamite.DynamiteModule.a(r4, r0)     // Catch:{ Exception -> 0x0098 }
            android.content.Context r5 = r13.p     // Catch:{ Exception -> 0x0098 }
            int r0 = com.google.android.gms.dynamite.DynamiteModule.d(r5, r0, r2)     // Catch:{ Exception -> 0x0098 }
            if (r3 == 0) goto L_0x0071
            int r3 = java.lang.Math.max(r4, r0)     // Catch:{ Exception -> 0x0098 }
            if (r0 >= r4) goto L_0x006e
            r0 = 1
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            r8 = r0
            goto L_0x007b
        L_0x0071:
            if (r4 <= 0) goto L_0x0074
            r0 = r4
        L_0x0074:
            if (r4 <= 0) goto L_0x0078
            r3 = 1
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            r8 = r3
            r3 = r0
        L_0x007b:
            com.google.android.gms.internal.measurement.f r0 = new com.google.android.gms.internal.measurement.f     // Catch:{ Exception -> 0x0098 }
            r4 = 31049(0x7949, double:1.534E-319)
            long r6 = (long) r3     // Catch:{ Exception -> 0x0098 }
            android.os.Bundle r12 = r13.q     // Catch:{ Exception -> 0x0098 }
            r3 = r0
            r3.<init>(r4, r6, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.internal.measurement.h r3 = r13.r     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.internal.measurement.jb r3 = com.google.android.gms.internal.measurement.h.v(r3)     // Catch:{ Exception -> 0x0098 }
            android.content.Context r4 = r13.p     // Catch:{ Exception -> 0x0098 }
            com.google.android.gms.dynamic.a r4 = com.google.android.gms.dynamic.b.F3(r4)     // Catch:{ Exception -> 0x0098 }
            long r5 = r13.a     // Catch:{ Exception -> 0x0098 }
            r3.initialize(r4, r0, r5)     // Catch:{ Exception -> 0x0098 }
            return
        L_0x0098:
            r0 = move-exception
            com.google.android.gms.internal.measurement.h r3 = r13.r
            com.google.android.gms.internal.measurement.h.j(r3, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.k.a():void");
    }
}
