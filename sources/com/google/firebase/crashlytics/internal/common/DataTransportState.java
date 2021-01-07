package com.google.firebase.crashlytics.internal.common;

public enum DataTransportState {
    NONE,
    JAVA_ONLY,
    ALL;

    static DataTransportState d(q00 q00) {
        boolean z = false;
        boolean z2 = q00.g == 2;
        if (q00.h == 2) {
            z = true;
        }
        if (!z2) {
            return NONE;
        }
        if (!z) {
            return JAVA_ONLY;
        }
        return ALL;
    }
}
