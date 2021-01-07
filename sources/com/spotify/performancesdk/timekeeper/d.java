package com.spotify.performancesdk.timekeeper;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* access modifiers changed from: package-private */
public final class d implements ThreadFactory {
    public static final d a = new d();

    d() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
        newThread.setName("timekeeper-thread");
        return newThread;
    }
}
