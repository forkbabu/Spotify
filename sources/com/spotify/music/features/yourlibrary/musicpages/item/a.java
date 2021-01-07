package com.spotify.music.features.yourlibrary.musicpages.item;

import com.spotify.music.features.yourlibrary.musicpages.item.MusicItem;
import java.util.Date;
import java.util.List;

abstract class a extends MusicItem {
    private final MusicItem.c A;
    private final String B;
    private final Date C;
    private final List<fb9> D;
    private final long c;
    private final MusicItem.Type f;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final int w;
    private final int x;
    private final Boolean y;
    private final com.spotify.playlist.models.offline.a z;

    /* access modifiers changed from: package-private */
    public static class b extends MusicItem.b {
        private Long a;
        private MusicItem.Type b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private Integer l;
        private Integer m;
        private Boolean n;
        private com.spotify.playlist.models.offline.a o;
        private MusicItem.c p;
        private String q;
        private Date r;
        private List<fb9> s;

        b() {
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b a(int i2) {
            this.l = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem b() {
            String str = this.a == null ? " uniqueId" : "";
            if (this.b == null) {
                str = je.x0(str, " type");
            }
            if (this.c == null) {
                str = je.x0(str, " isEnabled");
            }
            if (this.d == null) {
                str = je.x0(str, " followed");
            }
            if (this.e == null) {
                str = je.x0(str, " showFollow");
            }
            if (this.f == null) {
                str = je.x0(str, " isFollowDisabled");
            }
            if (this.g == null) {
                str = je.x0(str, " title");
            }
            if (this.h == null) {
                str = je.x0(str, " subtitle");
            }
            if (this.i == null) {
                str = je.x0(str, " uri");
            }
            if (this.j == null) {
                str = je.x0(str, " targetUri");
            }
            if (this.k == null) {
                str = je.x0(str, " imageUri");
            }
            if (this.l == null) {
                str = je.x0(str, " addTime");
            }
            if (this.m == null) {
                str = je.x0(str, " indexInDataSource");
            }
            if (str.isEmpty()) {
                return new i(this.a.longValue(), this.b, this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g, this.h, this.i, this.j, this.k, this.l.intValue(), this.m.intValue(), this.n, this.o, this.p, this.q, this.r, this.s);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b c(MusicItem.c cVar) {
            this.p = cVar;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b d(List<fb9> list) {
            this.s = list;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b e(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b f(String str) {
            if (str != null) {
                this.k = str;
                return this;
            }
            throw new NullPointerException("Null imageUri");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b g(int i2) {
            this.m = Integer.valueOf(i2);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b h(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b i(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b j(Boolean bool) {
            this.n = bool;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b k(com.spotify.playlist.models.offline.a aVar) {
            this.o = aVar;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b l(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b m(String str) {
            if (str != null) {
                this.h = str;
                return this;
            }
            throw new NullPointerException("Null subtitle");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b n(String str) {
            if (str != null) {
                this.j = str;
                return this;
            }
            throw new NullPointerException("Null targetUri");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b o(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b p(MusicItem.Type type) {
            this.b = type;
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b q(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem.b
        public MusicItem.b r(String str) {
            if (str != null) {
                this.i = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public MusicItem.b s(Date date) {
            this.r = null;
            return this;
        }

        public MusicItem.b t(String str) {
            this.q = null;
            return this;
        }

        b(MusicItem musicItem, C0263a aVar) {
            this.a = Long.valueOf(musicItem.a());
            this.b = musicItem.type();
            this.c = Boolean.valueOf(musicItem.l());
            this.d = Boolean.valueOf(musicItem.i());
            this.e = Boolean.valueOf(musicItem.t());
            this.f = Boolean.valueOf(musicItem.m());
            this.g = musicItem.w();
            this.h = musicItem.u();
            this.i = musicItem.A();
            this.j = musicItem.v();
            this.k = musicItem.j();
            this.l = Integer.valueOf(musicItem.b());
            this.m = Integer.valueOf(musicItem.k());
            this.n = musicItem.n();
            this.o = musicItem.p();
            this.p = musicItem.g();
            this.q = musicItem.r();
            this.r = musicItem.q();
            this.s = musicItem.h();
        }
    }

    a(long j, MusicItem.Type type, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, String str3, String str4, String str5, int i, int i2, Boolean bool, com.spotify.playlist.models.offline.a aVar, MusicItem.c cVar, String str6, Date date, List<fb9> list) {
        this.c = j;
        if (type != null) {
            this.f = type;
            this.n = z2;
            this.o = z3;
            this.p = z4;
            this.q = z5;
            if (str != null) {
                this.r = str;
                if (str2 != null) {
                    this.s = str2;
                    if (str3 != null) {
                        this.t = str3;
                        if (str4 != null) {
                            this.u = str4;
                            if (str5 != null) {
                                this.v = str5;
                                this.w = i;
                                this.x = i2;
                                this.y = bool;
                                this.z = aVar;
                                this.A = cVar;
                                this.B = str6;
                                this.C = date;
                                this.D = list;
                                return;
                            }
                            throw new NullPointerException("Null imageUri");
                        }
                        throw new NullPointerException("Null targetUri");
                    }
                    throw new NullPointerException("Null uri");
                }
                throw new NullPointerException("Null subtitle");
            }
            throw new NullPointerException("Null title");
        }
        throw new NullPointerException("Null type");
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public String A() {
        return this.t;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem, defpackage.d39.b
    public long a() {
        return this.c;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public int b() {
        return this.w;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        Boolean bool;
        com.spotify.playlist.models.offline.a aVar;
        MusicItem.c cVar;
        String str;
        Date date;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MusicItem)) {
            return false;
        }
        MusicItem musicItem = (MusicItem) obj;
        if (this.c == musicItem.a() && this.f.equals(musicItem.type()) && this.n == musicItem.l() && this.o == musicItem.i() && this.p == musicItem.t() && this.q == musicItem.m() && this.r.equals(musicItem.w()) && this.s.equals(musicItem.u()) && this.t.equals(musicItem.A()) && this.u.equals(musicItem.v()) && this.v.equals(musicItem.j()) && this.w == musicItem.b() && this.x == musicItem.k() && ((bool = this.y) != null ? bool.equals(musicItem.n()) : musicItem.n() == null) && ((aVar = this.z) != null ? aVar.equals(musicItem.p()) : musicItem.p() == null) && ((cVar = this.A) != null ? cVar.equals(musicItem.g()) : musicItem.g() == null) && ((str = this.B) != null ? str.equals(musicItem.r()) : musicItem.r() == null) && ((date = this.C) != null ? date.equals(musicItem.q()) : musicItem.q() == null)) {
            List<fb9> list = this.D;
            if (list == null) {
                if (musicItem.h() == null) {
                    return true;
                }
            } else if (list.equals(musicItem.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public MusicItem.c g() {
        return this.A;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public List<fb9> h() {
        return this.D;
    }

    @Override // java.lang.Object
    public int hashCode() {
        long j = this.c;
        int i = 1231;
        int hashCode = (((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f.hashCode()) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ (this.o ? 1231 : 1237)) * 1000003) ^ (this.p ? 1231 : 1237)) * 1000003;
        if (!this.q) {
            i = 1237;
        }
        int hashCode2 = (((((((((((((((hashCode ^ i) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.w) * 1000003) ^ this.x) * 1000003;
        Boolean bool = this.y;
        int i2 = 0;
        int hashCode3 = (hashCode2 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        com.spotify.playlist.models.offline.a aVar = this.z;
        int hashCode4 = (hashCode3 ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003;
        MusicItem.c cVar = this.A;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        String str = this.B;
        int hashCode6 = (hashCode5 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        Date date = this.C;
        int hashCode7 = (hashCode6 ^ (date == null ? 0 : date.hashCode())) * 1000003;
        List<fb9> list = this.D;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode7 ^ i2;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public boolean i() {
        return this.o;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public String j() {
        return this.v;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public int k() {
        return this.x;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public boolean l() {
        return this.n;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public boolean m() {
        return this.q;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public Boolean n() {
        return this.y;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public com.spotify.playlist.models.offline.a p() {
        return this.z;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public Date q() {
        return this.C;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public String r() {
        return this.B;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public boolean t() {
        return this.p;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("MusicItem{uniqueId=");
        V0.append(this.c);
        V0.append(", type=");
        V0.append(this.f);
        V0.append(", isEnabled=");
        V0.append(this.n);
        V0.append(", followed=");
        V0.append(this.o);
        V0.append(", showFollow=");
        V0.append(this.p);
        V0.append(", isFollowDisabled=");
        V0.append(this.q);
        V0.append(", title=");
        V0.append(this.r);
        V0.append(", subtitle=");
        V0.append(this.s);
        V0.append(", uri=");
        V0.append(this.t);
        V0.append(", targetUri=");
        V0.append(this.u);
        V0.append(", imageUri=");
        V0.append(this.v);
        V0.append(", addTime=");
        V0.append(this.w);
        V0.append(", indexInDataSource=");
        V0.append(this.x);
        V0.append(", isOnDemand=");
        V0.append(this.y);
        V0.append(", offlineState=");
        V0.append(this.z);
        V0.append(", extras=");
        V0.append(this.A);
        V0.append(", quickScrollLabel=");
        V0.append(this.B);
        V0.append(", quickScrollDate=");
        V0.append(this.C);
        V0.append(", filterTags=");
        return je.L0(V0, this.D, "}");
    }

    /* Return type fixed from 'java.lang.Enum' to match base method */
    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem, defpackage.d39.b
    public MusicItem.Type type() {
        return this.f;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public String u() {
        return this.s;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public String v() {
        return this.u;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public String w() {
        return this.r;
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public MusicItem.b x() {
        return new b(this, null);
    }

    @Override // com.spotify.music.features.yourlibrary.musicpages.item.MusicItem
    public MusicItem.Type z() {
        return this.f;
    }
}
