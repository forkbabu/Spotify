package defpackage;

/* renamed from: v10  reason: default package */
final class v10 extends z10 {
    private final String a;
    private final String b;

    v10(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // defpackage.z10
    public String a() {
        return this.a;
    }

    @Override // defpackage.z10
    public String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z10)) {
            return false;
        }
        z10 z10 = (z10) obj;
        if (!this.a.equals(z10.a()) || !this.b.equals(z10.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("LibraryVersion{libraryName=");
        V0.append(this.a);
        V0.append(", version=");
        return je.I0(V0, this.b, "}");
    }
}
