package com.spotify.playlist.models;

import com.spotify.playlist.models.Covers;
import kotlin.jvm.internal.h;

public final class Show implements g, h {
    private final String a;
    private final String b;
    private final int c;
    private final String f;
    private final String n;
    private final String o;
    private final boolean p;
    private final String q;
    private final boolean r;
    private final long s;
    private final String t;
    private final MediaType u;
    private final Covers v;
    private final ConsumptionOrder w;

    public enum ConsumptionOrder {
        UNKNOWN,
        EPISODIC,
        SEQUENTIAL,
        RECENT;

        static {
            values();
        }
    }

    public enum MediaType {
        MIXED,
        AUDIO,
        VIDEO,
        UNKNOWN;

        static {
            values();
        }
    }

    public static final class a {
        private String a;
        private int b;
        private String c;
        private String d;
        private String e;
        private String f;
        private boolean g;
        private String h;
        private boolean i;
        private long j;
        private String k;
        private MediaType l;
        private Covers m;
        private ConsumptionOrder n;

        public a() {
            this(null, 0, null, null, null, null, false, null, false, 0, null, null, null, null, 16383);
        }

        public a(String str, int i2, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, long j2, String str7, MediaType mediaType, Covers covers, ConsumptionOrder consumptionOrder, int i3) {
            String str8 = "";
            String str9 = (i3 & 1) != 0 ? str8 : null;
            boolean z3 = false;
            int i4 = (i3 & 2) != 0 ? 0 : i2;
            String str10 = (i3 & 4) != 0 ? str8 : null;
            int i5 = i3 & 8;
            String str11 = (i3 & 16) != 0 ? str8 : null;
            String str12 = (i3 & 32) != 0 ? str8 : null;
            boolean z4 = (i3 & 64) != 0 ? false : z;
            String str13 = (i3 & 128) != 0 ? str8 : null;
            z3 = (i3 & 256) == 0 ? z2 : z3;
            long j3 = (i3 & 512) != 0 ? -1 : j2;
            str8 = (i3 & 1024) == 0 ? null : str8;
            MediaType mediaType2 = (i3 & 2048) != 0 ? MediaType.UNKNOWN : null;
            Covers a2 = (i3 & 4096) != 0 ? new Covers.a(null, null, null, null, 15).a() : null;
            ConsumptionOrder consumptionOrder2 = (i3 & 8192) != 0 ? ConsumptionOrder.UNKNOWN : null;
            h.e(str9, "uri");
            h.e(str10, "name");
            h.e(str11, "publisher");
            h.e(str12, "description");
            h.e(str13, "trailerEpisodeUri");
            h.e(str8, "latestPlayedEpisodeLink");
            h.e(mediaType2, "mediaType");
            h.e(a2, "covers");
            h.e(consumptionOrder2, "consumptionOrder");
            this.a = str9;
            this.b = i4;
            this.c = str10;
            this.d = null;
            this.e = str11;
            this.f = str12;
            this.g = z4;
            this.h = str13;
            this.i = z3;
            this.j = j3;
            this.k = str8;
            this.l = mediaType2;
            this.m = a2;
            this.n = consumptionOrder2;
        }

        public final a a(int i2) {
            this.b = i2;
            return this;
        }

        public final Show b() {
            String str = this.a;
            String str2 = this.c;
            Covers covers = this.m;
            String str3 = this.d;
            int i2 = this.b;
            MediaType mediaType = this.l;
            return new Show(str, str3, i2, str2, this.e, this.f, this.g, this.h, this.i, this.j, this.k, mediaType, covers, this.n);
        }

        public final a c(ConsumptionOrder consumptionOrder) {
            h.e(consumptionOrder, "consumptionOrder");
            this.n = consumptionOrder;
            return this;
        }

        public final a d(Covers covers) {
            h.e(covers, "covers");
            this.m = covers;
            return this;
        }

        public final a e(String str) {
            h.e(str, "description");
            this.f = str;
            return this;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return h.a(this.a, aVar.a) && this.b == aVar.b && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && h.a(this.f, aVar.f) && this.g == aVar.g && h.a(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j && h.a(this.k, aVar.k) && h.a(this.l, aVar.l) && h.a(this.m, aVar.m) && h.a(this.n, aVar.n);
        }

        public final a f(boolean z) {
            this.g = z;
            return this;
        }

        public final a g(boolean z) {
            this.i = z;
            return this;
        }

        public final a h(long j2) {
            this.j = j2;
            return this;
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.d;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.e;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.f;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            boolean z = this.g;
            int i3 = 1;
            if (z) {
                z = true;
            }
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = (hashCode5 + i4) * 31;
            String str6 = this.h;
            int hashCode6 = (i7 + (str6 != null ? str6.hashCode() : 0)) * 31;
            boolean z2 = this.i;
            if (!z2) {
                i3 = z2 ? 1 : 0;
            }
            int a2 = (((hashCode6 + i3) * 31) + e.a(this.j)) * 31;
            String str7 = this.k;
            int hashCode7 = (a2 + (str7 != null ? str7.hashCode() : 0)) * 31;
            MediaType mediaType = this.l;
            int hashCode8 = (hashCode7 + (mediaType != null ? mediaType.hashCode() : 0)) * 31;
            Covers covers = this.m;
            int hashCode9 = (hashCode8 + (covers != null ? covers.hashCode() : 0)) * 31;
            ConsumptionOrder consumptionOrder = this.n;
            if (consumptionOrder != null) {
                i2 = consumptionOrder.hashCode();
            }
            return hashCode9 + i2;
        }

        public final a i(String str) {
            h.e(str, "latestPlayedEpisodeLink");
            this.k = str;
            return this;
        }

        public final a j(MediaType mediaType) {
            h.e(mediaType, "mediaType");
            this.l = mediaType;
            return this;
        }

        public final a k(String str) {
            h.e(str, "name");
            this.c = str;
            return this;
        }

        public final a l(String str) {
            h.e(str, "publisher");
            this.e = str;
            return this;
        }

        public final a m(String str) {
            h.e(str, "trailerEpisodeUri");
            this.h = str;
            return this;
        }

        public final a n(String str) {
            h.e(str, "uri");
            this.a = str;
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(uri=");
            V0.append(this.a);
            V0.append(", addTime=");
            V0.append(this.b);
            V0.append(", name=");
            V0.append(this.c);
            V0.append(", header=");
            V0.append(this.d);
            V0.append(", publisher=");
            V0.append(this.e);
            V0.append(", description=");
            V0.append(this.f);
            V0.append(", isFollowing=");
            V0.append(this.g);
            V0.append(", trailerEpisodeUri=");
            V0.append(this.h);
            V0.append(", hasNewEpisodes=");
            V0.append(this.i);
            V0.append(", latestPlayedEpisodeDate=");
            V0.append(this.j);
            V0.append(", latestPlayedEpisodeLink=");
            V0.append(this.k);
            V0.append(", mediaType=");
            V0.append(this.l);
            V0.append(", covers=");
            V0.append(this.m);
            V0.append(", consumptionOrder=");
            V0.append(this.n);
            V0.append(")");
            return V0.toString();
        }
    }

    public Show(String str, String str2, int i, String str3, String str4, String str5, boolean z, String str6, boolean z2, long j, String str7, MediaType mediaType, Covers covers, ConsumptionOrder consumptionOrder) {
        h.e(str, "uri");
        h.e(str3, "name");
        h.e(str4, "publisher");
        h.e(str5, "description");
        h.e(str6, "trailerEpisodeUri");
        h.e(str7, "latestPlayedEpisodeLink");
        h.e(mediaType, "mediaType");
        h.e(covers, "covers");
        h.e(consumptionOrder, "consumptionOrder");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.f = str3;
        this.n = str4;
        this.o = str5;
        this.p = z;
        this.q = str6;
        this.r = z2;
        this.s = j;
        this.t = str7;
        this.u = mediaType;
        this.v = covers;
        this.w = consumptionOrder;
    }

    public static final a a() {
        return new a(null, 0, null, null, null, null, false, null, false, 0, null, null, null, null, 16383);
    }

    public final ConsumptionOrder b() {
        return this.w;
    }

    public final Covers c() {
        return this.v;
    }

    public final String d() {
        return this.o;
    }

    public final long e() {
        return this.s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Show)) {
            return false;
        }
        Show show = (Show) obj;
        return h.a(this.a, show.a) && h.a(this.b, show.b) && this.c == show.c && h.a(this.f, show.f) && h.a(this.n, show.n) && h.a(this.o, show.o) && this.p == show.p && h.a(this.q, show.q) && this.r == show.r && this.s == show.s && h.a(this.t, show.t) && h.a(this.u, show.u) && h.a(this.v, show.v) && h.a(this.w, show.w);
    }

    public final String f() {
        return this.t;
    }

    public final MediaType g() {
        return this.u;
    }

    @Override // com.spotify.playlist.models.g
    public String getHeader() {
        return this.b;
    }

    @Override // com.spotify.playlist.models.h
    public String getUri() {
        return this.a;
    }

    public final String h() {
        return this.f;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.n;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.o;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z = this.p;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode5 + i3) * 31;
        String str6 = this.q;
        int hashCode6 = (i6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        boolean z2 = this.r;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        int a2 = (((hashCode6 + i2) * 31) + e.a(this.s)) * 31;
        String str7 = this.t;
        int hashCode7 = (a2 + (str7 != null ? str7.hashCode() : 0)) * 31;
        MediaType mediaType = this.u;
        int hashCode8 = (hashCode7 + (mediaType != null ? mediaType.hashCode() : 0)) * 31;
        Covers covers = this.v;
        int hashCode9 = (hashCode8 + (covers != null ? covers.hashCode() : 0)) * 31;
        ConsumptionOrder consumptionOrder = this.w;
        if (consumptionOrder != null) {
            i = consumptionOrder.hashCode();
        }
        return hashCode9 + i;
    }

    public final String i() {
        return this.n;
    }

    public final String j() {
        return this.q;
    }

    public final boolean k() {
        return this.p;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Show(uri=");
        V0.append(this.a);
        V0.append(", header=");
        V0.append(this.b);
        V0.append(", addTime=");
        V0.append(this.c);
        V0.append(", name=");
        V0.append(this.f);
        V0.append(", publisher=");
        V0.append(this.n);
        V0.append(", description=");
        V0.append(this.o);
        V0.append(", isFollowing=");
        V0.append(this.p);
        V0.append(", trailerEpisodeUri=");
        V0.append(this.q);
        V0.append(", hasNewEpisodes=");
        V0.append(this.r);
        V0.append(", latestPlayedEpisodeDate=");
        V0.append(this.s);
        V0.append(", latestPlayedEpisodeLink=");
        V0.append(this.t);
        V0.append(", mediaType=");
        V0.append(this.u);
        V0.append(", covers=");
        V0.append(this.v);
        V0.append(", consumptionOrder=");
        V0.append(this.w);
        V0.append(")");
        return V0.toString();
    }

    public Show() {
        this("", null, 0, "", "", "", false, "", false, -1, "", MediaType.UNKNOWN, je.Q(null, null, null, null, 15), ConsumptionOrder.UNKNOWN);
    }
}
