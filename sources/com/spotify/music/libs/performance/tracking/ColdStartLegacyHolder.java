package com.spotify.music.libs.performance.tracking;

import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.ColdStartTracker;

public final class ColdStartLegacyHolder {
    private static ColdStartTracker sInstance;

    private ColdStartLegacyHolder() {
    }

    @Deprecated
    public static void commitMessages(String str) {
        ColdStartTracker coldStartTracker = sInstance;
        if (coldStartTracker != null) {
            coldStartTracker.c(str, null);
        } else {
            Logger.e(new IllegalStateException("Not initialized"), "Unable to process log request", new Object[0]);
        }
    }

    @Deprecated
    public static void logCoreFeatureDuration(String str, long j) {
        ColdStartTracker coldStartTracker = sInstance;
        if (coldStartTracker != null) {
            synchronized (coldStartTracker) {
                coldStartTracker.r("dcf_" + str, j);
            }
            return;
        }
        Logger.e(new IllegalStateException("Not initialized"), "Unable to process log request", new Object[0]);
    }

    @Deprecated
    public static void logStep(String str, int i) {
        if (i == 1) {
            ColdStartTracker coldStartTracker = sInstance;
            if (coldStartTracker != null) {
                coldStartTracker.m(str);
            } else {
                Logger.e(new IllegalStateException("Not initialized"), "Unable to process log request", new Object[0]);
            }
        }
    }

    public static void setInstance(ColdStartTracker coldStartTracker) {
        sInstance = coldStartTracker;
    }
}
