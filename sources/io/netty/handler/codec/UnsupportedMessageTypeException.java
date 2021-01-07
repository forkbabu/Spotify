package io.netty.handler.codec;

public class UnsupportedMessageTypeException extends CodecException {
    private static final long serialVersionUID = 2799598826487038726L;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public UnsupportedMessageTypeException(java.lang.Object r4, java.lang.Class<?>... r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0005
            java.lang.String r4 = "null"
            goto L_0x000d
        L_0x0005:
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
        L_0x000d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            int r4 = r5.length
            if (r4 <= 0) goto L_0x0041
            java.lang.String r4 = " (expected: "
            r0.append(r4)
            r4 = 0
            r4 = r5[r4]
            java.lang.String r4 = r4.getName()
            r0.append(r4)
            r4 = 1
        L_0x0025:
            int r1 = r5.length
            if (r4 >= r1) goto L_0x003c
            r1 = r5[r4]
            if (r1 != 0) goto L_0x002d
            goto L_0x003c
        L_0x002d:
            java.lang.String r2 = ", "
            r0.append(r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            int r4 = r4 + 1
            goto L_0x0025
        L_0x003c:
            r4 = 41
            r0.append(r4)
        L_0x0041:
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.netty.handler.codec.UnsupportedMessageTypeException.<init>(java.lang.Object, java.lang.Class[]):void");
    }

    public UnsupportedMessageTypeException() {
    }
}
