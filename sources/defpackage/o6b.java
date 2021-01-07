package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: o6b  reason: default package */
public final class o6b extends p6b {
    private final String a;
    private final boolean b;

    o6b(String str, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null query");
    }

    @Override // defpackage.p6b
    public boolean b() {
        return this.b;
    }

    @Override // defpackage.p6b
    public String c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p6b)) {
            return false;
        }
        p6b p6b = (p6b) obj;
        if (!this.a.equals(p6b.c()) || this.b != p6b.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("FilterData{query=");
        V0.append(this.a);
        V0.append(", isOnline=");
        return je.P0(V0, this.b, "}");
    }
}
