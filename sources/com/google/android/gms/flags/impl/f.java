package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* access modifiers changed from: package-private */
public final class f implements Callable<SharedPreferences> {
    private final /* synthetic */ Context a;

    f(Context context) {
        this.a = context;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}
