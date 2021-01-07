package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: le5  reason: default package */
public final class le5 extends ne5 {
    private final String a;
    private final String b;
    private final String c;

    le5(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null brand");
            }
            throw new NullPointerException("Null model");
        }
        throw new NullPointerException("Null clientId");
    }

    @Override // defpackage.ne5
    public String a() {
        return this.c;
    }

    @Override // defpackage.ne5
    public String b() {
        return this.a;
    }

    @Override // defpackage.ne5
    public String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ne5)) {
            return false;
        }
        ne5 ne5 = (ne5) obj;
        if (!this.a.equals(ne5.b()) || !this.b.equals(ne5.d()) || !this.c.equals(ne5.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayGoCommand{clientId=");
        V0.append(this.a);
        V0.append(", model=");
        V0.append(this.b);
        V0.append(", brand=");
        return je.I0(V0, this.c, "}");
    }
}
