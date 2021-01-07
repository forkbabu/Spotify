package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class r extends CrashlyticsReport.d.AbstractC0117d.c {
    private final Double a;
    private final int b;
    private final boolean c;
    private final int d;
    private final long e;
    private final long f;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.AbstractC0117d.c.a {
        private Double a;
        private Integer b;
        private Boolean c;
        private Integer d;
        private Long e;
        private Long f;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c.a
        public CrashlyticsReport.d.AbstractC0117d.c a() {
            String str = this.b == null ? " batteryVelocity" : "";
            if (this.c == null) {
                str = je.x0(str, " proximityOn");
            }
            if (this.d == null) {
                str = je.x0(str, " orientation");
            }
            if (this.e == null) {
                str = je.x0(str, " ramUsed");
            }
            if (this.f == null) {
                str = je.x0(str, " diskUsed");
            }
            if (str.isEmpty()) {
                return new r(this.a, this.b.intValue(), this.c.booleanValue(), this.d.intValue(), this.e.longValue(), this.f.longValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c.a
        public CrashlyticsReport.d.AbstractC0117d.c.a b(Double d2) {
            this.a = d2;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c.a
        public CrashlyticsReport.d.AbstractC0117d.c.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c.a
        public CrashlyticsReport.d.AbstractC0117d.c.a d(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c.a
        public CrashlyticsReport.d.AbstractC0117d.c.a e(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c.a
        public CrashlyticsReport.d.AbstractC0117d.c.a f(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c.a
        public CrashlyticsReport.d.AbstractC0117d.c.a g(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    r(Double d2, int i, boolean z, int i2, long j, long j2, a aVar) {
        this.a = d2;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c
    public Double b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c
    public int c() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c
    public long d() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC0117d.c)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC0117d.c cVar = (CrashlyticsReport.d.AbstractC0117d.c) obj;
        Double d2 = this.a;
        if (d2 != null ? d2.equals(cVar.b()) : cVar.b() == null) {
            if (this.b == cVar.c() && this.c == cVar.g() && this.d == cVar.e() && this.e == cVar.f() && this.f == cVar.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c
    public long f() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.c
    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        Double d2 = this.a;
        int hashCode = ((((d2 == null ? 0 : d2.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003;
        int i = this.c ? 1231 : 1237;
        long j = this.e;
        long j2 = this.f;
        return ((((((hashCode ^ i) * 1000003) ^ this.d) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder V0 = je.V0("Device{batteryLevel=");
        V0.append(this.a);
        V0.append(", batteryVelocity=");
        V0.append(this.b);
        V0.append(", proximityOn=");
        V0.append(this.c);
        V0.append(", orientation=");
        V0.append(this.d);
        V0.append(", ramUsed=");
        V0.append(this.e);
        V0.append(", diskUsed=");
        return je.E0(V0, this.f, "}");
    }
}
