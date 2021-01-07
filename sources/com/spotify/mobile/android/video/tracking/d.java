package com.spotify.mobile.android.video.tracking;

import com.spotify.mobile.android.video.tracking.f;

final class d extends f {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;
    private final long f;
    private final long g;
    private final long h;
    private final long i;
    private final long j;
    private final long k;
    private final long l;
    private final int m;
    private final int n;
    private final int o;
    private final long p;
    private final long q;
    private final int r;
    private final long s;
    private final float t;
    private final int u;

    /* access modifiers changed from: package-private */
    public static final class b extends f.a {
        private Long a;
        private Long b;
        private Long c;
        private Long d;
        private Long e;
        private Long f;
        private Long g;
        private Long h;
        private Long i;
        private Long j;
        private Long k;
        private Long l;
        private Integer m;
        private Integer n;
        private Integer o;
        private Long p;
        private Long q;
        private Integer r;
        private Long s;
        private Float t;
        private Integer u;

        b() {
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.video.tracking.f.a
        public f a() {
            String str = this.a == null ? " msPlayed" : "";
            if (this.b == null) {
                str = je.x0(str, " msNominalPlayed");
            }
            if (this.c == null) {
                str = je.x0(str, " msPlayedBackground");
            }
            if (this.d == null) {
                str = je.x0(str, " msPlayedFullscreen");
            }
            if (this.e == null) {
                str = je.x0(str, " msPlayedSubtitles");
            }
            if (this.f == null) {
                str = je.x0(str, " msUnionPlayed");
            }
            if (this.g == null) {
                str = je.x0(str, " msMaxContinuousPlayed");
            }
            if (this.h == null) {
                str = je.x0(str, " msInitialBuffering");
            }
            if (this.i == null) {
                str = je.x0(str, " msBufferingSeek");
            }
            if (this.j == null) {
                str = je.x0(str, " msBufferingSeekLongest");
            }
            if (this.k == null) {
                str = je.x0(str, " msBufferingStall");
            }
            if (this.l == null) {
                str = je.x0(str, " msBufferingStallLongest");
            }
            if (this.m == null) {
                str = je.x0(str, " nStalls");
            }
            if (this.n == null) {
                str = je.x0(str, " nSeekForward");
            }
            if (this.o == null) {
                str = je.x0(str, " nSeekBackward");
            }
            if (this.p == null) {
                str = je.x0(str, " msSeekForward");
            }
            if (this.q == null) {
                str = je.x0(str, " msSeekBackward");
            }
            if (this.r == null) {
                str = je.x0(str, " startBitrate");
            }
            if (this.s == null) {
                str = je.x0(str, " bytesTransferred");
            }
            if (this.t == null) {
                str = je.x0(str, " averageScreenRotation");
            }
            if (this.u == null) {
                str = je.x0(str, " nViewTransitions");
            }
            if (str.isEmpty()) {
                return new d(this.a.longValue(), this.b.longValue(), this.c.longValue(), this.d.longValue(), this.e.longValue(), this.f.longValue(), this.g.longValue(), this.h.longValue(), this.i.longValue(), this.j.longValue(), this.k.longValue(), this.l.longValue(), this.m.intValue(), this.n.intValue(), this.o.intValue(), this.p.longValue(), this.q.longValue(), this.r.intValue(), this.s.longValue(), this.t.floatValue(), this.u.intValue(), null);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        /* access modifiers changed from: package-private */
        @Override // com.spotify.mobile.android.video.tracking.f.a
        public f.a b(int i2) {
            this.u = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a c(float f2) {
            this.t = Float.valueOf(f2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a d(long j2) {
            this.s = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a e(long j2) {
            this.i = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a f(long j2) {
            this.j = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a g(long j2) {
            this.k = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a h(long j2) {
            this.l = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a i(long j2) {
            this.h = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a j(long j2) {
            this.g = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public long k() {
            Long l2 = this.b;
            if (l2 != null) {
                return l2.longValue();
            }
            throw new IllegalStateException("Property \"msNominalPlayed\" has not been set");
        }

        /* access modifiers changed from: package-private */
        public f.a l(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a m(long j2) {
            this.a = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a n(long j2) {
            this.c = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a o(long j2) {
            this.d = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a p(long j2) {
            this.e = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a q(long j2) {
            this.q = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a r(long j2) {
            this.p = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a s(long j2) {
            this.f = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a t(int i2) {
            this.o = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a u(int i2) {
            this.n = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a v(int i2) {
            this.m = Integer.valueOf(i2);
            return this;
        }

        /* access modifiers changed from: package-private */
        public f.a w(int i2) {
            this.r = Integer.valueOf(i2);
            return this;
        }
    }

    d(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, int i3, int i4, long j14, long j15, int i5, long j16, float f2, int i6, a aVar) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = j8;
        this.h = j9;
        this.i = j10;
        this.j = j11;
        this.k = j12;
        this.l = j13;
        this.m = i2;
        this.n = i3;
        this.o = i4;
        this.p = j14;
        this.q = j15;
        this.r = i5;
        this.s = j16;
        this.t = f2;
        this.u = i6;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public float a() {
        return this.t;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long b() {
        return this.s;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long c() {
        return this.i;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long d() {
        return this.j;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a == fVar.j() && this.b == fVar.i() && this.c == fVar.k() && this.d == fVar.l() && this.e == fVar.m() && this.f == fVar.p() && this.g == fVar.h() && this.h == fVar.g() && this.i == fVar.c() && this.j == fVar.d() && this.k == fVar.e() && this.l == fVar.f() && this.m == fVar.s() && this.n == fVar.r() && this.o == fVar.q() && this.p == fVar.o() && this.q == fVar.n() && this.r == fVar.u() && this.s == fVar.b() && Float.floatToIntBits(this.t) == Float.floatToIntBits(fVar.a()) && this.u == fVar.t()) {
            return true;
        }
        return false;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long f() {
        return this.l;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long g() {
        return this.h;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long h() {
        return this.g;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        long j4 = this.c;
        long j5 = this.d;
        long j6 = this.e;
        long j7 = this.f;
        long j8 = this.g;
        long j9 = this.h;
        long j10 = this.i;
        long j11 = this.j;
        long j12 = this.k;
        long j13 = this.l;
        long j14 = this.p;
        long j15 = this.q;
        long j16 = this.s;
        return this.u ^ ((((((((((((((((((((((((((((((((((((((((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003) ^ ((int) (j8 ^ (j8 >>> 32)))) * 1000003) ^ ((int) (j9 ^ (j9 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003) ^ ((int) (j13 ^ (j13 >>> 32)))) * 1000003) ^ this.m) * 1000003) ^ this.n) * 1000003) ^ this.o) * 1000003) ^ ((int) (j14 ^ (j14 >>> 32)))) * 1000003) ^ ((int) (j15 ^ (j15 >>> 32)))) * 1000003) ^ this.r) * 1000003) ^ ((int) (j16 ^ (j16 >>> 32)))) * 1000003) ^ Float.floatToIntBits(this.t)) * 1000003);
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long i() {
        return this.b;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long j() {
        return this.a;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long k() {
        return this.c;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long l() {
        return this.d;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long m() {
        return this.e;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long n() {
        return this.q;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long o() {
        return this.p;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public long p() {
        return this.f;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public int q() {
        return this.o;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public int r() {
        return this.n;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public int s() {
        return this.m;
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public int t() {
        return this.u;
    }

    public String toString() {
        StringBuilder V0 = je.V0("BasicPlaybackStatistics{msPlayed=");
        V0.append(this.a);
        V0.append(", msNominalPlayed=");
        V0.append(this.b);
        V0.append(", msPlayedBackground=");
        V0.append(this.c);
        V0.append(", msPlayedFullscreen=");
        V0.append(this.d);
        V0.append(", msPlayedSubtitles=");
        V0.append(this.e);
        V0.append(", msUnionPlayed=");
        V0.append(this.f);
        V0.append(", msMaxContinuousPlayed=");
        V0.append(this.g);
        V0.append(", msInitialBuffering=");
        V0.append(this.h);
        V0.append(", msBufferingSeek=");
        V0.append(this.i);
        V0.append(", msBufferingSeekLongest=");
        V0.append(this.j);
        V0.append(", msBufferingStall=");
        V0.append(this.k);
        V0.append(", msBufferingStallLongest=");
        V0.append(this.l);
        V0.append(", nStalls=");
        V0.append(this.m);
        V0.append(", nSeekForward=");
        V0.append(this.n);
        V0.append(", nSeekBackward=");
        V0.append(this.o);
        V0.append(", msSeekForward=");
        V0.append(this.p);
        V0.append(", msSeekBackward=");
        V0.append(this.q);
        V0.append(", startBitrate=");
        V0.append(this.r);
        V0.append(", bytesTransferred=");
        V0.append(this.s);
        V0.append(", averageScreenRotation=");
        V0.append(this.t);
        V0.append(", nViewTransitions=");
        return je.B0(V0, this.u, "}");
    }

    @Override // com.spotify.mobile.android.video.tracking.f
    public int u() {
        return this.r;
    }
}
