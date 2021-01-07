package com.facebook.internal;

import android.net.Uri;
import com.facebook.internal.o;
import java.io.IOException;
import java.io.OutputStream;

class e0 {
    static final String a = "e0";
    private static final String b = je.x0(e0.class.getSimpleName(), "_Redirect");
    private static o c;

    e0() {
    }

    static void a(Uri uri, Uri uri2) {
        if (uri != null && uri2 != null) {
            OutputStream outputStream = null;
            try {
                outputStream = b().g(uri.toString(), b);
                outputStream.write(uri2.toString().getBytes());
            } catch (IOException unused) {
                if (outputStream == null) {
                    return;
                }
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
            try {
                outputStream.close();
            } catch (IOException unused3) {
            }
        }
    }

    static synchronized o b() {
        o oVar;
        synchronized (e0.class) {
            if (c == null) {
                c = new o(a, new o.f());
            }
            oVar = c;
        }
        return oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004c, code lost:
        if (r4 != null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0060, code lost:
        if (r4 == null) goto L_0x0063;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x001f] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x005b A[SYNTHETIC, Splitter:B:39:0x005b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.net.Uri c(android.net.Uri r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r9 = r9.toString()
            com.facebook.internal.o r1 = b()     // Catch:{ IOException -> 0x005f, all -> 0x0055 }
            r2 = 0
            r4 = r0
            r3 = 0
        L_0x000f:
            java.lang.String r5 = com.facebook.internal.e0.b     // Catch:{ IOException -> 0x0060, all -> 0x0052 }
            java.io.InputStream r5 = r1.f(r9, r5)     // Catch:{ IOException -> 0x0060, all -> 0x0052 }
            if (r5 == 0) goto L_0x0040
            r3 = 1
            java.io.InputStreamReader r9 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0060, all -> 0x0052 }
            r9.<init>(r5)     // Catch:{ IOException -> 0x0060, all -> 0x0052 }
            r4 = 128(0x80, float:1.794E-43)
            char[] r5 = new char[r4]     // Catch:{ IOException -> 0x003e, all -> 0x0034 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003e, all -> 0x0034 }
            r6.<init>()     // Catch:{ IOException -> 0x003e, all -> 0x0034 }
        L_0x0026:
            int r7 = r9.read(r5, r2, r4)     // Catch:{ IOException -> 0x003e, all -> 0x0034 }
            if (r7 <= 0) goto L_0x0030
            r6.append(r5, r2, r7)     // Catch:{ IOException -> 0x003e, all -> 0x0034 }
            goto L_0x0026
        L_0x0030:
            r9.close()     // Catch:{ IOException -> 0x0036, all -> 0x0034 }
            goto L_0x0036
        L_0x0034:
            r0 = move-exception
            goto L_0x0059
        L_0x0036:
            java.lang.String r4 = r6.toString()
            r8 = r4
            r4 = r9
            r9 = r8
            goto L_0x000f
        L_0x003e:
            r4 = r9
            goto L_0x0060
        L_0x0040:
            if (r3 == 0) goto L_0x004c
            android.net.Uri r9 = android.net.Uri.parse(r9)
            if (r4 == 0) goto L_0x004b
            r4.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            return r9
        L_0x004c:
            if (r4 == 0) goto L_0x0063
        L_0x004e:
            r4.close()     // Catch:{ IOException -> 0x0063 }
            goto L_0x0063
        L_0x0052:
            r0 = move-exception
            r9 = r4
            goto L_0x0059
        L_0x0055:
            r9 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
        L_0x0059:
            if (r9 == 0) goto L_0x005e
            r9.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            throw r0
        L_0x005f:
            r4 = r0
        L_0x0060:
            if (r4 == 0) goto L_0x0063
            goto L_0x004e
        L_0x0063:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.e0.c(android.net.Uri):android.net.Uri");
    }
}
