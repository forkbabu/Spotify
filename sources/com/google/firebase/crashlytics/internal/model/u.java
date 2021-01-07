package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

/* access modifiers changed from: package-private */
public final class u extends CrashlyticsReport.d.f {
    private final String a;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.f.a {
        private String a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.f.a
        public CrashlyticsReport.d.f a() {
            String str = this.a == null ? " identifier" : "";
            if (str.isEmpty()) {
                return new u(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.f.a
        public CrashlyticsReport.d.f.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    u(String str, a aVar) {
        this.a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.f
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.d.f) {
            return this.a.equals(((CrashlyticsReport.d.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("User{identifier="), this.a, "}");
    }
}
