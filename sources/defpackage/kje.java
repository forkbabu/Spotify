package defpackage;

import defpackage.sje;

/* access modifiers changed from: package-private */
/* renamed from: kje  reason: default package */
public abstract class kje extends sje {
    private final tje b;
    private final boolean c;
    private final boolean f;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;

    /* access modifiers changed from: package-private */
    /* renamed from: kje$b */
    public static class b implements sje.a {
        private tje a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;

        b() {
        }

        public sje a() {
            String str = this.a == null ? " nameState" : "";
            if (this.b == null) {
                str = je.x0(str, " isLoading");
            }
            if (this.c == null) {
                str = je.x0(str, " requiresMarketingOptInText");
            }
            if (this.d == null) {
                str = je.x0(str, " requiresKoreaTerms");
            }
            if (this.e == null) {
                str = je.x0(str, " requiresPersonalInformationCollection");
            }
            if (this.f == null) {
                str = je.x0(str, " isKoreaTermsAccepted");
            }
            if (this.g == null) {
                str = je.x0(str, " isThirdPartyDataProvisionTermAccepted");
            }
            if (this.h == null) {
                str = je.x0(str, " isCollectPersonalInformationTermAccepted");
            }
            if (str.isEmpty()) {
                return new pje(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public sje.a b(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public sje.a c(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public sje.a d(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public sje.a e(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public sje.a f(tje tje) {
            if (tje != null) {
                this.a = tje;
                return this;
            }
            throw new NullPointerException("Null nameState");
        }

        public sje.a g(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public sje.a h(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public sje.a i(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        b(sje sje, a aVar) {
            this.a = sje.g();
            this.b = Boolean.valueOf(sje.c());
            this.c = Boolean.valueOf(sje.i());
            this.d = Boolean.valueOf(sje.h());
            this.e = Boolean.valueOf(sje.j());
            this.f = Boolean.valueOf(sje.b());
            this.g = Boolean.valueOf(sje.e());
            this.h = Boolean.valueOf(sje.a());
        }
    }

    kje(tje tje, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (tje != null) {
            this.b = tje;
            this.c = z;
            this.f = z2;
            this.n = z3;
            this.o = z4;
            this.p = z5;
            this.q = z6;
            this.r = z7;
            return;
        }
        throw new NullPointerException("Null nameState");
    }

    @Override // defpackage.sje
    public boolean a() {
        return this.r;
    }

    @Override // defpackage.sje
    public boolean b() {
        return this.p;
    }

    @Override // defpackage.sje
    public boolean c() {
        return this.c;
    }

    @Override // defpackage.sje
    public boolean e() {
        return this.q;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sje)) {
            return false;
        }
        sje sje = (sje) obj;
        if (this.b.equals(sje.g()) && this.c == sje.c() && this.f == sje.i() && this.n == sje.h() && this.o == sje.j() && this.p == sje.b() && this.q == sje.e() && this.r == sje.a()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.sje
    public tje g() {
        return this.b;
    }

    @Override // defpackage.sje
    public boolean h() {
        return this.n;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003) ^ (this.q ? 1231 : 1237)) * 1000003;
        if (!this.r) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // defpackage.sje
    public boolean i() {
        return this.f;
    }

    @Override // defpackage.sje
    public boolean j() {
        return this.o;
    }

    @Override // defpackage.sje
    public sje.a k() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("NameModel{nameState=");
        V0.append(this.b);
        V0.append(", isLoading=");
        V0.append(this.c);
        V0.append(", requiresMarketingOptInText=");
        V0.append(this.f);
        V0.append(", requiresKoreaTerms=");
        V0.append(this.n);
        V0.append(", requiresPersonalInformationCollection=");
        V0.append(this.o);
        V0.append(", isKoreaTermsAccepted=");
        V0.append(this.p);
        V0.append(", isThirdPartyDataProvisionTermAccepted=");
        V0.append(this.q);
        V0.append(", isCollectPersonalInformationTermAccepted=");
        return je.P0(V0, this.r, "}");
    }
}
