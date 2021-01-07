package com.spotify.remoteconfig;

import com.spotify.remoteconfig.ci;

public final /* synthetic */ class w0 implements o0e {
    public static final /* synthetic */ w0 a = new w0();

    private /* synthetic */ w0() {
    }

    @Override // defpackage.o0e
    public final n0e a(p0e p0e) {
        int c = p0e.c("android-perf-tracking", "log_trim_memory_sample_interval", 1, 10000, 100);
        int c2 = p0e.c("android-perf-tracking", "log_trim_memory_threshold", 0, 100, 60);
        boolean a2 = p0e.a("android-perf-tracking", "should_log_cold_startup_subdurations", false);
        boolean a3 = p0e.a("android-perf-tracking", "should_log_trim_memory_warnings", false);
        boolean a4 = p0e.a("android-perf-tracking", "should_send_time_measurements", false);
        ci.b bVar = new ci.b();
        bVar.b(100);
        bVar.c(60);
        bVar.d(false);
        bVar.e(false);
        bVar.f(false);
        bVar.b(c);
        bVar.c(c2);
        bVar.d(a2);
        bVar.e(a3);
        bVar.f(a4);
        wc a5 = bVar.a();
        if (a5.a() < 1 || a5.a() > 10000) {
            throw new IllegalArgumentException("Value for logTrimMemorySampleInterval() out of bounds");
        } else if (a5.b() >= 0 && a5.b() <= 100) {
            return a5;
        } else {
            throw new IllegalArgumentException("Value for logTrimMemoryThreshold() out of bounds");
        }
    }
}
