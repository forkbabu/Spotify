package com.google.firebase.crashlytics.internal.common;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public class f implements s0 {
    private final byte[] a;
    private final String b;
    private final String c;

    f(String str, String str2, byte[] bArr) {
        this.b = str;
        this.c = str2;
        this.a = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // com.google.firebase.crashlytics.internal.common.s0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c.b a() {
        /*
            r4 = this;
            byte[] r0 = r4.a
            if (r0 == 0) goto L_0x000a
            int r0 = r0.length
            if (r0 != 0) goto L_0x0008
            goto L_0x000a
        L_0x0008:
            r0 = 0
            goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            r1 = 0
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r3 = r1
            goto L_0x0037
        L_0x0010:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x000e }
            r0.<init>()     // Catch:{ IOException -> 0x000e }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0032 }
            r2.<init>(r0)     // Catch:{ all -> 0x0032 }
            byte[] r3 = r4.a     // Catch:{ all -> 0x002d }
            r2.write(r3)     // Catch:{ all -> 0x002d }
            r2.finish()     // Catch:{ all -> 0x002d }
            byte[] r3 = r0.toByteArray()     // Catch:{ all -> 0x002d }
            r2.close()
            r0.close()
            goto L_0x0037
        L_0x002d:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r3
        L_0x0032:
            r2 = move-exception
            r0.close()     // Catch:{ all -> 0x0036 }
        L_0x0036:
            throw r2
        L_0x0037:
            if (r3 != 0) goto L_0x003a
            goto L_0x004a
        L_0x003a:
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c$b$a r0 = com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c.b.a()
            r0.b(r3)
            java.lang.String r1 = r4.b
            r0.c(r1)
            com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c$b r1 = r0.a()
        L_0x004a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.f.a():com.google.firebase.crashlytics.internal.model.CrashlyticsReport$c$b");
    }

    @Override // com.google.firebase.crashlytics.internal.common.s0
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.s0
    public InputStream g() {
        byte[] bArr = this.a;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return new ByteArrayInputStream(this.a);
    }
}
