package defpackage;

/* renamed from: f02  reason: default package */
final class f02 extends j02 {
    private final String a;
    private final String b;
    private final String c;

    f02(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null value");
            }
            throw new NullPointerException("Null fieldName");
        }
        throw new NullPointerException("Null locale");
    }

    @Override // defpackage.j02
    public String a() {
        return this.b;
    }

    @Override // defpackage.j02
    public String b() {
        return this.a;
    }

    @Override // defpackage.j02
    public String c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j02)) {
            return false;
        }
        j02 j02 = (j02) obj;
        if (!this.a.equals(j02.b()) || !this.b.equals(j02.a()) || !this.c.equals(j02.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Field{locale=");
        V0.append(this.a);
        V0.append(", fieldName=");
        V0.append(this.b);
        V0.append(", value=");
        return je.I0(V0, this.c, "}");
    }
}
