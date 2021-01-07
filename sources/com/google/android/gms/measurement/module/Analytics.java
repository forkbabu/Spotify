package com.google.android.gms.measurement.module;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.measurement.internal.f5;

public class Analytics {
    private static volatile Analytics a;

    private Analytics(f5 f5Var) {
        if (f5Var == null) {
            throw new NullPointerException("null reference");
        }
    }

    @Keep
    public static Analytics getInstance(Context context) {
        if (a == null) {
            synchronized (Analytics.class) {
                if (a == null) {
                    a = new Analytics(f5.a(context, null, null));
                }
            }
        }
        return a;
    }
}
