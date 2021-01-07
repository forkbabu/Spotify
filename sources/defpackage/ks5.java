package defpackage;

/* renamed from: ks5  reason: default package */
abstract class ks5 extends os5 {
    private final String a;

    ks5(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof os5) {
            return this.a.equals(((os5) obj).getName());
        }
        return false;
    }

    @Override // defpackage.os5
    public String getName() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.I0(je.V0("CategoryViewModel{name="), this.a, "}");
    }
}
