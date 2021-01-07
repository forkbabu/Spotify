package defpackage;

/* renamed from: ts9  reason: default package */
final class ts9 extends vs9 {
    private final String a;
    private final String b;
    private final String c;

    ts9(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null displayName");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null clientId");
    }

    @Override // defpackage.vs9
    public String a() {
        return this.a;
    }

    @Override // defpackage.vs9
    public String b() {
        return this.c;
    }

    @Override // defpackage.vs9
    public String c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vs9)) {
            return false;
        }
        vs9 vs9 = (vs9) obj;
        if (!this.a.equals(vs9.a()) || !this.b.equals(vs9.c()) || !this.c.equals(vs9.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Platform{clientId=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", displayName=");
        return je.I0(V0, this.c, "}");
    }
}
