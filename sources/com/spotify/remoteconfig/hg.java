package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityModesVanillaProperties;

final class hg extends AndroidLibsPlaylistEntityModesVanillaProperties {
    private final boolean a;
    private final AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree b;
    private final boolean c;

    static final class b extends AndroidLibsPlaylistEntityModesVanillaProperties.a {
        private Boolean a;
        private AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree b;
        private Boolean c;

        b() {
        }

        public AndroidLibsPlaylistEntityModesVanillaProperties a() {
            String str = "";
            if (this.a == null) {
                str = je.x0(str, " onlyShowRecommendationsSectionInOnDemandPlaylistsInFree");
            }
            if (this.b == null) {
                str = je.x0(str, " recommendationsSectionInFree");
            }
            if (this.c == null) {
                str = je.x0(str, " showRefreshHeaderInsteadOfPlaylistHeader");
            }
            if (str.isEmpty()) {
                return new hg(this.a.booleanValue(), this.b, this.c.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsPlaylistEntityModesVanillaProperties.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsPlaylistEntityModesVanillaProperties.a c(AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree recommendationsSectionInFree) {
            if (recommendationsSectionInFree != null) {
                this.b = recommendationsSectionInFree;
                return this;
            }
            throw new NullPointerException("Null recommendationsSectionInFree");
        }

        public AndroidLibsPlaylistEntityModesVanillaProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }
    }

    hg(boolean z, AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree recommendationsSectionInFree, boolean z2, a aVar) {
        this.a = z;
        this.b = recommendationsSectionInFree;
        this.c = z2;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityModesVanillaProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityModesVanillaProperties
    public AndroidLibsPlaylistEntityModesVanillaProperties.RecommendationsSectionInFree b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityModesVanillaProperties
    public boolean c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsPlaylistEntityModesVanillaProperties)) {
            return false;
        }
        AndroidLibsPlaylistEntityModesVanillaProperties androidLibsPlaylistEntityModesVanillaProperties = (AndroidLibsPlaylistEntityModesVanillaProperties) obj;
        if (this.a == androidLibsPlaylistEntityModesVanillaProperties.a() && this.b.equals(androidLibsPlaylistEntityModesVanillaProperties.b()) && this.c == androidLibsPlaylistEntityModesVanillaProperties.c()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 1231;
        int hashCode = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsPlaylistEntityModesVanillaProperties{onlyShowRecommendationsSectionInOnDemandPlaylistsInFree=");
        V0.append(this.a);
        V0.append(", recommendationsSectionInFree=");
        V0.append(this.b);
        V0.append(", showRefreshHeaderInsteadOfPlaylistHeader=");
        return je.P0(V0, this.c, "}");
    }
}
