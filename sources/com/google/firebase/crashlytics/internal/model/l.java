package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class l extends CrashlyticsReport.d.AbstractC0117d.a.b {
    private final v<CrashlyticsReport.d.AbstractC0117d.a.b.e> a;
    private final CrashlyticsReport.d.AbstractC0117d.a.b.c b;
    private final CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d c;
    private final v<CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a> d;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b {
        private v<CrashlyticsReport.d.AbstractC0117d.a.b.e> a;
        private CrashlyticsReport.d.AbstractC0117d.a.b.c b;
        private CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d c;
        private v<CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a> d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b
        public CrashlyticsReport.d.AbstractC0117d.a.b a() {
            String str = this.a == null ? " threads" : "";
            if (this.b == null) {
                str = je.x0(str, " exception");
            }
            if (this.c == null) {
                str = je.x0(str, " signal");
            }
            if (this.d == null) {
                str = je.x0(str, " binaries");
            }
            if (str.isEmpty()) {
                return new l(this.a, this.b, this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b b(v<CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a> vVar) {
            if (vVar != null) {
                this.d = vVar;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b c(CrashlyticsReport.d.AbstractC0117d.a.b.c cVar) {
            this.b = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b d(CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d dVar) {
            this.c = dVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0121b e(v<CrashlyticsReport.d.AbstractC0117d.a.b.e> vVar) {
            if (vVar != null) {
                this.a = vVar;
                return this;
            }
            throw new NullPointerException("Null threads");
        }
    }

    l(v vVar, CrashlyticsReport.d.AbstractC0117d.a.b.c cVar, CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d dVar, v vVar2, a aVar) {
        this.a = vVar;
        this.b = cVar;
        this.c = dVar;
        this.d = vVar2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b
    public v<CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a> b() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b
    public CrashlyticsReport.d.AbstractC0117d.a.b.c c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b
    public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0123d d() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b
    public v<CrashlyticsReport.d.AbstractC0117d.a.b.e> e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC0117d.a.b)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC0117d.a.b bVar = (CrashlyticsReport.d.AbstractC0117d.a.b) obj;
        if (!this.a.equals(bVar.e()) || !this.b.equals(bVar.c()) || !this.c.equals(bVar.d()) || !this.d.equals(bVar.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Execution{threads=");
        V0.append(this.a);
        V0.append(", exception=");
        V0.append(this.b);
        V0.append(", signal=");
        V0.append(this.c);
        V0.append(", binaries=");
        V0.append(this.d);
        V0.append("}");
        return V0.toString();
    }
}
