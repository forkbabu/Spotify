package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class j extends CrashlyticsReport.d.AbstractC0117d {
    private final long a;
    private final String b;
    private final CrashlyticsReport.d.AbstractC0117d.a c;
    private final CrashlyticsReport.d.AbstractC0117d.c d;
    private final CrashlyticsReport.d.AbstractC0117d.AbstractC0128d e;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.AbstractC0117d.b {
        private Long a;
        private String b;
        private CrashlyticsReport.d.AbstractC0117d.a c;
        private CrashlyticsReport.d.AbstractC0117d.c d;
        private CrashlyticsReport.d.AbstractC0117d.AbstractC0128d e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.b
        public CrashlyticsReport.d.AbstractC0117d a() {
            String str = this.a == null ? " timestamp" : "";
            if (this.b == null) {
                str = je.x0(str, " type");
            }
            if (this.c == null) {
                str = je.x0(str, " app");
            }
            if (this.d == null) {
                str = je.x0(str, " device");
            }
            if (str.isEmpty()) {
                return new j(this.a.longValue(), this.b, this.c, this.d, this.e, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.b
        public CrashlyticsReport.d.AbstractC0117d.b b(CrashlyticsReport.d.AbstractC0117d.a aVar) {
            this.c = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.b
        public CrashlyticsReport.d.AbstractC0117d.b c(CrashlyticsReport.d.AbstractC0117d.c cVar) {
            this.d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.b
        public CrashlyticsReport.d.AbstractC0117d.b d(CrashlyticsReport.d.AbstractC0117d.AbstractC0128d dVar) {
            this.e = dVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.b
        public CrashlyticsReport.d.AbstractC0117d.b e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.b
        public CrashlyticsReport.d.AbstractC0117d.b f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }

        b(CrashlyticsReport.d.AbstractC0117d dVar, a aVar) {
            this.a = Long.valueOf(dVar.e());
            this.b = dVar.f();
            this.c = dVar.b();
            this.d = dVar.c();
            this.e = dVar.d();
        }
    }

    j(long j, String str, CrashlyticsReport.d.AbstractC0117d.a aVar, CrashlyticsReport.d.AbstractC0117d.c cVar, CrashlyticsReport.d.AbstractC0117d.AbstractC0128d dVar, a aVar2) {
        this.a = j;
        this.b = str;
        this.c = aVar;
        this.d = cVar;
        this.e = dVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d
    public CrashlyticsReport.d.AbstractC0117d.a b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d
    public CrashlyticsReport.d.AbstractC0117d.c c() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d
    public CrashlyticsReport.d.AbstractC0117d.AbstractC0128d d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC0117d)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC0117d dVar = (CrashlyticsReport.d.AbstractC0117d) obj;
        if (this.a == dVar.e() && this.b.equals(dVar.f()) && this.c.equals(dVar.b()) && this.d.equals(dVar.c())) {
            CrashlyticsReport.d.AbstractC0117d.AbstractC0128d dVar2 = this.e;
            if (dVar2 == null) {
                if (dVar.d() == null) {
                    return true;
                }
            } else if (dVar2.equals(dVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d
    public String f() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d
    public CrashlyticsReport.d.AbstractC0117d.b g() {
        return new b(this, null);
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        CrashlyticsReport.d.AbstractC0117d.AbstractC0128d dVar = this.e;
        return (dVar == null ? 0 : dVar.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Event{timestamp=");
        V0.append(this.a);
        V0.append(", type=");
        V0.append(this.b);
        V0.append(", app=");
        V0.append(this.c);
        V0.append(", device=");
        V0.append(this.d);
        V0.append(", log=");
        V0.append(this.e);
        V0.append("}");
        return V0.toString();
    }
}
