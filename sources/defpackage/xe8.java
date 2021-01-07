package defpackage;

/* renamed from: xe8  reason: default package */
abstract class xe8 extends uf8 {
    private final dfa a;
    private final boolean b;

    xe8(dfa dfa, boolean z) {
        if (dfa != null) {
            this.a = dfa;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null cachePresenterState");
    }

    @Override // defpackage.uf8
    public dfa a() {
        return this.a;
    }

    @Override // defpackage.uf8
    public boolean b() {
        return this.b;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uf8)) {
            return false;
        }
        uf8 uf8 = (uf8) obj;
        if (!this.a.equals(uf8.a()) || this.b != uf8.b()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("SearchPresenterParcelable{cachePresenterState=");
        V0.append(this.a);
        V0.append(", isSearchFieldFocused=");
        return je.P0(V0, this.b, "}");
    }
}
