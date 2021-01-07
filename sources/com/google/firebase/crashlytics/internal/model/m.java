package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class m extends CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a {
        private Long a;
        private Long b;
        private String c;
        private String d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a a() {
            String str = this.a == null ? " baseAddress" : "";
            if (this.b == null) {
                str = je.x0(str, " size");
            }
            if (this.c == null) {
                str = je.x0(str, " name");
            }
            if (str.isEmpty()) {
                return new m(this.a.longValue(), this.b.longValue(), this.c, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a
        public CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a.AbstractC0120a e(String str) {
            this.d = str;
            return this;
        }
    }

    m(long j, long j2, String str, String str2, a aVar) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a
    public long b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a
    public String c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a
    public long d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a
    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a aVar = (CrashlyticsReport.d.AbstractC0117d.a.b.AbstractC0119a) obj;
        if (this.a == aVar.b() && this.b == aVar.d() && this.c.equals(aVar.c())) {
            String str = this.d;
            if (str == null) {
                if (aVar.e() == null) {
                    return true;
                }
            } else if (str.equals(aVar.e())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int hashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return (str == null ? 0 : str.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder V0 = je.V0("BinaryImage{baseAddress=");
        V0.append(this.a);
        V0.append(", size=");
        V0.append(this.b);
        V0.append(", name=");
        V0.append(this.c);
        V0.append(", uuid=");
        return je.I0(V0, this.d, "}");
    }
}
