package defpackage;

/* renamed from: ls5  reason: default package */
abstract class ls5 extends qs5 {
    private final String a;
    private final String b;

    ls5(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null title");
    }

    @Override // defpackage.qs5
    public String b() {
        return this.b;
    }

    @Override // defpackage.qs5
    public String c() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qs5)) {
            return false;
        }
        qs5 qs5 = (qs5) obj;
        if (!this.a.equals(qs5.c()) || !this.b.equals(qs5.b())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("DescriptionViewModel{title=");
        V0.append(this.a);
        V0.append(", description=");
        return je.I0(V0, this.b, "}");
    }
}
