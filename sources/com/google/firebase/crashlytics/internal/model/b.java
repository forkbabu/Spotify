package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class b extends CrashlyticsReport {
    private final String b;
    private final String c;
    private final int d;
    private final String e;
    private final String f;
    private final String g;
    private final CrashlyticsReport.d h;
    private final CrashlyticsReport.c i;

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.firebase.crashlytics.internal.model.b$b  reason: collision with other inner class name */
    public static final class C0130b extends CrashlyticsReport.a {
        private String a;
        private String b;
        private Integer c;
        private String d;
        private String e;
        private String f;
        private CrashlyticsReport.d g;
        private CrashlyticsReport.c h;

        C0130b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
        public CrashlyticsReport a() {
            String str = this.a == null ? " sdkVersion" : "";
            if (this.b == null) {
                str = je.x0(str, " gmpAppId");
            }
            if (this.c == null) {
                str = je.x0(str, " platform");
            }
            if (this.d == null) {
                str = je.x0(str, " installationUuid");
            }
            if (this.e == null) {
                str = je.x0(str, " buildVersion");
            }
            if (this.f == null) {
                str = je.x0(str, " displayVersion");
            }
            if (str.isEmpty()) {
                return new b(this.a, this.b, this.c.intValue(), this.d, this.e, this.f, this.g, this.h, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
        public CrashlyticsReport.a b(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
        public CrashlyticsReport.a c(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
        public CrashlyticsReport.a d(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
        public CrashlyticsReport.a e(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
        public CrashlyticsReport.a f(CrashlyticsReport.c cVar) {
            this.h = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
        public CrashlyticsReport.a g(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
        public CrashlyticsReport.a h(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.a
        public CrashlyticsReport.a i(CrashlyticsReport.d dVar) {
            this.g = dVar;
            return this;
        }

        C0130b(CrashlyticsReport crashlyticsReport, a aVar) {
            this.a = crashlyticsReport.i();
            this.b = crashlyticsReport.e();
            this.c = Integer.valueOf(crashlyticsReport.h());
            this.d = crashlyticsReport.f();
            this.e = crashlyticsReport.c();
            this.f = crashlyticsReport.d();
            this.g = crashlyticsReport.j();
            this.h = crashlyticsReport.g();
        }
    }

    b(String str, String str2, int i2, String str3, String str4, String str5, CrashlyticsReport.d dVar, CrashlyticsReport.c cVar, a aVar) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = dVar;
        this.i = cVar;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String c() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String d() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        CrashlyticsReport.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport)) {
            return false;
        }
        CrashlyticsReport crashlyticsReport = (CrashlyticsReport) obj;
        if (this.b.equals(crashlyticsReport.i()) && this.c.equals(crashlyticsReport.e()) && this.d == crashlyticsReport.h() && this.e.equals(crashlyticsReport.f()) && this.f.equals(crashlyticsReport.c()) && this.g.equals(crashlyticsReport.d()) && ((dVar = this.h) != null ? dVar.equals(crashlyticsReport.j()) : crashlyticsReport.j() == null)) {
            CrashlyticsReport.c cVar = this.i;
            if (cVar == null) {
                if (crashlyticsReport.g() == null) {
                    return true;
                }
            } else if (cVar.equals(crashlyticsReport.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String f() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.c g() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public int h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003;
        CrashlyticsReport.d dVar = this.h;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        CrashlyticsReport.c cVar = this.i;
        if (cVar != null) {
            i2 = cVar.hashCode();
        }
        return hashCode2 ^ i2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public String i() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.d j() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport
    public CrashlyticsReport.a k() {
        return new C0130b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("CrashlyticsReport{sdkVersion=");
        V0.append(this.b);
        V0.append(", gmpAppId=");
        V0.append(this.c);
        V0.append(", platform=");
        V0.append(this.d);
        V0.append(", installationUuid=");
        V0.append(this.e);
        V0.append(", buildVersion=");
        V0.append(this.f);
        V0.append(", displayVersion=");
        V0.append(this.g);
        V0.append(", session=");
        V0.append(this.h);
        V0.append(", ndkPayload=");
        V0.append(this.i);
        V0.append("}");
        return V0.toString();
    }
}
