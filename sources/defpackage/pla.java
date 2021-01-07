package defpackage;

import defpackage.sla;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: pla  reason: default package */
public final class pla extends sla {
    private final String a;
    private final String b;
    private final String c;
    private final List<String> d;
    private final String e;
    private final long f;
    private final long g;
    private final long h;

    /* access modifiers changed from: package-private */
    /* renamed from: pla$b */
    public static final class b implements sla.a {
        private String a;
        private String b;
        private String c;
        private List<String> d;
        private String e;
        private Long f;
        private Long g;
        private Long h;

        b() {
        }

        @Override // defpackage.sla.a
        public sla.a a(long j) {
            this.g = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.sla.a
        public sla.a b(long j) {
            this.h = Long.valueOf(j);
            return this;
        }

        @Override // defpackage.sla.a
        public sla build() {
            String str = this.a == null ? " bannerSessionId" : "";
            if (this.b == null) {
                str = je.x0(str, " reasonType");
            }
            if (this.c == null) {
                str = je.x0(str, " sessionType");
            }
            if (this.d == null) {
                str = je.x0(str, " shownApps");
            }
            if (this.e == null) {
                str = je.x0(str, " connectedApp");
            }
            if (this.f == null) {
                str = je.x0(str, " bannerSessionStartMillis");
            }
            if (this.g == null) {
                str = je.x0(str, " bannerSessionResumedMillis");
            }
            if (this.h == null) {
                str = je.x0(str, " bannerSessionLength");
            }
            if (str.isEmpty()) {
                return new pla(this.a, this.b, this.c, this.d, this.e, this.f.longValue(), this.g.longValue(), this.h.longValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.sla.a
        public sla.a c(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        public sla.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null bannerSessionId");
        }

        public sla.a e(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null connectedApp");
        }

        public sla.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null reasonType");
        }

        public sla.a g(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null sessionType");
        }

        public sla.a h(List<String> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null shownApps");
        }

        b(sla sla, a aVar) {
            this.a = sla.a();
            this.b = sla.g();
            this.c = sla.h();
            this.d = sla.i();
            this.e = sla.e();
            this.f = Long.valueOf(sla.d());
            this.g = Long.valueOf(sla.c());
            this.h = Long.valueOf(sla.b());
        }
    }

    pla(String str, String str2, String str3, List list, String str4, long j, long j2, long j3, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        this.f = j;
        this.g = j2;
        this.h = j3;
    }

    @Override // defpackage.sla
    public String a() {
        return this.a;
    }

    @Override // defpackage.sla
    public long b() {
        return this.h;
    }

    @Override // defpackage.sla
    public long c() {
        return this.g;
    }

    @Override // defpackage.sla
    public long d() {
        return this.f;
    }

    @Override // defpackage.sla
    public String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sla)) {
            return false;
        }
        sla sla = (sla) obj;
        if (!this.a.equals(sla.a()) || !this.b.equals(sla.g()) || !this.c.equals(sla.h()) || !this.d.equals(sla.i()) || !this.e.equals(sla.e()) || this.f != sla.d() || this.g != sla.c() || this.h != sla.b()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.sla
    public String g() {
        return this.b;
    }

    @Override // defpackage.sla
    public String h() {
        return this.c;
    }

    public int hashCode() {
        long j = this.f;
        long j2 = this.g;
        long j3 = this.h;
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    @Override // defpackage.sla
    public List<String> i() {
        return this.d;
    }

    @Override // defpackage.sla
    public sla.a j() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("PartnerBannerSession{bannerSessionId=");
        V0.append(this.a);
        V0.append(", reasonType=");
        V0.append(this.b);
        V0.append(", sessionType=");
        V0.append(this.c);
        V0.append(", shownApps=");
        V0.append(this.d);
        V0.append(", connectedApp=");
        V0.append(this.e);
        V0.append(", bannerSessionStartMillis=");
        V0.append(this.f);
        V0.append(", bannerSessionResumedMillis=");
        V0.append(this.g);
        V0.append(", bannerSessionLength=");
        return je.E0(V0, this.h, "}");
    }
}
