package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: km9  reason: default package */
public final class km9 extends mm9 {
    private final String a;
    private final String b;

    km9(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    @Override // defpackage.mm9
    public String c() {
        return this.b;
    }

    @Override // defpackage.mm9
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mm9)) {
            return false;
        }
        mm9 mm9 = (mm9) obj;
        if (!this.a.equals(mm9.d()) || !this.b.equals(mm9.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("RecommendationItem{uri=");
        V0.append(this.a);
        V0.append(", name=");
        return je.I0(V0, this.b, "}");
    }
}
