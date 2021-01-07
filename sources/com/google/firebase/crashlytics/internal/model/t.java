package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class t extends CrashlyticsReport.d.e {
    private final int a;
    private final String b;
    private final String c;
    private final boolean d;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.e.a {
        private Integer a;
        private String b;
        private String c;
        private Boolean d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.e.a
        public CrashlyticsReport.d.e a() {
            String str = this.a == null ? " platform" : "";
            if (this.b == null) {
                str = je.x0(str, " version");
            }
            if (this.c == null) {
                str = je.x0(str, " buildVersion");
            }
            if (this.d == null) {
                str = je.x0(str, " jailbroken");
            }
            if (str.isEmpty()) {
                return new t(this.a.intValue(), this.b, this.c, this.d.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.e.a
        public CrashlyticsReport.d.e.a b(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.e.a
        public CrashlyticsReport.d.e.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.e.a
        public CrashlyticsReport.d.e.a d(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.e.a
        public CrashlyticsReport.d.e.a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    t(int i, String str, String str2, boolean z, a aVar) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.e
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.e
    public int c() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.e
    public String d() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.e
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.e)) {
            return false;
        }
        CrashlyticsReport.d.e eVar = (CrashlyticsReport.d.e) obj;
        if (this.a != eVar.c() || !this.b.equals(eVar.d()) || !this.c.equals(eVar.b()) || this.d != eVar.e()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("OperatingSystem{platform=");
        V0.append(this.a);
        V0.append(", version=");
        V0.append(this.b);
        V0.append(", buildVersion=");
        V0.append(this.c);
        V0.append(", jailbroken=");
        return je.P0(V0, this.d, "}");
    }
}
