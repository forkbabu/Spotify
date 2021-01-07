package com.spotify.playlist.models;

import com.spotify.playlist.models.offline.a;
import kotlin.jvm.internal.h;

public final class b implements g, h {
    private final String a;
    private final String b;
    private final Covers c;
    private final com.spotify.playlist.models.offline.a f;
    private final com.spotify.playlist.models.offline.a n;
    private final int o;
    private final int p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final int t;
    private final String u;
    private final String v;
    private final String w;

    public b(String str, String str2, Covers covers, com.spotify.playlist.models.offline.a aVar, com.spotify.playlist.models.offline.a aVar2, int i, int i2, boolean z, boolean z2, boolean z3, int i3, String str3, String str4, String str5) {
        h.e(str2, "name");
        h.e(covers, "covers");
        h.e(aVar, "offlineState");
        h.e(aVar2, "inferredOfflineState");
        h.e(str5, "uri");
        this.a = str;
        this.b = str2;
        this.c = covers;
        this.f = aVar;
        this.n = aVar2;
        this.o = i;
        this.p = i2;
        this.q = z;
        this.r = z2;
        this.s = z3;
        this.t = i3;
        this.u = str3;
        this.v = str4;
        this.w = str5;
    }

    public static final a a() {
        Covers Q = je.Q(null, null, null, null, 15);
        a.f fVar = a.f.a;
        return new a(0, "", "", null, null, false, false, null, 0, 0, false, Q, fVar, fVar);
    }

    public final int b() {
        return this.t;
    }

    public final String c() {
        return this.a;
    }

    public final Covers d() {
        return this.c;
    }

    public final String e() {
        return this.u;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return h.a(this.a, bVar.a) && h.a(this.b, bVar.b) && h.a(this.c, bVar.c) && h.a(this.f, bVar.f) && h.a(this.n, bVar.n) && this.o == bVar.o && this.p == bVar.p && this.q == bVar.q && this.r == bVar.r && this.s == bVar.s && this.t == bVar.t && h.a(this.u, bVar.u) && h.a(this.v, bVar.v) && h.a(this.w, bVar.w);
    }

    public final String f() {
        return this.b;
    }

    public final int g() {
        return this.o;
    }

    @Override // com.spotify.playlist.models.g
    public String getHeader() {
        return this.v;
    }

    @Override // com.spotify.playlist.models.h
    public String getUri() {
        return this.w;
    }

    public final com.spotify.playlist.models.offline.a h() {
        return this.f;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Covers covers = this.c;
        int hashCode3 = (hashCode2 + (covers != null ? covers.hashCode() : 0)) * 31;
        com.spotify.playlist.models.offline.a aVar = this.f;
        int hashCode4 = (hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        com.spotify.playlist.models.offline.a aVar2 = this.n;
        int hashCode5 = (((((hashCode4 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31) + this.o) * 31) + this.p) * 31;
        boolean z = this.q;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode5 + i3) * 31;
        boolean z2 = this.r;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.s;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        int i11 = (((i10 + i2) * 31) + this.t) * 31;
        String str3 = this.u;
        int hashCode6 = (i11 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.v;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.w;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode7 + i;
    }

    public final boolean i() {
        return this.r;
    }

    public final boolean j() {
        return this.q;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Artist(collectionUri=");
        V0.append(this.a);
        V0.append(", name=");
        V0.append(this.b);
        V0.append(", covers=");
        V0.append(this.c);
        V0.append(", offlineState=");
        V0.append(this.f);
        V0.append(", inferredOfflineState=");
        V0.append(this.n);
        V0.append(", numTracksInCollection=");
        V0.append(this.o);
        V0.append(", numAlbumsInCollection=");
        V0.append(this.p);
        V0.append(", isFollowed=");
        V0.append(this.q);
        V0.append(", isDismissed=");
        V0.append(this.r);
        V0.append(", isVariousArtists=");
        V0.append(this.s);
        V0.append(", addTime=");
        V0.append(this.t);
        V0.append(", groupLabel=");
        V0.append(this.u);
        V0.append(", header=");
        V0.append(this.v);
        V0.append(", uri=");
        return je.I0(V0, this.w, ")");
    }

    public static final class a {
        private int a;
        private String b;
        private String c;
        private String d;
        private String e;
        private boolean f;
        private boolean g;
        private String h;
        private int i;
        private int j;
        private boolean k;
        private Covers l;
        private com.spotify.playlist.models.offline.a m;
        private com.spotify.playlist.models.offline.a n;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a() {
            /*
                r15 = this;
                com.spotify.playlist.models.offline.a$f r14 = com.spotify.playlist.models.offline.a.f.a
                r1 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r0 = 0
                r2 = 0
                r3 = 0
                r12 = 0
                r13 = 15
                com.spotify.playlist.models.Covers r12 = defpackage.je.Q(r0, r2, r3, r12, r13)
                java.lang.String r3 = ""
                r0 = r15
                r2 = r3
                r13 = r14
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.playlist.models.b.a.<init>():void");
        }

        public final a a(int i2) {
            this.a = i2;
            return this;
        }

        public final b b() {
            String str = this.b;
            String str2 = this.c;
            String str3 = this.d;
            Covers covers = this.l;
            int i2 = this.a;
            String str4 = this.e;
            boolean z = this.f;
            boolean z2 = this.g;
            com.spotify.playlist.models.offline.a aVar = this.m;
            return new b(this.h, str2, covers, aVar, this.n, this.j, this.i, z, z2, this.k, i2, str4, str3, str);
        }

        public final a c(String str) {
            this.h = str;
            return this;
        }

        public final a d(Covers covers) {
            h.e(covers, "covers");
            this.l = covers;
            return this;
        }

        public final a e(boolean z) {
            this.g = z;
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
            return this.a == aVar.a && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && h.a(this.h, aVar.h) && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && h.a(this.l, aVar.l) && h.a(this.m, aVar.m) && h.a(this.n, aVar.n);
        }

        public final a f(boolean z) {
            this.f = z;
            return this;
        }

        public final a g(String str) {
            this.e = str;
            return this;
        }

        public final a h(String str) {
            this.d = str;
            return this;
        }

        public int hashCode() {
            int i2 = this.a * 31;
            String str = this.b;
            int i3 = 0;
            int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.d;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.e;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            boolean z = this.f;
            int i4 = 1;
            if (z) {
                z = true;
            }
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            int i8 = (hashCode4 + i5) * 31;
            boolean z2 = this.g;
            if (z2) {
                z2 = true;
            }
            int i9 = z2 ? 1 : 0;
            int i10 = z2 ? 1 : 0;
            int i11 = z2 ? 1 : 0;
            int i12 = (i8 + i9) * 31;
            String str5 = this.h;
            int hashCode5 = (((((i12 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.i) * 31) + this.j) * 31;
            boolean z3 = this.k;
            if (!z3) {
                i4 = z3 ? 1 : 0;
            }
            int i13 = (hashCode5 + i4) * 31;
            Covers covers = this.l;
            int hashCode6 = (i13 + (covers != null ? covers.hashCode() : 0)) * 31;
            com.spotify.playlist.models.offline.a aVar = this.m;
            int hashCode7 = (hashCode6 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            com.spotify.playlist.models.offline.a aVar2 = this.n;
            if (aVar2 != null) {
                i3 = aVar2.hashCode();
            }
            return hashCode7 + i3;
        }

        public final a i(com.spotify.playlist.models.offline.a aVar) {
            h.e(aVar, "inferredOfflineState");
            this.n = aVar;
            return this;
        }

        public final a j(String str) {
            h.e(str, "name");
            this.c = str;
            return this;
        }

        public final a k(int i2) {
            this.i = i2;
            return this;
        }

        public final a l(int i2) {
            this.j = i2;
            return this;
        }

        public final a m(com.spotify.playlist.models.offline.a aVar) {
            h.e(aVar, "offlineState");
            this.m = aVar;
            return this;
        }

        public final a n(String str) {
            h.e(str, "uri");
            this.b = str;
            return this;
        }

        public final a o(boolean z) {
            this.k = z;
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(addTime=");
            V0.append(this.a);
            V0.append(", uri=");
            V0.append(this.b);
            V0.append(", name=");
            V0.append(this.c);
            V0.append(", header=");
            V0.append(this.d);
            V0.append(", groupLabel=");
            V0.append(this.e);
            V0.append(", isFollowed=");
            V0.append(this.f);
            V0.append(", isDismissed=");
            V0.append(this.g);
            V0.append(", collectionUri=");
            V0.append(this.h);
            V0.append(", numAlbumsInCollection=");
            V0.append(this.i);
            V0.append(", numTracksInCollection=");
            V0.append(this.j);
            V0.append(", isVariousArtists=");
            V0.append(this.k);
            V0.append(", covers=");
            V0.append(this.l);
            V0.append(", offlineState=");
            V0.append(this.m);
            V0.append(", inferredOfflineState=");
            V0.append(this.n);
            V0.append(")");
            return V0.toString();
        }

        public a(int i2, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, int i3, int i4, boolean z3, Covers covers, com.spotify.playlist.models.offline.a aVar, com.spotify.playlist.models.offline.a aVar2) {
            h.e(str, "uri");
            h.e(str2, "name");
            h.e(covers, "covers");
            h.e(aVar, "offlineState");
            h.e(aVar2, "inferredOfflineState");
            this.a = i2;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = z;
            this.g = z2;
            this.h = str5;
            this.i = i3;
            this.j = i4;
            this.k = z3;
            this.l = covers;
            this.m = aVar;
            this.n = aVar2;
        }
    }
}
