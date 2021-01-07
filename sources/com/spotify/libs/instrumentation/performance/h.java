package com.spotify.libs.instrumentation.performance;

import java.util.concurrent.Callable;

public final /* synthetic */ class h implements Callable {
    public final /* synthetic */ o a;

    public /* synthetic */ h(o oVar) {
        this.a = oVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:? A[ExcHandler: IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:15:0x0071] */
    @Override // java.util.concurrent.Callable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r17 = this;
            r0 = r17
            com.spotify.libs.instrumentation.performance.o r1 = r0.a
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r3 = 1
            r4 = 0
            int r5 = android.os.Process.myPid()     // Catch:{ IOException -> 0x003a }
            java.io.File r6 = new java.io.File     // Catch:{ IOException -> 0x003a }
            java.util.Locale r7 = java.util.Locale.US     // Catch:{ IOException -> 0x003a }
            java.lang.String r8 = "/proc/%d/stat"
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ IOException -> 0x003a }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ IOException -> 0x003a }
            r9[r4] = r5     // Catch:{ IOException -> 0x003a }
            java.lang.String r5 = java.lang.String.format(r7, r8, r9)     // Catch:{ IOException -> 0x003a }
            r6.<init>(r5)     // Catch:{ IOException -> 0x003a }
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x003a }
            java.lang.String r7 = "r"
            r5.<init>(r6, r7)     // Catch:{ IOException -> 0x003a }
            java.lang.String r6 = r5.readLine()     // Catch:{ IOException -> 0x003a }
            r5.close()     // Catch:{ IOException -> 0x003a }
            com.spotify.libs.instrumentation.performance.n r5 = new com.spotify.libs.instrumentation.performance.n     // Catch:{ IOException -> 0x003a }
            r5.<init>(r6)     // Catch:{ IOException -> 0x003a }
            goto L_0x0041
        L_0x003a:
            com.spotify.libs.instrumentation.performance.n r5 = new com.spotify.libs.instrumentation.performance.n
            java.lang.String r6 = ""
            r5.<init>(r6)
        L_0x0041:
            r6 = 22
            long r5 = r5.a(r6)
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 1000(0x3e8, double:4.94E-321)
            r10 = 21
            r11 = 0
            if (r7 < r10) goto L_0x005d
            int r3 = android.system.OsConstants._SC_CLK_TCK
            long r13 = android.system.Os.sysconf(r3)
            int r3 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b1
            long r8 = r8 / r13
            goto L_0x00b2
        L_0x005d:
            java.lang.String r7 = "_SC_CLK_TCK"
            r10 = 0
            java.lang.String r13 = "android.system.OsConstants"
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ ClassNotFoundException -> 0x006f }
            java.lang.reflect.Field r13 = r13.getField(r7)     // Catch:{ ClassNotFoundException -> 0x006f }
            int r7 = r13.getInt(r10)     // Catch:{ ClassNotFoundException -> 0x006f }
            goto L_0x007d
        L_0x006f:
            java.lang.String r13 = "libcore.io.OsConstants"
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.reflect.Field r7 = r13.getField(r7)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            int r7 = r7.getInt(r10)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
        L_0x007d:
            java.lang.String r13 = "libcore.io.Libcore"
            java.lang.Class r13 = java.lang.Class.forName(r13)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.String r14 = "os"
            java.lang.reflect.Field r13 = r13.getField(r14)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.Object r10 = r13.get(r10)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.Class r13 = r10.getClass()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.String r14 = "sysconf"
            java.lang.Class[] r15 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            r15[r4] = r16     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.reflect.Method r13 = r13.getMethod(r14, r15)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            r3[r4] = r7     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.Object r3 = r13.invoke(r10, r3)     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            long r13 = r3.longValue()     // Catch:{ IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1, IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException -> 0x00b1 }
            long r8 = r8 / r13
            goto L_0x00b2
        L_0x00b1:
            r8 = r11
        L_0x00b2:
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c2
            int r3 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x00c2
            long r5 = r5 * r8
            long r1 = r1 - r5
            int r2 = (int) r1
            int r4 = java.lang.Math.max(r4, r2)
        L_0x00c2:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.libs.instrumentation.performance.h.call():java.lang.Object");
    }
}
