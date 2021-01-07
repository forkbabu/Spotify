package com.google.firebase.installations;

import com.google.firebase.installations.k;

final class a extends k {
    private final String a;
    private final long b;
    private final long c;

    static final class b extends k.a {
        private String a;
        private Long b;
        private Long c;

        b() {
        }

        @Override // com.google.firebase.installations.k.a
        public k a() {
            String str = this.a == null ? " token" : "";
            if (this.b == null) {
                str = je.x0(str, " tokenExpirationTimestamp");
            }
            if (this.c == null) {
                str = je.x0(str, " tokenCreationTimestamp");
            }
            if (str.isEmpty()) {
                return new a(this.a, this.b.longValue(), this.c.longValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.google.firebase.installations.k.a
        public k.a b(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.k.a
        public k.a c(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public k.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null token");
        }
    }

    a(String str, long j, long j2, C0131a aVar) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    @Override // com.google.firebase.installations.k
    public String a() {
        return this.a;
    }

    @Override // com.google.firebase.installations.k
    public long b() {
        return this.c;
    }

    @Override // com.google.firebase.installations.k
    public long c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a.equals(kVar.a()) && this.b == kVar.c() && this.c == kVar.b()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.b;
        long j2 = this.c;
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder V0 = je.V0("InstallationTokenResult{token=");
        V0.append(this.a);
        V0.append(", tokenExpirationTimestamp=");
        V0.append(this.b);
        V0.append(", tokenCreationTimestamp=");
        return je.E0(V0, this.c, "}");
    }
}
