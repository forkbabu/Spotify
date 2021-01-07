package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* access modifiers changed from: package-private */
public final class c extends g0 {
    private final CrashlyticsReport a;
    private final String b;

    c(CrashlyticsReport crashlyticsReport, String str) {
        if (crashlyticsReport != null) {
            this.a = crashlyticsReport;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // com.google.firebase.crashlytics.internal.common.g0
    public CrashlyticsReport b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.common.g0
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        if (!this.a.equals(g0Var.b()) || !this.b.equals(g0Var.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("CrashlyticsReportWithSessionId{report=");
        V0.append(this.a);
        V0.append(", sessionId=");
        return je.I0(V0, this.b, "}");
    }
}
