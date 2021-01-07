package io.netty.util;

public class IllegalReferenceCountException extends IllegalStateException {
    private static final long serialVersionUID = -2507492394288153468L;

    public IllegalReferenceCountException() {
    }

    public IllegalReferenceCountException(int i) {
        super(je.p0("refCnt: ", i));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IllegalReferenceCountException(int r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = "refCnt: "
            java.lang.String r1 = ", "
            java.lang.StringBuilder r3 = defpackage.je.W0(r0, r3, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            if (r4 <= 0) goto L_0x0015
            java.lang.String r1 = "increment: "
            r0.append(r1)
            goto L_0x001b
        L_0x0015:
            java.lang.String r1 = "decrement: "
            r0.append(r1)
            int r4 = -r4
        L_0x001b:
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.util.IllegalReferenceCountException.<init>(int, int):void");
    }
}
