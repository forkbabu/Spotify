package com.spotify.playlist.models;

import com.spotify.playlist.models.Covers;
import com.spotify.playlist.models.offline.a;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.h;

public final class j implements g, h {
    private final boolean A;
    private final String B;
    private final Map<String, String> C;
    private final f D;
    private final com.spotify.playlist.models.offline.a E;
    private final int F;
    private final String G;
    private final p H;
    private final int I;
    private final String J;
    private final String a;
    private final String b;
    private final String c;
    private final String f;
    private final Covers n;
    private final p o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final Boolean x;
    private final Boolean y;
    private final OnDemandInFreeReason z;

    public static final class a {
        private OnDemandInFreeReason A;
        private String a;
        private int b;
        private String c;
        private p d;
        private int e;
        private String f;
        private p g;
        private String h;
        private f i;
        private boolean j;
        private String k;
        private String l;
        private boolean m;
        private boolean n;
        private boolean o;
        private String p;
        private boolean q;
        private Boolean r;
        private boolean s;
        private boolean t;
        private boolean u;
        private Boolean v;
        private boolean w;
        private Covers x;
        private com.spotify.playlist.models.offline.a y;
        private Map<String, String> z;

        public a() {
            this(null, 0, null, null, 0, null, null, null, null, false, null, null, false, false, false, null, false, null, false, false, false, null, false, null, null, null, null, 134217727);
        }

        public a(String str, int i2, String str2, p pVar, int i3, String str3, p pVar2, String str4, f fVar, boolean z2, String str5, String str6, boolean z3, boolean z4, boolean z5, String str7, boolean z6, Boolean bool, boolean z7, boolean z8, boolean z9, Boolean bool2, boolean z10, Covers covers, com.spotify.playlist.models.offline.a aVar, Map map, OnDemandInFreeReason onDemandInFreeReason, int i4) {
            boolean z11;
            a.f fVar2;
            boolean z12;
            Map<String, String> map2;
            boolean z13;
            OnDemandInFreeReason onDemandInFreeReason2;
            String str8 = "";
            String str9 = (i4 & 1) != 0 ? str8 : null;
            int i5 = (i4 & 2) != 0 ? 0 : i2;
            String str10 = (i4 & 4) != 0 ? str8 : null;
            int i6 = i4 & 8;
            int i7 = (i4 & 16) != 0 ? 0 : i3;
            int i8 = i4 & 32;
            int i9 = i4 & 64;
            int i10 = i4 & 128;
            int i11 = i4 & 256;
            boolean z14 = (i4 & 512) != 0 ? false : z2;
            str8 = (i4 & 1024) == 0 ? null : str8;
            int i12 = i4 & 2048;
            boolean z15 = (i4 & 4096) != 0 ? false : z3;
            boolean z16 = (i4 & 8192) != 0 ? false : z4;
            boolean z17 = (i4 & 16384) != 0 ? false : z5;
            int i13 = 32768 & i4;
            boolean z18 = (65536 & i4) != 0 ? false : z6;
            int i14 = 131072 & i4;
            boolean z19 = (262144 & i4) != 0 ? false : z7;
            boolean z20 = (524288 & i4) != 0 ? false : z8;
            boolean z21 = (i4 & 1048576) != 0 ? false : z9;
            int i15 = i4 & 2097152;
            boolean z22 = (i4 & 4194304) != 0 ? false : z10;
            Covers a2 = (i4 & 8388608) != 0 ? new Covers.a(null, null, null, null, 15).a() : null;
            if ((i4 & 16777216) != 0) {
                z11 = z21;
                fVar2 = a.f.a;
            } else {
                z11 = z21;
                fVar2 = null;
            }
            if ((i4 & 33554432) != 0) {
                z12 = z20;
                map2 = EmptyMap.a;
            } else {
                z12 = z20;
                map2 = null;
            }
            if ((i4 & 67108864) != 0) {
                onDemandInFreeReason2 = OnDemandInFreeReason.UNKNOWN;
                z13 = z19;
            } else {
                z13 = z19;
                onDemandInFreeReason2 = null;
            }
            h.e(str9, "uri");
            h.e(str10, "name");
            h.e(a2, "covers");
            h.e(fVar2, "offlineState");
            h.e(map2, "formatListAttributes");
            h.e(onDemandInFreeReason2, "onDemandInFreeReason");
            this.a = str9;
            this.b = i5;
            this.c = str10;
            this.d = null;
            this.e = i7;
            this.f = null;
            this.g = null;
            this.h = null;
            this.i = null;
            this.j = z14;
            this.k = str8;
            this.l = null;
            this.m = z15;
            this.n = z16;
            this.o = z17;
            this.p = null;
            this.q = z18;
            this.r = null;
            this.s = z13;
            this.t = z12;
            this.u = z11;
            this.v = null;
            this.w = z22;
            this.x = a2;
            this.y = fVar2;
            this.z = map2;
            this.A = onDemandInFreeReason2;
        }

        public final a A(int i2) {
            this.e = i2;
            return this;
        }

        public final a B(String str) {
            h.e(str, "uri");
            this.a = str;
            return this;
        }

        public final a a(boolean z2) {
            this.s = z2;
            return this;
        }

        public final a b(int i2) {
            this.b = i2;
            return this;
        }

        public final a c(boolean z2) {
            this.t = z2;
            return this;
        }

        public final j d() {
            String str = this.a;
            String str2 = this.c;
            String str3 = this.f;
            p pVar = this.d;
            Covers covers = this.x;
            String str4 = this.h;
            f fVar = this.i;
            int i2 = this.b;
            p pVar2 = this.g;
            boolean z2 = this.j;
            boolean z3 = this.m;
            String str5 = this.l;
            int i3 = this.e;
            String str6 = this.k;
            boolean z4 = this.n;
            com.spotify.playlist.models.offline.a aVar = this.y;
            boolean z5 = this.o;
            String str7 = this.p;
            boolean z6 = this.q;
            Boolean bool = this.r;
            boolean z7 = this.s;
            return new j(str, str4, str2, str6, covers, pVar, z2, z6, z3, z4, this.t, z5, this.w, this.u, this.v, bool, this.A, z7, str7, this.z, fVar, aVar, i3, str3, pVar2, i2, str5);
        }

        public final a e(boolean z2) {
            this.q = z2;
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
            return h.a(this.a, aVar.a) && this.b == aVar.b && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && this.e == aVar.e && h.a(this.f, aVar.f) && h.a(this.g, aVar.g) && h.a(this.h, aVar.h) && h.a(this.i, aVar.i) && this.j == aVar.j && h.a(this.k, aVar.k) && h.a(this.l, aVar.l) && this.m == aVar.m && this.n == aVar.n && this.o == aVar.o && h.a(this.p, aVar.p) && this.q == aVar.q && h.a(this.r, aVar.r) && this.s == aVar.s && this.t == aVar.t && this.u == aVar.u && h.a(this.v, aVar.v) && this.w == aVar.w && h.a(this.x, aVar.x) && h.a(this.y, aVar.y) && h.a(this.z, aVar.z) && h.a(this.A, aVar.A);
        }

        public final a f(Covers covers) {
            h.e(covers, "covers");
            this.x = covers;
            return this;
        }

        public final a g(String str) {
            this.k = str;
            return this;
        }

        public final a h(boolean z2) {
            this.w = z2;
            return this;
        }

        public int hashCode() {
            String str = this.a;
            int i2 = 0;
            int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.b) * 31;
            String str2 = this.c;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            p pVar = this.d;
            int hashCode3 = (((hashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31) + this.e) * 31;
            String str3 = this.f;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            p pVar2 = this.g;
            int hashCode5 = (hashCode4 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31;
            String str4 = this.h;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
            f fVar = this.i;
            int hashCode7 = (hashCode6 + (fVar != null ? fVar.hashCode() : 0)) * 31;
            boolean z2 = this.j;
            int i3 = 1;
            if (z2) {
                z2 = true;
            }
            int i4 = z2 ? 1 : 0;
            int i5 = z2 ? 1 : 0;
            int i6 = z2 ? 1 : 0;
            int i7 = (hashCode7 + i4) * 31;
            String str5 = this.k;
            int hashCode8 = (i7 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.l;
            int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
            boolean z3 = this.m;
            if (z3) {
                z3 = true;
            }
            int i8 = z3 ? 1 : 0;
            int i9 = z3 ? 1 : 0;
            int i10 = z3 ? 1 : 0;
            int i11 = (hashCode9 + i8) * 31;
            boolean z4 = this.n;
            if (z4) {
                z4 = true;
            }
            int i12 = z4 ? 1 : 0;
            int i13 = z4 ? 1 : 0;
            int i14 = z4 ? 1 : 0;
            int i15 = (i11 + i12) * 31;
            boolean z5 = this.o;
            if (z5) {
                z5 = true;
            }
            int i16 = z5 ? 1 : 0;
            int i17 = z5 ? 1 : 0;
            int i18 = z5 ? 1 : 0;
            int i19 = (i15 + i16) * 31;
            String str7 = this.p;
            int hashCode10 = (i19 + (str7 != null ? str7.hashCode() : 0)) * 31;
            boolean z6 = this.q;
            if (z6) {
                z6 = true;
            }
            int i20 = z6 ? 1 : 0;
            int i21 = z6 ? 1 : 0;
            int i22 = z6 ? 1 : 0;
            int i23 = (hashCode10 + i20) * 31;
            Boolean bool = this.r;
            int hashCode11 = (i23 + (bool != null ? bool.hashCode() : 0)) * 31;
            boolean z7 = this.s;
            if (z7) {
                z7 = true;
            }
            int i24 = z7 ? 1 : 0;
            int i25 = z7 ? 1 : 0;
            int i26 = z7 ? 1 : 0;
            int i27 = (hashCode11 + i24) * 31;
            boolean z8 = this.t;
            if (z8) {
                z8 = true;
            }
            int i28 = z8 ? 1 : 0;
            int i29 = z8 ? 1 : 0;
            int i30 = z8 ? 1 : 0;
            int i31 = (i27 + i28) * 31;
            boolean z9 = this.u;
            if (z9) {
                z9 = true;
            }
            int i32 = z9 ? 1 : 0;
            int i33 = z9 ? 1 : 0;
            int i34 = z9 ? 1 : 0;
            int i35 = (i31 + i32) * 31;
            Boolean bool2 = this.v;
            int hashCode12 = (i35 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            boolean z10 = this.w;
            if (!z10) {
                i3 = z10 ? 1 : 0;
            }
            int i36 = (hashCode12 + i3) * 31;
            Covers covers = this.x;
            int hashCode13 = (i36 + (covers != null ? covers.hashCode() : 0)) * 31;
            com.spotify.playlist.models.offline.a aVar = this.y;
            int hashCode14 = (hashCode13 + (aVar != null ? aVar.hashCode() : 0)) * 31;
            Map<String, String> map = this.z;
            int hashCode15 = (hashCode14 + (map != null ? map.hashCode() : 0)) * 31;
            OnDemandInFreeReason onDemandInFreeReason = this.A;
            if (onDemandInFreeReason != null) {
                i2 = onDemandInFreeReason.hashCode();
            }
            return hashCode15 + i2;
        }

        public final a i(f fVar) {
            this.i = fVar;
            return this;
        }

        public final a j(boolean z2) {
            this.m = z2;
            return this;
        }

        public final a k(Map<String, String> map) {
            h.e(map, "formatListAttributes");
            this.z = map;
            return this;
        }

        public final a l(String str) {
            this.p = str;
            return this;
        }

        public final a m(String str) {
            this.l = str;
            return this;
        }

        public final a n(String str) {
            this.h = str;
            return this;
        }

        public final a o(Boolean bool) {
            this.v = bool;
            return this;
        }

        public final a p(Boolean bool) {
            this.r = bool;
            return this;
        }

        public final a q(boolean z2) {
            this.j = z2;
            return this;
        }

        public final a r(p pVar) {
            this.g = pVar;
            return this;
        }

        public final a s(String str) {
            h.e(str, "name");
            this.c = str;
            return this;
        }

        public final a t(com.spotify.playlist.models.offline.a aVar) {
            h.e(aVar, "offlineState");
            this.y = aVar;
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(uri=");
            V0.append(this.a);
            V0.append(", addTime=");
            V0.append(this.b);
            V0.append(", name=");
            V0.append(this.c);
            V0.append(", owner=");
            V0.append(this.d);
            V0.append(", totalLength=");
            V0.append(this.e);
            V0.append(", rowId=");
            V0.append(this.f);
            V0.append(", madeFor=");
            V0.append(this.g);
            V0.append(", header=");
            V0.append(this.h);
            V0.append(", folder=");
            V0.append(this.i);
            V0.append(", isLoaded=");
            V0.append(this.j);
            V0.append(", description=");
            V0.append(this.k);
            V0.append(", groupLabel=");
            V0.append(this.l);
            V0.append(", isFollowed=");
            V0.append(this.m);
            V0.append(", isPublished=");
            V0.append(this.n);
            V0.append(", isOwnedBySelf=");
            V0.append(this.o);
            V0.append(", formatListType=");
            V0.append(this.p);
            V0.append(", isCollaborative=");
            V0.append(this.q);
            V0.append(", isOnDemandInFree=");
            V0.append(this.r);
            V0.append(", isAbuseReportable=");
            V0.append(this.s);
            V0.append(", isBrowsableOffline=");
            V0.append(this.t);
            V0.append(", isPictureAnnotated=");
            V0.append(this.u);
            V0.append(", isCurrentlyPlayable=");
            V0.append(this.v);
            V0.append(", isDescriptionAnnotated=");
            V0.append(this.w);
            V0.append(", covers=");
            V0.append(this.x);
            V0.append(", offlineState=");
            V0.append(this.y);
            V0.append(", formatListAttributes=");
            V0.append(this.z);
            V0.append(", onDemandInFreeReason=");
            V0.append(this.A);
            V0.append(")");
            return V0.toString();
        }

        public final a u(OnDemandInFreeReason onDemandInFreeReason) {
            h.e(onDemandInFreeReason, "onDemandInFreeReason");
            this.A = onDemandInFreeReason;
            return this;
        }

        public final a v(boolean z2) {
            this.o = z2;
            return this;
        }

        public final a w(p pVar) {
            this.d = pVar;
            return this;
        }

        public final a x(boolean z2) {
            this.u = z2;
            return this;
        }

        public final a y(boolean z2) {
            this.n = z2;
            return this;
        }

        public final a z(String str) {
            this.f = str;
            return this;
        }
    }

    public j(String str, String str2, String str3, String str4, Covers covers, p pVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, Boolean bool, Boolean bool2, OnDemandInFreeReason onDemandInFreeReason, boolean z10, String str5, Map<String, String> map, f fVar, com.spotify.playlist.models.offline.a aVar, int i, String str6, p pVar2, int i2, String str7) {
        h.e(str, "uri");
        h.e(str3, "name");
        h.e(covers, "covers");
        h.e(onDemandInFreeReason, "onDemandInFreeReason");
        h.e(map, "formatListAttributes");
        h.e(aVar, "offlineState");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f = str4;
        this.n = covers;
        this.o = pVar;
        this.p = z2;
        this.q = z3;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = z8;
        this.w = z9;
        this.x = bool;
        this.y = bool2;
        this.z = onDemandInFreeReason;
        this.A = z10;
        this.B = str5;
        this.C = map;
        this.D = fVar;
        this.E = aVar;
        this.F = i;
        this.G = str6;
        this.H = pVar2;
        this.I = i2;
        this.J = str7;
    }

    public static final a a() {
        return new a(null, 0, null, null, 0, null, null, null, null, false, null, null, false, false, false, null, false, null, false, false, false, null, false, null, null, null, null, 134217727);
    }

    public final int b() {
        return this.I;
    }

    public final Covers c() {
        return this.n;
    }

    public final String d() {
        return this.f;
    }

    public final f e() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return h.a(this.a, jVar.a) && h.a(this.b, jVar.b) && h.a(this.c, jVar.c) && h.a(this.f, jVar.f) && h.a(this.n, jVar.n) && h.a(this.o, jVar.o) && this.p == jVar.p && this.q == jVar.q && this.r == jVar.r && this.s == jVar.s && this.t == jVar.t && this.u == jVar.u && this.v == jVar.v && this.w == jVar.w && h.a(this.x, jVar.x) && h.a(this.y, jVar.y) && h.a(this.z, jVar.z) && this.A == jVar.A && h.a(this.B, jVar.B) && h.a(this.C, jVar.C) && h.a(this.D, jVar.D) && h.a(this.E, jVar.E) && this.F == jVar.F && h.a(this.G, jVar.G) && h.a(this.H, jVar.H) && this.I == jVar.I && h.a(this.J, jVar.J);
    }

    public final Map<String, String> f() {
        return this.C;
    }

    public final String g() {
        return this.B;
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
        return this.J;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Covers covers = this.n;
        int hashCode5 = (hashCode4 + (covers != null ? covers.hashCode() : 0)) * 31;
        p pVar = this.o;
        int hashCode6 = (hashCode5 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        boolean z2 = this.p;
        int i2 = 1;
        if (z2) {
            z2 = true;
        }
        int i3 = z2 ? 1 : 0;
        int i4 = z2 ? 1 : 0;
        int i5 = z2 ? 1 : 0;
        int i6 = (hashCode6 + i3) * 31;
        boolean z3 = this.q;
        if (z3) {
            z3 = true;
        }
        int i7 = z3 ? 1 : 0;
        int i8 = z3 ? 1 : 0;
        int i9 = z3 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z4 = this.r;
        if (z4) {
            z4 = true;
        }
        int i11 = z4 ? 1 : 0;
        int i12 = z4 ? 1 : 0;
        int i13 = z4 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z5 = this.s;
        if (z5) {
            z5 = true;
        }
        int i15 = z5 ? 1 : 0;
        int i16 = z5 ? 1 : 0;
        int i17 = z5 ? 1 : 0;
        int i18 = (i14 + i15) * 31;
        boolean z6 = this.t;
        if (z6) {
            z6 = true;
        }
        int i19 = z6 ? 1 : 0;
        int i20 = z6 ? 1 : 0;
        int i21 = z6 ? 1 : 0;
        int i22 = (i18 + i19) * 31;
        boolean z7 = this.u;
        if (z7) {
            z7 = true;
        }
        int i23 = z7 ? 1 : 0;
        int i24 = z7 ? 1 : 0;
        int i25 = z7 ? 1 : 0;
        int i26 = (i22 + i23) * 31;
        boolean z8 = this.v;
        if (z8) {
            z8 = true;
        }
        int i27 = z8 ? 1 : 0;
        int i28 = z8 ? 1 : 0;
        int i29 = z8 ? 1 : 0;
        int i30 = (i26 + i27) * 31;
        boolean z9 = this.w;
        if (z9) {
            z9 = true;
        }
        int i31 = z9 ? 1 : 0;
        int i32 = z9 ? 1 : 0;
        int i33 = z9 ? 1 : 0;
        int i34 = (i30 + i31) * 31;
        Boolean bool = this.x;
        int hashCode7 = (i34 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.y;
        int hashCode8 = (hashCode7 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        OnDemandInFreeReason onDemandInFreeReason = this.z;
        int hashCode9 = (hashCode8 + (onDemandInFreeReason != null ? onDemandInFreeReason.hashCode() : 0)) * 31;
        boolean z10 = this.A;
        if (!z10) {
            i2 = z10 ? 1 : 0;
        }
        int i35 = (hashCode9 + i2) * 31;
        String str5 = this.B;
        int hashCode10 = (i35 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Map<String, String> map = this.C;
        int hashCode11 = (hashCode10 + (map != null ? map.hashCode() : 0)) * 31;
        f fVar = this.D;
        int hashCode12 = (hashCode11 + (fVar != null ? fVar.hashCode() : 0)) * 31;
        com.spotify.playlist.models.offline.a aVar = this.E;
        int hashCode13 = (((hashCode12 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.F) * 31;
        String str6 = this.G;
        int hashCode14 = (hashCode13 + (str6 != null ? str6.hashCode() : 0)) * 31;
        p pVar2 = this.H;
        int hashCode15 = (((hashCode14 + (pVar2 != null ? pVar2.hashCode() : 0)) * 31) + this.I) * 31;
        String str7 = this.J;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode15 + i;
    }

    public final p i() {
        return this.H;
    }

    public final String j() {
        return this.c;
    }

    public final com.spotify.playlist.models.offline.a k() {
        return this.E;
    }

    public final OnDemandInFreeReason l() {
        return this.z;
    }

    public final p m() {
        return this.o;
    }

    public final String n() {
        return this.G;
    }

    public final int o() {
        return this.F;
    }

    public final boolean p() {
        return this.A;
    }

    public final boolean q() {
        return this.t;
    }

    public final boolean r() {
        return this.q;
    }

    public final boolean s() {
        return this.D != null;
    }

    public final boolean t() {
        return this.r;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Playlist(uri=");
        V0.append(this.a);
        V0.append(", header=");
        V0.append(this.b);
        V0.append(", name=");
        V0.append(this.c);
        V0.append(", description=");
        V0.append(this.f);
        V0.append(", covers=");
        V0.append(this.n);
        V0.append(", owner=");
        V0.append(this.o);
        V0.append(", isLoaded=");
        V0.append(this.p);
        V0.append(", isCollaborative=");
        V0.append(this.q);
        V0.append(", isFollowed=");
        V0.append(this.r);
        V0.append(", isPublished=");
        V0.append(this.s);
        V0.append(", isBrowsableOffline=");
        V0.append(this.t);
        V0.append(", isOwnedBySelf=");
        V0.append(this.u);
        V0.append(", isDescriptionAnnotated=");
        V0.append(this.v);
        V0.append(", isPictureAnnotated=");
        V0.append(this.w);
        V0.append(", isCurrentlyPlayable=");
        V0.append(this.x);
        V0.append(", isOnDemandInFree=");
        V0.append(this.y);
        V0.append(", onDemandInFreeReason=");
        V0.append(this.z);
        V0.append(", isAbuseReportable=");
        V0.append(this.A);
        V0.append(", formatListType=");
        V0.append(this.B);
        V0.append(", formatListAttributes=");
        V0.append(this.C);
        V0.append(", folder=");
        V0.append(this.D);
        V0.append(", offlineState=");
        V0.append(this.E);
        V0.append(", totalLength=");
        V0.append(this.F);
        V0.append(", rowId=");
        V0.append(this.G);
        V0.append(", madeFor=");
        V0.append(this.H);
        V0.append(", addTime=");
        V0.append(this.I);
        V0.append(", groupLabel=");
        return je.I0(V0, this.J, ")");
    }

    public final boolean u() {
        return this.p;
    }

    public final Boolean v() {
        return this.y;
    }

    public final boolean w() {
        return this.u;
    }

    public final boolean x() {
        return this.w;
    }

    public final boolean y() {
        return this.s;
    }
}
