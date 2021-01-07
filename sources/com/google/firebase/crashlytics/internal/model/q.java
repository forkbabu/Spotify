package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class q extends CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b {
    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a {
        private Long a;
        private String b;
        private String c;
        private Long d;
        private Integer e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a
        public CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b a() {
            String str = this.a == null ? " pc" : "";
            if (this.b == null) {
                str = je.x0(str, " symbol");
            }
            if (this.d == null) {
                str = je.x0(str, " offset");
            }
            if (this.e == null) {
                str = je.x0(str, " importance");
            }
            if (str.isEmpty()) {
                return new q(this.a.longValue(), this.b, this.c, this.d.longValue(), this.e.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a
        public CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a
        public CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a c(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a
        public CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a d(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a
        public CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a e(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a
        public CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b.AbstractC0127a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    q(long j, String str, String str2, long j2, int i, a aVar) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b
    public int c() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b
    public long d() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b
    public long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b bVar = (CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b) obj;
        if (this.a == bVar.e() && this.b.equals(bVar.f()) && ((str = this.c) != null ? str.equals(bVar.b()) : bVar.b() == null) && this.d == bVar.d() && this.e == bVar.c()) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b
    public String f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.a;
        int hashCode = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j2 = this.d;
        return this.e ^ ((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Frame{pc=");
        V0.append(this.a);
        V0.append(", symbol=");
        V0.append(this.b);
        V0.append(", file=");
        V0.append(this.c);
        V0.append(", offset=");
        V0.append(this.d);
        V0.append(", importance=");
        return je.B0(V0, this.e, "}");
    }
}
