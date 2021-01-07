package com.spotify.performancesdk.timekeeper;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.f;
import kotlin.jvm.internal.h;

public final class e implements g {
    private final ThreadPoolExecutor a;

    public e(ThreadPoolExecutor threadPoolExecutor, int i) {
        ThreadPoolExecutor threadPoolExecutor2 = (i & 1) != 0 ? new ThreadPoolExecutor(1, 1, 2, TimeUnit.MINUTES, new LinkedBlockingQueue(2048), d.a) : null;
        h.e(threadPoolExecutor2, "executor");
        this.a = threadPoolExecutor2;
        threadPoolExecutor2.allowCoreThreadTimeOut(true);
    }

    @Override // com.spotify.performancesdk.timekeeper.g
    public void a(cmf<f> cmf) {
        h.e(cmf, "block");
        this.a.execute(new f(cmf));
    }
}
