package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.f0;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.v0;

/* access modifiers changed from: package-private */
public final class j0 {
    private static final t.a n = new t.a(new Object());
    public final v0 a;
    public final t.a b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final f0 h;
    public final kq i;
    public final t.a j;
    public volatile long k;
    public volatile long l;
    public volatile long m;

    public j0(v0 v0Var, t.a aVar, long j2, long j3, int i2, ExoPlaybackException exoPlaybackException, boolean z, f0 f0Var, kq kqVar, t.a aVar2, long j4, long j5, long j6) {
        this.a = v0Var;
        this.b = aVar;
        this.c = j2;
        this.d = j3;
        this.e = i2;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = f0Var;
        this.i = kqVar;
        this.j = aVar2;
        this.k = j4;
        this.l = j5;
        this.m = j6;
    }

    public static j0 d(long j2, kq kqVar) {
        v0 v0Var = v0.a;
        t.a aVar = n;
        return new j0(v0Var, aVar, j2, -9223372036854775807L, 1, null, false, f0.f, kqVar, aVar, j2, 0, j2);
    }

    public j0 a(t.a aVar, long j2, long j3, long j4) {
        return new j0(this.a, aVar, j2, aVar.a() ? j3 : -9223372036854775807L, this.e, this.f, this.g, this.h, this.i, this.j, this.k, j4, j2);
    }

    public j0 b(ExoPlaybackException exoPlaybackException) {
        return new j0(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public j0 c(f0 f0Var, kq kqVar) {
        return new j0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, f0Var, kqVar, this.j, this.k, this.l, this.m);
    }

    public t.a e(boolean z, v0.c cVar, v0.b bVar) {
        if (this.a.n()) {
            return n;
        }
        int a2 = this.a.a();
        int i2 = this.a.k(a2, cVar).f;
        int b2 = this.a.b(this.b.a);
        long j2 = -1;
        if (b2 != -1 && a2 == this.a.d(b2, bVar).b) {
            j2 = this.b.d;
        }
        return new t.a(this.a.j(i2), j2);
    }
}
