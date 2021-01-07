package com.spotify.remoteconfig;

import com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties;

final class bg extends AndroidLibsPlaylistEntityConfigurationProperties {
    private final boolean a;
    private final AndroidLibsPlaylistEntityConfigurationProperties.ChunkyRowsAndPreviews b;
    private final boolean c;
    private final AndroidLibsPlaylistEntityConfigurationProperties.EditPlaylistOptionInToolbarMenuNftBehaviour d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final AndroidLibsPlaylistEntityConfigurationProperties.RecommendationEducationOptionInToolbarMenuBehavior h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final AndroidLibsPlaylistEntityConfigurationProperties.ShowToastAboutPremiumOnPreviewPlayback l;

    static final class b extends AndroidLibsPlaylistEntityConfigurationProperties.a {
        private Boolean a;
        private AndroidLibsPlaylistEntityConfigurationProperties.ChunkyRowsAndPreviews b;
        private Boolean c;
        private AndroidLibsPlaylistEntityConfigurationProperties.EditPlaylistOptionInToolbarMenuNftBehaviour d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private AndroidLibsPlaylistEntityConfigurationProperties.RecommendationEducationOptionInToolbarMenuBehavior h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private AndroidLibsPlaylistEntityConfigurationProperties.ShowToastAboutPremiumOnPreviewPlayback l;

        b() {
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsPlaylistEntityConfigurationProperties b() {
            String str = "";
            if (this.a == null) {
                str = je.x0(str, " allowAutoPlayOfEpisodesInShuffleModeInPlaylist");
            }
            if (this.b == null) {
                str = je.x0(str, " chunkyRowsAndPreviews");
            }
            if (this.c == null) {
                str = je.x0(str, " doubleStatePlayButton");
            }
            if (this.d == null) {
                str = je.x0(str, " editPlaylistOptionInToolbarMenuNftBehaviour");
            }
            if (this.e == null) {
                str = je.x0(str, " enableWeightedShufflePlayback");
            }
            if (this.f == null) {
                str = je.x0(str, " logImpressionsForItemRows");
            }
            if (this.g == null) {
                str = je.x0(str, " onboardingForChunkyRowsAndPreviews");
            }
            if (this.h == null) {
                str = je.x0(str, " recommendationEducationOptionInToolbarMenuBehavior");
            }
            if (this.i == null) {
                str = je.x0(str, " respectShowsCollectionFlagInPlaylistForIncludingEpisodes");
            }
            if (this.j == null) {
                str = je.x0(str, " showManagePrivacyOptionInToolbarMenu");
            }
            if (this.k == null) {
                str = je.x0(str, " showOtherDevicesToOfflineToOptionInToolbarMenu");
            }
            if (this.l == null) {
                str = je.x0(str, " showToastAboutPremiumOnPreviewPlayback");
            }
            if (str.isEmpty()) {
                return new bg(this.a.booleanValue(), this.b, this.c.booleanValue(), this.d, this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h, this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a c(AndroidLibsPlaylistEntityConfigurationProperties.ChunkyRowsAndPreviews chunkyRowsAndPreviews) {
            if (chunkyRowsAndPreviews != null) {
                this.b = chunkyRowsAndPreviews;
                return this;
            }
            throw new NullPointerException("Null chunkyRowsAndPreviews");
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a e(AndroidLibsPlaylistEntityConfigurationProperties.EditPlaylistOptionInToolbarMenuNftBehaviour editPlaylistOptionInToolbarMenuNftBehaviour) {
            if (editPlaylistOptionInToolbarMenuNftBehaviour != null) {
                this.d = editPlaylistOptionInToolbarMenuNftBehaviour;
                return this;
            }
            throw new NullPointerException("Null editPlaylistOptionInToolbarMenuNftBehaviour");
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a g(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a i(AndroidLibsPlaylistEntityConfigurationProperties.RecommendationEducationOptionInToolbarMenuBehavior recommendationEducationOptionInToolbarMenuBehavior) {
            if (recommendationEducationOptionInToolbarMenuBehavior != null) {
                this.h = recommendationEducationOptionInToolbarMenuBehavior;
                return this;
            }
            throw new NullPointerException("Null recommendationEducationOptionInToolbarMenuBehavior");
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a j(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a k(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a l(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        public AndroidLibsPlaylistEntityConfigurationProperties.a m(AndroidLibsPlaylistEntityConfigurationProperties.ShowToastAboutPremiumOnPreviewPlayback showToastAboutPremiumOnPreviewPlayback) {
            if (showToastAboutPremiumOnPreviewPlayback != null) {
                this.l = showToastAboutPremiumOnPreviewPlayback;
                return this;
            }
            throw new NullPointerException("Null showToastAboutPremiumOnPreviewPlayback");
        }
    }

    bg(boolean z, AndroidLibsPlaylistEntityConfigurationProperties.ChunkyRowsAndPreviews chunkyRowsAndPreviews, boolean z2, AndroidLibsPlaylistEntityConfigurationProperties.EditPlaylistOptionInToolbarMenuNftBehaviour editPlaylistOptionInToolbarMenuNftBehaviour, boolean z3, boolean z4, boolean z5, AndroidLibsPlaylistEntityConfigurationProperties.RecommendationEducationOptionInToolbarMenuBehavior recommendationEducationOptionInToolbarMenuBehavior, boolean z6, boolean z7, boolean z8, AndroidLibsPlaylistEntityConfigurationProperties.ShowToastAboutPremiumOnPreviewPlayback showToastAboutPremiumOnPreviewPlayback, a aVar) {
        this.a = z;
        this.b = chunkyRowsAndPreviews;
        this.c = z2;
        this.d = editPlaylistOptionInToolbarMenuNftBehaviour;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = recommendationEducationOptionInToolbarMenuBehavior;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = showToastAboutPremiumOnPreviewPlayback;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public boolean a() {
        return this.a;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public AndroidLibsPlaylistEntityConfigurationProperties.ChunkyRowsAndPreviews b() {
        return this.b;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public AndroidLibsPlaylistEntityConfigurationProperties.EditPlaylistOptionInToolbarMenuNftBehaviour d() {
        return this.d;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AndroidLibsPlaylistEntityConfigurationProperties)) {
            return false;
        }
        AndroidLibsPlaylistEntityConfigurationProperties androidLibsPlaylistEntityConfigurationProperties = (AndroidLibsPlaylistEntityConfigurationProperties) obj;
        if (this.a == androidLibsPlaylistEntityConfigurationProperties.a() && this.b.equals(androidLibsPlaylistEntityConfigurationProperties.b()) && this.c == androidLibsPlaylistEntityConfigurationProperties.c() && this.d.equals(androidLibsPlaylistEntityConfigurationProperties.d()) && this.e == androidLibsPlaylistEntityConfigurationProperties.e() && this.f == androidLibsPlaylistEntityConfigurationProperties.f() && this.g == androidLibsPlaylistEntityConfigurationProperties.g() && this.h.equals(androidLibsPlaylistEntityConfigurationProperties.h()) && this.i == androidLibsPlaylistEntityConfigurationProperties.i() && this.j == androidLibsPlaylistEntityConfigurationProperties.j() && this.k == androidLibsPlaylistEntityConfigurationProperties.k() && this.l.equals(androidLibsPlaylistEntityConfigurationProperties.l())) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public boolean f() {
        return this.f;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public boolean g() {
        return this.g;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public AndroidLibsPlaylistEntityConfigurationProperties.RecommendationEducationOptionInToolbarMenuBehavior h() {
        return this.h;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003;
        if (!this.k) {
            i2 = 1237;
        }
        return ((hashCode ^ i2) * 1000003) ^ this.l.hashCode();
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public boolean i() {
        return this.i;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public boolean j() {
        return this.j;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public boolean k() {
        return this.k;
    }

    @Override // com.spotify.remoteconfig.AndroidLibsPlaylistEntityConfigurationProperties
    public AndroidLibsPlaylistEntityConfigurationProperties.ShowToastAboutPremiumOnPreviewPlayback l() {
        return this.l;
    }

    public String toString() {
        StringBuilder V0 = je.V0("AndroidLibsPlaylistEntityConfigurationProperties{allowAutoPlayOfEpisodesInShuffleModeInPlaylist=");
        V0.append(this.a);
        V0.append(", chunkyRowsAndPreviews=");
        V0.append(this.b);
        V0.append(", doubleStatePlayButton=");
        V0.append(this.c);
        V0.append(", editPlaylistOptionInToolbarMenuNftBehaviour=");
        V0.append(this.d);
        V0.append(", enableWeightedShufflePlayback=");
        V0.append(this.e);
        V0.append(", logImpressionsForItemRows=");
        V0.append(this.f);
        V0.append(", onboardingForChunkyRowsAndPreviews=");
        V0.append(this.g);
        V0.append(", recommendationEducationOptionInToolbarMenuBehavior=");
        V0.append(this.h);
        V0.append(", respectShowsCollectionFlagInPlaylistForIncludingEpisodes=");
        V0.append(this.i);
        V0.append(", showManagePrivacyOptionInToolbarMenu=");
        V0.append(this.j);
        V0.append(", showOtherDevicesToOfflineToOptionInToolbarMenu=");
        V0.append(this.k);
        V0.append(", showToastAboutPremiumOnPreviewPlayback=");
        V0.append(this.l);
        V0.append("}");
        return V0.toString();
    }
}
