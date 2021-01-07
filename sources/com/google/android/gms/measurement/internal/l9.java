package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import com.google.android.gms.common.util.b;
import com.google.android.gms.common.util.d;

/* access modifiers changed from: package-private */
public final class l9 {
    private final b a;
    private long b;

    public l9(b bVar) {
        if (bVar != null) {
            this.a = bVar;
            return;
        }
        throw new NullPointerException("null reference");
    }

    public final void a() {
        ((d) this.a).getClass();
        this.b = SystemClock.elapsedRealtime();
    }

    public final boolean b() {
        if (this.b == 0) {
            return true;
        }
        ((d) this.a).getClass();
        if (SystemClock.elapsedRealtime() - this.b >= 3600000) {
            return true;
        }
        return false;
    }

    public final void c() {
        this.b = 0;
    }
}
