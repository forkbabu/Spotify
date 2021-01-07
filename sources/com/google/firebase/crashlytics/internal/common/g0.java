package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

public abstract class g0 {
    public static g0 a(CrashlyticsReport crashlyticsReport, String str) {
        return new c(crashlyticsReport, str);
    }

    public abstract CrashlyticsReport b();

    public abstract String c();
}
