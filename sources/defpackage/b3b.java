package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: b3b  reason: default package */
public final class b3b extends d5b {
    private final String a;
    private final boolean b;

    b3b(String str, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null catalogue");
    }

    @Override // defpackage.d5b
    public boolean a() {
        return this.b;
    }

    @Override // defpackage.d5b
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d5b)) {
            return false;
        }
        d5b d5b = (d5b) obj;
        if (!this.a.equals(d5b.b()) || this.b != d5b.a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchSessionState{catalogue=");
        V0.append(this.a);
        V0.append(", canPlayAgeRestrictedContent=");
        return je.P0(V0, this.b, "}");
    }
}
