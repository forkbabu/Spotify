package com.spotify.libs.search.history;

/* access modifiers changed from: package-private */
public final class d extends g {
    private final Integer a;
    private final Integer b;

    d(Integer num, Integer num2) {
        if (num != null) {
            this.a = num;
            if (num2 != null) {
                this.b = num2;
                return;
            }
            throw new NullPointerException("Null end");
        }
        throw new NullPointerException("Null start");
    }

    @Override // com.spotify.libs.search.history.g
    public Integer a() {
        return this.b;
    }

    @Override // com.spotify.libs.search.history.g
    public Integer b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!this.a.equals(gVar.b()) || !this.b.equals(gVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("IndexRange{start=");
        V0.append(this.a);
        V0.append(", end=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
