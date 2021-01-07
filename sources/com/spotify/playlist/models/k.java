package com.spotify.playlist.models;

import com.spotify.mobile.android.core.internal.AudioDriver;
import java.util.List;
import kotlin.jvm.internal.h;

public final class k implements i<l> {
    private final j a;
    private final long b;
    private final int c;
    private final boolean f;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final int q;
    private final int r;
    private final long s;
    private final List<o> t;
    private final boolean u;
    private final List<l> v;
    private final boolean w;
    private final int x;
    private final int y;

    public static final class a {
        private Long a;
        private Integer b;
        private j c;
        private Boolean d;
        private Integer e;
        private Integer f;
        private Integer g;
        private Integer h;
        private Long i;
        private Boolean j;
        private List<l> k;
        private Boolean l;
        private Boolean m;
        private List<? extends o> n;
        private Boolean o;
        private Boolean p;

        public a() {
            this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AudioDriver.SPOTIFY_MAX_VOLUME);
        }

        public a(Long l2, Integer num, j jVar, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Long l3, Boolean bool2, List<l> list, Boolean bool3, Boolean bool4, List<? extends o> list2, Boolean bool5, Boolean bool6) {
            this.a = l2;
            this.b = num;
            this.c = jVar;
            this.d = bool;
            this.e = num2;
            this.f = num3;
            this.g = num4;
            this.h = num5;
            this.i = l3;
            this.j = bool2;
            this.k = list;
            this.l = bool3;
            this.m = bool4;
            this.n = list2;
            this.o = bool5;
            this.p = bool6;
        }

        public final k a() {
            List<l> list = this.k;
            h.c(list);
            j jVar = this.c;
            h.c(jVar);
            Long l2 = this.a;
            h.c(l2);
            long longValue = l2.longValue();
            Boolean bool = this.d;
            h.c(bool);
            boolean booleanValue = bool.booleanValue();
            Integer num = this.b;
            h.c(num);
            int intValue = num.intValue();
            Integer num2 = this.e;
            h.c(num2);
            int intValue2 = num2.intValue();
            Integer num3 = this.f;
            h.c(num3);
            int intValue3 = num3.intValue();
            Boolean bool2 = this.j;
            h.c(bool2);
            boolean booleanValue2 = bool2.booleanValue();
            List<? extends o> list2 = this.n;
            h.c(list2);
            Integer num4 = this.h;
            h.c(num4);
            int intValue4 = num4.intValue();
            Integer num5 = this.g;
            h.c(num5);
            int intValue5 = num5.intValue();
            Long l3 = this.i;
            h.c(l3);
            long longValue2 = l3.longValue();
            Boolean bool3 = this.l;
            h.c(bool3);
            boolean booleanValue3 = bool3.booleanValue();
            Boolean bool4 = this.m;
            h.c(bool4);
            boolean booleanValue4 = bool4.booleanValue();
            Boolean bool5 = this.o;
            h.c(bool5);
            boolean booleanValue5 = bool5.booleanValue();
            Boolean bool6 = this.p;
            h.c(bool6);
            return new k(jVar, longValue, intValue, booleanValue4, booleanValue2, booleanValue3, bool6.booleanValue(), intValue4, intValue2, longValue2, list2, booleanValue5, list, booleanValue, intValue5, intValue3);
        }

        public final a b(boolean z) {
            this.p = Boolean.valueOf(z);
            return this;
        }

        public final a c(boolean z) {
            this.l = Boolean.valueOf(z);
            return this;
        }

        public final a d(boolean z) {
            this.j = Boolean.valueOf(z);
            return this;
        }

        public final a e(long j2) {
            this.a = Long.valueOf(j2);
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
            return h.a(this.a, aVar.a) && h.a(this.b, aVar.b) && h.a(this.c, aVar.c) && h.a(this.d, aVar.d) && h.a(this.e, aVar.e) && h.a(this.f, aVar.f) && h.a(this.g, aVar.g) && h.a(this.h, aVar.h) && h.a(this.i, aVar.i) && h.a(this.j, aVar.j) && h.a(this.k, aVar.k) && h.a(this.l, aVar.l) && h.a(this.m, aVar.m) && h.a(this.n, aVar.n) && h.a(this.o, aVar.o) && h.a(this.p, aVar.p);
        }

        public final a f(boolean z) {
            this.m = Boolean.valueOf(z);
            return this;
        }

        public final a g(List<l> list) {
            h.e(list, "items");
            this.k = list;
            return this;
        }

        public final a h(long j2) {
            this.i = Long.valueOf(j2);
            return this;
        }

        public int hashCode() {
            Long l2 = this.a;
            int i2 = 0;
            int hashCode = (l2 != null ? l2.hashCode() : 0) * 31;
            Integer num = this.b;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            j jVar = this.c;
            int hashCode3 = (hashCode2 + (jVar != null ? jVar.hashCode() : 0)) * 31;
            Boolean bool = this.d;
            int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
            Integer num2 = this.e;
            int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
            Integer num3 = this.f;
            int hashCode6 = (hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31;
            Integer num4 = this.g;
            int hashCode7 = (hashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31;
            Integer num5 = this.h;
            int hashCode8 = (hashCode7 + (num5 != null ? num5.hashCode() : 0)) * 31;
            Long l3 = this.i;
            int hashCode9 = (hashCode8 + (l3 != null ? l3.hashCode() : 0)) * 31;
            Boolean bool2 = this.j;
            int hashCode10 = (hashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
            List<l> list = this.k;
            int hashCode11 = (hashCode10 + (list != null ? list.hashCode() : 0)) * 31;
            Boolean bool3 = this.l;
            int hashCode12 = (hashCode11 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
            Boolean bool4 = this.m;
            int hashCode13 = (hashCode12 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
            List<? extends o> list2 = this.n;
            int hashCode14 = (hashCode13 + (list2 != null ? list2.hashCode() : 0)) * 31;
            Boolean bool5 = this.o;
            int hashCode15 = (hashCode14 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
            Boolean bool6 = this.p;
            if (bool6 != null) {
                i2 = bool6.hashCode();
            }
            return hashCode15 + i2;
        }

        public final a i(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final a j(int i2) {
            this.b = Integer.valueOf(i2);
            return this;
        }

        public final a k(int i2) {
            this.h = Integer.valueOf(i2);
            return this;
        }

        public final a l(int i2) {
            this.e = Integer.valueOf(i2);
            return this;
        }

        public final a m(j jVar) {
            h.e(jVar, "playlist");
            this.c = jVar;
            return this;
        }

        public final a n(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        public final a o(List<? extends o> list) {
            h.e(list, "recommendations");
            this.n = list;
            return this;
        }

        public final a p(int i2) {
            this.g = Integer.valueOf(i2);
            return this;
        }

        public final a q(int i2) {
            this.f = Integer.valueOf(i2);
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(duration=");
            V0.append(this.a);
            V0.append(", numFollowers=");
            V0.append(this.b);
            V0.append(", playlist=");
            V0.append(this.c);
            V0.append(", isLoading=");
            V0.append(this.d);
            V0.append(", numberOfTracks=");
            V0.append(this.e);
            V0.append(", unrangedLength=");
            V0.append(this.f);
            V0.append(", unfilteredLength=");
            V0.append(this.g);
            V0.append(", numberOfEpisodes=");
            V0.append(this.h);
            V0.append(", lastModification=");
            V0.append(this.i);
            V0.append(", containsTracks=");
            V0.append(this.j);
            V0.append(", items=");
            V0.append(this.k);
            V0.append(", containsEpisodes=");
            V0.append(this.l);
            V0.append(", hasExplicitContent=");
            V0.append(this.m);
            V0.append(", recommendations=");
            V0.append(this.n);
            V0.append(", preferLinearPlayback=");
            V0.append(this.o);
            V0.append(", containsAudioEpisodes=");
            V0.append(this.p);
            V0.append(")");
            return V0.toString();
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Long l2, Integer num, j jVar, Boolean bool, Integer num2, Integer num3, Integer num4, Integer num5, Long l3, Boolean bool2, List list, Boolean bool3, Boolean bool4, List list2, Boolean bool5, Boolean bool6, int i2) {
            this((i2 & 1) != 0 ? 0L : null, (i2 & 2) != 0 ? 0 : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            int i3 = i2 & 4;
            int i4 = i2 & 8;
            int i5 = i2 & 16;
            int i6 = i2 & 32;
            int i7 = i2 & 64;
            int i8 = i2 & 128;
            int i9 = i2 & 256;
            int i10 = i2 & 512;
            int i11 = i2 & 1024;
            int i12 = i2 & 2048;
            int i13 = i2 & 4096;
            int i14 = i2 & 8192;
            int i15 = i2 & 16384;
            int i16 = i2 & 32768;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r19v0, resolved type: java.util.List<? extends com.spotify.playlist.models.o> */
    /* JADX WARN: Multi-variable type inference failed */
    public k(j jVar, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, long j2, List<? extends o> list, boolean z5, List<l> list2, boolean z6, int i4, int i5) {
        h.e(jVar, "playlist");
        h.e(list, "recommendations");
        h.e(list2, "items");
        this.a = jVar;
        this.b = j;
        this.c = i;
        this.f = z;
        this.n = z2;
        this.o = z3;
        this.p = z4;
        this.q = i2;
        this.r = i3;
        this.s = j2;
        this.t = list;
        this.u = z5;
        this.v = list2;
        this.w = z6;
        this.x = i4;
        this.y = i5;
    }

    public final boolean a() {
        return this.p;
    }

    public final boolean b() {
        return this.o;
    }

    public final boolean c() {
        return this.n;
    }

    public final long d() {
        return this.b;
    }

    public final boolean e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.a(this.a, kVar.a) && this.b == kVar.b && this.c == kVar.c && this.f == kVar.f && this.n == kVar.n && this.o == kVar.o && this.p == kVar.p && this.q == kVar.q && this.r == kVar.r && this.s == kVar.s && h.a(this.t, kVar.t) && this.u == kVar.u && h.a(this.v, kVar.v) && this.w == kVar.w && this.x == kVar.x && this.y == kVar.y;
    }

    public final long f() {
        return this.s;
    }

    public final int g() {
        return this.c;
    }

    @Override // com.spotify.playlist.models.i
    public List<l> getItems() {
        return this.v;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnfilteredLength() {
        return this.x;
    }

    @Override // com.spotify.playlist.models.i
    public int getUnrangedLength() {
        return this.y;
    }

    public final int h() {
        return this.q;
    }

    public int hashCode() {
        j jVar = this.a;
        int i = 0;
        int hashCode = (((((jVar != null ? jVar.hashCode() : 0) * 31) + e.a(this.b)) * 31) + this.c) * 31;
        boolean z = this.f;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.n;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.o;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.p;
        if (z4) {
            z4 = true;
        }
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = z4 ? 1 : 0;
        int a2 = (((((((i14 + i15) * 31) + this.q) * 31) + this.r) * 31) + e.a(this.s)) * 31;
        List<o> list = this.t;
        int hashCode2 = (a2 + (list != null ? list.hashCode() : 0)) * 31;
        boolean z5 = this.u;
        if (z5) {
            z5 = true;
        }
        int i18 = z5 ? 1 : 0;
        int i19 = z5 ? 1 : 0;
        int i20 = z5 ? 1 : 0;
        int i21 = (hashCode2 + i18) * 31;
        List<l> list2 = this.v;
        if (list2 != null) {
            i = list2.hashCode();
        }
        int i22 = (i21 + i) * 31;
        boolean z6 = this.w;
        if (!z6) {
            i2 = z6 ? 1 : 0;
        }
        return ((((i22 + i2) * 31) + this.x) * 31) + this.y;
    }

    public final int i() {
        return this.r;
    }

    @Override // com.spotify.playlist.models.i
    public boolean isLoading() {
        return this.w;
    }

    public final j j() {
        return this.a;
    }

    public final boolean k() {
        return this.u;
    }

    public final List<o> l() {
        return this.t;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaylistEntity(playlist=");
        V0.append(this.a);
        V0.append(", duration=");
        V0.append(this.b);
        V0.append(", numFollowers=");
        V0.append(this.c);
        V0.append(", hasExplicitContent=");
        V0.append(this.f);
        V0.append(", containsTracks=");
        V0.append(this.n);
        V0.append(", containsEpisodes=");
        V0.append(this.o);
        V0.append(", containsAudioEpisodes=");
        V0.append(this.p);
        V0.append(", numberOfEpisodes=");
        V0.append(this.q);
        V0.append(", numberOfTracks=");
        V0.append(this.r);
        V0.append(", lastModification=");
        V0.append(this.s);
        V0.append(", recommendations=");
        V0.append(this.t);
        V0.append(", preferLinearPlayback=");
        V0.append(this.u);
        V0.append(", items=");
        V0.append(this.v);
        V0.append(", isLoading=");
        V0.append(this.w);
        V0.append(", unfilteredLength=");
        V0.append(this.x);
        V0.append(", unrangedLength=");
        return je.B0(V0, this.y, ")");
    }
}
