package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class n extends CrashlyticsReport.d.AbstractC0117d.a.b.c {
    private final String a;
    private final String b;
    private final v<CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b> c;
    private final CrashlyticsReport.d.AbstractC0117d.a.b.c d;
    private final int e;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a {
        private String a;
        private String b;
        private v<CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b> c;
        private CrashlyticsReport.d.AbstractC0117d.a.b.c d;
        private Integer e;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a
        public CrashlyticsReport.d.AbstractC0117d.a.b.c a() {
            String str = this.a == null ? " type" : "";
            if (this.c == null) {
                str = je.x0(str, " frames");
            }
            if (this.e == null) {
                str = je.x0(str, " overflowCount");
            }
            if (str.isEmpty()) {
                return new n(this.a, this.b, this.c, this.d, this.e.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a
        public CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a b(CrashlyticsReport.d.AbstractC0117d.a.b.c cVar) {
            this.d = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a
        public CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a c(v<CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b> vVar) {
            if (vVar != null) {
                this.c = vVar;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a
        public CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a d(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a
        public CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a e(String str) {
            this.b = str;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a
        public CrashlyticsReport.d.AbstractC0117d.a.b.c.AbstractC0122a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    n(String str, String str2, v vVar, CrashlyticsReport.d.AbstractC0117d.a.b.c cVar, int i, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = vVar;
        this.d = cVar;
        this.e = i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c
    public CrashlyticsReport.d.AbstractC0117d.a.b.c b() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c
    public v<CrashlyticsReport.d.AbstractC0117d.a.b.e.AbstractC0126b> c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c
    public int d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        CrashlyticsReport.d.AbstractC0117d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.AbstractC0117d.a.b.c)) {
            return false;
        }
        CrashlyticsReport.d.AbstractC0117d.a.b.c cVar2 = (CrashlyticsReport.d.AbstractC0117d.a.b.c) obj;
        if (!this.a.equals(cVar2.f()) || ((str = this.b) != null ? !str.equals(cVar2.e()) : cVar2.e() != null) || !this.c.equals(cVar2.c()) || ((cVar = this.d) != null ? !cVar.equals(cVar2.b()) : cVar2.b() != null) || this.e != cVar2.d()) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.AbstractC0117d.a.b.c
    public String f() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        CrashlyticsReport.d.AbstractC0117d.a.b.c cVar = this.d;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.e;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Exception{type=");
        V0.append(this.a);
        V0.append(", reason=");
        V0.append(this.b);
        V0.append(", frames=");
        V0.append(this.c);
        V0.append(", causedBy=");
        V0.append(this.d);
        V0.append(", overflowCount=");
        return je.B0(V0, this.e, "}");
    }
}
