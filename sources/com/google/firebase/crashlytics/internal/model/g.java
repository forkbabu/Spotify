package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class g extends CrashlyticsReport.d.a {
    private final String a;
    private final String b;
    private final String c;
    private final CrashlyticsReport.d.a.b d = null;
    private final String e;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.a.AbstractC0116a {
        private String a;
        private String b;
        private String c;
        private String d;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a.AbstractC0116a
        public CrashlyticsReport.d.a a() {
            String str = this.a == null ? " identifier" : "";
            if (this.b == null) {
                str = je.x0(str, " version");
            }
            if (str.isEmpty()) {
                return new g(this.a, this.b, this.c, null, this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a.AbstractC0116a
        public CrashlyticsReport.d.a.AbstractC0116a b(String str) {
            this.c = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a.AbstractC0116a
        public CrashlyticsReport.d.a.AbstractC0116a c(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a.AbstractC0116a
        public CrashlyticsReport.d.a.AbstractC0116a d(String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a.AbstractC0116a
        public CrashlyticsReport.d.a.AbstractC0116a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    g(String str, String str2, String str3, CrashlyticsReport.d.a.b bVar, String str4, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = str4;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
    public String b() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
    public String c() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
    public String d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
    public CrashlyticsReport.d.a.b e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.d.a.b bVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.a)) {
            return false;
        }
        CrashlyticsReport.d.a aVar = (CrashlyticsReport.d.a) obj;
        if (this.a.equals(aVar.c()) && this.b.equals(aVar.f()) && ((str = this.c) != null ? str.equals(aVar.b()) : aVar.b() == null) && ((bVar = this.d) != null ? bVar.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.e;
            if (str2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.a
    public String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        CrashlyticsReport.d.a.b bVar = this.d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Application{identifier=");
        V0.append(this.a);
        V0.append(", version=");
        V0.append(this.b);
        V0.append(", displayVersion=");
        V0.append(this.c);
        V0.append(", organization=");
        V0.append(this.d);
        V0.append(", installationUuid=");
        return je.I0(V0, this.e, "}");
    }
}
