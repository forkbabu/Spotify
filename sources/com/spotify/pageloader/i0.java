package com.spotify.pageloader;

import io.reactivex.functions.l;
import io.reactivex.z;

public final /* synthetic */ class i0 implements l {
    public final /* synthetic */ z a;

    public /* synthetic */ i0(z zVar) {
        this.a = zVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r1.a() != 504) goto L_0x0020;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // io.reactivex.functions.l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r5) {
        /*
            r4 = this;
            io.reactivex.z r0 = r4.a
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            boolean r1 = r5 instanceof java.io.IOException
            if (r1 != 0) goto L_0x0022
            boolean r1 = r5 instanceof retrofit2.HttpException
            if (r1 == 0) goto L_0x0020
            r1 = r5
            retrofit2.HttpException r1 = (retrofit2.HttpException) r1
            int r2 = r1.a()
            r3 = 503(0x1f7, float:7.05E-43)
            if (r2 == r3) goto L_0x0022
            int r1 = r1.a()
            r2 = 504(0x1f8, float:7.06E-43)
            if (r1 != r2) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r1 = 0
            goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            if (r1 == 0) goto L_0x0026
            goto L_0x002a
        L_0x0026:
            io.reactivex.z r0 = io.reactivex.z.q(r5)
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.pageloader.i0.apply(java.lang.Object):java.lang.Object");
    }
}
