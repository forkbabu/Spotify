package com.spotify.music.nowplaying.common.view.contextmenu;

import com.spotify.music.nowplaying.common.view.contextmenu.o;

final class j extends o.c {
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;

    /* access modifiers changed from: package-private */
    public static final class b extends o.c.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private Boolean k;
        private Boolean l;
        private Boolean m;

        b() {
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c a() {
            String str = this.a == null ? " canUpdateCollectionState" : "";
            if (this.b == null) {
                str = je.x0(str, " canAddToQueue");
            }
            if (this.c == null) {
                str = je.x0(str, " canBan");
            }
            if (this.d == null) {
                str = je.x0(str, " canBrowseAlbum");
            }
            if (this.e == null) {
                str = je.x0(str, " canBrowseArtist");
            }
            if (this.f == null) {
                str = je.x0(str, " canGoToQueue");
            }
            if (this.g == null) {
                str = je.x0(str, " canGoToQueueFromTopBar");
            }
            if (this.h == null) {
                str = je.x0(str, " canStartRadio");
            }
            if (this.i == null) {
                str = je.x0(str, " canReportAbuse");
            }
            if (this.j == null) {
                str = je.x0(str, " canShuffle");
            }
            if (this.k == null) {
                str = je.x0(str, " canRepeat");
            }
            if (this.l == null) {
                str = je.x0(str, " canUseSleepTimer");
            }
            if (this.m == null) {
                str = je.x0(str, " canShowTagsInDescription");
            }
            if (str.isEmpty()) {
                return new j(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a g(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a h(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a i(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a j(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a k(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a l(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a m(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c.a
        public o.c.a n(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }
    }

    j(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, a aVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
        this.m = z12;
        this.n = z13;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean b() {
        return this.c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean c() {
        return this.d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean d() {
        return this.e;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o.c)) {
            return false;
        }
        o.c cVar = (o.c) obj;
        if (this.b == cVar.m() && this.c == cVar.b() && this.d == cVar.c() && this.e == cVar.d() && this.f == cVar.e() && this.g == cVar.f() && this.h == cVar.g() && this.i == cVar.l() && this.j == cVar.i() && this.k == cVar.k() && this.l == cVar.h() && this.m == cVar.n() && this.n == cVar.j()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean f() {
        return this.g;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean g() {
        return this.h;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean h() {
        return this.l;
    }

    public int hashCode() {
        int i2 = 1231;
        int i3 = ((((((((((((((((((((((((this.b ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003) ^ (this.m ? 1231 : 1237)) * 1000003;
        if (!this.n) {
            i2 = 1237;
        }
        return i3 ^ i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean i() {
        return this.j;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean j() {
        return this.n;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean k() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean l() {
        return this.i;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean m() {
        return this.b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.spotify.music.nowplaying.common.view.contextmenu.o.c
    public boolean n() {
        return this.m;
    }

    public String toString() {
        StringBuilder V0 = je.V0("ForTrack{canUpdateCollectionState=");
        V0.append(this.b);
        V0.append(", canAddToQueue=");
        V0.append(this.c);
        V0.append(", canBan=");
        V0.append(this.d);
        V0.append(", canBrowseAlbum=");
        V0.append(this.e);
        V0.append(", canBrowseArtist=");
        V0.append(this.f);
        V0.append(", canGoToQueue=");
        V0.append(this.g);
        V0.append(", canGoToQueueFromTopBar=");
        V0.append(this.h);
        V0.append(", canStartRadio=");
        V0.append(this.i);
        V0.append(", canReportAbuse=");
        V0.append(this.j);
        V0.append(", canShuffle=");
        V0.append(this.k);
        V0.append(", canRepeat=");
        V0.append(this.l);
        V0.append(", canUseSleepTimer=");
        V0.append(this.m);
        V0.append(", canShowTagsInDescription=");
        return je.P0(V0, this.n, "}");
    }
}
