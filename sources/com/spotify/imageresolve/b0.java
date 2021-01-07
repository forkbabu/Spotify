package com.spotify.imageresolve;

import android.content.Context;
import com.spotify.base.java.logging.Logger;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class b0 {
    private final File a;
    private final File b;
    private final long c;
    private final cqe d;

    public b0(Context context, cqe cqe, int i) {
        File file = new File(context.getCacheDir(), "imageresolve");
        this.a = file;
        this.b = new File(file, "image-resolve-configuration");
        this.d = cqe;
        long millis = TimeUnit.SECONDS.toMillis((long) i);
        this.c = millis;
        if (millis == 0) {
            a();
        }
    }

    private void a() {
        if (this.b.exists() && !this.b.delete()) {
            Logger.d("ImageResolve: Failed to clear image resolve cache", new Object[0]);
        }
    }

    private File c() {
        if (this.a.exists()) {
            if (!this.a.isDirectory() && !new File(this.a.getCanonicalPath()).isDirectory()) {
                throw new IOException();
            }
        } else if (!this.a.mkdirs()) {
            throw new IOException();
        }
        if (this.b.exists()) {
            return this.b;
        }
        if (this.b.createNewFile()) {
            return this.b;
        }
        throw new IOException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if (r0 != null) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[Catch:{ all -> 0x0063 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(io.reactivex.m r11) {
        /*
            r10 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x006f, all -> 0x006a }
            java.io.File r1 = r10.c()     // Catch:{ IOException -> 0x006f, all -> 0x006a }
            r0.<init>(r1)     // Catch:{ IOException -> 0x006f, all -> 0x006a }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x006f, all -> 0x006a }
            long r1 = r0.size()     // Catch:{ all -> 0x0061 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x005d
            cqe r1 = r10.d     // Catch:{ all -> 0x0061 }
            long r1 = r1.d()     // Catch:{ all -> 0x0061 }
            java.io.File r5 = r10.b     // Catch:{ all -> 0x0061 }
            long r5 = r5.lastModified()     // Catch:{ all -> 0x0061 }
            long r1 = r1 - r5
            long r5 = r10.c     // Catch:{ all -> 0x0061 }
            r7 = 1
            r8 = 0
            int r9 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r9 > 0) goto L_0x0033
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r1 = 0
            goto L_0x0034
        L_0x0033:
            r1 = 1
        L_0x0034:
            if (r1 != 0) goto L_0x005d
            long r1 = r0.size()     // Catch:{ all -> 0x0061 }
            int r2 = (int) r1     // Catch:{ all -> 0x0061 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)     // Catch:{ all -> 0x0061 }
            r0.read(r1)     // Catch:{ all -> 0x0061 }
            byte[] r1 = r1.array()     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "ImageResolve: Read Projection Map from cache %s bytes"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x0061 }
            int r4 = r1.length     // Catch:{ all -> 0x0061 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0061 }
            r3[r8] = r4     // Catch:{ all -> 0x0061 }
            com.spotify.base.java.logging.Logger.b(r2, r3)     // Catch:{ all -> 0x0061 }
            com.spotify.imageresolve.proto.ProjectionMap r1 = com.spotify.imageresolve.proto.ProjectionMap.p(r1)     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x005d
            r11.onSuccess(r1)     // Catch:{ all -> 0x0061 }
        L_0x005d:
            r0.close()
            goto L_0x006f
        L_0x0061:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r1 = move-exception
            if (r0 == 0) goto L_0x0069
            r0.close()     // Catch:{ all -> 0x0069 }
        L_0x0069:
            throw r1
        L_0x006a:
            r0 = move-exception
            r11.onComplete()
            throw r0
        L_0x006f:
            r11.onComplete()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.imageresolve.b0.b(io.reactivex.m):void");
    }

    public void d() {
        a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r0 != null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(com.spotify.imageresolve.proto.ProjectionMap r6) {
        /*
            r5 = this;
            long r0 = r5.c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0009
            return
        L_0x0009:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0031 }
            java.io.File r1 = r5.c()     // Catch:{ IOException -> 0x0031 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0031 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x0031 }
            r0.lock()     // Catch:{ all -> 0x0028 }
            byte[] r6 = r6.toByteArray()     // Catch:{ all -> 0x0028 }
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)     // Catch:{ all -> 0x0028 }
            r0.write(r6)     // Catch:{ all -> 0x0028 }
            r0.close()
            goto L_0x0037
        L_0x0028:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x002a }
        L_0x002a:
            r6 = move-exception
            if (r0 == 0) goto L_0x0030
            r0.close()     // Catch:{ all -> 0x0030 }
        L_0x0030:
            throw r6
        L_0x0031:
            r6 = move-exception
            java.lang.String r0 = "Failed to cache projection response"
            com.spotify.mobile.android.util.Assertion.i(r0, r6)
        L_0x0037:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.imageresolve.b0.e(com.spotify.imageresolve.proto.ProjectionMap):void");
    }
}
