package com.google.firebase.installations;

import android.util.Log;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* access modifiers changed from: package-private */
public class b {
    private final FileChannel a;
    private final FileLock b;

    private b(FileChannel fileChannel, FileLock fileLock) {
        this.a = fileChannel;
        this.b = fileLock;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038 A[SYNTHETIC, Splitter:B:15:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f A[SYNTHETIC, Splitter:B:19:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.firebase.installations.b a(android.content.Context r4, java.lang.String r5) {
        /*
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x002b, Error -> 0x0029 }
            java.io.File r4 = r4.getFilesDir()     // Catch:{ IOException -> 0x002b, Error -> 0x0029 }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x002b, Error -> 0x0029 }
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002b, Error -> 0x0029 }
            java.lang.String r5 = "rw"
            r4.<init>(r1, r5)     // Catch:{ IOException -> 0x002b, Error -> 0x0029 }
            java.nio.channels.FileChannel r4 = r4.getChannel()     // Catch:{ IOException -> 0x002b, Error -> 0x0029 }
            java.nio.channels.FileLock r5 = r4.lock()     // Catch:{ IOException -> 0x0025, Error -> 0x0023 }
            com.google.firebase.installations.b r1 = new com.google.firebase.installations.b     // Catch:{ IOException -> 0x0021, Error -> 0x001f }
            r1.<init>(r4, r5)     // Catch:{ IOException -> 0x0021, Error -> 0x001f }
            return r1
        L_0x001f:
            r1 = move-exception
            goto L_0x002f
        L_0x0021:
            r1 = move-exception
            goto L_0x002f
        L_0x0023:
            r5 = move-exception
            goto L_0x0026
        L_0x0025:
            r5 = move-exception
        L_0x0026:
            r1 = r5
            r5 = r0
            goto L_0x002f
        L_0x0029:
            r4 = move-exception
            goto L_0x002c
        L_0x002b:
            r4 = move-exception
        L_0x002c:
            r1 = r4
            r4 = r0
            r5 = r4
        L_0x002f:
            java.lang.String r2 = "CrossProcessLock"
            java.lang.String r3 = "encountered error while creating and acquiring the lock, ignoring"
            android.util.Log.e(r2, r3, r1)
            if (r5 == 0) goto L_0x003d
            r5.release()     // Catch:{ IOException -> 0x003c }
            goto L_0x003d
        L_0x003c:
        L_0x003d:
            if (r4 == 0) goto L_0x0042
            r4.close()     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.b.a(android.content.Context, java.lang.String):com.google.firebase.installations.b");
    }

    /* access modifiers changed from: package-private */
    public void b() {
        try {
            this.b.release();
            this.a.close();
        } catch (IOException e) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", e);
        }
    }
}
