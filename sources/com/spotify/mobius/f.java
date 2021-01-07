package com.spotify.mobius;

import java.util.Set;

/* access modifiers changed from: package-private */
public final class f<M, F> extends e0<M, F> {
    private final M a;
    private final Set<F> b;

    f(M m, Set<F> set) {
        this.a = m;
        if (set != null) {
            this.b = set;
            return;
        }
        throw new NullPointerException("Null effects");
    }

    @Override // com.spotify.mobius.e0
    public Set<F> b() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    @Override // com.spotify.mobius.e0
    public M d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        M m = this.a;
        if (m != null ? m.equals(e0Var.d()) : e0Var.d() == null) {
            if (this.b.equals(e0Var.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        M m = this.a;
        return (((m == null ? 0 : m.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Next{model=");
        V0.append((Object) this.a);
        V0.append(", effects=");
        V0.append(this.b);
        V0.append("}");
        return V0.toString();
    }
}
