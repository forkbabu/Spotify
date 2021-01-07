package com.spotify.music.features.podcast.episode.inspector.tracklist.model;

import com.spotify.music.features.podcast.episode.inspector.tracklist.model.c;
import java.util.List;

final class a extends c {
    private final long a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final List<String> h;
    private final String i;
    private final String j;
    private final String k;
    private final TrackListItemType l;
    private final boolean m;

    /* access modifiers changed from: package-private */
    public static final class b implements c.a {
        private Long a;
        private Long b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private List<String> h;
        private String i;
        private String j;
        private String k;
        private TrackListItemType l;
        private Boolean m;

        b() {
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a a(String str) {
            this.g = str;
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a b(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c build() {
            String str = this.a == null ? " startTimeMs" : "";
            if (this.b == null) {
                str = je.x0(str, " endTimeMs");
            }
            if (this.c == null) {
                str = je.x0(str, " trackUri");
            }
            if (this.h == null) {
                str = je.x0(str, " artistNames");
            }
            if (this.l == null) {
                str = je.x0(str, " segmentType");
            }
            if (this.m == null) {
                str = je.x0(str, " isAbridged");
            }
            if (str.isEmpty()) {
                return new a(this.a.longValue(), this.b.longValue(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m.booleanValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a c(String str) {
            this.e = str;
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a d(String str) {
            this.k = str;
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a e(List<String> list) {
            if (list != null) {
                this.h = list;
                return this;
            }
            throw new NullPointerException("Null artistNames");
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a f(String str) {
            this.f = str;
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a g(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a h(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null trackUri");
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a i(String str) {
            this.i = str;
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a j(String str) {
            this.j = str;
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a k(String str) {
            this.d = str;
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a l(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c.a
        public c.a m(TrackListItemType trackListItemType) {
            if (trackListItemType != null) {
                this.l = trackListItemType;
                return this;
            }
            throw new NullPointerException("Null segmentType");
        }
    }

    a(long j2, long j3, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, TrackListItemType trackListItemType, boolean z, C0246a aVar) {
        this.a = j2;
        this.b = j3;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = list;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = trackListItemType;
        this.m = z;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public List<String> a() {
        return this.h;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public long c() {
        return this.b;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public String d() {
        return this.k;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.k() || this.b != cVar.c() || !this.c.equals(cVar.n()) || ((str = this.d) != null ? !str.equals(cVar.i()) : cVar.i() != null) || ((str2 = this.e) != null ? !str2.equals(cVar.h()) : cVar.h() != null) || ((str3 = this.f) != null ? !str3.equals(cVar.m()) : cVar.m() != null) || ((str4 = this.g) != null ? !str4.equals(cVar.e()) : cVar.e() != null) || !this.h.equals(cVar.a()) || ((str5 = this.i) != null ? !str5.equals(cVar.g()) : cVar.g() != null) || ((str6 = this.j) != null ? !str6.equals(cVar.l()) : cVar.l() != null) || ((str7 = this.k) != null ? !str7.equals(cVar.d()) : cVar.d() != null) || !this.l.equals(cVar.j()) || this.m != cVar.f()) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public boolean f() {
        return this.m;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public String g() {
        return this.i;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public String h() {
        return this.e;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        int hashCode = (((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        int i2 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.e;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.g;
        int hashCode5 = (((hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003;
        String str5 = this.i;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.j;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.k;
        if (str7 != null) {
            i2 = str7.hashCode();
        }
        return (this.m ? 1231 : 1237) ^ ((((hashCode7 ^ i2) * 1000003) ^ this.l.hashCode()) * 1000003);
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public String i() {
        return this.d;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public TrackListItemType j() {
        return this.l;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public long k() {
        return this.a;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public String l() {
        return this.j;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public String m() {
        return this.f;
    }

    @Override // com.spotify.music.features.podcast.episode.inspector.tracklist.model.c
    public String n() {
        return this.c;
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackListItemModel{startTimeMs=");
        V0.append(this.a);
        V0.append(", endTimeMs=");
        V0.append(this.b);
        V0.append(", trackUri=");
        V0.append(this.c);
        V0.append(", segmentTitle=");
        V0.append(this.d);
        V0.append(", segmentSubtitle=");
        V0.append(this.e);
        V0.append(", trackName=");
        V0.append(this.f);
        V0.append(", episodeName=");
        V0.append(this.g);
        V0.append(", artistNames=");
        V0.append(this.h);
        V0.append(", segmentImageUrl=");
        V0.append(this.i);
        V0.append(", trackImageUrl=");
        V0.append(this.j);
        V0.append(", episodeImageUrl=");
        V0.append(this.k);
        V0.append(", segmentType=");
        V0.append(this.l);
        V0.append(", isAbridged=");
        return je.P0(V0, this.m, "}");
    }
}
