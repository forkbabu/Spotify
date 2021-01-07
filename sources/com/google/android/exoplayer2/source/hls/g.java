package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import android.os.SystemClock;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.source.e0;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.upstream.a0;
import com.google.android.exoplayer2.upstream.k;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.f0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* access modifiers changed from: package-private */
public class g {
    private final i a;
    private final k b;
    private final k c;
    private final p d;
    private final Uri[] e;
    private final d0[] f;
    private final HlsPlaylistTracker g;
    private final e0 h;
    private final List<d0> i;
    private final FullSegmentEncryptionKeyCache j = new FullSegmentEncryptionKeyCache(4);
    private boolean k;
    private byte[] l = f0.f;
    private IOException m;
    private Uri n;
    private boolean o;
    private gq p;
    private long q = -9223372036854775807L;
    private boolean r;

    /* access modifiers changed from: private */
    public static final class a extends no {
        private byte[] k;

        public a(k kVar, m mVar, d0 d0Var, int i, Object obj, byte[] bArr) {
            super(kVar, mVar, 3, d0Var, i, obj, bArr);
        }

        /* access modifiers changed from: protected */
        @Override // defpackage.no
        public void f(byte[] bArr, int i) {
            this.k = Arrays.copyOf(bArr, i);
        }

        public byte[] h() {
            return this.k;
        }
    }

    public static final class b {
        public ho a = null;
        public boolean b = false;
        public Uri c = null;
    }

    /* access modifiers changed from: private */
    public static final class c extends fo {
        public c(f fVar, long j, int i) {
            super((long) i, (long) (fVar.o.size() - 1));
        }
    }

    private static final class d extends bq {
        private int g;

        public d(e0 e0Var, int[] iArr) {
            super(e0Var, iArr);
            this.g = q(e0Var.a(0));
        }

        @Override // defpackage.gq
        public int b() {
            return this.g;
        }

        @Override // defpackage.gq
        public Object g() {
            return null;
        }

        @Override // defpackage.gq
        public void m(long j, long j2, long j3, List<? extends po> list, qo[] qoVarArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (r(this.g, elapsedRealtime)) {
                for (int i = this.b - 1; i >= 0; i--) {
                    if (!r(i, elapsedRealtime)) {
                        this.g = i;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // defpackage.gq
        public int p() {
            return 0;
        }
    }

    public g(i iVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, d0[] d0VarArr, h hVar, a0 a0Var, p pVar, List<d0> list) {
        this.a = iVar;
        this.g = hlsPlaylistTracker;
        this.e = uriArr;
        this.f = d0VarArr;
        this.d = pVar;
        this.i = list;
        k a2 = hVar.a(1);
        this.b = a2;
        if (a0Var != null) {
            a2.b(a0Var);
        }
        this.c = hVar.a(3);
        this.h = new e0(d0VarArr);
        int[] iArr = new int[uriArr.length];
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            iArr[i2] = i2;
        }
        this.p = new d(this.h, iArr);
    }

    private long b(k kVar, boolean z, f fVar, long j2, long j3) {
        long j4;
        long j5;
        if (kVar != null && !z) {
            return kVar.f();
        }
        long j6 = fVar.p + j2;
        if (kVar != null && !this.o) {
            j3 = kVar.f;
        }
        if (fVar.l || j3 < j6) {
            j5 = (long) f0.c(fVar.o, Long.valueOf(j3 - j2), true, !((com.google.android.exoplayer2.source.hls.playlist.c) this.g).t() || kVar == null);
            j4 = fVar.i;
        } else {
            j5 = fVar.i;
            j4 = (long) fVar.o.size();
        }
        return j5 + j4;
    }

    private ho g(Uri uri, int i2) {
        if (uri == null) {
            return null;
        }
        byte[] c2 = this.j.c(uri);
        if (c2 != null) {
            this.j.b(uri, c2);
            return null;
        }
        return new a(this.c, new m(uri, 0, -1, null, 1), this.f[i2], this.p.p(), this.p.g(), this.l);
    }

    public qo[] a(k kVar, long j2) {
        int i2;
        g gVar = this;
        qo qoVar = qo.a;
        int b2 = kVar == null ? -1 : gVar.h.b(kVar.c);
        int length = gVar.p.length();
        qo[] qoVarArr = new qo[length];
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            int e2 = gVar.p.e(i3);
            Uri uri = gVar.e[e2];
            if (!((com.google.android.exoplayer2.source.hls.playlist.c) gVar.g).u(uri)) {
                qoVarArr[i3] = qoVar;
                i2 = i3;
            } else {
                f s = ((com.google.android.exoplayer2.source.hls.playlist.c) gVar.g).s(uri, z);
                s.getClass();
                i2 = i3;
                long q2 = s.f - ((com.google.android.exoplayer2.source.hls.playlist.c) gVar.g).q();
                long b3 = b(kVar, e2 != b2, s, q2, j2);
                long j3 = s.i;
                if (b3 < j3) {
                    qoVarArr[i2] = qoVar;
                } else {
                    qoVarArr[i2] = new c(s, q2, (int) (b3 - j3));
                }
            }
            i3 = i2 + 1;
            z = false;
            gVar = this;
        }
        return qoVarArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(long r28, long r30, java.util.List<com.google.android.exoplayer2.source.hls.k> r32, boolean r33, com.google.android.exoplayer2.source.hls.g.b r34) {
        /*
        // Method dump skipped, instructions count: 455
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.g.c(long, long, java.util.List, boolean, com.google.android.exoplayer2.source.hls.g$b):void");
    }

    public e0 d() {
        return this.h;
    }

    public gq e() {
        return this.p;
    }

    public boolean f(ho hoVar, long j2) {
        gq gqVar = this.p;
        return gqVar.c(gqVar.i(this.h.b(hoVar.c)), j2);
    }

    public void h() {
        IOException iOException = this.m;
        if (iOException == null) {
            Uri uri = this.n;
            if (uri != null && this.r) {
                ((com.google.android.exoplayer2.source.hls.playlist.c) this.g).v(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    public void i(ho hoVar) {
        if (hoVar instanceof a) {
            a aVar = (a) hoVar;
            this.l = aVar.g();
            FullSegmentEncryptionKeyCache fullSegmentEncryptionKeyCache = this.j;
            Uri uri = aVar.a.a;
            byte[] h2 = aVar.h();
            h2.getClass();
            fullSegmentEncryptionKeyCache.b(uri, h2);
        }
    }

    public boolean j(Uri uri, long j2) {
        int i2;
        int i3 = 0;
        while (true) {
            Uri[] uriArr = this.e;
            if (i3 >= uriArr.length) {
                i3 = -1;
                break;
            } else if (uriArr[i3].equals(uri)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 == -1 || (i2 = this.p.i(i3)) == -1) {
            return true;
        }
        this.r = uri.equals(this.n) | this.r;
        if (j2 == -9223372036854775807L || this.p.c(i2, j2)) {
            return true;
        }
        return false;
    }

    public void k() {
        this.m = null;
    }

    public void l(boolean z) {
        this.k = z;
    }

    public void m(gq gqVar) {
        this.p = gqVar;
    }
}
