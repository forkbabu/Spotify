package defpackage;

/* renamed from: fd8  reason: default package */
abstract class fd8 extends ud8 {
    private final td8 a;
    private final String b;

    fd8(td8 td8, String str) {
        if (td8 != null) {
            this.a = td8;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null uri");
        }
        throw new NullPointerException("Null baseParams");
    }

    @Override // defpackage.ud8
    public td8 a() {
        return this.a;
    }

    @Override // defpackage.ud8
    public String b() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ud8)) {
            return false;
        }
        ud8 ud8 = (ud8) obj;
        if (!this.a.equals(ud8.a()) || !this.b.equals(ud8.b())) {
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
        StringBuilder V0 = je.V0("SearchDrilldownFragmentParams{baseParams=");
        V0.append(this.a);
        V0.append(", uri=");
        return je.I0(V0, this.b, "}");
    }
}
