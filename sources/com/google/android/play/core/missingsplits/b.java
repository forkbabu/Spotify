package com.google.android.play.core.missingsplits;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

public class b {
    private static final AtomicReference<Boolean> a = new AtomicReference<>(null);

    public static a a(Context context) {
        return new d(context, Runtime.getRuntime(), new c(context, context.getPackageManager()), a);
    }
}
