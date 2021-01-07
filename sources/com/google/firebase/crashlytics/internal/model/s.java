package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class s extends CrashlyticsReport.d.AbstractC0117d.AbstractC0128d {
    private final String a;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.AbstractC0117d.AbstractC0128d.a {
        private String a;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.AbstractC0128d.a
        public CrashlyticsReport.d.AbstractC0117d.AbstractC0128d a() {
            String str = this.a == null ? " content" : "";
            if (str.isEmpty()) {
                return new s(this.a, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.AbstractC0128d.a
        public CrashlyticsReport.d.AbstractC0117d.AbstractC0128d.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    s(String str, a aVar) {
        this.a = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.AbstractC0128d
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.d.AbstractC0117d.AbstractC0128d) {
            return this.a.equals(((CrashlyticsReport.d.AbstractC0117d.AbstractC0128d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return je.I0(je.V0("Log{content="), this.a, "}");
    }
}
