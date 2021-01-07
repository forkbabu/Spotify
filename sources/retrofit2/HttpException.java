package retrofit2;

public class HttpException extends RuntimeException {
    private final int code;
    private final String message;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpException(retrofit2.v<?> r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x002f
            java.lang.String r0 = "HTTP "
            java.lang.StringBuilder r0 = defpackage.je.V0(r0)
            int r1 = r3.b()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            java.lang.String r1 = r3.g()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            int r0 = r3.b()
            r2.code = r0
            java.lang.String r3 = r3.g()
            r2.message = r3
            return
        L_0x002f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "response == null"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.HttpException.<init>(retrofit2.v):void");
    }

    public int a() {
        return this.code;
    }
}
