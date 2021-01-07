package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: w6b  reason: default package */
public final class w6b extends b7b {
    private final String a;
    private final c7b b;

    w6b(String str, c7b c7b) {
        if (str != null) {
            this.a = str;
            this.b = c7b;
            return;
        }
        throw new NullPointerException("Null query");
    }

    @Override // defpackage.b7b
    public String a() {
        return this.a;
    }

    @Override // defpackage.b7b
    public c7b b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b7b)) {
            return false;
        }
        b7b b7b = (b7b) obj;
        if (!this.a.equals(b7b.a()) || !this.b.equals(b7b.b())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchQuery{query=");
        V0.append(this.a);
        V0.append(", source=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
