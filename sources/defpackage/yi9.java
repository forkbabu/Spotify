package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: yi9  reason: default package */
public final class yi9 extends fj9 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    yi9(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            return;
        }
        throw new NullPointerException("Null pageIdentifier");
    }

    @Override // defpackage.fj9
    public String a() {
        return this.d;
    }

    @Override // defpackage.fj9
    public String c() {
        return this.c;
    }

    @Override // defpackage.fj9
    public String d() {
        return this.a;
    }

    @Override // defpackage.fj9
    public String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fj9)) {
            return false;
        }
        fj9 fj9 = (fj9) obj;
        if (this.a.equals(fj9.d()) && ((str = this.b) != null ? str.equals(fj9.e()) : fj9.e() == null) && ((str2 = this.c) != null ? str2.equals(fj9.c()) : fj9.c() == null)) {
            String str3 = this.d;
            if (str3 == null) {
                if (fj9.a() == null) {
                    return true;
                }
            } else if (str3.equals(fj9.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PageView{pageIdentifier=");
        V0.append(this.a);
        V0.append(", pageUri=");
        V0.append(this.b);
        V0.append(", navigationalRoot=");
        V0.append(this.c);
        V0.append(", className=");
        return je.I0(V0, this.d, "}");
    }
}
