package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidFeatureSearchProperties;

final class ke extends AndroidFeatureSearchProperties {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final AndroidFeatureSearchProperties.LoadMoreSearchResults f;
    private final AndroidFeatureSearchProperties.MoreRecentSearchesResults g;
    private final AndroidFeatureSearchProperties.TrendingSearchesBehaviour h;
    private final AndroidFeatureSearchProperties.TrendingSearchesExperience i;

    static final class b extends AndroidFeatureSearchProperties.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private AndroidFeatureSearchProperties.LoadMoreSearchResults f;
        private AndroidFeatureSearchProperties.MoreRecentSearchesResults g;
        private AndroidFeatureSearchProperties.TrendingSearchesBehaviour h;
        private AndroidFeatureSearchProperties.TrendingSearchesExperience i;

        b() {
        }

        public AndroidFeatureSearchProperties a() {
            String str = this.a == null ? " enableEditorialOnDemandPlayback" : "";
            if (this.b == null) {
                str = je.x0(str, " enableMobius");
            }
            if (this.c == null) {
                str = je.x0(str, " enableMusicAndTalk");
            }
            if (this.d == null) {
                str = je.x0(str, " enableNewFindHeaderInSearch");
            }
            if (this.e == null) {
                str = je.x0(str, " enablePageLoadingApiIntegrationInSearchDrillDown");
            }
            if (this.f == null) {
                str = je.x0(str, " loadMoreSearchResults");
            }
            if (this.g == null) {
                str = je.x0(str, " moreRecentSearchesResults");
            }
            if (this.h == null) {
                str = je.x0(str, " trendingSearchesBehaviour");
            }
            if (this.i == null) {
                str = je.x0(str, " trendingSearchesExperience");
            }
            if (str.isEmpty()) {
                return new ke(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f, this.g, this.h, this.i, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidFeatureSearchProperties.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureSearchProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureSearchProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureSearchProperties.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureSearchProperties.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public AndroidFeatureSearchProperties.a g(AndroidFeatureSearchProperties.LoadMoreSearchResults loadMoreSearchResults) {
            if (loadMoreSearchResults != null) {
                this.f = loadMoreSearchResults;
                return this;
            }
            throw new NullPointerException("Null loadMoreSearchResults");
        }

        public AndroidFeatureSearchProperties.a h(AndroidFeatureSearchProperties.MoreRecentSearchesResults moreRecentSearchesResults) {
            if (moreRecentSearchesResults != null) {
                this.g = moreRecentSearchesResults;
                return this;
            }
            throw new NullPointerException("Null moreRecentSearchesResults");
        }

        public AndroidFeatureSearchProperties.a i(AndroidFeatureSearchProperties.TrendingSearchesBehaviour trendingSearchesBehaviour) {
            if (trendingSearchesBehaviour != null) {
                this.h = trendingSearchesBehaviour;
                return this;
            }
            throw new NullPointerException("Null trendingSearchesBehaviour");
        }

        public AndroidFeatureSearchProperties.a j(AndroidFeatureSearchProperties.TrendingSearchesExperience trendingSearchesExperience) {
            if (trendingSearchesExperience != null) {
                this.i = trendingSearchesExperience;
                return this;
            }
            throw new NullPointerException("Null trendingSearchesExperience");
        }
    }

    ke(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, AndroidFeatureSearchProperties.LoadMoreSearchResults loadMoreSearchResults, AndroidFeatureSearchProperties.MoreRecentSearchesResults moreRecentSearchesResults, AndroidFeatureSearchProperties.TrendingSearchesBehaviour trendingSearchesBehaviour, AndroidFeatureSearchProperties.TrendingSearchesExperience trendingSearchesExperience, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = loadMoreSearchResults;
        this.g = moreRecentSearchesResults;
        this.h = trendingSearchesBehaviour;
        this.i = trendingSearchesExperience;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSearchProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSearchProperties
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSearchProperties
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSearchProperties
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSearchProperties
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidFeatureSearchProperties)) {
            return false;
        }
        AndroidFeatureSearchProperties androidFeatureSearchProperties = (AndroidFeatureSearchProperties) obj;
        if (this.a == androidFeatureSearchProperties.a() && this.b == androidFeatureSearchProperties.b() && this.c == androidFeatureSearchProperties.c() && this.d == androidFeatureSearchProperties.d() && this.e == androidFeatureSearchProperties.e() && this.f.equals(androidFeatureSearchProperties.f()) && this.g.equals(androidFeatureSearchProperties.g()) && this.h.equals(androidFeatureSearchProperties.h()) && this.i.equals(androidFeatureSearchProperties.i())) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSearchProperties
    public AndroidFeatureSearchProperties.LoadMoreSearchResults f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSearchProperties
    public AndroidFeatureSearchProperties.MoreRecentSearchesResults g() {
        return this.g;
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSearchProperties
    public AndroidFeatureSearchProperties.TrendingSearchesBehaviour h() {
        return this.h;
    }

    public int hashCode() {
        int i2 = 1231;
        int i3 = ((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i2 = 1237;
        }
        return ((((((((i3 ^ i2) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.spotify.remoteconfig.AndroidFeatureSearchProperties
    public AndroidFeatureSearchProperties.TrendingSearchesExperience i() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidFeatureSearchProperties{enableEditorialOnDemandPlayback=");
        V0.append(this.a);
        V0.append(", enableMobius=");
        V0.append(this.b);
        V0.append(", enableMusicAndTalk=");
        V0.append(this.c);
        V0.append(", enableNewFindHeaderInSearch=");
        V0.append(this.d);
        V0.append(", enablePageLoadingApiIntegrationInSearchDrillDown=");
        V0.append(this.e);
        V0.append(", loadMoreSearchResults=");
        V0.append(this.f);
        V0.append(", moreRecentSearchesResults=");
        V0.append(this.g);
        V0.append(", trendingSearchesBehaviour=");
        V0.append(this.h);
        V0.append(", trendingSearchesExperience=");
        V0.append(this.i);
        V0.append("}");
        return V0.toString();
    }
}
