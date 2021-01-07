package com.spotify.music.features.premiumdestination;

import android.content.Context;
import java.util.concurrent.Callable;

public class k0 implements Callable<String> {
    private final Context a;
    private final int b;

    public k0(Context context, int i) {
        this.a = context.getApplicationContext();
        this.b = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r0 != null) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        r1 = move-exception;
     */
    @Override // java.util.concurrent.Callable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String call() {
        /*
            r3 = this;
            android.content.Context r0 = r3.a
            android.content.res.Resources r0 = r0.getResources()
            int r1 = r3.b
            java.io.InputStream r0 = r0.openRawResource(r1)
            java.util.Scanner r1 = new java.util.Scanner     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "UTF-8"
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)     // Catch:{ all -> 0x002b }
            java.lang.String r2 = r2.name()     // Catch:{ all -> 0x002b }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "\\A"
            java.util.Scanner r1 = r1.useDelimiter(r2)     // Catch:{ all -> 0x002b }
            java.lang.String r1 = r1.next()     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x002a
            r0.close()
        L_0x002a:
            return r1
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r1 = move-exception
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.premiumdestination.k0.call():java.lang.Object");
    }
}
