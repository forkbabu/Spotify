package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;

final class f extends CrashlyticsReport.d {
    private final String a;
    private final String b;
    private final long c;
    private final Long d;
    private final boolean e;
    private final CrashlyticsReport.d.a f;
    private final CrashlyticsReport.d.f g;
    private final CrashlyticsReport.d.e h;
    private final CrashlyticsReport.d.c i;
    private final v<CrashlyticsReport.d.AbstractC0117d> j;
    private final int k;

    /* access modifiers changed from: package-private */
    public static final class b extends CrashlyticsReport.d.b {
        private String a;
        private String b;
        private Long c;
        private Long d;
        private Boolean e;
        private CrashlyticsReport.d.a f;
        private CrashlyticsReport.d.f g;
        private CrashlyticsReport.d.e h;
        private CrashlyticsReport.d.c i;
        private v<CrashlyticsReport.d.AbstractC0117d> j;
        private Integer k;

        b() {
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d a() {
            String str = this.a == null ? " generator" : "";
            if (this.b == null) {
                str = je.x0(str, " identifier");
            }
            if (this.c == null) {
                str = je.x0(str, " startedAt");
            }
            if (this.e == null) {
                str = je.x0(str, " crashed");
            }
            if (this.f == null) {
                str = je.x0(str, " app");
            }
            if (this.k == null) {
                str = je.x0(str, " generatorType");
            }
            if (str.isEmpty()) {
                return new f(this.a, this.b, this.c.longValue(), this.d, this.e.booleanValue(), this.f, this.g, this.h, this.i, this.j, this.k.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b b(CrashlyticsReport.d.a aVar) {
            this.f = aVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b c(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b d(CrashlyticsReport.d.c cVar) {
            this.i = cVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b e(Long l) {
            this.d = l;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b f(v<CrashlyticsReport.d.AbstractC0117d> vVar) {
            this.j = vVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b g(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b h(int i2) {
            this.k = Integer.valueOf(i2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b i(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b k(CrashlyticsReport.d.e eVar) {
            this.h = eVar;
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b l(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d.b
        public CrashlyticsReport.d.b m(CrashlyticsReport.d.f fVar) {
            this.g = fVar;
            return this;
        }

        b(CrashlyticsReport.d dVar, a aVar) {
            this.a = dVar.f();
            this.b = dVar.h();
            this.c = Long.valueOf(dVar.j());
            this.d = dVar.d();
            this.e = Boolean.valueOf(dVar.l());
            this.f = dVar.b();
            this.g = dVar.k();
            this.h = dVar.i();
            this.i = dVar.c();
            this.j = dVar.e();
            this.k = Integer.valueOf(dVar.g());
        }
    }

    f(String str, String str2, long j2, Long l, boolean z, CrashlyticsReport.d.a aVar, CrashlyticsReport.d.f fVar, CrashlyticsReport.d.e eVar, CrashlyticsReport.d.c cVar, v vVar, int i2, a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = j2;
        this.d = l;
        this.e = z;
        this.f = aVar;
        this.g = fVar;
        this.h = eVar;
        this.i = cVar;
        this.j = vVar;
        this.k = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public CrashlyticsReport.d.a b() {
        return this.f;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public CrashlyticsReport.d.c c() {
        return this.i;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public Long d() {
        return this.d;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public v<CrashlyticsReport.d.AbstractC0117d> e() {
        return this.j;
    }

    public boolean equals(Object obj) {
        Long l;
        CrashlyticsReport.d.f fVar;
        CrashlyticsReport.d.e eVar;
        CrashlyticsReport.d.c cVar;
        v<CrashlyticsReport.d.AbstractC0117d> vVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CrashlyticsReport.d)) {
            return false;
        }
        CrashlyticsReport.d dVar = (CrashlyticsReport.d) obj;
        if (!this.a.equals(dVar.f()) || !this.b.equals(dVar.h()) || this.c != dVar.j() || ((l = this.d) != null ? !l.equals(dVar.d()) : dVar.d() != null) || this.e != dVar.l() || !this.f.equals(dVar.b()) || ((fVar = this.g) != null ? !fVar.equals(dVar.k()) : dVar.k() != null) || ((eVar = this.h) != null ? !eVar.equals(dVar.i()) : dVar.i() != null) || ((cVar = this.i) != null ? !cVar.equals(dVar.c()) : dVar.c() != null) || ((vVar = this.j) != null ? !vVar.equals(dVar.e()) : dVar.e() != null) || this.k != dVar.g()) {
            return false;
        }
        return true;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public String f() {
        return this.a;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public int g() {
        return this.k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public String h() {
        return this.b;
    }

    public int hashCode() {
        long j2 = this.c;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        Long l = this.d;
        int i2 = 0;
        int hashCode2 = (((((hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003;
        CrashlyticsReport.d.f fVar = this.g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        CrashlyticsReport.d.e eVar = this.h;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        CrashlyticsReport.d.c cVar = this.i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        v<CrashlyticsReport.d.AbstractC0117d> vVar = this.j;
        if (vVar != null) {
            i2 = vVar.hashCode();
        }
        return ((hashCode5 ^ i2) * 1000003) ^ this.k;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public CrashlyticsReport.d.e i() {
        return this.h;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public long j() {
        return this.c;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public CrashlyticsReport.d.f k() {
        return this.g;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public boolean l() {
        return this.e;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.d
    public CrashlyticsReport.d.b m() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Session{generator=");
        V0.append(this.a);
        V0.append(", identifier=");
        V0.append(this.b);
        V0.append(", startedAt=");
        V0.append(this.c);
        V0.append(", endedAt=");
        V0.append(this.d);
        V0.append(", crashed=");
        V0.append(this.e);
        V0.append(", app=");
        V0.append(this.f);
        V0.append(", user=");
        V0.append(this.g);
        V0.append(", os=");
        V0.append(this.h);
        V0.append(", device=");
        V0.append(this.i);
        V0.append(", events=");
        V0.append(this.j);
        V0.append(", generatorType=");
        return je.B0(V0, this.k, "}");
    }
}
