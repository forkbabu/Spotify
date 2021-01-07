package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicReference;

public final class hb extends nb {
    private final AtomicReference<Bundle> a = new AtomicReference<>();
    private boolean b;

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r4 = r4.get("r");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T D3(android.os.Bundle r4, java.lang.Class<T> r5) {
        /*
            if (r4 == 0) goto L_0x0031
            java.lang.String r0 = "r"
            java.lang.Object r4 = r4.get(r0)
            if (r4 == 0) goto L_0x0031
            java.lang.Object r4 = r5.cast(r4)     // Catch:{ ClassCastException -> 0x000f }
            return r4
        L_0x000f:
            r0 = move-exception
            java.lang.String r5 = r5.getCanonicalName()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getCanonicalName()
            java.lang.String r1 = "Unexpected object type. Expected, Received"
            java.lang.String r2 = ": %s, %s"
            java.lang.String r1 = r1.concat(r2)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r4
            java.lang.String.format(r1, r2)
            throw r0
        L_0x0031:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.hb.D3(android.os.Bundle, java.lang.Class):java.lang.Object");
    }

    public final String E3(long j) {
        return (String) D3(F3(j), String.class);
    }

    public final Bundle F3(long j) {
        Bundle bundle;
        synchronized (this.a) {
            if (!this.b) {
                try {
                    this.a.wait(j);
                } catch (InterruptedException unused) {
                    return null;
                }
            }
            bundle = this.a.get();
        }
        return bundle;
    }

    @Override // com.google.android.gms.internal.measurement.kb
    public final void m(Bundle bundle) {
        synchronized (this.a) {
            try {
                this.a.set(bundle);
                this.b = true;
                this.a.notify();
            } catch (Throwable th) {
                this.a.notify();
                throw th;
            }
        }
    }
}
