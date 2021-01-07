package com.spotify.music.libs.assistedcuration.presenter;

import com.spotify.music.libs.assistedcuration.presenter.x;
import java.util.Set;

final class p extends x {
    private final Set<String> a;
    private final String b;

    static final class b implements x.a {
        private Set<String> a;
        private String b;

        b() {
        }

        public x a() {
            String str = this.a == null ? " seeds" : "";
            if (this.b == null) {
                str = je.x0(str, " destinationTitle");
            }
            if (str.isEmpty()) {
                return new p(this.a, this.b, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public x.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null destinationTitle");
        }

        public x.a c(Set<String> set) {
            this.a = set;
            return this;
        }
    }

    p(Set set, String str, a aVar) {
        this.a = set;
        this.b = str;
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.x
    public String a() {
        return this.b;
    }

    @Override // com.spotify.music.libs.assistedcuration.presenter.x
    public Set<String> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.a.equals(xVar.b()) || !this.b.equals(xVar.a())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SeedData{seeds=");
        V0.append(this.a);
        V0.append(", destinationTitle=");
        return je.I0(V0, this.b, "}");
    }
}
