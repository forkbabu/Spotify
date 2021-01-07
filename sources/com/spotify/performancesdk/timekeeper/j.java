package com.spotify.performancesdk.timekeeper;

import kotlin.jvm.internal.h;

public final class j extends k {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        ((j) obj).getClass();
        return h.a(null, null) && h.a(null, null) && h.a(null, null) && h.a(null, null) && h.a(null, null) && h.a(null, null) && h.a(null, null) && h.a(null, null) && h.a(null, null) && h.a(null, null);
    }

    public int hashCode() {
        return ((((0 + 0) * 31) + 0) * 31) + 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TimeMeasurementError(measurementId=");
        sb.append((Object) null);
        sb.append(", category=");
        sb.append((String) null);
        sb.append(", metadata=");
        sb.append((Object) null);
        sb.append(", dimensions=");
        sb.append((Object) null);
        sb.append(", points=");
        sb.append((Object) null);
        sb.append(", featureId=");
        sb.append((String) null);
        sb.append(", parentMeasurementId=");
        sb.append((Object) null);
        sb.append(", parentEpochOffset=");
        sb.append((Object) null);
        sb.append(", errorCode=");
        sb.append(0);
        sb.append(", errorData=");
        sb.append((Object) null);
        sb.append(", ongoingPoints=");
        return je.G0(sb, null, ")");
    }
}
