package defpackage;

/* renamed from: u1e  reason: default package */
final class u1e extends b2e {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    u1e(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        return;
                    }
                    throw new NullPointerException("Null authServerUrl");
                }
                throw new NullPointerException("Null apiServerUrl");
            }
            throw new NullPointerException("Null authcode");
        }
        throw new NullPointerException("Null idToken");
    }

    @Override // defpackage.b2e
    public String a() {
        return this.c;
    }

    @Override // defpackage.b2e
    public String b() {
        return this.d;
    }

    @Override // defpackage.b2e
    public String c() {
        return this.b;
    }

    @Override // defpackage.b2e
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2e)) {
            return false;
        }
        b2e b2e = (b2e) obj;
        if (!this.a.equals(b2e.d()) || !this.b.equals(b2e.c()) || !this.c.equals(b2e.a()) || !this.d.equals(b2e.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SamsungTokenResponse{idToken=");
        V0.append(this.a);
        V0.append(", authcode=");
        V0.append(this.b);
        V0.append(", apiServerUrl=");
        V0.append(this.c);
        V0.append(", authServerUrl=");
        return je.I0(V0, this.d, "}");
    }
}
