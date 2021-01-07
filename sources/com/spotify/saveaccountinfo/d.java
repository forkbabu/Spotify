package com.spotify.saveaccountinfo;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.g;
import io.reactivex.y;

public final class d {
    public static void a(SaveAccountInfoWorker saveAccountInfoWorker, g70 g70) {
        saveAccountInfoWorker.s = g70;
    }

    public static void b(SaveAccountInfoWorker saveAccountInfoWorker, ColdStartTracker coldStartTracker) {
        saveAccountInfoWorker.u = coldStartTracker;
    }

    public static void c(SaveAccountInfoWorker saveAccountInfoWorker, y yVar) {
        saveAccountInfoWorker.q = yVar;
    }

    public static void d(SaveAccountInfoWorker saveAccountInfoWorker, bqa bqa) {
        saveAccountInfoWorker.t = bqa;
    }

    public static void e(SaveAccountInfoWorker saveAccountInfoWorker, y yVar) {
        saveAccountInfoWorker.p = yVar;
    }

    public static void f(SaveAccountInfoWorker saveAccountInfoWorker, g<SessionState> gVar) {
        saveAccountInfoWorker.r = gVar;
    }
}
