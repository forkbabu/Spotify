package com.spotify.music.preloadlogger;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.rx.x;
import com.spotify.mobile.android.service.session.f;

public final class e {
    public static void a(LoginTimeReporterWorker loginTimeReporterWorker, cqe cqe) {
        loginTimeReporterWorker.r = cqe;
    }

    public static void b(LoginTimeReporterWorker loginTimeReporterWorker, ColdStartTracker coldStartTracker) {
        loginTimeReporterWorker.s = coldStartTracker;
    }

    public static void c(LoginTimeReporterWorker loginTimeReporterWorker, f fVar) {
        loginTimeReporterWorker.q = fVar;
    }

    public static void d(LoginTimeReporterWorker loginTimeReporterWorker, f fVar) {
        loginTimeReporterWorker.p = fVar;
    }

    public static f e(cqe cqe, x xVar, yyd yyd) {
        return new f(cqe, xVar, yyd);
    }
}
