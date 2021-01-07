package com.spotify.music.playlist.ui;

import com.spotify.music.playlist.ui.ItemConfiguration;

final class a0 extends ItemConfiguration {
    private final boolean a;
    private final ItemConfiguration.AddedBy b;
    private final boolean c;
    private final ItemConfiguration.HeartAndBan d;
    private final ItemConfiguration.LongClickAction e;
    private final boolean f;
    private final ItemConfiguration.PreviewOverlay g;
    private final ItemConfiguration.PreviewOverlay h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;

    /* access modifiers changed from: package-private */
    public static final class b implements ItemConfiguration.a {
        private Boolean a;
        private ItemConfiguration.AddedBy b;
        private Boolean c;
        private ItemConfiguration.HeartAndBan d;
        private ItemConfiguration.LongClickAction e;
        private Boolean f;
        private ItemConfiguration.PreviewOverlay g;
        private ItemConfiguration.PreviewOverlay h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Boolean l;

        b() {
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a b(ItemConfiguration.PreviewOverlay previewOverlay) {
            this.g = previewOverlay;
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration build() {
            String str = this.a == null ? " prependTitleWithNumber" : "";
            if (this.b == null) {
                str = je.x0(str, " showAddedByAs");
            }
            if (this.c == null) {
                str = je.x0(str, " showAlbumInSubtitle");
            }
            if (this.d == null) {
                str = je.x0(str, " heartAndBanOnTrackRows");
            }
            if (this.e == null) {
                str = je.x0(str, " longClickAction");
            }
            if (this.f == null) {
                str = je.x0(str, " showLyricsLabels");
            }
            if (this.g == null) {
                str = je.x0(str, " showPreviewOverlayForTracks");
            }
            if (this.h == null) {
                str = je.x0(str, " showPreviewOverlayForEpisodes");
            }
            if (this.i == null) {
                str = je.x0(str, " useEncoreForTracks");
            }
            if (this.j == null) {
                str = je.x0(str, " logItemImpressions");
            }
            if (this.k == null) {
                str = je.x0(str, " canDownloadMusicAndTalkEpisodes");
            }
            if (this.l == null) {
                str = je.x0(str, " showPremiumMiniOnboardingTooltip");
            }
            if (str.isEmpty()) {
                return new a0(this.a.booleanValue(), this.b, this.c.booleanValue(), this.d, this.e, this.f.booleanValue(), this.g, this.h, this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a c(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a d(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a e(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a f(ItemConfiguration.LongClickAction longClickAction) {
            this.e = longClickAction;
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a g(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a h(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a i(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a j(ItemConfiguration.HeartAndBan heartAndBan) {
            this.d = heartAndBan;
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a k(ItemConfiguration.PreviewOverlay previewOverlay) {
            this.h = previewOverlay;
            return this;
        }

        @Override // com.spotify.music.playlist.ui.ItemConfiguration.a
        public ItemConfiguration.a l(ItemConfiguration.AddedBy addedBy) {
            if (addedBy != null) {
                this.b = addedBy;
                return this;
            }
            throw new NullPointerException("Null showAddedByAs");
        }

        b(ItemConfiguration itemConfiguration, a aVar) {
            this.a = Boolean.valueOf(itemConfiguration.f());
            this.b = itemConfiguration.g();
            this.c = Boolean.valueOf(itemConfiguration.h());
            this.d = itemConfiguration.c();
            this.e = itemConfiguration.e();
            this.f = Boolean.valueOf(itemConfiguration.i());
            this.g = itemConfiguration.l();
            this.h = itemConfiguration.k();
            this.i = Boolean.valueOf(itemConfiguration.n());
            this.j = Boolean.valueOf(itemConfiguration.d());
            this.k = Boolean.valueOf(itemConfiguration.b());
            this.l = Boolean.valueOf(itemConfiguration.j());
        }
    }

    a0(boolean z, ItemConfiguration.AddedBy addedBy, boolean z2, ItemConfiguration.HeartAndBan heartAndBan, ItemConfiguration.LongClickAction longClickAction, boolean z3, ItemConfiguration.PreviewOverlay previewOverlay, ItemConfiguration.PreviewOverlay previewOverlay2, boolean z4, boolean z5, boolean z6, boolean z7, a aVar) {
        this.a = z;
        this.b = addedBy;
        this.c = z2;
        this.d = heartAndBan;
        this.e = longClickAction;
        this.f = z3;
        this.g = previewOverlay;
        this.h = previewOverlay2;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public boolean b() {
        return this.k;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public ItemConfiguration.HeartAndBan c() {
        return this.d;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public boolean d() {
        return this.j;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public ItemConfiguration.LongClickAction e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ItemConfiguration)) {
            return false;
        }
        ItemConfiguration itemConfiguration = (ItemConfiguration) obj;
        if (this.a == itemConfiguration.f() && this.b.equals(itemConfiguration.g()) && this.c == itemConfiguration.h() && this.d.equals(itemConfiguration.c()) && this.e.equals(itemConfiguration.e()) && this.f == itemConfiguration.i() && this.g.equals(itemConfiguration.l()) && this.h.equals(itemConfiguration.k()) && this.i == itemConfiguration.n() && this.j == itemConfiguration.d() && this.k == itemConfiguration.b() && this.l == itemConfiguration.j()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public boolean f() {
        return this.a;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public ItemConfiguration.AddedBy g() {
        return this.b;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public boolean h() {
        return this.c;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003;
        if (!this.l) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public boolean i() {
        return this.f;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public boolean j() {
        return this.l;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public ItemConfiguration.PreviewOverlay k() {
        return this.h;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public ItemConfiguration.PreviewOverlay l() {
        return this.g;
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public ItemConfiguration.a m() {
        return new b(this, null);
    }

    @Override // com.spotify.music.playlist.ui.ItemConfiguration
    public boolean n() {
        return this.i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ItemConfiguration{prependTitleWithNumber=");
        V0.append(this.a);
        V0.append(", showAddedByAs=");
        V0.append(this.b);
        V0.append(", showAlbumInSubtitle=");
        V0.append(this.c);
        V0.append(", heartAndBanOnTrackRows=");
        V0.append(this.d);
        V0.append(", longClickAction=");
        V0.append(this.e);
        V0.append(", showLyricsLabels=");
        V0.append(this.f);
        V0.append(", showPreviewOverlayForTracks=");
        V0.append(this.g);
        V0.append(", showPreviewOverlayForEpisodes=");
        V0.append(this.h);
        V0.append(", useEncoreForTracks=");
        V0.append(this.i);
        V0.append(", logItemImpressions=");
        V0.append(this.j);
        V0.append(", canDownloadMusicAndTalkEpisodes=");
        V0.append(this.k);
        V0.append(", showPremiumMiniOnboardingTooltip=");
        return je.P0(V0, this.l, "}");
    }
}
