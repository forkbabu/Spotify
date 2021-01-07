package com.spotify.intentrouter;

/* access modifiers changed from: package-private */
public final class f<T> extends k<T> {
    private final m<T> a;
    private final h<T> b;

    f(m<T> mVar, h<T> hVar) {
        if (mVar != null) {
            this.a = mVar;
            if (hVar != null) {
                this.b = hVar;
                return;
            }
            throw new NullPointerException("Null factory");
        }
        throw new NullPointerException("Null matcher");
    }

    @Override // com.spotify.intentrouter.k
    public h<T> a() {
        return this.b;
    }

    @Override // com.spotify.intentrouter.k
    public m<T> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!this.a.equals(kVar.b()) || !this.b.equals(kVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("CommandRoute{matcher=");
        V0.append(this.a);
        V0.append(", factory=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
