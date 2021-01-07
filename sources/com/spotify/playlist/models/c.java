package com.spotify.playlist.models;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.spotify.playlist.models.Episode;

/* access modifiers changed from: package-private */
public final class c extends Episode {
    private final Integer A;
    private final boolean B;
    private final boolean C;
    private final boolean D;
    private final Long E;
    private final boolean F;
    private final int G;
    private final Show H;
    private final com.spotify.playlist.models.offline.a I;
    private final ImmutableMap<String, String> J;
    private final Episode.MediaType K;
    private final Episode.Type L;
    private final ImmutableList<m> M;
    private final n N;
    private final e O;
    private final String a;
    private final String b;
    private final String c;
    private final Covers f;
    private final Covers n;
    private final String o;
    private final String p;
    private final String q;
    private final String r;
    private final String s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final PlayabilityRestriction x;
    private final boolean y;
    private final int z;

    /* access modifiers changed from: package-private */
    public static final class b implements Episode.a {
        private ImmutableMap<String, String> A;
        private Episode.MediaType B;
        private Episode.Type C;
        private ImmutableList<m> D;
        private n E;
        private e F;
        private String a;
        private String b;
        private String c;
        private Covers d;
        private Covers e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private Boolean k;
        private Boolean l;
        private Boolean m;
        private Boolean n;
        private PlayabilityRestriction o;
        private Boolean p;
        private Integer q;
        private Integer r;
        private Boolean s;
        private Boolean t;
        private Boolean u;
        private Long v;
        private Boolean w;
        private Integer x;
        private Show y;
        private com.spotify.playlist.models.offline.a z;

        b() {
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a A(int i2) {
            this.x = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a B(ImmutableList<m> immutableList) {
            this.D = immutableList;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a C(boolean z2) {
            this.s = Boolean.valueOf(z2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a D(Covers covers) {
            this.e = covers;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a E(n nVar) {
            this.E = nVar;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a F(Episode.MediaType mediaType) {
            this.B = mediaType;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a G(Integer num) {
            this.r = num;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a H(boolean z2) {
            this.t = Boolean.valueOf(z2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a a(boolean z2) {
            this.l = Boolean.valueOf(z2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a b(boolean z2) {
            this.n = Boolean.valueOf(z2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode build() {
            String str = this.b == null ? " uri" : "";
            if (this.c == null) {
                str = je.x0(str, " name");
            }
            if (this.d == null) {
                str = je.x0(str, " covers");
            }
            if (this.e == null) {
                str = je.x0(str, " freezeFrames");
            }
            if (this.f == null) {
                str = je.x0(str, " description");
            }
            if (this.h == null) {
                str = je.x0(str, " manifestId");
            }
            if (this.i == null) {
                str = je.x0(str, " previewManifestId");
            }
            if (this.k == null) {
                str = je.x0(str, " inCollection");
            }
            if (this.l == null) {
                str = je.x0(str, " explicit");
            }
            if (this.m == null) {
                str = je.x0(str, " isNew");
            }
            if (this.n == null) {
                str = je.x0(str, " currentlyPlayable");
            }
            if (this.o == null) {
                str = je.x0(str, " playabilityRestriction");
            }
            if (this.p == null) {
                str = je.x0(str, " availableInMetadataCatalogue");
            }
            if (this.q == null) {
                str = je.x0(str, " length");
            }
            if (this.s == null) {
                str = je.x0(str, " played");
            }
            if (this.t == null) {
                str = je.x0(str, " savedForListenLater");
            }
            if (this.u == null) {
                str = je.x0(str, " isMusicAndTalk");
            }
            if (this.w == null) {
                str = je.x0(str, " backgroundable");
            }
            if (this.x == null) {
                str = je.x0(str, " pubDate");
            }
            if (this.z == null) {
                str = je.x0(str, " offlineState");
            }
            if (this.A == null) {
                str = je.x0(str, " metadata");
            }
            if (this.B == null) {
                str = je.x0(str, " mediaType");
            }
            if (this.C == null) {
                str = je.x0(str, " type");
            }
            if (str.isEmpty()) {
                return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), this.o, this.p.booleanValue(), this.q.intValue(), this.r, this.s.booleanValue(), this.t.booleanValue(), this.u.booleanValue(), this.v, this.w.booleanValue(), this.x.intValue(), this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a c(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null description");
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a d(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a e(com.spotify.playlist.models.offline.a aVar) {
            this.z = aVar;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a f(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a i(String str) {
            this.a = str;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a j(PlayabilityRestriction playabilityRestriction) {
            this.o = playabilityRestriction;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a k(String str) {
            this.g = str;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a l(int i2) {
            this.q = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a m(boolean z2) {
            this.p = Boolean.valueOf(z2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a n(boolean z2) {
            this.k = Boolean.valueOf(z2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a o(String str) {
            this.j = str;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a p(e eVar) {
            this.F = eVar;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a q(boolean z2) {
            this.u = Boolean.valueOf(z2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a r(Show show) {
            this.y = show;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a s(Covers covers) {
            this.d = covers;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a t(ImmutableMap<String, String> immutableMap) {
            this.A = immutableMap;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a u(Episode.Type type) {
            this.C = type;
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a v(boolean z2) {
            this.m = Boolean.valueOf(z2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a w(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null manifestId");
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a x(boolean z2) {
            this.w = Boolean.valueOf(z2);
            return this;
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a y(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null previewManifestId");
        }

        @Override // com.spotify.playlist.models.Episode.a
        public Episode.a z(Long l2) {
            this.v = l2;
            return this;
        }
    }

    c(String str, String str2, String str3, Covers covers, Covers covers2, String str4, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, boolean z5, PlayabilityRestriction playabilityRestriction, boolean z6, int i, Integer num, boolean z7, boolean z8, boolean z9, Long l, boolean z10, int i2, Show show, com.spotify.playlist.models.offline.a aVar, ImmutableMap immutableMap, Episode.MediaType mediaType, Episode.Type type, ImmutableList immutableList, n nVar, e eVar, a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = covers;
        this.n = covers2;
        this.o = str4;
        this.p = str5;
        this.q = str6;
        this.r = str7;
        this.s = str8;
        this.t = z2;
        this.u = z3;
        this.v = z4;
        this.w = z5;
        this.x = playabilityRestriction;
        this.y = z6;
        this.z = i;
        this.A = num;
        this.B = z7;
        this.C = z8;
        this.D = z9;
        this.E = l;
        this.F = z10;
        this.G = i2;
        this.H = show;
        this.I = aVar;
        this.J = immutableMap;
        this.K = mediaType;
        this.L = type;
        this.M = immutableList;
        this.N = nVar;
        this.O = eVar;
    }

    @Override // com.spotify.playlist.models.Episode
    public boolean A() {
        return this.F;
    }

    @Override // com.spotify.playlist.models.Episode
    public boolean B() {
        return this.w;
    }

    @Override // com.spotify.playlist.models.Episode
    public boolean C() {
        return this.u;
    }

    @Override // com.spotify.playlist.models.Episode
    public boolean D() {
        return this.t;
    }

    @Override // com.spotify.playlist.models.Episode
    public boolean E() {
        return this.B;
    }

    @Override // com.spotify.playlist.models.Episode
    public boolean F() {
        return this.C;
    }

    @Override // com.spotify.playlist.models.Episode
    public Covers c() {
        return this.f;
    }

    @Override // com.spotify.playlist.models.Episode
    public String d() {
        return this.o;
    }

    @Override // com.spotify.playlist.models.Episode
    public Covers e() {
        return this.n;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        Integer num;
        Long l;
        Show show;
        ImmutableList<m> immutableList;
        n nVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode) obj;
        String str3 = this.a;
        if (str3 != null ? str3.equals(((c) episode).a) : ((c) episode).a == null) {
            if (this.b.equals(((c) episode).b) && this.c.equals(episode.n()) && this.f.equals(episode.c()) && this.n.equals(episode.e()) && this.o.equals(episode.d()) && ((str = this.p) != null ? str.equals(episode.f()) : episode.f() == null) && this.q.equals(episode.k()) && this.r.equals(episode.t()) && ((str2 = this.s) != null ? str2.equals(episode.s()) : episode.s() == null) && this.t == episode.D() && this.u == episode.C() && this.v == episode.h() && this.w == episode.B() && this.x.equals(episode.p()) && this.y == episode.z() && this.z == episode.j() && ((num = this.A) != null ? num.equals(episode.x()) : episode.x() == null) && this.B == episode.E() && this.C == episode.F() && this.D == episode.g() && ((l = this.E) != null ? l.equals(episode.i()) : episode.i() == null) && this.F == episode.A() && this.G == episode.u() && ((show = this.H) != null ? show.equals(episode.w()) : episode.w() == null) && this.I.equals(episode.o()) && this.J.equals(episode.m()) && this.K.equals(episode.l()) && this.L.equals(episode.y()) && ((immutableList = this.M) != null ? immutableList.equals(episode.v()) : episode.v() == null) && ((nVar = this.N) != null ? nVar.equals(episode.q()) : episode.q() == null)) {
                e eVar = this.O;
                if (eVar == null) {
                    if (episode.r() == null) {
                        return true;
                    }
                } else if (eVar.equals(episode.r())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.spotify.playlist.models.Episode
    public String f() {
        return this.p;
    }

    @Override // com.spotify.playlist.models.Episode
    public boolean g() {
        return this.D;
    }

    @Override // com.spotify.playlist.models.g
    public String getHeader() {
        return this.a;
    }

    @Override // com.spotify.playlist.models.h
    public String getUri() {
        return this.b;
    }

    @Override // com.spotify.playlist.models.Episode
    public boolean h() {
        return this.v;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((((((((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003;
        String str2 = this.p;
        int hashCode2 = (((((hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003;
        String str3 = this.s;
        int i2 = 1231;
        int hashCode3 = (((((((((((((((hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ (this.t ? 1231 : 1237)) * 1000003) ^ (this.u ? 1231 : 1237)) * 1000003) ^ (this.v ? 1231 : 1237)) * 1000003) ^ (this.w ? 1231 : 1237)) * 1000003) ^ this.x.hashCode()) * 1000003) ^ (this.y ? 1231 : 1237)) * 1000003) ^ this.z) * 1000003;
        Integer num = this.A;
        int hashCode4 = (((((((hashCode3 ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ (this.B ? 1231 : 1237)) * 1000003) ^ (this.C ? 1231 : 1237)) * 1000003) ^ (this.D ? 1231 : 1237)) * 1000003;
        Long l = this.E;
        int hashCode5 = (hashCode4 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        if (!this.F) {
            i2 = 1237;
        }
        int i3 = (((hashCode5 ^ i2) * 1000003) ^ this.G) * 1000003;
        Show show = this.H;
        int hashCode6 = (((((((((i3 ^ (show == null ? 0 : show.hashCode())) * 1000003) ^ this.I.hashCode()) * 1000003) ^ this.J.hashCode()) * 1000003) ^ this.K.hashCode()) * 1000003) ^ this.L.hashCode()) * 1000003;
        ImmutableList<m> immutableList = this.M;
        int hashCode7 = (hashCode6 ^ (immutableList == null ? 0 : immutableList.hashCode())) * 1000003;
        n nVar = this.N;
        int hashCode8 = (hashCode7 ^ (nVar == null ? 0 : nVar.hashCode())) * 1000003;
        e eVar = this.O;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode8 ^ i;
    }

    @Override // com.spotify.playlist.models.Episode
    public Long i() {
        return this.E;
    }

    @Override // com.spotify.playlist.models.Episode
    public int j() {
        return this.z;
    }

    @Override // com.spotify.playlist.models.Episode
    public String k() {
        return this.q;
    }

    @Override // com.spotify.playlist.models.Episode
    public Episode.MediaType l() {
        return this.K;
    }

    @Override // com.spotify.playlist.models.Episode
    public ImmutableMap<String, String> m() {
        return this.J;
    }

    @Override // com.spotify.playlist.models.Episode
    public String n() {
        return this.c;
    }

    @Override // com.spotify.playlist.models.Episode
    public com.spotify.playlist.models.offline.a o() {
        return this.I;
    }

    @Override // com.spotify.playlist.models.Episode
    public PlayabilityRestriction p() {
        return this.x;
    }

    @Override // com.spotify.playlist.models.Episode
    public n q() {
        return this.N;
    }

    @Override // com.spotify.playlist.models.Episode
    public e r() {
        return this.O;
    }

    @Override // com.spotify.playlist.models.Episode
    public String s() {
        return this.s;
    }

    @Override // com.spotify.playlist.models.Episode
    public String t() {
        return this.r;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Episode{header=");
        V0.append(this.a);
        V0.append(", uri=");
        V0.append(this.b);
        V0.append(", name=");
        V0.append(this.c);
        V0.append(", covers=");
        V0.append(this.f);
        V0.append(", freezeFrames=");
        V0.append(this.n);
        V0.append(", description=");
        V0.append(this.o);
        V0.append(", htmlDescription=");
        V0.append(this.p);
        V0.append(", manifestId=");
        V0.append(this.q);
        V0.append(", previewManifestId=");
        V0.append(this.r);
        V0.append(", previewId=");
        V0.append(this.s);
        V0.append(", inCollection=");
        V0.append(this.t);
        V0.append(", explicit=");
        V0.append(this.u);
        V0.append(", isNew=");
        V0.append(this.v);
        V0.append(", currentlyPlayable=");
        V0.append(this.w);
        V0.append(", playabilityRestriction=");
        V0.append(this.x);
        V0.append(", availableInMetadataCatalogue=");
        V0.append(this.y);
        V0.append(", length=");
        V0.append(this.z);
        V0.append(", timeLeft=");
        V0.append(this.A);
        V0.append(", played=");
        V0.append(this.B);
        V0.append(", savedForListenLater=");
        V0.append(this.C);
        V0.append(", isMusicAndTalk=");
        V0.append(this.D);
        V0.append(", lastPlayedAt=");
        V0.append(this.E);
        V0.append(", backgroundable=");
        V0.append(this.F);
        V0.append(", pubDate=");
        V0.append(this.G);
        V0.append(", show=");
        V0.append(this.H);
        V0.append(", offlineState=");
        V0.append(this.I);
        V0.append(", metadata=");
        V0.append(this.J);
        V0.append(", mediaType=");
        V0.append(this.K);
        V0.append(", type=");
        V0.append(this.L);
        V0.append(", quotes=");
        V0.append(this.M);
        V0.append(", podcastSegments=");
        V0.append(this.N);
        V0.append(", podcastTranscripts=");
        V0.append(this.O);
        V0.append("}");
        return V0.toString();
    }

    @Override // com.spotify.playlist.models.Episode
    public int u() {
        return this.G;
    }

    @Override // com.spotify.playlist.models.Episode
    public ImmutableList<m> v() {
        return this.M;
    }

    @Override // com.spotify.playlist.models.Episode
    public Show w() {
        return this.H;
    }

    @Override // com.spotify.playlist.models.Episode
    public Integer x() {
        return this.A;
    }

    @Override // com.spotify.playlist.models.Episode
    public Episode.Type y() {
        return this.L;
    }

    @Override // com.spotify.playlist.models.Episode
    public boolean z() {
        return this.y;
    }
}
