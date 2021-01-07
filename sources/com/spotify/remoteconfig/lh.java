package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties;

final class lh extends AndroidLibsYourLibraryMusicPagesFlagsProperties {
    private final AndroidLibsYourLibraryMusicPagesFlagsProperties.ArtistRecommendationsSource a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource e;
    private final AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType f;
    private final AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary g;
    private final int h;
    private final int i;

    static final class b extends AndroidLibsYourLibraryMusicPagesFlagsProperties.a {
        private AndroidLibsYourLibraryMusicPagesFlagsProperties.ArtistRecommendationsSource a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource e;
        private AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType f;
        private AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary g;
        private Integer h;
        private Integer i;

        b() {
        }

        public AndroidLibsYourLibraryMusicPagesFlagsProperties.a a(AndroidLibsYourLibraryMusicPagesFlagsProperties.ArtistRecommendationsSource artistRecommendationsSource) {
            if (artistRecommendationsSource != null) {
                this.a = artistRecommendationsSource;
                return this;
            }
            throw new NullPointerException("Null artistRecommendationsSource");
        }

        /* access modifiers changed from: package-private */
        public AndroidLibsYourLibraryMusicPagesFlagsProperties b() {
            String str = this.a == null ? " artistRecommendationsSource" : "";
            if (this.b == null) {
                str = je.x0(str, " displayTagsInLikedSongsContextMenu");
            }
            if (this.c == null) {
                str = je.x0(str, " frecencySortingAsDefaultInYourLibraryMusicPagesPlaylists");
            }
            if (this.d == null) {
                str = je.x0(str, " likedSongsFilterChipsEnabled");
            }
            if (this.e == null) {
                str = je.x0(str, " likedSongsFilterChipsSource");
            }
            if (this.f == null) {
                str = je.x0(str, " likedSongsScrollerType");
            }
            if (this.g == null) {
                str = je.x0(str, " quickscrollMechanismInYourLibrary");
            }
            if (this.h == null) {
                str = je.x0(str, " quickscrollMinPages");
            }
            if (this.i == null) {
                str = je.x0(str, " yourLibraryMusicPagesLoadingRangeSize");
            }
            if (str.isEmpty()) {
                return new lh(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e, this.f, this.g, this.h.intValue(), this.i.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsYourLibraryMusicPagesFlagsProperties.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsYourLibraryMusicPagesFlagsProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsYourLibraryMusicPagesFlagsProperties.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsYourLibraryMusicPagesFlagsProperties.a f(AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource likedSongsFilterChipsSource) {
            if (likedSongsFilterChipsSource != null) {
                this.e = likedSongsFilterChipsSource;
                return this;
            }
            throw new NullPointerException("Null likedSongsFilterChipsSource");
        }

        public AndroidLibsYourLibraryMusicPagesFlagsProperties.a g(AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType likedSongsScrollerType) {
            if (likedSongsScrollerType != null) {
                this.f = likedSongsScrollerType;
                return this;
            }
            throw new NullPointerException("Null likedSongsScrollerType");
        }

        public AndroidLibsYourLibraryMusicPagesFlagsProperties.a h(AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary quickscrollMechanismInYourLibrary) {
            if (quickscrollMechanismInYourLibrary != null) {
                this.g = quickscrollMechanismInYourLibrary;
                return this;
            }
            throw new NullPointerException("Null quickscrollMechanismInYourLibrary");
        }

        public AndroidLibsYourLibraryMusicPagesFlagsProperties.a i(int i2) {
            this.h = Integer.valueOf(i2);
            return this;
        }

        public AndroidLibsYourLibraryMusicPagesFlagsProperties.a j(int i2) {
            this.i = Integer.valueOf(i2);
            return this;
        }
    }

    lh(AndroidLibsYourLibraryMusicPagesFlagsProperties.ArtistRecommendationsSource artistRecommendationsSource, boolean z, boolean z2, boolean z3, AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource likedSongsFilterChipsSource, AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType likedSongsScrollerType, AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary quickscrollMechanismInYourLibrary, int i2, int i3, a aVar) {
        this.a = artistRecommendationsSource;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = likedSongsFilterChipsSource;
        this.f = likedSongsScrollerType;
        this.g = quickscrollMechanismInYourLibrary;
        this.h = i2;
        this.i = i3;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties
    public AndroidLibsYourLibraryMusicPagesFlagsProperties.ArtistRecommendationsSource a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties
    public boolean b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties
    public boolean d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties
    public AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsFilterChipsSource e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsYourLibraryMusicPagesFlagsProperties)) {
            return false;
        }
        AndroidLibsYourLibraryMusicPagesFlagsProperties androidLibsYourLibraryMusicPagesFlagsProperties = (AndroidLibsYourLibraryMusicPagesFlagsProperties) obj;
        if (this.a.equals(androidLibsYourLibraryMusicPagesFlagsProperties.a()) && this.b == androidLibsYourLibraryMusicPagesFlagsProperties.b() && this.c == androidLibsYourLibraryMusicPagesFlagsProperties.c() && this.d == androidLibsYourLibraryMusicPagesFlagsProperties.d() && this.e.equals(androidLibsYourLibraryMusicPagesFlagsProperties.e()) && this.f.equals(androidLibsYourLibraryMusicPagesFlagsProperties.f()) && this.g.equals(androidLibsYourLibraryMusicPagesFlagsProperties.g()) && this.h == androidLibsYourLibraryMusicPagesFlagsProperties.h() && this.i == androidLibsYourLibraryMusicPagesFlagsProperties.i()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties
    public AndroidLibsYourLibraryMusicPagesFlagsProperties.LikedSongsScrollerType f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties
    public AndroidLibsYourLibraryMusicPagesFlagsProperties.QuickscrollMechanismInYourLibrary g() {
        return this.g;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties
    public int h() {
        return this.h;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i2 = 1237;
        }
        return ((((((((((hashCode ^ i2) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003) ^ this.i;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsYourLibraryMusicPagesFlagsProperties
    public int i() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsYourLibraryMusicPagesFlagsProperties{artistRecommendationsSource=");
        V0.append(this.a);
        V0.append(", displayTagsInLikedSongsContextMenu=");
        V0.append(this.b);
        V0.append(", frecencySortingAsDefaultInYourLibraryMusicPagesPlaylists=");
        V0.append(this.c);
        V0.append(", likedSongsFilterChipsEnabled=");
        V0.append(this.d);
        V0.append(", likedSongsFilterChipsSource=");
        V0.append(this.e);
        V0.append(", likedSongsScrollerType=");
        V0.append(this.f);
        V0.append(", quickscrollMechanismInYourLibrary=");
        V0.append(this.g);
        V0.append(", quickscrollMinPages=");
        V0.append(this.h);
        V0.append(", yourLibraryMusicPagesLoadingRangeSize=");
        return je.B0(V0, this.i, "}");
    }
}
