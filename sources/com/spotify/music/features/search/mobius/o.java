package com.spotify.music.features.search.mobius;

import com.google.common.base.Optional;

final class o extends w0 {
    private final b91 a;
    private final Optional<String> b;
    private final boolean c;

    o(b91 b91, Optional<String> optional, boolean z) {
        if (b91 != null) {
            this.a = b91;
            this.b = optional;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null hubsViewModel");
    }

    @Override // com.spotify.music.features.search.mobius.w0
    public b91 a() {
        return this.a;
    }

    @Override // com.spotify.music.features.search.mobius.w0
    public boolean b() {
        return this.c;
    }

    @Override // com.spotify.music.features.search.mobius.w0
    public Optional<String> c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        if (!this.a.equals(w0Var.a()) || !this.b.equals(w0Var.c()) || this.c != w0Var.b()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("SearchViewModel{hubsViewModel=");
        V0.append(this.a);
        V0.append(", requestId=");
        V0.append(this.b);
        V0.append(", isHistory=");
        return je.P0(V0, this.c, "}");
    }
}
