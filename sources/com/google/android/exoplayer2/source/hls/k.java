package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.source.hls.playlist.f;
import com.google.android.exoplayer2.upstream.m;
import com.google.android.exoplayer2.util.e0;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.util.v;
import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* access modifiers changed from: package-private */
public final class k extends po {
    private static final wj H = new wj();
    private static final AtomicInteger I = new AtomicInteger();
    private qj A;
    private boolean B;
    private n C;
    private int D;
    private boolean E;
    private volatile boolean F;
    private boolean G;
    public final int j;
    public final int k;
    public final Uri l;
    private final com.google.android.exoplayer2.upstream.k m;
    private final m n;
    private final qj o;
    private final boolean p;
    private final boolean q;
    private final e0 r;
    private final boolean s;
    private final i t;
    private final List<d0> u;
    private final l v;
    private final nn w;
    private final v x;
    private final boolean y;
    private final boolean z;

    private k(i iVar, com.google.android.exoplayer2.upstream.k kVar, m mVar, d0 d0Var, boolean z2, com.google.android.exoplayer2.upstream.k kVar2, m mVar2, boolean z3, Uri uri, List<d0> list, int i, Object obj, long j2, long j3, long j4, int i2, boolean z4, boolean z5, e0 e0Var, l lVar, qj qjVar, nn nnVar, v vVar, boolean z6) {
        super(kVar, mVar, d0Var, i, obj, j2, j3, j4);
        this.y = z2;
        this.k = i2;
        this.n = mVar2;
        this.m = kVar2;
        this.E = mVar2 != null;
        this.z = z3;
        this.l = uri;
        this.p = z5;
        this.r = e0Var;
        this.q = z4;
        this.t = iVar;
        this.u = list;
        this.v = lVar;
        this.o = qjVar;
        this.w = nnVar;
        this.x = vVar;
        this.s = z6;
        this.j = I.getAndIncrement();
    }

    public static k h(i iVar, com.google.android.exoplayer2.upstream.k kVar, d0 d0Var, long j2, f fVar, int i, Uri uri, List<d0> list, int i2, Object obj, boolean z2, p pVar, k kVar2, byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        com.google.android.exoplayer2.upstream.k kVar3;
        m mVar;
        boolean z3;
        m mVar2;
        com.google.android.exoplayer2.upstream.k kVar4;
        boolean z4;
        v vVar;
        nn nnVar;
        qj qjVar;
        byte[] bArr4;
        d dVar = kVar;
        f.a aVar = fVar.o.get(i);
        m mVar3 = new m(o.j(fVar.a, aVar.a), aVar.r, aVar.s, null);
        boolean z5 = bArr != null;
        if (z5) {
            String str = aVar.q;
            str.getClass();
            bArr3 = j(str);
        } else {
            bArr3 = null;
        }
        if (bArr != null) {
            bArr3.getClass();
            kVar3 = new d(dVar, bArr, bArr3);
        } else {
            kVar3 = dVar;
        }
        f.a aVar2 = aVar.b;
        if (aVar2 != null) {
            boolean z6 = bArr2 != null;
            if (z6) {
                String str2 = aVar2.q;
                str2.getClass();
                bArr4 = j(str2);
            } else {
                bArr4 = null;
            }
            mVar = mVar3;
            m mVar4 = new m(o.j(fVar.a, aVar2.a), aVar2.r, aVar2.s, null);
            if (bArr2 != null) {
                bArr4.getClass();
                dVar = new d(dVar, bArr2, bArr4);
            }
            kVar4 = dVar;
            mVar2 = mVar4;
            z3 = z6;
        } else {
            mVar = mVar3;
            kVar4 = null;
            mVar2 = null;
            z3 = false;
        }
        long j3 = j2 + aVar.n;
        long j4 = j3 + aVar.c;
        int i3 = fVar.h + aVar.f;
        if (kVar2 != null) {
            nn nnVar2 = kVar2.w;
            v vVar2 = kVar2.x;
            boolean z7 = !uri.equals(kVar2.l) || !kVar2.G;
            nnVar = nnVar2;
            vVar = vVar2;
            z4 = z7;
            qjVar = (!kVar2.B || kVar2.k != i3 || z7) ? null : kVar2.A;
        } else {
            nnVar = new nn();
            vVar = new v(10);
            qjVar = null;
            z4 = false;
        }
        return new k(iVar, kVar3, mVar, d0Var, z5, kVar4, mVar2, z3, uri, list, i2, obj, j3, j4, fVar.i + ((long) i), i3, aVar.t, z2, pVar.a(i3), aVar.o, qjVar, nnVar, vVar, z4);
    }

    @RequiresNonNull({"output"})
    private void i(com.google.android.exoplayer2.upstream.k kVar, m mVar, boolean z2) {
        m mVar2;
        boolean z3;
        int i = 0;
        if (z2) {
            z3 = this.D != 0;
            mVar2 = mVar;
        } else {
            mVar2 = mVar.d((long) this.D);
            z3 = false;
        }
        try {
            nj l2 = l(kVar, mVar2);
            if (z3) {
                l2.l(this.D);
            }
            while (i == 0) {
                try {
                    if (this.F) {
                        break;
                    }
                    i = this.A.a(l2, H);
                } catch (Throwable th) {
                    this.D = (int) (l2.e() - mVar.e);
                    throw th;
                }
            }
            this.D = (int) (l2.e() - mVar.e);
            int i2 = f0.a;
            try {
                kVar.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            int i3 = f0.a;
            if (kVar != null) {
                try {
                    kVar.close();
                } catch (IOException unused2) {
                }
            }
            throw th2;
        }
    }

    private static byte[] j(String str) {
        if (f0.Q(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00e7  */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractor"})
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.nj l(com.google.android.exoplayer2.upstream.k r18, com.google.android.exoplayer2.upstream.m r19) {
        /*
        // Method dump skipped, instructions count: 257
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.k.l(com.google.android.exoplayer2.upstream.k, com.google.android.exoplayer2.upstream.m):nj");
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() {
        qj qjVar;
        this.C.getClass();
        if (this.A == null && (qjVar = this.o) != null) {
            this.A = qjVar;
            this.B = true;
            this.E = false;
            this.C.D(this.j, this.s, true);
        }
        if (this.E) {
            this.m.getClass();
            this.n.getClass();
            i(this.m, this.n, this.z);
            this.D = 0;
            this.E = false;
        }
        if (!this.F) {
            if (!this.q) {
                if (!this.p) {
                    this.r.h();
                } else if (this.r.c() == Long.MAX_VALUE) {
                    this.r.g(this.f);
                }
                i(this.h, this.a, this.y);
            }
            this.G = true;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void b() {
        this.F = true;
    }

    @Override // defpackage.po
    public boolean g() {
        return this.G;
    }

    public void k(n nVar) {
        this.C = nVar;
    }
}
