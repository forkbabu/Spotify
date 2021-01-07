package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: wnd  reason: default package */
class wnd implements vnd {
    private final Context a;

    wnd(Context context) {
        this.a = context;
    }

    @Override // defpackage.vnd
    public File a(String str) {
        File file = new File(this.a.getCacheDir(), "canvasshare");
        if (file.exists() || file.mkdirs()) {
            return new File(file, str);
        }
        StringBuilder V0 = je.V0("Can't create directory ");
        V0.append(file.getAbsolutePath());
        throw new IllegalStateException(V0.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0022, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0023, code lost:
        if (r2 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0028, code lost:
        throw r3;
     */
    @Override // defpackage.vnd
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.net.Uri b(java.io.InputStream r2, java.io.File r3) {
        /*
            r1 = this;
            java.math.BigInteger r0 = org.apache.commons.io.b.a     // Catch:{ all -> 0x0016 }
            org.apache.commons.io.b.e(r2, r3)     // Catch:{ all -> 0x0018 }
            int r0 = org.apache.commons.io.d.a
            if (r2 == 0) goto L_0x000c
            r2.close()     // Catch:{ IOException -> 0x000c }
        L_0x000c:
            android.net.Uri r3 = android.net.Uri.fromFile(r3)
            if (r2 == 0) goto L_0x0015
            r2.close()
        L_0x0015:
            return r3
        L_0x0016:
            r3 = move-exception
            goto L_0x0021
        L_0x0018:
            r3 = move-exception
            int r0 = org.apache.commons.io.d.a
            if (r2 == 0) goto L_0x0020
            r2.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            throw r3
        L_0x0021:
            throw r3     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r3 = move-exception
            if (r2 == 0) goto L_0x0028
            r2.close()     // Catch:{ all -> 0x0028 }
        L_0x0028:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wnd.b(java.io.InputStream, java.io.File):android.net.Uri");
    }
}
