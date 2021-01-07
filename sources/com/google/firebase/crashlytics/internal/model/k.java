package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class k extends CrashlyticsReport.d.AbstractC0117d.a {
    private final CrashlyticsReport.d.AbstractC0117d.a.b a;
    private final v<CrashlyticsReport.b> b;
    private final Boolean c;
    private final int d;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a {
        private CrashlyticsReport.d.AbstractC0117d.a.b a;
        private v<CrashlyticsReport.b> b;
        private Boolean c;
        private Integer d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a
        public CrashlyticsReport.d.AbstractC0117d.a a() {
            String str = this.a == null ? " execution" : "";
            if (this.d == null) {
                str = je.x0(str, " uiOrientation");
            }
            if (str.isEmpty()) {
                return new k(this.a, this.b, this.c, this.d.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a
        public CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a b(Boolean bool) {
            this.c = bool;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a
        public CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a c(v<CrashlyticsReport.b> vVar) {
            this.b = vVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a
        public CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a d(CrashlyticsReport.d.AbstractC0117d.a.b bVar) {
            this.a = bVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a
        public CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a e(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        b(CrashlyticsReport.d.AbstractC0117d.a aVar, a aVar2) {
            this.a = aVar.d();
            this.b = aVar.c();
            this.c = aVar.b();
            this.d = Integer.valueOf(aVar.e());
        }
    }

    k(CrashlyticsReport.d.AbstractC0117d.a.b bVar, v vVar, Boolean bool, int i, a aVar) {
        this.a = bVar;
        this.b = vVar;
        this.c = bool;
        this.d = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a
    public Boolean b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a
    public v<CrashlyticsReport.b> c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a
    public CrashlyticsReport.d.AbstractC0117d.a.b d() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        v<CrashlyticsReport.b> vVar;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC0117d.a)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC0117d.a aVar = (CrashlyticsReport.d.AbstractC0117d.a) obj;
        if (!this.a.equals(aVar.d()) || ((vVar = this.b) != null ? !vVar.equals(aVar.c()) : aVar.c() != null) || ((bool = this.c) != null ? !bool.equals(aVar.b()) : aVar.b() != null) || this.d != aVar.e()) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a
    public CrashlyticsReport.d.AbstractC0117d.a.AbstractC0118a f() {
        return new b(this, null);
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        v<CrashlyticsReport.b> vVar = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (vVar == null ? 0 : vVar.hashCode())) * 1000003;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.d;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Application{execution=");
        V0.append(this.a);
        V0.append(", customAttributes=");
        V0.append(this.b);
        V0.append(", background=");
        V0.append(this.c);
        V0.append(", uiOrientation=");
        return je.B0(V0, this.d, "}");
    }
}
