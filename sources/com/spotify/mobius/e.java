package com.spotify.mobius;

import java.util.Set;

/* access modifiers changed from: package-private */
public final class e<M, F> extends s<M, F> {
    private final M a;
    private final Set<F> b;

    e(M m, Set<F> set) {
        if (m != null) {
            this.a = m;
            if (set != null) {
                this.b = set;
                return;
            }
            throw new NullPointerException("Null effects");
        }
        throw new NullPointerException("Null model");
    }

    @Override // com.spotify.mobius.s
    public Set<F> a() {
        return this.b;
    }

    @Override // com.spotify.mobius.s
    public M d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (!this.a.equals(sVar.d()) || !this.b.equals(sVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("First{model=");
        V0.append((Object) this.a);
        V0.append(", effects=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
