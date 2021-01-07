package com.spotify.termsandconditions.model;

/* access modifiers changed from: package-private */
public final class a extends b {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    a(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // com.spotify.termsandconditions.model.b
    public boolean a() {
        return this.b;
    }

    @Override // com.spotify.termsandconditions.model.b
    public boolean b() {
        return this.a;
    }

    @Override // com.spotify.termsandconditions.model.b
    public boolean d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.b() && this.b == bVar.a() && this.c == bVar.d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TermsAndConditionsModel{canImplicitlyAcceptTermsAndConditions=");
        V0.append(this.a);
        V0.append(", canImplicitlyAcceptPrivacyPolicy=");
        V0.append(this.b);
        V0.append(", shouldUseSpecificLicenses=");
        return je.P0(V0, this.c, "}");
    }
}
