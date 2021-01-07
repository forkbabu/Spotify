package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class i extends CrashlyticsReport.d.c {
    private final int a;
    private final String b;
    private final int c;
    private final long d;
    private final long e;
    private final boolean f;
    private final int g;
    private final String h;
    private final String i;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.c.a {
        private Integer a;
        private String b;
        private Integer c;
        private Long d;
        private Long e;
        private Boolean f;
        private Integer g;
        private String h;
        private String i;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c.a
        public CrashlyticsReport.d.c a() {
            String str = this.a == null ? " arch" : "";
            if (this.b == null) {
                str = je.x0(str, " model");
            }
            if (this.c == null) {
                str = je.x0(str, " cores");
            }
            if (this.d == null) {
                str = je.x0(str, " ram");
            }
            if (this.e == null) {
                str = je.x0(str, " diskSpace");
            }
            if (this.f == null) {
                str = je.x0(str, " simulator");
            }
            if (this.g == null) {
                str = je.x0(str, " state");
            }
            if (this.h == null) {
                str = je.x0(str, " manufacturer");
            }
            if (this.i == null) {
                str = je.x0(str, " modelClass");
            }
            if (str.isEmpty()) {
                return new i(this.a.intValue(), this.b, this.c.intValue(), this.d.longValue(), this.e.longValue(), this.f.booleanValue(), this.g.intValue(), this.h, this.i, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c.a
        public CrashlyticsReport.d.c.a b(int i2) {
            this.a = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c.a
        public CrashlyticsReport.d.c.a c(int i2) {
            this.c = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c.a
        public CrashlyticsReport.d.c.a d(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c.a
        public CrashlyticsReport.d.c.a e(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null manufacturer");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c.a
        public CrashlyticsReport.d.c.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null model");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c.a
        public CrashlyticsReport.d.c.a g(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null modelClass");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c.a
        public CrashlyticsReport.d.c.a h(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c.a
        public CrashlyticsReport.d.c.a i(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c.a
        public CrashlyticsReport.d.c.a j(int i2) {
            this.g = Integer.valueOf(i2);
            return this;
        }
    }

    i(int i2, String str, int i3, long j, long j2, boolean z, int i4, String str2, String str3, a aVar) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i4;
        this.h = str2;
        this.i = str3;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c
    public int b() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c
    public int c() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c
    public long d() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d.c)) {
            return false;
        }
        CrashlyticsReport.d.c cVar = (CrashlyticsReport.d.c) obj;
        if (this.a == cVar.b() && this.b.equals(cVar.f()) && this.c == cVar.c() && this.d == cVar.h() && this.e == cVar.d() && this.f == cVar.j() && this.g == cVar.i() && this.h.equals(cVar.e()) && this.i.equals(cVar.g())) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c
    public String f() {
        return this.b;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c
    public String g() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c
    public long h() {
        return this.d;
    }

    public int hashCode() {
        long j = this.d;
        long j2 = this.e;
        return ((((((((((((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c
    public int i() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.c
    public boolean j() {
        return this.f;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Device{arch=");
        V0.append(this.a);
        V0.append(", model=");
        V0.append(this.b);
        V0.append(", cores=");
        V0.append(this.c);
        V0.append(", ram=");
        V0.append(this.d);
        V0.append(", diskSpace=");
        V0.append(this.e);
        V0.append(", simulator=");
        V0.append(this.f);
        V0.append(", state=");
        V0.append(this.g);
        V0.append(", manufacturer=");
        V0.append(this.h);
        V0.append(", modelClass=");
        return je.I0(V0, this.i, "}");
    }
}
