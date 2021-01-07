package com.google.android.gms.measurement.internal;

import com.google.android.exoplayer2.util.g;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class m7 implements Runnable {
    private final URL a;
    private final e5 b;
    private final String c;
    private final /* synthetic */ k7 f;

    /* JADX WARN: Incorrect args count in method signature: (Ljava/lang/String;Ljava/net/URL;[BLjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Lcom/google/android/gms/measurement/internal/e5;)V */
    public m7(k7 k7Var, String str, URL url, e5 e5Var) {
        this.f = k7Var;
        g.i(str);
        this.a = url;
        this.b = e5Var;
        this.c = str;
    }

    private final void b(int i, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f.k().y(new l7(this, i, exc, bArr, map));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(int i, Exception exc, byte[] bArr, Map map) {
        this.b.a(this.c, i, exc, bArr, map);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003d  */
    @Override // java.lang.Runnable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.android.gms.measurement.internal.k7 r0 = r5.f
            r0.a()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.k7 r2 = r5.f     // Catch:{ IOException -> 0x0038, all -> 0x002c }
            java.net.URL r3 = r5.a     // Catch:{ IOException -> 0x0038, all -> 0x002c }
            java.net.HttpURLConnection r2 = r2.t(r3)     // Catch:{ IOException -> 0x0038, all -> 0x002c }
            int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            java.util.Map r3 = r2.getHeaderFields()     // Catch:{ IOException -> 0x0029, all -> 0x0026 }
            byte[] r4 = com.google.android.gms.measurement.internal.k7.u(r2)     // Catch:{ IOException -> 0x0024, all -> 0x0022 }
            r2.disconnect()
            r5.b(r1, r0, r4, r3)
            return
        L_0x0022:
            r4 = move-exception
            goto L_0x002f
        L_0x0024:
            r4 = move-exception
            goto L_0x003b
        L_0x0026:
            r4 = move-exception
            r3 = r0
            goto L_0x002f
        L_0x0029:
            r4 = move-exception
            r3 = r0
            goto L_0x003b
        L_0x002c:
            r4 = move-exception
            r2 = r0
            r3 = r2
        L_0x002f:
            if (r2 == 0) goto L_0x0034
            r2.disconnect()
        L_0x0034:
            r5.b(r1, r0, r0, r3)
            throw r4
        L_0x0038:
            r4 = move-exception
            r2 = r0
            r3 = r2
        L_0x003b:
            if (r2 == 0) goto L_0x0040
            r2.disconnect()
        L_0x0040:
            r5.b(r1, r4, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m7.run():void");
    }
}
