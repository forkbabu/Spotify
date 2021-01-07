package com.spotify.playlist.models;

import com.google.common.collect.ImmutableList;
import com.spotify.playlist.models.o;

final class d extends o {
    private final com.spotify.playlist.models.offline.a A;
    private final String B;
    private final String C;
    private final int D;
    private final String E;
    private final int F;
    private final ImmutableList<String> G;
    private final String a;
    private final String b;
    private final String c;
    private final a f;
    private final ImmutableList<b> n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final PlayabilityRestriction t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    /* access modifiers changed from: package-private */
    public static final class b implements o.a {
        private String a;
        private String b;
        private String c;
        private a d;
        private ImmutableList<b> e;
        private Boolean f;
        private Boolean g;
        private Boolean h;
        private Boolean i;
        private Boolean j;
        private PlayabilityRestriction k;
        private Boolean l;
        private Boolean m;
        private Boolean n;
        private Boolean o;
        private Boolean p;
        private Boolean q;
        private com.spotify.playlist.models.offline.a r;
        private String s;
        private String t;
        private Integer u;
        private String v;
        private Integer w;
        private ImmutableList<String> x;

        b() {
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a a(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a b(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o build() {
            String str = this.b == null ? " uri" : "";
            if (this.c == null) {
                str = je.x0(str, " name");
            }
            if (this.d == null) {
                str = je.x0(str, " album");
            }
            if (this.f == null) {
                str = je.x0(str, " inCollection");
            }
            if (this.g == null) {
                str = je.x0(str, " canAddToCollection");
            }
            if (this.h == null) {
                str = je.x0(str, " banned");
            }
            if (this.i == null) {
                str = je.x0(str, " canBan");
            }
            if (this.j == null) {
                str = je.x0(str, " currentlyPlayable");
            }
            if (this.k == null) {
                str = je.x0(str, " playabilityRestriction");
            }
            if (this.l == null) {
                str = je.x0(str, " availableInMetadataCatalogue");
            }
            if (this.m == null) {
                str = je.x0(str, " explicit");
            }
            if (this.n == null) {
                str = je.x0(str, " is19plus");
            }
            if (this.o == null) {
                str = je.x0(str, " hasLyrics");
            }
            if (this.p == null) {
                str = je.x0(str, " local");
            }
            if (this.q == null) {
                str = je.x0(str, " premiumOnly");
            }
            if (this.r == null) {
                str = je.x0(str, " offlineState");
            }
            if (this.u == null) {
                str = je.x0(str, " length");
            }
            if (this.w == null) {
                str = je.x0(str, " addTime");
            }
            if (this.x == null) {
                str = je.x0(str, " trackDescriptors");
            }
            if (str.isEmpty()) {
                return new d(this.a, this.b, this.c, this.d, this.e, this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k, this.l.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.q.booleanValue(), this.r, this.s, this.t, this.u.intValue(), this.v, this.w.intValue(), this.x, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a c(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a d(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a e(com.spotify.playlist.models.offline.a aVar) {
            this.r = aVar;
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a g(a aVar) {
            if (aVar != null) {
                this.d = aVar;
                return this;
            }
            throw new NullPointerException("Null album");
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a h(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a i(String str) {
            this.a = str;
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a j(PlayabilityRestriction playabilityRestriction) {
            this.k = playabilityRestriction;
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a k(int i2) {
            this.w = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a l(int i2) {
            this.u = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a m(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a n(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a o(String str) {
            this.s = str;
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a p(String str) {
            this.t = str;
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a q(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a r(ImmutableList<String> immutableList) {
            if (immutableList != null) {
                this.x = immutableList;
                return this;
            }
            throw new NullPointerException("Null trackDescriptors");
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a s(String str) {
            this.v = str;
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a t(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a u(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a v(ImmutableList<b> immutableList) {
            this.e = immutableList;
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a w(boolean z) {
            this.n = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.playlist.models.o.a
        public o.a x(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        b(o oVar, a aVar) {
            d dVar = (d) oVar;
            this.a = dVar.getHeader();
            this.b = dVar.getUri();
            this.c = oVar.getName();
            this.d = oVar.getAlbum();
            this.e = oVar.getArtists();
            this.f = Boolean.valueOf(oVar.isInCollection());
            this.g = Boolean.valueOf(oVar.getCanAddToCollection());
            this.h = Boolean.valueOf(oVar.isBanned());
            this.i = Boolean.valueOf(oVar.getCanBan());
            this.j = Boolean.valueOf(oVar.isCurrentlyPlayable());
            this.k = oVar.getPlayabilityRestriction();
            this.l = Boolean.valueOf(oVar.isAvailableInMetadataCatalogue());
            this.m = Boolean.valueOf(oVar.isExplicit());
            this.n = Boolean.valueOf(oVar.getIs19plus());
            this.o = Boolean.valueOf(oVar.getHasLyrics());
            this.p = Boolean.valueOf(oVar.isLocal());
            this.q = Boolean.valueOf(oVar.isPremiumOnly());
            this.r = oVar.getOfflineState();
            this.s = oVar.getPreviewId();
            this.t = oVar.getPlayableTrackUri();
            this.u = Integer.valueOf(oVar.getLength());
            this.v = oVar.getGroupLabel();
            this.w = Integer.valueOf(oVar.getAddTime());
            this.x = oVar.getTrackDescriptors();
        }
    }

    d(String str, String str2, String str3, a aVar, ImmutableList immutableList, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, PlayabilityRestriction playabilityRestriction, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, com.spotify.playlist.models.offline.a aVar2, String str4, String str5, int i, String str6, int i2, ImmutableList immutableList2, a aVar3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = aVar;
        this.n = immutableList;
        this.o = z2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.s = z6;
        this.t = playabilityRestriction;
        this.u = z7;
        this.v = z8;
        this.w = z9;
        this.x = z10;
        this.y = z11;
        this.z = z12;
        this.A = aVar2;
        this.B = str4;
        this.C = str5;
        this.D = i;
        this.E = str6;
        this.F = i2;
        this.G = immutableList2;
    }

    public boolean equals(Object obj) {
        ImmutableList<b> immutableList;
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        String str4 = this.a;
        if (str4 != null ? str4.equals(oVar.getHeader()) : oVar.getHeader() == null) {
            if (this.b.equals(oVar.getUri()) && this.c.equals(oVar.getName()) && this.f.equals(oVar.getAlbum()) && ((immutableList = this.n) != null ? immutableList.equals(oVar.getArtists()) : oVar.getArtists() == null) && this.o == oVar.isInCollection() && this.p == oVar.getCanAddToCollection() && this.q == oVar.isBanned() && this.r == oVar.getCanBan() && this.s == oVar.isCurrentlyPlayable() && this.t.equals(oVar.getPlayabilityRestriction()) && this.u == oVar.isAvailableInMetadataCatalogue() && this.v == oVar.isExplicit() && this.w == oVar.getIs19plus() && this.x == oVar.getHasLyrics() && this.y == oVar.isLocal() && this.z == oVar.isPremiumOnly() && this.A.equals(oVar.getOfflineState()) && ((str = this.B) != null ? str.equals(oVar.getPreviewId()) : oVar.getPreviewId() == null) && ((str2 = this.C) != null ? str2.equals(oVar.getPlayableTrackUri()) : oVar.getPlayableTrackUri() == null) && this.D == oVar.getLength() && ((str3 = this.E) != null ? str3.equals(oVar.getGroupLabel()) : oVar.getGroupLabel() == null) && this.F == oVar.getAddTime() && this.G.equals(oVar.getTrackDescriptors())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.playlist.models.o
    public int getAddTime() {
        return this.F;
    }

    @Override // com.spotify.playlist.models.o
    public a getAlbum() {
        return this.f;
    }

    @Override // com.spotify.playlist.models.o
    public ImmutableList<b> getArtists() {
        return this.n;
    }

    @Override // com.spotify.playlist.models.o
    public boolean getCanAddToCollection() {
        return this.p;
    }

    @Override // com.spotify.playlist.models.o
    public boolean getCanBan() {
        return this.r;
    }

    @Override // com.spotify.playlist.models.o
    public String getGroupLabel() {
        return this.E;
    }

    @Override // com.spotify.playlist.models.o
    public boolean getHasLyrics() {
        return this.x;
    }

    @Override // com.spotify.playlist.models.g
    public String getHeader() {
        return this.a;
    }

    @Override // com.spotify.playlist.models.o
    public boolean getIs19plus() {
        return this.w;
    }

    @Override // com.spotify.playlist.models.o
    public int getLength() {
        return this.D;
    }

    @Override // com.spotify.playlist.models.o
    public String getName() {
        return this.c;
    }

    @Override // com.spotify.playlist.models.o
    public com.spotify.playlist.models.offline.a getOfflineState() {
        return this.A;
    }

    @Override // com.spotify.playlist.models.o
    public PlayabilityRestriction getPlayabilityRestriction() {
        return this.t;
    }

    @Override // com.spotify.playlist.models.o
    public String getPlayableTrackUri() {
        return this.C;
    }

    @Override // com.spotify.playlist.models.o
    public String getPreviewId() {
        return this.B;
    }

    @Override // com.spotify.playlist.models.o
    public ImmutableList<String> getTrackDescriptors() {
        return this.G;
    }

    @Override // com.spotify.playlist.models.h
    public String getUri() {
        return this.b;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        ImmutableList<b> immutableList = this.n;
        int i2 = 1231;
        int hashCode2 = (((((((((((((((((((((((hashCode ^ (immutableList == null ? 0 : immutableList.hashCode())) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003) ^ (this.q ? 1231 : 1237)) * 1000003) ^ (this.r ? 1231 : 1237)) * 1000003) ^ (this.s ? 1231 : 1237)) * 1000003) ^ this.t.hashCode()) * 1000003) ^ (this.u ? 1231 : 1237)) * 1000003) ^ (this.v ? 1231 : 1237)) * 1000003) ^ (this.w ? 1231 : 1237)) * 1000003) ^ (this.x ? 1231 : 1237)) * 1000003) ^ (this.y ? 1231 : 1237)) * 1000003;
        if (!this.z) {
            i2 = 1237;
        }
        int hashCode3 = (((hashCode2 ^ i2) * 1000003) ^ this.A.hashCode()) * 1000003;
        String str2 = this.B;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.C;
        int hashCode5 = (((hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.D) * 1000003;
        String str4 = this.E;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return ((((hashCode5 ^ i) * 1000003) ^ this.F) * 1000003) ^ this.G.hashCode();
    }

    @Override // com.spotify.playlist.models.o
    public boolean isAvailableInMetadataCatalogue() {
        return this.u;
    }

    @Override // com.spotify.playlist.models.o
    public boolean isBanned() {
        return this.q;
    }

    @Override // com.spotify.playlist.models.o
    public boolean isCurrentlyPlayable() {
        return this.s;
    }

    @Override // com.spotify.playlist.models.o
    public boolean isExplicit() {
        return this.v;
    }

    @Override // com.spotify.playlist.models.o
    public boolean isInCollection() {
        return this.o;
    }

    @Override // com.spotify.playlist.models.o
    public boolean isLocal() {
        return this.y;
    }

    @Override // com.spotify.playlist.models.o
    public boolean isPremiumOnly() {
        return this.z;
    }

    @Override // com.spotify.playlist.models.o
    public o.a toBuilder() {
        return new b(this, null);
    }

    public String toString() {
        StringBuilder V0 = je.V0("Track{header=");
        V0.append(this.a);
        V0.append(", uri=");
        V0.append(this.b);
        V0.append(", name=");
        V0.append(this.c);
        V0.append(", album=");
        V0.append(this.f);
        V0.append(", artists=");
        V0.append(this.n);
        V0.append(", inCollection=");
        V0.append(this.o);
        V0.append(", canAddToCollection=");
        V0.append(this.p);
        V0.append(", banned=");
        V0.append(this.q);
        V0.append(", canBan=");
        V0.append(this.r);
        V0.append(", currentlyPlayable=");
        V0.append(this.s);
        V0.append(", playabilityRestriction=");
        V0.append(this.t);
        V0.append(", availableInMetadataCatalogue=");
        V0.append(this.u);
        V0.append(", explicit=");
        V0.append(this.v);
        V0.append(", is19plus=");
        V0.append(this.w);
        V0.append(", hasLyrics=");
        V0.append(this.x);
        V0.append(", local=");
        V0.append(this.y);
        V0.append(", premiumOnly=");
        V0.append(this.z);
        V0.append(", offlineState=");
        V0.append(this.A);
        V0.append(", previewId=");
        V0.append(this.B);
        V0.append(", playableTrackUri=");
        V0.append(this.C);
        V0.append(", length=");
        V0.append(this.D);
        V0.append(", groupLabel=");
        V0.append(this.E);
        V0.append(", addTime=");
        V0.append(this.F);
        V0.append(", trackDescriptors=");
        V0.append(this.G);
        V0.append("}");
        return V0.toString();
    }
}
