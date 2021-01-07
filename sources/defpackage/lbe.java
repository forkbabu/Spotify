package defpackage;

import defpackage.fee;

/* renamed from: lbe  reason: default package */
abstract class lbe extends fee {
    private final boolean b;
    private final boolean c;
    private final boolean f;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final String r;

    /* access modifiers changed from: package-private */
    /* renamed from: lbe$a */
    public static class a implements fee.b {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private String h;

        a() {
        }

        public fee a() {
            String str = this.a == null ? " canAcceptLicensesInOneStep" : "";
            if (this.b == null) {
                str = je.x0(str, " canSignupWithAllGenders");
            }
            if (this.c == null) {
                str = je.x0(str, " canImplicitlyAcceptTermsAndCondition");
            }
            if (this.d == null) {
                str = je.x0(str, " requiresMarketingOptIn");
            }
            if (this.e == null) {
                str = je.x0(str, " requiresMarketingOptInText");
            }
            if (this.f == null) {
                str = je.x0(str, " requiresSpecificLicenses");
            }
            if (this.g == null) {
                str = je.x0(str, " requiresPersonalInformationCollection");
            }
            if (this.h == null) {
                str = je.x0(str, " country");
            }
            if (str.isEmpty()) {
                return new dee(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public fee.b b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public fee.b c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public fee.b d(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public fee.b e(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null country");
        }

        public fee.b f(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public fee.b g(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public fee.b h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public fee.b i(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }
    }

    lbe(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str) {
        this.b = z;
        this.c = z2;
        this.f = z3;
        this.n = z4;
        this.o = z5;
        this.p = z6;
        this.q = z7;
        if (str != null) {
            this.r = str;
            return;
        }
        throw new NullPointerException("Null country");
    }

    @Override // defpackage.fee
    public boolean b() {
        return this.b;
    }

    @Override // defpackage.fee
    public boolean c() {
        return this.f;
    }

    @Override // defpackage.fee
    public boolean e() {
        return this.c;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fee)) {
            return false;
        }
        fee fee = (fee) obj;
        if (this.b == fee.b() && this.c == fee.e() && this.f == fee.c() && this.n == fee.i() && this.o == fee.j() && this.p == fee.l() && this.q == fee.k() && this.r.equals(fee.f())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fee
    public String f() {
        return this.r;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003;
        if (!this.q) {
            i = 1237;
        }
        return ((i2 ^ i) * 1000003) ^ this.r.hashCode();
    }

    @Override // defpackage.fee
    public boolean i() {
        return this.n;
    }

    @Override // defpackage.fee
    public boolean j() {
        return this.o;
    }

    @Override // defpackage.fee
    public boolean k() {
        return this.q;
    }

    @Override // defpackage.fee
    public boolean l() {
        return this.p;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SignupConfiguration{canAcceptLicensesInOneStep=");
        V0.append(this.b);
        V0.append(", canSignupWithAllGenders=");
        V0.append(this.c);
        V0.append(", canImplicitlyAcceptTermsAndCondition=");
        V0.append(this.f);
        V0.append(", requiresMarketingOptIn=");
        V0.append(this.n);
        V0.append(", requiresMarketingOptInText=");
        V0.append(this.o);
        V0.append(", requiresSpecificLicenses=");
        V0.append(this.p);
        V0.append(", requiresPersonalInformationCollection=");
        V0.append(this.q);
        V0.append(", country=");
        return je.I0(V0, this.r, "}");
    }
}
