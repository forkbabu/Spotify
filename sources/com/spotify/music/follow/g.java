package com.spotify.music.follow;

import com.spotify.music.follow.j;

final class g extends j {
    private final String a;
    private final int b;
    private final int c;
    private final boolean d;
    private final boolean e;

    /* access modifiers changed from: package-private */
    public static final class b extends j.a {
        private String a;
        private Integer b;
        private Integer c;
        private Boolean d;
        private Boolean e;

        b() {
        }

        @Override // com.spotify.music.follow.j.a
        public j a() {
            String str = this.a == null ? " uri" : "";
            if (this.b == null) {
                str = je.x0(str, " followersCount");
            }
            if (this.c == null) {
                str = je.x0(str, " followingCount");
            }
            if (this.d == null) {
                str = je.x0(str, " following");
            }
            if (this.e == null) {
                str = je.x0(str, " dismissed");
            }
            if (str.isEmpty()) {
                return new g(this.a, this.b.intValue(), this.c.intValue(), this.d.booleanValue(), this.e.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.follow.j.a
        public j.a b(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.follow.j.a
        public j.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.follow.j.a
        public j.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.follow.j.a
        public j.a e(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.follow.j.a
        public j.a f(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        b(j jVar, a aVar) {
            this.a = jVar.e();
            this.b = Integer.valueOf(jVar.c());
            this.c = Integer.valueOf(jVar.d());
            this.d = Boolean.valueOf(jVar.g());
            this.e = Boolean.valueOf(jVar.f());
        }
    }

    g(String str, int i, int i2, boolean z, boolean z2, a aVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = z2;
    }

    @Override // com.spotify.music.follow.j
    public int c() {
        return this.b;
    }

    @Override // com.spotify.music.follow.j
    public int d() {
        return this.c;
    }

    @Override // com.spotify.music.follow.j
    public String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.a.equals(jVar.e()) && this.b == jVar.c() && this.c == jVar.d() && this.d == jVar.g() && this.e == jVar.f()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.follow.j
    public boolean f() {
        return this.e;
    }

    @Override // com.spotify.music.follow.j
    public boolean g() {
        return this.d;
    }

    @Override // com.spotify.music.follow.j
    public j.a h() {
        return new b(this, null);
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FollowData{uri=");
        V0.append(this.a);
        V0.append(", followersCount=");
        V0.append(this.b);
        V0.append(", followingCount=");
        V0.append(this.c);
        V0.append(", following=");
        V0.append(this.d);
        V0.append(", dismissed=");
        return je.P0(V0, this.e, "}");
    }
}
