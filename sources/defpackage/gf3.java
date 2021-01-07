package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import defpackage.of3;

/* renamed from: gf3  reason: default package */
final class gf3 extends of3 {
    private final String a;
    private final SpotifyIconV2 b;
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

    /* access modifiers changed from: package-private */
    /* renamed from: gf3$b */
    public static final class b implements of3.a {
        private String a;
        private SpotifyIconV2 b;
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

        @Override // defpackage.of3.a
        public of3.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        @Override // defpackage.of3.a
        public of3.a b(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.of3.a
        public of3 build() {
            String str = this.a == null ? " title" : "";
            if (this.b == null) {
                str = je.x0(str, " icon");
            }
            if (this.c == null) {
                str = je.x0(str, " isImageRounded");
            }
            if (this.d == null) {
                str = je.x0(str, " canBan");
            }
            if (this.e == null) {
                str = je.x0(str, " canGoToArtist");
            }
            if (this.f == null) {
                str = je.x0(str, " canAddToPlaylist");
            }
            if (this.g == null) {
                str = je.x0(str, " canAddToQueue");
            }
            if (this.h == null) {
                str = je.x0(str, " localBanIcon");
            }
            if (this.i == null) {
                str = je.x0(str, " canGoToRadio");
            }
            if (this.j == null) {
                str = je.x0(str, " shouldAddFollowToToolbar");
            }
            if (this.k == null) {
                str = je.x0(str, " canSaveAllTracks");
            }
            if (this.l == null) {
                str = je.x0(str, " canReport");
            }
            if (this.m == null) {
                str = je.x0(str, " canAddToHomeScreen");
            }
            if (str.isEmpty()) {
                return new gf3(this.a, this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // defpackage.of3.a
        public of3.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.of3.a
        public of3.a d(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.of3.a
        public of3.a e(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.of3.a
        public of3.a f(SpotifyIconV2 spotifyIconV2) {
            this.b = spotifyIconV2;
            return this;
        }

        @Override // defpackage.of3.a
        public of3.a g(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.of3.a
        public of3.a h(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.of3.a
        public of3.a i(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.of3.a
        public of3.a j(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.of3.a
        public of3.a k(boolean z) {
            this.k = Boolean.valueOf(z);
            return this;
        }

        @Override // defpackage.of3.a
        public of3.a l(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public of3.a m(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }
    }

    gf3(String str, SpotifyIconV2 spotifyIconV2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, a aVar) {
        this.a = str;
        this.b = spotifyIconV2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        this.k = z9;
        this.l = z10;
        this.m = z11;
    }

    @Override // defpackage.of3
    public boolean b() {
        return this.m;
    }

    @Override // defpackage.of3
    public boolean c() {
        return this.f;
    }

    @Override // defpackage.of3
    public boolean d() {
        return this.g;
    }

    @Override // defpackage.of3
    public boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof of3)) {
            return false;
        }
        of3 of3 = (of3) obj;
        if (this.a.equals(of3.n()) && this.b.equals(of3.j()) && this.c == of3.k() && this.d == of3.e() && this.e == of3.f() && this.f == of3.c() && this.g == of3.d() && this.h == of3.l() && this.i == of3.g() && this.j == of3.m() && this.k == of3.i() && this.l == of3.h() && this.m == of3.b()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.of3
    public boolean f() {
        return this.e;
    }

    @Override // defpackage.of3
    public boolean g() {
        return this.i;
    }

    @Override // defpackage.of3
    public boolean h() {
        return this.l;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.g ? 1231 : 1237)) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003) ^ (this.j ? 1231 : 1237)) * 1000003) ^ (this.k ? 1231 : 1237)) * 1000003) ^ (this.l ? 1231 : 1237)) * 1000003;
        if (!this.m) {
            i2 = 1237;
        }
        return hashCode ^ i2;
    }

    @Override // defpackage.of3
    public boolean i() {
        return this.k;
    }

    @Override // defpackage.of3
    public SpotifyIconV2 j() {
        return this.b;
    }

    @Override // defpackage.of3
    public boolean k() {
        return this.c;
    }

    @Override // defpackage.of3
    public boolean l() {
        return this.h;
    }

    @Override // defpackage.of3
    public boolean m() {
        return this.j;
    }

    @Override // defpackage.of3
    public String n() {
        return this.a;
    }

    public String toString() {
        StringBuilder V0 = je.V0("FreeTierToolbarConfiguration{title=");
        V0.append(this.a);
        V0.append(", icon=");
        V0.append(this.b);
        V0.append(", isImageRounded=");
        V0.append(this.c);
        V0.append(", canBan=");
        V0.append(this.d);
        V0.append(", canGoToArtist=");
        V0.append(this.e);
        V0.append(", canAddToPlaylist=");
        V0.append(this.f);
        V0.append(", canAddToQueue=");
        V0.append(this.g);
        V0.append(", localBanIcon=");
        V0.append(this.h);
        V0.append(", canGoToRadio=");
        V0.append(this.i);
        V0.append(", shouldAddFollowToToolbar=");
        V0.append(this.j);
        V0.append(", canSaveAllTracks=");
        V0.append(this.k);
        V0.append(", canReport=");
        V0.append(this.l);
        V0.append(", canAddToHomeScreen=");
        return je.P0(V0, this.m, "}");
    }
}
