package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class p extends CrashlyticsReport.d.AbstractC0117d.a.b.e {
    private final String a;
    private final int b;
    private final v<CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b> c;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0125a {
        private String a;
        private Integer b;
        private v<CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b> c;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0125a
        public CrashlyticsReport.d.AbstractC0117d.a.b.e a() {
            String str = this.a == null ? " name" : "";
            if (this.b == null) {
                str = je.x0(str, " importance");
            }
            if (this.c == null) {
                str = je.x0(str, " frames");
            }
            if (str.isEmpty()) {
                return new p(this.a, this.b.intValue(), this.c, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0125a
        public CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0125a b(v<CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b> vVar) {
            if (vVar != null) {
                this.c = vVar;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0125a
        public CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0125a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0125a
        public CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0125a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    p(String str, int i, v vVar, a aVar) {
        this.a = str;
        this.b = i;
        this.c = vVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e
    public v<CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b> b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e
    public int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC0117d.a.b.e)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC0117d.a.b.e eVar = (CrashlyticsReport.d.AbstractC0117d.a.b.e) obj;
        if (!this.a.equals(eVar.d()) || this.b != eVar.c() || !this.c.equals(eVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Thread{name=");
        V0.append(this.a);
        V0.append(", importance=");
        V0.append(this.b);
        V0.append(", frames=");
        V0.append(this.c);
        V0.append("}");
        return V0.toString();
    }
}
