package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class o extends CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d {
    private final String a;
    private final String b;
    private final long c;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.AbstractC0124a {
        private String a;
        private String b;
        private Long c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.AbstractC0124a
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d a() {
            String str = this.a == null ? " name" : "";
            if (this.b == null) {
                str = je.x0(str, " code");
            }
            if (this.c == null) {
                str = je.x0(str, " address");
            }
            if (str.isEmpty()) {
                return new o(this.a, this.b, this.c.longValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.AbstractC0124a
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.AbstractC0124a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.AbstractC0124a
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.AbstractC0124a c(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null code");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.AbstractC0124a
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d.AbstractC0124a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    o(String str, String str2, long j, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d
    public long b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d
    public String c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d dVar = (CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d) obj;
        if (!this.a.equals(dVar.d()) || !this.b.equals(dVar.c()) || this.c != dVar.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder V0 = je.V0("Signal{name=");
        V0.append(this.a);
        V0.append(", code=");
        V0.append(this.b);
        V0.append(", address=");
        return je.E0(V0, this.c, "}");
    }
}
