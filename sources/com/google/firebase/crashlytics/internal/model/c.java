package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class c extends CrashlyticsReport.b {
    private final String a;
    private final String b;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.b.a {
        private String a;
        private String b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.b.a
        public CrashlyticsReport.b a() {
            String str = this.a == null ? " key" : "";
            if (this.b == null) {
                str = je.x0(str, " value");
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.b.a
        public CrashlyticsReport.b.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.b.a
        public CrashlyticsReport.b.a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    c(String str, String str2, a aVar) {
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.b
    public String b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.b
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.b)) {
            return false;
        }
        CrashlyticsReport.b bVar = (CrashlyticsReport.b) obj;
        if (!this.a.equals(bVar.b()) || !this.b.equals(bVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("CustomAttribute{key=");
        V0.append(this.a);
        V0.append(", value=");
        return je.I0(V0, this.b, "}");
    }
}
