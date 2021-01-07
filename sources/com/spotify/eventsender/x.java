package com.spotify.eventsender;

import com.spotify.eventsender.k0;
import java.util.Set;

final class x extends k0 {
    private final Set<Integer> a;
    private final boolean b;

    /* access modifiers changed from: package-private */
    public static final class b extends k0.a {
        private Set<Integer> a;
        private Boolean b;

        b() {
        }

        @Override // com.spotify.eventsender.k0.a
        public k0 a() {
            String str = this.a == null ? " deletableIndices" : "";
            if (this.b == null) {
                str = je.x0(str, " shouldBackoff");
            }
            if (str.isEmpty()) {
                return new x(this.a, this.b.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.eventsender.k0.a
        public k0.a b(Set<Integer> set) {
            if (set != null) {
                this.a = set;
                return this;
            }
            throw new NullPointerException("Null deletableIndices");
        }

        @Override // com.spotify.eventsender.k0.a
        public k0.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }
    }

    x(Set set, boolean z, a aVar) {
        this.a = set;
        this.b = z;
    }

    @Override // com.spotify.eventsender.k0
    public Set<Integer> b() {
        return this.a;
    }

    @Override // com.spotify.eventsender.k0
    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (!this.a.equals(k0Var.b()) || this.b != k0Var.c()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder V0 = je.V0("EventsResponse{deletableIndices=");
        V0.append(this.a);
        V0.append(", shouldBackoff=");
        return je.P0(V0, this.b, "}");
    }
}
