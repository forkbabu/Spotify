package com.spotify.mobile.android.sso.bakery;

import com.spotify.mobile.android.sso.bakery.d;

final class c extends d {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Long e;
    private final Boolean f;

    /* access modifiers changed from: package-private */
    public static final class b extends d.a {
        private String a;
        private String b;
        private String c;
        private String d;
        private Long e;
        private Boolean f;

        b() {
        }

        @Override // com.spotify.mobile.android.sso.bakery.d.a
        public d a() {
            String str = this.a == null ? " name" : "";
            if (this.b == null) {
                str = je.x0(str, " value");
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, this.c, this.d, this.e, this.f, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.sso.bakery.d.a
        public d.a b(Long l) {
            this.e = l;
            return this;
        }

        @Override // com.spotify.mobile.android.sso.bakery.d.a
        public d.a c(String str) {
            this.c = str;
            return this;
        }

        @Override // com.spotify.mobile.android.sso.bakery.d.a
        public d.a d(Boolean bool) {
            this.f = bool;
            return this;
        }

        public d.a e(String str) {
            this.d = str;
            return this;
        }

        public d.a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        public d.a g(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    c(String str, String str2, String str3, String str4, Long l, Boolean bool, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = bool;
    }

    @Override // com.spotify.mobile.android.sso.bakery.d
    public String a() {
        return this.d;
    }

    @Override // com.spotify.mobile.android.sso.bakery.d
    public Long c() {
        return this.e;
    }

    @Override // com.spotify.mobile.android.sso.bakery.d
    public String d() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.sso.bakery.d
    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        Long l;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.a.equals(dVar.d()) && this.b.equals(dVar.h()) && ((str = this.c) != null ? str.equals(dVar.e()) : dVar.e() == null) && ((str2 = this.d) != null ? str2.equals(dVar.a()) : dVar.a() == null) && ((l = this.e) != null ? l.equals(dVar.c()) : dVar.c() == null)) {
            Boolean bool = this.f;
            if (bool == null) {
                if (dVar.f() == null) {
                    return true;
                }
            } else if (bool.equals(dVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.mobile.android.sso.bakery.d
    public Boolean f() {
        return this.f;
    }

    @Override // com.spotify.mobile.android.sso.bakery.d
    public String h() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.e;
        int hashCode4 = (hashCode3 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.f;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ImmutableHttpCookie{name=");
        V0.append(this.a);
        V0.append(", value=");
        V0.append(this.b);
        V0.append(", path=");
        V0.append(this.c);
        V0.append(", domain=");
        V0.append(this.d);
        V0.append(", maxAge=");
        V0.append(this.e);
        V0.append(", secure=");
        V0.append(this.f);
        V0.append("}");
        return V0.toString();
    }
}
