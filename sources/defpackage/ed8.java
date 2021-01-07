package defpackage;

/* renamed from: ed8  reason: default package */
abstract class ed8 extends td8 {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    ed8(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // defpackage.td8
    public boolean a() {
        return this.b;
    }

    @Override // defpackage.td8
    public boolean b() {
        return this.c;
    }

    @Override // defpackage.td8
    public boolean c() {
        return this.a;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof td8)) {
            return false;
        }
        td8 td8 = (td8) obj;
        if (this.a == td8.c() && this.b == td8.a() && this.c == td8.b()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SearchBaseFragmentParams{nft=");
        V0.append(this.a);
        V0.append(", assistedCuration=");
        V0.append(this.b);
        V0.append(", connected=");
        return je.P0(V0, this.c, "}");
    }
}
