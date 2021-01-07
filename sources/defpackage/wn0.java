package defpackage;

/* renamed from: wn0  reason: default package */
abstract class wn0 extends yn0 {
    private final ifd a;

    wn0(ifd ifd) {
        if (ifd != null) {
            this.a = ifd;
            return;
        }
        throw new NullPointerException("Null featureIdentifier");
    }

    @Override // defpackage.yn0
    public ifd b() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yn0) {
            return this.a.equals(((yn0) obj).b());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("InternalReferrer{featureIdentifier=");
        V0.append(this.a);
        V0.append("}");
        return V0.toString();
    }
}
