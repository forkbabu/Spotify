package com.google.android.gms.internal.cast;

import com.google.android.gms.cast.framework.b;
import com.google.android.gms.cast.framework.c;
import com.google.android.gms.cast.framework.h;
import com.google.android.gms.cast.framework.k;

public final class g extends k {
    private final b d;
    private final o e;
    private final r8 f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public g(android.content.Context r3, com.google.android.gms.cast.framework.b r4, com.google.android.gms.internal.cast.o r5) {
        /*
            r2 = this;
            java.util.List r0 = r4.q2()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = r4.o2()
            java.lang.String r0 = com.google.android.gms.cast.f.a(r0)
            goto L_0x001f
        L_0x0013:
            java.lang.String r0 = r4.o2()
            java.util.List r1 = r4.q2()
            java.lang.String r0 = com.google.android.gms.cast.f.b(r0, r1)
        L_0x001f:
            r2.<init>(r3, r0)
            r2.d = r4
            r2.e = r5
            com.google.android.gms.internal.cast.f r3 = new com.google.android.gms.internal.cast.f
            r3.<init>()
            r2.f = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cast.g.<init>(android.content.Context, com.google.android.gms.cast.framework.b, com.google.android.gms.internal.cast.o):void");
    }

    @Override // com.google.android.gms.cast.framework.k
    public final h a(String str) {
        return new c(c(), b(), str, this.d, this.f, new com.google.android.gms.cast.framework.media.internal.k(c(), this.d, this.e));
    }

    @Override // com.google.android.gms.cast.framework.k
    public final boolean d() {
        return this.d.p2();
    }
}
