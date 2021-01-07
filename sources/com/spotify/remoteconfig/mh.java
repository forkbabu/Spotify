package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties;

final class mh extends AndroidLibsYourLibraryXFlagsProperties {
    private final AndroidLibsYourLibraryXFlagsProperties.DefaultSortOption a;
    private final AndroidLibsYourLibraryXFlagsProperties.DefaultViewDensity b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private final boolean g;

    static final class b extends AndroidLibsYourLibraryXFlagsProperties.a {
        private AndroidLibsYourLibraryXFlagsProperties.DefaultSortOption a;
        private AndroidLibsYourLibraryXFlagsProperties.DefaultViewDensity b;
        private Boolean c;
        private Boolean d;
        private Integer e;
        private Integer f;
        private Boolean g;

        b() {
        }

        /* access modifiers changed from: package-private */
        public AndroidLibsYourLibraryXFlagsProperties a() {
            String str = this.a == null ? " defaultSortOption" : "";
            if (this.b == null) {
                str = je.x0(str, " defaultViewDensity");
            }
            if (this.c == null) {
                str = je.x0(str, " enableYourLibraryX");
            }
            if (this.d == null) {
                str = je.x0(str, " hideMostRelevantSortOption");
            }
            if (this.e == null) {
                str = je.x0(str, " pageSize");
            }
            if (this.f == null) {
                str = je.x0(str, " pageThreshold");
            }
            if (this.g == null) {
                str = je.x0(str, " pinToTopEnabled");
            }
            if (str.isEmpty()) {
                return new mh(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.intValue(), this.f.intValue(), this.g.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsYourLibraryXFlagsProperties.a b(AndroidLibsYourLibraryXFlagsProperties.DefaultSortOption defaultSortOption) {
            if (defaultSortOption != null) {
                this.a = defaultSortOption;
                return this;
            }
            throw new NullPointerException("Null defaultSortOption");
        }

        public AndroidLibsYourLibraryXFlagsProperties.a c(AndroidLibsYourLibraryXFlagsProperties.DefaultViewDensity defaultViewDensity) {
            if (defaultViewDensity != null) {
                this.b = defaultViewDensity;
                return this;
            }
            throw new NullPointerException("Null defaultViewDensity");
        }

        public AndroidLibsYourLibraryXFlagsProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsYourLibraryXFlagsProperties.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsYourLibraryXFlagsProperties.a f(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        public AndroidLibsYourLibraryXFlagsProperties.a g(int i) {
            this.f = Integer.valueOf(i);
            return this;
        }

        public AndroidLibsYourLibraryXFlagsProperties.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }
    }

    mh(AndroidLibsYourLibraryXFlagsProperties.DefaultSortOption defaultSortOption, AndroidLibsYourLibraryXFlagsProperties.DefaultViewDensity defaultViewDensity, boolean z, boolean z2, int i, int i2, boolean z3, a aVar) {
        this.a = defaultSortOption;
        this.b = defaultViewDensity;
        this.c = z;
        this.d = z2;
        this.e = i;
        this.f = i2;
        this.g = z3;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties
    public AndroidLibsYourLibraryXFlagsProperties.DefaultSortOption a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties
    public AndroidLibsYourLibraryXFlagsProperties.DefaultViewDensity b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties
    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsYourLibraryXFlagsProperties)) {
            return false;
        }
        AndroidLibsYourLibraryXFlagsProperties androidLibsYourLibraryXFlagsProperties = (AndroidLibsYourLibraryXFlagsProperties) obj;
        if (this.a.equals(androidLibsYourLibraryXFlagsProperties.a()) && this.b.equals(androidLibsYourLibraryXFlagsProperties.b()) && this.c == androidLibsYourLibraryXFlagsProperties.c() && this.d == androidLibsYourLibraryXFlagsProperties.d() && this.e == androidLibsYourLibraryXFlagsProperties.e() && this.f == androidLibsYourLibraryXFlagsProperties.f() && this.g == androidLibsYourLibraryXFlagsProperties.g()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties
    public int f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryXFlagsProperties
    public boolean g() {
        return this.g;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003;
        if (!this.g) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsYourLibraryXFlagsProperties{defaultSortOption=");
        V0.append(this.a);
        V0.append(", defaultViewDensity=");
        V0.append(this.b);
        V0.append(", enableYourLibraryX=");
        V0.append(this.c);
        V0.append(", hideMostRelevantSortOption=");
        V0.append(this.d);
        V0.append(", pageSize=");
        V0.append(this.e);
        V0.append(", pageThreshold=");
        V0.append(this.f);
        V0.append(", pinToTopEnabled=");
        return je.P0(V0, this.g, "}");
    }
}
