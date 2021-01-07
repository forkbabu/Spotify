package com.spotify.playlist.models;

import com.spotify.playlist.models.b;
import com.spotify.playlist.models.offline.a;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.h;

public final class a implements g, h {
    private final String A;
    private final String a;
    private final String b;
    private final int c;
    private final String f;
    private final int n;
    private final int o;
    private final Covers p;
    private final int q;
    private final String r;
    private final String s;
    private final int t;
    private final boolean u;
    private final b v;
    private final List<b> w;
    private final com.spotify.playlist.models.offline.a x;
    private final boolean y;
    private final com.spotify.playlist.models.offline.a z;

    /* renamed from: com.spotify.playlist.models.a$a  reason: collision with other inner class name */
    public static final class C0376a {
        private int a;
        private int b;
        private String c;
        private int d;
        private String e;
        private int f;
        private String g;
        private String h;
        private String i;
        private String j;
        private int k;
        private List<b> l;
        private boolean m;
        private boolean n;
        private b o;
        private Covers p;
        private com.spotify.playlist.models.offline.a q;
        private com.spotify.playlist.models.offline.a r;

        public C0376a() {
            this(0, 0, null, 0, null, 0, null, null, null, null, 0, null, false, false, null, null, null, null, 262143);
        }

        public C0376a(int i2, int i3, String str, int i4, String str2, int i5, String str3, String str4, String str5, String str6, int i6, List list, boolean z, boolean z2, b bVar, Covers covers, com.spotify.playlist.models.offline.a aVar, com.spotify.playlist.models.offline.a aVar2, int i7) {
            int i8;
            boolean z3;
            boolean z4;
            b bVar2;
            a.f fVar = a.f.a;
            boolean z5 = false;
            int i9 = (i7 & 1) != 0 ? 0 : i2;
            int i10 = (i7 & 2) != 0 ? 0 : i3;
            String str7 = "";
            String str8 = (i7 & 4) != 0 ? str7 : null;
            int i11 = (i7 & 8) != 0 ? 0 : i4;
            str7 = (i7 & 16) == 0 ? null : str7;
            int i12 = (i7 & 32) != 0 ? 0 : i5;
            int i13 = (i7 & 1024) != 0 ? 0 : i6;
            EmptyList emptyList = (i7 & 2048) != 0 ? EmptyList.a : null;
            boolean z6 = (i7 & 4096) != 0 ? false : z;
            z5 = (i7 & 8192) == 0 ? z2 : z5;
            if ((i7 & 16384) != 0) {
                z4 = z5;
                z3 = z6;
                i8 = i13;
                bVar2 = new b.a(0, "", "", null, null, false, false, null, 0, 0, false, je.Q(null, null, null, null, 15), fVar, fVar).b();
            } else {
                z4 = z5;
                i8 = i13;
                z3 = z6;
                bVar2 = null;
            }
            Covers Q = (32768 & i7) != 0 ? je.Q(null, null, null, null, 15) : null;
            a.f fVar2 = (65536 & i7) != 0 ? fVar : null;
            fVar = (i7 & 131072) == 0 ? null : fVar;
            h.e(str8, "uri");
            h.e(str7, "name");
            h.e(emptyList, "artists");
            h.e(bVar2, "artist");
            h.e(Q, "covers");
            h.e(fVar2, "offlineState");
            h.e(fVar, "inferredOfflineState");
            this.a = i9;
            this.b = i10;
            this.c = str8;
            this.d = i11;
            this.e = str7;
            this.f = i12;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = null;
            this.k = i8;
            this.l = emptyList;
            this.m = z3;
            this.n = z4;
            this.o = bVar2;
            this.p = Q;
            this.q = fVar2;
            this.r = fVar;
        }

        public final C0376a a(int i2) {
            this.b = i2;
            return this;
        }

        public final C0376a b(boolean z) {
            this.m = z;
            return this;
        }

        public final C0376a c(b bVar) {
            h.e(bVar, "artist");
            this.o = bVar;
            return this;
        }

        public final C0376a d(List<b> list) {
            h.e(list, "artists");
            this.l = list;
            return this;
        }

        public final a e() {
            String str = this.c;
            int i2 = this.a;
            String str2 = this.e;
            b bVar = this.o;
            Covers covers = this.p;
            String str3 = this.g;
            List<b> list = this.l;
            int i3 = this.b;
            int i4 = this.d;
            int i5 = this.f;
            String str4 = this.h;
            String str5 = this.i;
            com.spotify.playlist.models.offline.a aVar = this.q;
            return new a(str, str3, i2, str2, i3, i4, covers, i5, str4, this.j, this.k, this.m, bVar, list, aVar, this.n, this.r, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0376a)) {
                return false;
            }
            C0376a aVar = (C0376a) obj;
            return this.a == aVar.a && this.b == aVar.b && h.a(this.c, aVar.c) && this.d == aVar.d && h.a(this.e, aVar.e) && this.f == aVar.f && h.a(this.g, aVar.g) && h.a(this.h, aVar.h) && h.a(this.i, aVar.i) && h.a(this.j, aVar.j) && this.k == aVar.k && h.a(this.l, aVar.l) && this.m == aVar.m && this.n == aVar.n && h.a(this.o, aVar.o) && h.a(this.p, aVar.p) && h.a(this.q, aVar.q) && h.a(this.r, aVar.r);
        }

        public final C0376a f(String str) {
            this.j = str;
            return this;
        }

        public final C0376a g(String str) {
            this.h = str;
            return this;
        }

        public final C0376a h(Covers covers) {
            h.e(covers, "covers");
            this.p = covers;
            return this;
        }

        public int hashCode() {
            int i2 = ((this.a * 31) + this.b) * 31;
            String str = this.c;
            int i3 = 0;
            int hashCode = (((i2 + (str != null ? str.hashCode() : 0)) * 31) + this.d) * 31;
            String str2 = this.e;
            int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f) * 31;
            String str3 = this.g;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.h;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.i;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.j;
            int hashCode6 = (((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.k) * 31;
            List<b> list = this.l;
            int hashCode7 = (hashCode6 + (list != null ? list.hashCode() : 0)) * 31;
            boolean z = this.m;
            int i4 = 1;
            if (z) {
                z = true;
            }
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            int i8 = (hashCode7 + i5) * 31;
            boolean z2 = this.n;
            if (!z2) {
                i4 = z2 ? 1 : 0;
            }
            int i9 = (i8 + i4) * 31;
            b bVar = this.o;
            int hashCode8 = (i9 + (bVar != null ? bVar.hashCode() : 0)) * 31;
            Covers covers = this.p;
            int hashCode9 = (hashCode8 + (covers != null ? covers.hashCode() : 0)) * 31;
            com.spotify.playlist.models.offline.a aVar = this.q;
            int hashCode10 = (hashCode9 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            com.spotify.playlist.models.offline.a aVar2 = this.r;
            if (aVar2 != null) {
                i3 = aVar2.hashCode();
            }
            return hashCode10 + i3;
        }

        public final C0376a i(String str) {
            this.i = str;
            return this;
        }

        public final C0376a j(String str) {
            this.g = str;
            return this;
        }

        public final C0376a k(com.spotify.playlist.models.offline.a aVar) {
            h.e(aVar, "inferredOfflineState");
            this.r = aVar;
            return this;
        }

        public final C0376a l(String str) {
            h.e(str, "name");
            this.e = str;
            return this;
        }

        public final C0376a m(int i2) {
            this.d = i2;
            return this;
        }

        public final C0376a n(int i2) {
            this.f = i2;
            return this;
        }

        public final C0376a o(int i2) {
            this.k = i2;
            return this;
        }

        public final C0376a p(com.spotify.playlist.models.offline.a aVar) {
            h.e(aVar, "offlineState");
            this.q = aVar;
            return this;
        }

        public final C0376a q(boolean z) {
            this.n = z;
            return this;
        }

        public final C0376a r(String str) {
            h.e(str, "uri");
            this.c = str;
            return this;
        }

        public final C0376a s(int i2) {
            this.a = i2;
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(year=");
            V0.append(this.a);
            V0.append(", addTime=");
            V0.append(this.b);
            V0.append(", uri=");
            V0.append(this.c);
            V0.append(", numDiscs=");
            V0.append(this.d);
            V0.append(", name=");
            V0.append(this.e);
            V0.append(", numTracks=");
            V0.append(this.f);
            V0.append(", header=");
            V0.append(this.g);
            V0.append(", copyright=");
            V0.append(this.h);
            V0.append(", groupLabel=");
            V0.append(this.i);
            V0.append(", collectionUri=");
            V0.append(this.j);
            V0.append(", numTracksInCollection=");
            V0.append(this.k);
            V0.append(", artists=");
            V0.append(this.l);
            V0.append(", isAnyTrackPlayable=");
            V0.append(this.m);
            V0.append(", isSavedToCollection=");
            V0.append(this.n);
            V0.append(", artist=");
            V0.append(this.o);
            V0.append(", covers=");
            V0.append(this.p);
            V0.append(", offlineState=");
            V0.append(this.q);
            V0.append(", inferredOfflineState=");
            V0.append(this.r);
            V0.append(")");
            return V0.toString();
        }
    }

    public a(String str, String str2, int i, String str3, int i2, int i3, Covers covers, int i4, String str4, String str5, int i5, boolean z2, b bVar, List<b> list, com.spotify.playlist.models.offline.a aVar, boolean z3, com.spotify.playlist.models.offline.a aVar2, String str6) {
        h.e(str, "uri");
        h.e(str3, "name");
        h.e(covers, "covers");
        h.e(bVar, "artist");
        h.e(list, "artists");
        h.e(aVar, "offlineState");
        h.e(aVar2, "inferredOfflineState");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.f = str3;
        this.n = i2;
        this.o = i3;
        this.p = covers;
        this.q = i4;
        this.r = str4;
        this.s = str5;
        this.t = i5;
        this.u = z2;
        this.v = bVar;
        this.w = list;
        this.x = aVar;
        this.y = z3;
        this.z = aVar2;
        this.A = str6;
    }

    public static final C0376a a() {
        return new C0376a(0, 0, null, 0, null, 0, null, null, null, null, 0, null, false, false, null, null, null, null, 262143);
    }

    public final int b() {
        return this.n;
    }

    public final b c() {
        return this.v;
    }

    public final String d() {
        return this.s;
    }

    public final Covers e() {
        return this.p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && this.c == aVar.c && h.a(this.f, aVar.f) && this.n == aVar.n && this.o == aVar.o && h.a(this.p, aVar.p) && this.q == aVar.q && h.a(this.r, aVar.r) && h.a(this.s, aVar.s) && this.t == aVar.t && this.u == aVar.u && h.a(this.v, aVar.v) && h.a(this.w, aVar.w) && h.a(this.x, aVar.x) && this.y == aVar.y && h.a(this.z, aVar.z) && h.a(this.A, aVar.A);
    }

    public final String f() {
        return this.A;
    }

    public final String g() {
        return this.f;
    }

    @Override // com.spotify.playlist.models.g
    public String getHeader() {
        return this.b;
    }

    @Override // com.spotify.playlist.models.h
    public String getUri() {
        return this.a;
    }

    public final int h() {
        return this.t;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.c) * 31;
        String str3 = this.f;
        int hashCode3 = (((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.n) * 31) + this.o) * 31;
        Covers covers = this.p;
        int hashCode4 = (((hashCode3 + (covers != null ? covers.hashCode() : 0)) * 31) + this.q) * 31;
        String str4 = this.r;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.s;
        int hashCode6 = (((hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.t) * 31;
        boolean z2 = this.u;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int i3 = z2 ? 1 : 0;
        int i4 = z2 ? 1 : 0;
        int i5 = z2 ? 1 : 0;
        int i6 = (hashCode6 + i3) * 31;
        b bVar = this.v;
        int hashCode7 = (i6 + (bVar != null ? bVar.hashCode() : 0)) * 31;
        List<b> list = this.w;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        com.spotify.playlist.models.offline.a aVar = this.x;
        int hashCode9 = (hashCode8 + (aVar != null ? aVar.hashCode() : 0)) * 31;
        boolean z3 = this.y;
        if (!z3) {
            i2 = z3 ? 1 : 0;
        }
        int i7 = (hashCode9 + i2) * 31;
        com.spotify.playlist.models.offline.a aVar2 = this.z;
        int hashCode10 = (i7 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        String str6 = this.A;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode10 + i;
    }

    public final com.spotify.playlist.models.offline.a i() {
        return this.x;
    }

    public final boolean j() {
        return this.u;
    }

    public final boolean k() {
        return this.y;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Album(uri=");
        V0.append(this.a);
        V0.append(", header=");
        V0.append(this.b);
        V0.append(", year=");
        V0.append(this.c);
        V0.append(", name=");
        V0.append(this.f);
        V0.append(", addTime=");
        V0.append(this.n);
        V0.append(", numDiscs=");
        V0.append(this.o);
        V0.append(", covers=");
        V0.append(this.p);
        V0.append(", numTracks=");
        V0.append(this.q);
        V0.append(", copyright=");
        V0.append(this.r);
        V0.append(", collectionUri=");
        V0.append(this.s);
        V0.append(", numTracksInCollection=");
        V0.append(this.t);
        V0.append(", isAnyTrackPlayable=");
        V0.append(this.u);
        V0.append(", artist=");
        V0.append(this.v);
        V0.append(", artists=");
        V0.append(this.w);
        V0.append(", offlineState=");
        V0.append(this.x);
        V0.append(", isSavedToCollection=");
        V0.append(this.y);
        V0.append(", inferredOfflineState=");
        V0.append(this.z);
        V0.append(", groupLabel=");
        return je.I0(V0, this.A, ")");
    }
}
