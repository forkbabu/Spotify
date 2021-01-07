package com.google.android.gms.internal.recaptcha;

import android.os.Build;
import android.os.SystemClock;

public final class m {
    static {
        try {
            if (Build.VERSION.SDK_INT >= 17) {
                SystemClock.elapsedRealtimeNanos();
            }
        } catch (Throwable unused) {
        }
    }
}
