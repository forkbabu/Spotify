package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class d extends CrashlyticsReport.c {
    private final v<CrashlyticsReport.c.b> a;
    private final String b;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.c.a {
        private v<CrashlyticsReport.c.b> a;
        private String b;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c.a
        public CrashlyticsReport.c a() {
            String str = this.a == null ? " files" : "";
            if (str.isEmpty()) {
                return new d(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c.a
        public CrashlyticsReport.c.a b(v<CrashlyticsReport.c.b> vVar) {
            this.a = vVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c.a
        public CrashlyticsReport.c.a c(String str) {
            this.b = str;
            return this;
        }
    }

    d(v vVar, String str, a aVar) {
        this.a = vVar;
        this.b = str;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
    public v<CrashlyticsReport.c.b> b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.c
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.c)) {
            return false;
        }
        CrashlyticsReport.c cVar = (CrashlyticsReport.c) obj;
        if (this.a.equals(cVar.b())) {
            String str = this.b;
            if (str == null) {
                if (cVar.c() == null) {
                    return true;
                }
            } else if (str.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder V0 = je.V0("FilesPayload{files=");
        V0.append(this.a);
        V0.append(", orgId=");
        return je.I0(V0, this.b, "}");
    }
}
