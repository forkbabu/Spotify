package com.spotify.share.cleanup;

import com.spotify.libs.instrumentation.performance.ColdStartTracker;
import com.spotify.share.util.i;
import com.spotify.share.util.o;

public final class d {
    public static void a(SharedFilesCleanWorker sharedFilesCleanWorker, ColdStartTracker coldStartTracker) {
        sharedFilesCleanWorker.q = coldStartTracker;
    }

    public static void b(SharedFilesCleanWorker sharedFilesCleanWorker, i iVar) {
        sharedFilesCleanWorker.p = iVar;
    }

    public static void c(SharedFilesCleanWorker sharedFilesCleanWorker, o oVar) {
        sharedFilesCleanWorker.o = oVar;
    }
}
