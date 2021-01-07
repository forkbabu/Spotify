package com.spotify.mobile.android.service;

import android.os.HandlerThread;
import android.os.Looper;

public final class b0 implements fjf<Looper> {

    /* access modifiers changed from: private */
    public static final class a {
        private static final b0 a = new b0();
    }

    public static b0 a() {
        return a.a;
    }

    @Override // defpackage.wlf
    public Object get() {
        Looper looper;
        if (ig0.b()) {
            looper = Looper.getMainLooper();
        } else {
            HandlerThread handlerThread = new HandlerThread("backgroundUpdater");
            handlerThread.start();
            looper = handlerThread.getLooper();
        }
        yif.g(looper, "Cannot return null from a non-@Nullable @Provides method");
        return looper;
    }
}
