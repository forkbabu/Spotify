package kotlin;

public final class NotImplementedError extends Error {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NotImplementedError(java.lang.String r1, int r2) {
        /*
            r0 = this;
            r1 = r2 & 1
            if (r1 == 0) goto L_0x0007
            java.lang.String r1 = "An operation is not implemented."
            goto L_0x0008
        L_0x0007:
            r1 = 0
        L_0x0008:
            java.lang.String r2 = "message"
            kotlin.jvm.internal.h.e(r1, r2)
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.NotImplementedError.<init>(java.lang.String, int):void");
    }
}
