package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.music.nowplaying.common.view.contextmenu.o;

final class i extends o.b {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;

    /* access modifiers changed from: package-private */
    public static final class b extends o.b.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;

        b() {
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b.a
        public o.b a() {
            String str = this.a == null ? " canAddToQueue" : "";
            if (this.b == null) {
                str = je.x0(str, " canBrowseAssociatedSpotifyTrackAlbum");
            }
            if (this.c == null) {
                str = je.x0(str, " canBrowseShow");
            }
            if (this.d == null) {
                str = je.x0(str, " canDownload");
            }
            if (this.e == null) {
                str = je.x0(str, " canGoToQueue");
            }
            if (this.f == null) {
                str = je.x0(str, " canShare");
            }
            if (this.g == null) {
                str = je.x0(str, " canUseSleepTimer");
            }
            if (str.isEmpty()) {
                return new i(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b.a
        public o.b.a b(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b.a
        public o.b.a c(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b.a
        public o.b.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b.a
        public o.b.a e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b.a
        public o.b.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b.a
        public o.b.a g(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b.a
        public o.b.a h(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }
    }

    i(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, a aVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b
    public boolean b() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b
    public boolean c() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b
    public boolean d() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b
    public boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o.b)) {
            return false;
        }
        o.b bVar = (o.b) obj;
        if (this.b == bVar.b() && this.c == bVar.c() && this.d == bVar.d() && this.e == bVar.e() && this.f == bVar.f() && this.g == bVar.g() && this.h == bVar.h()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b
    public boolean f() {
        return this.f;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b
    public boolean g() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.b
    public boolean h() {
        return this.h;
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003;
        if (!this.h) {
            i = 1237;
        }
        return i2 ^ i;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ForShow{canAddToQueue=");
        V0.append(this.b);
        V0.append(", canBrowseAssociatedSpotifyTrackAlbum=");
        V0.append(this.c);
        V0.append(", canBrowseShow=");
        V0.append(this.d);
        V0.append(", canDownload=");
        V0.append(this.e);
        V0.append(", canGoToQueue=");
        V0.append(this.f);
        V0.append(", canShare=");
        V0.append(this.g);
        V0.append(", canUseSleepTimer=");
        return je.P0(V0, this.h, "}");
    }
}
