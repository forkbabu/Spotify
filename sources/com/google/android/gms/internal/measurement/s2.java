package com.google.android.gms.internal.measurement;

public final class s2 {
    private static final u2 a;

    static final class a extends u2 {
        a() {
        }

        @Override // com.google.android.gms.internal.measurement.u2
        public final void a(Throwable th, Throwable th2) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    static {
        /*
            r0 = 0
            java.lang.String r1 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0017 }
            java.lang.String r2 = "SDK_INT"
            java.lang.reflect.Field r1 = r1.getField(r2)     // Catch:{ Exception -> 0x0017 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ Exception -> 0x0017 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ Exception -> 0x0017 }
            r0 = r1
            goto L_0x0024
        L_0x0015:
            r1 = move-exception
            goto L_0x004a
        L_0x0017:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0015 }
            java.lang.String r3 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
            r2.println(r3)     // Catch:{ all -> 0x0015 }
            java.io.PrintStream r2 = java.lang.System.err     // Catch:{ all -> 0x0015 }
            r1.printStackTrace(r2)     // Catch:{ all -> 0x0015 }
        L_0x0024:
            if (r0 == 0) goto L_0x0034
            int r1 = r0.intValue()     // Catch:{ all -> 0x0015 }
            r2 = 19
            if (r1 < r2) goto L_0x0034
            com.google.android.gms.internal.measurement.y2 r1 = new com.google.android.gms.internal.measurement.y2     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            goto L_0x007b
        L_0x0034:
            java.lang.String r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r1 = java.lang.Boolean.getBoolean(r1)     // Catch:{ all -> 0x0015 }
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x0044
            com.google.android.gms.internal.measurement.w2 r1 = new com.google.android.gms.internal.measurement.w2     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            goto L_0x007b
        L_0x0044:
            com.google.android.gms.internal.measurement.s2$a r1 = new com.google.android.gms.internal.measurement.s2$a     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            goto L_0x007b
        L_0x004a:
            java.io.PrintStream r2 = java.lang.System.err
            java.lang.Class<com.google.android.gms.internal.measurement.s2$a> r3 = com.google.android.gms.internal.measurement.s2.a.class
            java.lang.String r3 = r3.getName()
            int r4 = r3.length()
            int r4 = r4 + 133
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = "will be used. The error is: "
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.err
            r1.printStackTrace(r2)
            com.google.android.gms.internal.measurement.s2$a r1 = new com.google.android.gms.internal.measurement.s2$a
            r1.<init>()
        L_0x007b:
            com.google.android.gms.internal.measurement.s2.a = r1
            if (r0 != 0) goto L_0x0080
            goto L_0x0083
        L_0x0080:
            r0.intValue()
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.s2.<clinit>():void");
    }

    public static void a(Throwable th, Throwable th2) {
        a.a(th, th2);
    }
}
