package com.spotify.music.features.yourlibrary.musicpages.item;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import com.spotify.playlist.models.PlayabilityRestriction;

/* access modifiers changed from: package-private */
public abstract class d extends MusicItem.g {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean f;
    private final boolean n;
    private final boolean o;
    private final PlayabilityRestriction p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final String t;
    private final String u;

    /* access modifiers changed from: package-private */
    public static class b extends MusicItem.g.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private PlayabilityRestriction g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private String k;
        private String l;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g b() {
            String str = this.a == null ? " inCollection" : "";
            if (this.b == null) {
                str = je.x0(str, " banned");
            }
            if (this.c == null) {
                str = je.x0(str, " canLike");
            }
            if (this.d == null) {
                str = je.x0(str, " canBan");
            }
            if (this.e == null) {
                str = je.x0(str, " explicit");
            }
            if (this.f == null) {
                str = je.x0(str, " is19plus");
            }
            if (this.g == null) {
                str = je.x0(str, " playabilityRestriction");
            }
            if (this.h == null) {
                str = je.x0(str, " currentlyPlayable");
            }
            if (this.i == null) {
                str = je.x0(str, " recommended");
            }
            if (this.j == null) {
                str = je.x0(str, " local");
            }
            if (this.l == null) {
                str = je.x0(str, " contextUri");
            }
            if (str.isEmpty()) {
                return new l(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g, this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k, this.l);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a d(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a e(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a f(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a g(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a h(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a i(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a j(PlayabilityRestriction playabilityRestriction) {
            this.g = playabilityRestriction;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a k(String str) {
            this.k = str;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g.a
        public MusicItem.g.a l(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        public MusicItem.g.a m(String str) {
            if (str != null) {
                this.l = str;
                return this;
            }
            throw new NullPointerException("Null contextUri");
        }

        b(MusicItem.g gVar, a aVar) {
            this.a = Boolean.valueOf(gVar.h());
            this.b = Boolean.valueOf(gVar.a());
            this.c = Boolean.valueOf(gVar.c());
            this.d = Boolean.valueOf(gVar.b());
            this.e = Boolean.valueOf(gVar.g());
            this.f = Boolean.valueOf(gVar.i());
            this.g = gVar.k();
            this.h = Boolean.valueOf(gVar.f());
            this.i = Boolean.valueOf(gVar.m());
            this.j = Boolean.valueOf(gVar.j());
            this.k = gVar.l();
            this.l = gVar.e();
        }
    }

    d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, PlayabilityRestriction playabilityRestriction, boolean z7, boolean z8, boolean z9, String str, String str2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.f = z4;
        this.n = z5;
        this.o = z6;
        if (playabilityRestriction != null) {
            this.p = playabilityRestriction;
            this.q = z7;
            this.r = z8;
            this.s = z9;
            this.t = str;
            if (str2 != null) {
                this.u = str2;
                return;
            }
            throw new NullPointerException("Null contextUri");
        }
        throw new NullPointerException("Null playabilityRestriction");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public boolean a() {
        return this.b;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public boolean b() {
        return this.f;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public boolean c() {
        return this.c;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public String e() {
        return this.u;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicItem.g)) {
            return false;
        }
        MusicItem.g gVar = (MusicItem.g) obj;
        if (this.a == gVar.h() && this.b == gVar.a() && this.c == gVar.c() && this.f == gVar.b() && this.n == gVar.g() && this.o == gVar.i() && this.p.equals(gVar.k()) && this.q == gVar.f() && this.r == gVar.m() && this.s == gVar.j() && ((str = this.t) != null ? str.equals(gVar.l()) : gVar.l() == null) && this.u.equals(gVar.e())) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public boolean f() {
        return this.q;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public boolean g() {
        return this.n;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public boolean h() {
        return this.a;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = ((((((((((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ this.p.hashCode()) * 1000003) ^ (this.q ? 1231 : 1237)) * 1000003) ^ (this.r ? 1231 : 1237)) * 1000003;
        if (!this.s) {
            i = 1237;
        }
        int i2 = (hashCode ^ i) * 1000003;
        String str = this.t;
        return ((i2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.u.hashCode();
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public boolean i() {
        return this.o;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public boolean j() {
        return this.s;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public PlayabilityRestriction k() {
        return this.p;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public String l() {
        return this.t;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public boolean m() {
        return this.r;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.g
    public MusicItem.g.a n() {
        return new b(this, null);
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("TrackExtras{inCollection=");
        V0.append(this.a);
        V0.append(", banned=");
        V0.append(this.b);
        V0.append(", canLike=");
        V0.append(this.c);
        V0.append(", canBan=");
        V0.append(this.f);
        V0.append(", explicit=");
        V0.append(this.n);
        V0.append(", is19plus=");
        V0.append(this.o);
        V0.append(", playabilityRestriction=");
        V0.append(this.p);
        V0.append(", currentlyPlayable=");
        V0.append(this.q);
        V0.append(", recommended=");
        V0.append(this.r);
        V0.append(", local=");
        V0.append(this.s);
        V0.append(", previewId=");
        V0.append(this.t);
        V0.append(", contextUri=");
        return je.I0(V0, this.u, "}");
    }
}
