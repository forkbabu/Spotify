package defpackage;

import com.spotify.playlist.models.j;
import kotlin.jvm.internal.h;

/* renamed from: h76  reason: default package */
public final class h76 {
    private final long a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final long f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final j k;
    private final z66 l;

    /* renamed from: h76$a */
    public static final class a {
        private long a;
        private int b;
        private int c;
        private int d;
        private int e;
        private long f;
        private boolean g;
        private boolean h;
        private boolean i;
        private boolean j;
        private z66 k;
        private j l;

        public a() {
            this(0, 0, 0, 0, 0, 0, false, false, false, false, null, null, 4095);
        }

        public a(long j2, int i2, int i3, int i4, int i5, long j3, boolean z, boolean z2, boolean z3, boolean z4, z66 z66, j jVar, int i6) {
            boolean z5;
            z66 z662;
            long j4 = 0;
            long j5 = (i6 & 1) != 0 ? 0 : j2;
            boolean z6 = false;
            int i7 = (i6 & 2) != 0 ? 0 : i2;
            int i8 = (i6 & 4) != 0 ? 0 : i3;
            int i9 = (i6 & 8) != 0 ? 0 : i4;
            int i10 = (i6 & 16) != 0 ? 0 : i5;
            j4 = (i6 & 32) == 0 ? j3 : j4;
            boolean z7 = (i6 & 64) != 0 ? false : z;
            boolean z8 = (i6 & 128) != 0 ? false : z2;
            boolean z9 = (i6 & 256) != 0 ? false : z3;
            z6 = (i6 & 512) == 0 ? z4 : z6;
            j jVar2 = null;
            if ((i6 & 1024) != 0) {
                z5 = z6;
                z662 = new z66(null, null, 3);
            } else {
                z5 = z6;
                z662 = null;
            }
            jVar2 = (i6 & 2048) != 0 ? new j.a(null, 0, null, null, 0, null, null, null, null, false, null, null, false, false, false, null, false, null, false, false, false, null, false, null, null, null, null, 134217727).d() : jVar2;
            h.e(z662, "filterAndSort");
            h.e(jVar2, "playlist");
            this.a = j5;
            this.b = i7;
            this.c = i8;
            this.d = i9;
            this.e = i10;
            this.f = j4;
            this.g = z7;
            this.h = z8;
            this.i = z9;
            this.j = z5;
            this.k = z662;
            this.l = jVar2;
        }

        public final h76 a() {
            j jVar = this.l;
            long j2 = this.a;
            z66 z66 = this.k;
            int i2 = this.b;
            boolean z = this.g;
            return new h76(j2, i2, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, jVar, z66);
        }

        public final a b(boolean z) {
            this.j = z;
            return this;
        }

        public final a c(boolean z) {
            this.h = z;
            return this;
        }

        public final a d(boolean z) {
            this.g = z;
            return this;
        }

        public final a e(long j2) {
            this.a = j2;
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
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && h.a(this.k, aVar.k) && h.a(this.l, aVar.l);
        }

        public final a f(z66 z66) {
            h.e(z66, "filterAndSort");
            this.k = z66;
            return this;
        }

        public final a g(boolean z) {
            this.i = z;
            return this;
        }

        public final a h(long j2) {
            this.f = j2;
            return this;
        }

        public int hashCode() {
            int a2 = ((((((((((e.a(this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + e.a(this.f)) * 31;
            boolean z = this.g;
            int i2 = 1;
            if (z) {
                z = true;
            }
            int i3 = z ? 1 : 0;
            int i4 = z ? 1 : 0;
            int i5 = z ? 1 : 0;
            int i6 = (a2 + i3) * 31;
            boolean z2 = this.h;
            if (z2) {
                z2 = true;
            }
            int i7 = z2 ? 1 : 0;
            int i8 = z2 ? 1 : 0;
            int i9 = z2 ? 1 : 0;
            int i10 = (i6 + i7) * 31;
            boolean z3 = this.i;
            if (z3) {
                z3 = true;
            }
            int i11 = z3 ? 1 : 0;
            int i12 = z3 ? 1 : 0;
            int i13 = z3 ? 1 : 0;
            int i14 = (i10 + i11) * 31;
            boolean z4 = this.j;
            if (!z4) {
                i2 = z4 ? 1 : 0;
            }
            int i15 = (i14 + i2) * 31;
            z66 z66 = this.k;
            int i16 = 0;
            int hashCode = (i15 + (z66 != null ? z66.hashCode() : 0)) * 31;
            j jVar = this.l;
            if (jVar != null) {
                i16 = jVar.hashCode();
            }
            return hashCode + i16;
        }

        public final a i(int i2) {
            this.d = i2;
            return this;
        }

        public final a j(int i2) {
            this.e = i2;
            return this;
        }

        public final a k(int i2) {
            this.b = i2;
            return this;
        }

        public final a l(int i2) {
            this.c = i2;
            return this;
        }

        public final a m(j jVar) {
            h.e(jVar, "playlist");
            this.l = jVar;
            return this;
        }

        public String toString() {
            StringBuilder V0 = je.V0("Builder(duration=");
            V0.append(this.a);
            V0.append(", numberOfItems=");
            V0.append(this.b);
            V0.append(", numberOfTracks=");
            V0.append(this.c);
            V0.append(", numberOfEpisodes=");
            V0.append(this.d);
            V0.append(", numberOfFollowers=");
            V0.append(this.e);
            V0.append(", lastModification=");
            V0.append(this.f);
            V0.append(", containsTracks=");
            V0.append(this.g);
            V0.append(", containsEpisodes=");
            V0.append(this.h);
            V0.append(", hasExplicitContent=");
            V0.append(this.i);
            V0.append(", containsAudioEpisodes=");
            V0.append(this.j);
            V0.append(", filterAndSort=");
            V0.append(this.k);
            V0.append(", playlist=");
            V0.append(this.l);
            V0.append(")");
            return V0.toString();
        }
    }

    public h76(long j2, int i2, int i3, int i4, int i5, long j3, boolean z, boolean z2, boolean z3, boolean z4, j jVar, z66 z66) {
        h.e(jVar, "playlist");
        h.e(z66, "filterAndSort");
        this.a = j2;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = j3;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = jVar;
        this.l = z66;
    }

    public final boolean a() {
        return this.k.w() || this.k.r();
    }

    public final boolean b() {
        return this.j;
    }

    public final boolean c() {
        return this.h;
    }

    public final boolean d() {
        return this.g;
    }

    public final long e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h76)) {
            return false;
        }
        h76 h76 = (h76) obj;
        return this.a == h76.a && this.b == h76.b && this.c == h76.c && this.d == h76.d && this.e == h76.e && this.f == h76.f && this.g == h76.g && this.h == h76.h && this.i == h76.i && this.j == h76.j && h.a(this.k, h76.k) && h.a(this.l, h76.l);
    }

    public final z66 f() {
        return this.l;
    }

    public final long g() {
        return this.f;
    }

    public final int h() {
        return this.d;
    }

    public int hashCode() {
        int a2 = ((((((((((e.a(this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + e.a(this.f)) * 31;
        boolean z = this.g;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (a2 + i3) * 31;
        boolean z2 = this.h;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.i;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int i14 = (i10 + i11) * 31;
        boolean z4 = this.j;
        if (!z4) {
            i2 = z4 ? 1 : 0;
        }
        int i15 = (i14 + i2) * 31;
        j jVar = this.k;
        int i16 = 0;
        int hashCode = (i15 + (jVar != null ? jVar.hashCode() : 0)) * 31;
        z66 z66 = this.l;
        if (z66 != null) {
            i16 = z66.hashCode();
        }
        return hashCode + i16;
    }

    public final int i() {
        return this.e;
    }

    public final int j() {
        return this.b;
    }

    public final int k() {
        return this.c;
    }

    public final j l() {
        return this.k;
    }

    public final boolean m() {
        return this.b == 0;
    }

    public final boolean n() {
        return m() && this.l.b() == null;
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlaylistMetadata(duration=");
        V0.append(this.a);
        V0.append(", numberOfItems=");
        V0.append(this.b);
        V0.append(", numberOfTracks=");
        V0.append(this.c);
        V0.append(", numberOfEpisodes=");
        V0.append(this.d);
        V0.append(", numberOfFollowers=");
        V0.append(this.e);
        V0.append(", lastModification=");
        V0.append(this.f);
        V0.append(", containsTracks=");
        V0.append(this.g);
        V0.append(", containsEpisodes=");
        V0.append(this.h);
        V0.append(", hasExplicitContent=");
        V0.append(this.i);
        V0.append(", containsAudioEpisodes=");
        V0.append(this.j);
        V0.append(", playlist=");
        V0.append(this.k);
        V0.append(", filterAndSort=");
        V0.append(this.l);
        V0.append(")");
        return V0.toString();
    }

    public h76() {
        this(0, 0, 0, 0, 0, 0, false, false, false, false, new j.a(null, 0, null, null, 0, null, null, null, null, false, null, null, false, false, false, null, false, null, false, false, false, null, false, null, null, null, null, 134217727).d(), new z66(null, null, 3));
    }
}
