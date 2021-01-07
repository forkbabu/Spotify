package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class u0 implements Comparator {
    private static final u0 a = new u0();

    private u0() {
    }

    public static Comparator a() {
        return a;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((CrashlyticsReport.b) obj).b().compareTo(((CrashlyticsReport.b) obj2).b());
    }
}
