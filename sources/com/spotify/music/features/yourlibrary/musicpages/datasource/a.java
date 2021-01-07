package com.spotify.music.features.yourlibrary.musicpages.datasource;

import com.google.common.collect.ImmutableMap;
import com.spotify.music.features.yourlibrary.musicpages.datasource.x3;

/* access modifiers changed from: package-private */
public abstract class a extends x3 {
    private final int c;
    private final int f;
    private final x3.b n;
    private final ImmutableMap<String, String> o;
    private final Boolean p;
    private final boolean q;
    private final boolean r;

    /* access modifiers changed from: package-private */
    public static class b extends x3.a {
        private Integer a;
        private Integer b;
        private x3.b c;
        private ImmutableMap<String, String> d;
        private Boolean e;
        private Boolean f;
        private Boolean g;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.a
        public x3.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.a
        public x3 b() {
            String str = this.a == null ? " viewportRangeStart" : "";
            if (this.b == null) {
                str = je.x0(str, " viewportRangeSize");
            }
            if (this.c == null) {
                str = je.x0(str, " filterAndSortOptions");
            }
            if (this.d == null) {
                str = je.x0(str, " options");
            }
            if (this.f == null) {
                str = je.x0(str, " availableOnly");
            }
            if (this.g == null) {
                str = je.x0(str, " offlinedFirst");
            }
            if (str.isEmpty()) {
                return new t3(this.a.intValue(), this.b.intValue(), this.c, this.d, this.e, this.f.booleanValue(), this.g.booleanValue());
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.a
        public x3.a c(x3.b bVar) {
            if (bVar != null) {
                this.c = bVar;
                return this;
            }
            throw new NullPointerException("Null filterAndSortOptions");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.a
        public x3.a d(Boolean bool) {
            this.e = bool;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.a
        public x3.a e(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.a
        public x3.a f(ImmutableMap<String, String> immutableMap) {
            this.d = immutableMap;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.a
        public x3.a g(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3.a
        public x3.a h(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        b(x3 x3Var, C0260a aVar) {
            this.a = Integer.valueOf(x3Var.k());
            this.b = Integer.valueOf(x3Var.j());
            this.c = x3Var.c();
            this.d = x3Var.h();
            this.e = x3Var.f();
            this.f = Boolean.valueOf(x3Var.a());
            this.g = Boolean.valueOf(x3Var.g());
        }
    }

    a(int i, int i2, x3.b bVar, ImmutableMap<String, String> immutableMap, Boolean bool, boolean z, boolean z2) {
        this.c = i;
        this.f = i2;
        if (bVar != null) {
            this.n = bVar;
            if (immutableMap != null) {
                this.o = immutableMap;
                this.p = bool;
                this.q = z;
                this.r = z2;
                return;
            }
            throw new NullPointerException("Null options");
        }
        throw new NullPointerException("Null filterAndSortOptions");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3
    public boolean a() {
        return this.q;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3
    public x3.b c() {
        return this.n;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        if (this.c == x3Var.k() && this.f == x3Var.j() && this.n.equals(x3Var.c()) && this.o.equals(x3Var.h()) && ((bool = this.p) != null ? bool.equals(x3Var.f()) : x3Var.f() == null) && this.q == x3Var.a() && this.r == x3Var.g()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3
    public Boolean f() {
        return this.p;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3
    public boolean g() {
        return this.r;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3
    public ImmutableMap<String, String> h() {
        return this.o;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((((((this.c ^ 1000003) * 1000003) ^ this.f) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003;
        Boolean bool = this.p;
        int i = 1231;
        int hashCode2 = (((hashCode ^ (bool == null ? 0 : bool.hashCode())) * 1000003) ^ (this.q ? 1231 : 1237)) * 1000003;
        if (!this.r) {
            i = 1237;
        }
        return hashCode2 ^ i;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3
    public x3.a i() {
        return new b(this, null);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3
    public int j() {
        return this.f;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.datasource.x3
    public int k() {
        return this.c;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("DataSourceConfiguration{viewportRangeStart=");
        V0.append(this.c);
        V0.append(", viewportRangeSize=");
        V0.append(this.f);
        V0.append(", filterAndSortOptions=");
        V0.append(this.n);
        V0.append(", options=");
        V0.append(this.o);
        V0.append(", isOffline=");
        V0.append(this.p);
        V0.append(", availableOnly=");
        V0.append(this.q);
        V0.append(", offlinedFirst=");
        return je.P0(V0, this.r, "}");
    }
}
