package com.spotify.performancesdk.timekeeper;

import kotlin.jvm.internal.h;

final class f implements Runnable {
    private final /* synthetic */ cmf a;

    f(cmf cmf) {
        this.a = cmf;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        h.d(this.a.invoke(), "invoke(...)");
    }
}
