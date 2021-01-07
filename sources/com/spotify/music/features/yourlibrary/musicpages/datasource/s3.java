package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.datasource.p3;

final class s3 extends p3.a {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final Optional<SortOrder> e;

    s3(boolean z, boolean z2, boolean z3, Optional optional, a aVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = optional;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.p3.a
    public boolean a() {
        return this.d;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.p3.a
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.p3.a
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.p3.a
    public Optional<SortOrder> d() {
        return this.e;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.p3.a
    public p3.a.AbstractC0261a e() {
        return new b(this, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p3.a)) {
            return false;
        }
        p3.a aVar = (p3.a) obj;
        if (this.b == aVar.b() && this.c == aVar.c() && this.d == aVar.a() && this.e.equals(aVar.d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        return ((i2 ^ i) * 1000003) ^ this.e.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("Configuration{includeFollowed=");
        V0.append(this.b);
        V0.append(", includeInCollection=");
        V0.append(this.c);
        V0.append(", addFollowButton=");
        V0.append(this.d);
        V0.append(", sortOrder=");
        return je.F0(V0, this.e, "}");
    }

    static final class b extends p3.a.AbstractC0261a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Optional<SortOrder> d = Optional.absent();

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.p3.a.AbstractC0261a
        public p3.a.AbstractC0261a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.p3.a.AbstractC0261a
        public p3.a b() {
            String str = this.a == null ? " includeFollowed" : "";
            if (this.b == null) {
                str = je.x0(str, " includeInCollection");
            }
            if (this.c == null) {
                str = je.x0(str, " addFollowButton");
            }
            if (str.isEmpty()) {
                return new s3(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.p3.a.AbstractC0261a
        public p3.a.AbstractC0261a c(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.p3.a.AbstractC0261a
        public p3.a.AbstractC0261a d(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.p3.a.AbstractC0261a
        public p3.a.AbstractC0261a e(Optional<SortOrder> optional) {
            this.d = optional;
            return this;
        }

        b(p3.a aVar, a aVar2) {
            this.a = Boolean.valueOf(aVar.b());
            this.b = Boolean.valueOf(aVar.c());
            this.c = Boolean.valueOf(aVar.a());
            this.d = aVar.d();
        }
    }
}
