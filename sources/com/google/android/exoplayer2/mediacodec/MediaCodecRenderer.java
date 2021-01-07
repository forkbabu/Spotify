package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.drm.s;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.u;
import com.google.android.exoplayer2.util.d0;
import com.google.android.exoplayer2.util.f0;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public abstract class MediaCodecRenderer extends t {
    private static final byte[] z0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private final fj A = new fj(0);
    private final d0<com.google.android.exoplayer2.d0> B = new d0<>();
    private final ArrayList<Long> C = new ArrayList<>();
    private final MediaCodec.BufferInfo D = new MediaCodec.BufferInfo();
    private com.google.android.exoplayer2.d0 E;
    private com.google.android.exoplayer2.d0 F;
    private DrmSession<s> G;
    private DrmSession<s> H;
    private MediaCrypto I;
    private boolean J;
    private long K = -9223372036854775807L;
    private float L = 1.0f;
    private MediaCodec M;
    private com.google.android.exoplayer2.d0 N;
    private float O = -1.0f;
    private ArrayDeque<e> P;
    private DecoderInitializationException Q;
    private e R;
    private int S;
    private boolean T;
    private boolean U;
    private boolean V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean a0;
    private boolean b0;
    private ByteBuffer[] c0;
    private ByteBuffer[] d0;
    private long e0;
    private int f0;
    private int g0;
    private ByteBuffer h0;
    private boolean i0;
    private boolean j0;
    private boolean k0;
    private int l0 = 0;
    private int m0 = 0;
    private int n0 = 0;
    private boolean o0;
    private boolean p0;
    private long q0;
    private long r0;
    private boolean s0;
    private boolean t0;
    private final f u;
    private boolean u0;
    private final n<s> v;
    private boolean v0;
    private final boolean w;
    private boolean w0;
    private final boolean x;
    private boolean x0;
    private final float y;
    protected ej y0;
    private final fj z = new fj(0);

    public static class DecoderException extends Exception {
        public final e codecInfo;
        public final String diagnosticInfo;
    }

    public MediaCodecRenderer(int i, f fVar, n<s> nVar, boolean z2, boolean z3, float f) {
        super(i);
        fVar.getClass();
        this.u = fVar;
        this.v = nVar;
        this.w = z2;
        this.x = z3;
        this.y = f;
    }

    private void Q() {
        if (this.o0) {
            this.m0 = 1;
            this.n0 = 3;
            return;
        }
        o0();
        e0();
    }

    private void R() {
        if (f0.a < 23) {
            Q();
        } else if (this.o0) {
            this.m0 = 1;
            this.n0 = 2;
        } else {
            y0();
        }
    }

    private boolean S(long j, long j2) {
        boolean z2;
        boolean z3;
        int i;
        ByteBuffer byteBuffer;
        boolean z4;
        if (!(this.g0 >= 0)) {
            if (!this.X || !this.p0) {
                i = this.M.dequeueOutputBuffer(this.D, 0);
            } else {
                try {
                    i = this.M.dequeueOutputBuffer(this.D, 0);
                } catch (IllegalStateException unused) {
                    l0();
                    if (this.t0) {
                        o0();
                    }
                    return false;
                }
            }
            if (i < 0) {
                if (i == -2) {
                    MediaFormat outputFormat = this.M.getOutputFormat();
                    if (this.S != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.a0 = true;
                    } else {
                        if (this.Y) {
                            outputFormat.setInteger("channel-count", 1);
                        }
                        i0(this.M, outputFormat);
                    }
                    return true;
                } else if (i == -3) {
                    if (f0.a < 21) {
                        this.d0 = this.M.getOutputBuffers();
                    }
                    return true;
                } else {
                    if (this.b0 && (this.s0 || this.m0 == 2)) {
                        l0();
                    }
                    return false;
                }
            } else if (this.a0) {
                this.a0 = false;
                this.M.releaseOutputBuffer(i, false);
                return true;
            } else {
                MediaCodec.BufferInfo bufferInfo = this.D;
                if (bufferInfo.size != 0 || (bufferInfo.flags & 4) == 0) {
                    this.g0 = i;
                    if (f0.a >= 21) {
                        byteBuffer = this.M.getOutputBuffer(i);
                    } else {
                        byteBuffer = this.d0[i];
                    }
                    this.h0 = byteBuffer;
                    if (byteBuffer != null) {
                        byteBuffer.position(this.D.offset);
                        ByteBuffer byteBuffer2 = this.h0;
                        MediaCodec.BufferInfo bufferInfo2 = this.D;
                        byteBuffer2.limit(bufferInfo2.offset + bufferInfo2.size);
                    }
                    long j3 = this.D.presentationTimeUs;
                    int size = this.C.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            z4 = false;
                            break;
                        } else if (this.C.get(i2).longValue() == j3) {
                            this.C.remove(i2);
                            z4 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    this.i0 = z4;
                    long j4 = this.r0;
                    long j5 = this.D.presentationTimeUs;
                    this.j0 = j4 == j5;
                    com.google.android.exoplayer2.d0 d = this.B.d(j5);
                    if (d != null) {
                        this.F = d;
                    }
                } else {
                    l0();
                    return false;
                }
            }
        }
        if (!this.X || !this.p0) {
            z2 = false;
            MediaCodec mediaCodec = this.M;
            ByteBuffer byteBuffer3 = this.h0;
            int i3 = this.g0;
            MediaCodec.BufferInfo bufferInfo3 = this.D;
            z3 = m0(j, j2, mediaCodec, byteBuffer3, i3, bufferInfo3.flags, bufferInfo3.presentationTimeUs, this.i0, this.j0, this.F);
        } else {
            try {
                MediaCodec mediaCodec2 = this.M;
                ByteBuffer byteBuffer4 = this.h0;
                int i4 = this.g0;
                MediaCodec.BufferInfo bufferInfo4 = this.D;
                z2 = false;
                try {
                    z3 = m0(j, j2, mediaCodec2, byteBuffer4, i4, bufferInfo4.flags, bufferInfo4.presentationTimeUs, this.i0, this.j0, this.F);
                } catch (IllegalStateException unused2) {
                }
            } catch (IllegalStateException unused3) {
                z2 = false;
                l0();
                if (this.t0) {
                    o0();
                }
                return z2;
            }
        }
        if (z3) {
            j0(this.D.presentationTimeUs);
            boolean z5 = (this.D.flags & 4) != 0;
            r0();
            if (!z5) {
                return true;
            }
            l0();
        }
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:94:0x0166 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean T() {
        /*
        // Method dump skipped, instructions count: 586
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.T():boolean");
    }

    private List<e> W(boolean z2) {
        List<e> b02 = b0(this.u, this.E, z2);
        if (b02.isEmpty() && z2) {
            b02 = b0(this.u, this.E, false);
            if (!b02.isEmpty()) {
                StringBuilder V0 = je.V0("Drm session requires secure decoder for ");
                V0.append(this.E.r);
                V0.append(", but no secure decoder available. Trying to proceed with ");
                V0.append(b02);
                V0.append(".");
                V0.toString();
            }
        }
        return b02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017d, code lost:
        if ("stvm8".equals(r1) == false) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018d, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r8) == false) goto L_0x0191;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0131 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0196  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void d0(com.google.android.exoplayer2.mediacodec.e r17, android.media.MediaCrypto r18) {
        /*
        // Method dump skipped, instructions count: 601
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.d0(com.google.android.exoplayer2.mediacodec.e, android.media.MediaCrypto):void");
    }

    private void f0(MediaCrypto mediaCrypto, boolean z2) {
        if (this.P == null) {
            try {
                List<e> W2 = W(z2);
                ArrayDeque<e> arrayDeque = new ArrayDeque<>();
                this.P = arrayDeque;
                if (this.x) {
                    arrayDeque.addAll(W2);
                } else if (!W2.isEmpty()) {
                    this.P.add(W2.get(0));
                }
                this.Q = null;
            } catch (MediaCodecUtil.DecoderQueryException e) {
                throw new DecoderInitializationException(this.E, e, z2, -49998);
            }
        }
        if (!this.P.isEmpty()) {
            while (this.M == null) {
                e peekFirst = this.P.peekFirst();
                if (v0(peekFirst)) {
                    try {
                        d0(peekFirst, mediaCrypto);
                    } catch (Exception e2) {
                        String str = "Failed to initialize decoder: " + peekFirst;
                        this.P.removeFirst();
                        DecoderInitializationException decoderInitializationException = new DecoderInitializationException(this.E, e2, z2, peekFirst);
                        if (this.Q == null) {
                            this.Q = decoderInitializationException;
                        } else {
                            this.Q = DecoderInitializationException.a(this.Q, decoderInitializationException);
                        }
                        if (this.P.isEmpty()) {
                            throw this.Q;
                        }
                    }
                } else {
                    return;
                }
            }
            this.P = null;
            return;
        }
        throw new DecoderInitializationException(this.E, (Throwable) null, z2, -49999);
    }

    private void l0() {
        int i = this.n0;
        if (i == 1) {
            U();
        } else if (i == 2) {
            y0();
        } else if (i != 3) {
            this.t0 = true;
            p0();
        } else {
            o0();
            e0();
        }
    }

    private boolean n0(boolean z2) {
        e0 z3 = z();
        this.A.clear();
        int L2 = L(z3, this.A, z2);
        if (L2 == -5) {
            h0(z3);
            return true;
        } else if (L2 != -4 || !this.A.isEndOfStream()) {
            return false;
        } else {
            this.s0 = true;
            l0();
            return false;
        }
    }

    private void q0() {
        this.f0 = -1;
        this.z.b = null;
    }

    private void r0() {
        this.g0 = -1;
        this.h0 = null;
    }

    private void s0(DrmSession<s> drmSession) {
        DrmSession<s> drmSession2 = this.G;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.a();
            }
            if (drmSession2 != null) {
                drmSession2.d();
            }
        }
        this.G = drmSession;
    }

    private void u0(DrmSession<s> drmSession) {
        DrmSession<s> drmSession2 = this.H;
        if (drmSession2 != drmSession) {
            if (drmSession != null) {
                drmSession.a();
            }
            if (drmSession2 != null) {
                drmSession2.d();
            }
        }
        this.H = drmSession;
    }

    private void x0() {
        if (f0.a >= 23) {
            float a02 = a0(this.L, this.N, B());
            float f = this.O;
            if (f != a02) {
                if (a02 == -1.0f) {
                    Q();
                } else if (f != -1.0f || a02 > this.y) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", a02);
                    this.M.setParameters(bundle);
                    this.O = a02;
                }
            }
        }
    }

    private void y0() {
        s c = this.H.c();
        if (c == null) {
            o0();
            e0();
        } else if (u.e.equals(c.a)) {
            o0();
            e0();
        } else if (!U()) {
            try {
                this.I.setMediaDrmSession(c.b);
                s0(this.H);
                this.m0 = 0;
                this.n0 = 0;
            } catch (MediaCryptoException e) {
                throw x(e, this.E);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void E() {
        this.E = null;
        if (this.H == null && this.G == null) {
            V();
        } else {
            H();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void F(boolean z2) {
        this.y0 = new ej();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void G(long j, boolean z2) {
        this.s0 = false;
        this.t0 = false;
        this.x0 = false;
        U();
        this.B.b();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void H() {
        try {
            o0();
        } finally {
            u0(null);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int O(MediaCodec mediaCodec, e eVar, com.google.android.exoplayer2.d0 d0Var, com.google.android.exoplayer2.d0 d0Var2);

    /* access modifiers changed from: protected */
    public abstract void P(e eVar, MediaCodec mediaCodec, com.google.android.exoplayer2.d0 d0Var, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    public final boolean U() {
        boolean V2 = V();
        if (V2) {
            e0();
        }
        return V2;
    }

    /* access modifiers changed from: protected */
    public boolean V() {
        MediaCodec mediaCodec = this.M;
        if (mediaCodec == null) {
            return false;
        }
        if (this.n0 == 3 || this.V || (this.W && this.p0)) {
            o0();
            return true;
        }
        mediaCodec.flush();
        q0();
        r0();
        this.e0 = -9223372036854775807L;
        this.p0 = false;
        this.o0 = false;
        this.v0 = true;
        this.Z = false;
        this.a0 = false;
        this.i0 = false;
        this.j0 = false;
        this.u0 = false;
        this.C.clear();
        this.q0 = -9223372036854775807L;
        this.r0 = -9223372036854775807L;
        this.m0 = 0;
        this.n0 = 0;
        this.l0 = this.k0 ? 1 : 0;
        return false;
    }

    /* access modifiers changed from: protected */
    public final MediaCodec X() {
        return this.M;
    }

    /* access modifiers changed from: protected */
    public final e Y() {
        return this.R;
    }

    /* access modifiers changed from: protected */
    public boolean Z() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract float a0(float f, com.google.android.exoplayer2.d0 d0Var, com.google.android.exoplayer2.d0[] d0VarArr);

    @Override // com.google.android.exoplayer2.p0
    public boolean b() {
        return this.t0;
    }

    /* access modifiers changed from: protected */
    public abstract List<e> b0(f fVar, com.google.android.exoplayer2.d0 d0Var, boolean z2);

    /* access modifiers changed from: protected */
    public void c0(fj fjVar) {
    }

    @Override // com.google.android.exoplayer2.p0
    public boolean d() {
        if (this.E == null || this.u0) {
            return false;
        }
        if (!D()) {
            if (!(this.g0 >= 0) && (this.e0 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.e0)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.q0
    public final int e(com.google.android.exoplayer2.d0 d0Var) {
        try {
            return w0(this.u, this.v, d0Var);
        } catch (MediaCodecUtil.DecoderQueryException e) {
            throw x(e, d0Var);
        }
    }

    /* access modifiers changed from: protected */
    public final void e0() {
        if (this.M == null && this.E != null) {
            s0(this.H);
            String str = this.E.r;
            DrmSession<s> drmSession = this.G;
            if (drmSession != null) {
                if (this.I == null) {
                    s c = drmSession.c();
                    if (c != null) {
                        try {
                            MediaCrypto mediaCrypto = new MediaCrypto(c.a, c.b);
                            this.I = mediaCrypto;
                            this.J = !c.c && mediaCrypto.requiresSecureDecoderComponent(str);
                        } catch (MediaCryptoException e) {
                            throw x(e, this.E);
                        }
                    } else if (this.G.f() == null) {
                        return;
                    }
                }
                if (s.d) {
                    int state = this.G.getState();
                    if (state == 1) {
                        throw x(this.G.f(), this.E);
                    } else if (state != 4) {
                        return;
                    }
                }
            }
            try {
                f0(this.I, this.J);
            } catch (DecoderInitializationException e2) {
                throw x(e2, this.E);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract void g0(String str, long j, long j2);

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0091, code lost:
        if (r1.x == r2.x) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void h0(com.google.android.exoplayer2.e0 r6) {
        /*
            r5 = this;
            r0 = 1
            r5.w0 = r0
            com.google.android.exoplayer2.d0 r1 = r6.c
            r1.getClass()
            boolean r2 = r6.a
            if (r2 == 0) goto L_0x0012
            com.google.android.exoplayer2.drm.DrmSession<?> r6 = r6.b
            r5.u0(r6)
            goto L_0x001e
        L_0x0012:
            com.google.android.exoplayer2.d0 r6 = r5.E
            com.google.android.exoplayer2.drm.n<com.google.android.exoplayer2.drm.s> r2 = r5.v
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r3 = r5.H
            com.google.android.exoplayer2.drm.DrmSession r6 = r5.C(r6, r1, r2, r3)
            r5.H = r6
        L_0x001e:
            r5.E = r1
            android.media.MediaCodec r6 = r5.M
            if (r6 != 0) goto L_0x0028
            r5.e0()
            return
        L_0x0028:
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r2 = r5.H
            if (r2 != 0) goto L_0x0030
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r3 = r5.G
            if (r3 != 0) goto L_0x0048
        L_0x0030:
            if (r2 == 0) goto L_0x0036
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r3 = r5.G
            if (r3 == 0) goto L_0x0048
        L_0x0036:
            if (r2 == 0) goto L_0x003e
            com.google.android.exoplayer2.mediacodec.e r3 = r5.R
            boolean r3 = r3.f
            if (r3 == 0) goto L_0x0048
        L_0x003e:
            int r3 = com.google.android.exoplayer2.util.f0.a
            r4 = 23
            if (r3 >= r4) goto L_0x004c
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r3 = r5.G
            if (r2 == r3) goto L_0x004c
        L_0x0048:
            r5.Q()
            return
        L_0x004c:
            com.google.android.exoplayer2.mediacodec.e r2 = r5.R
            com.google.android.exoplayer2.d0 r3 = r5.N
            int r6 = r5.O(r6, r2, r3, r1)
            if (r6 == 0) goto L_0x00be
            if (r6 == r0) goto L_0x00a6
            r2 = 2
            if (r6 == r2) goto L_0x0073
            r0 = 3
            if (r6 != r0) goto L_0x006d
            r5.N = r1
            r5.x0()
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r6 = r5.H
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r0 = r5.G
            if (r6 == r0) goto L_0x00c1
            r5.R()
            goto L_0x00c1
        L_0x006d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>()
            throw r6
        L_0x0073:
            boolean r6 = r5.T
            if (r6 == 0) goto L_0x007b
            r5.Q()
            goto L_0x00c1
        L_0x007b:
            r5.k0 = r0
            r5.l0 = r0
            int r6 = r5.S
            if (r6 == r2) goto L_0x0095
            if (r6 != r0) goto L_0x0094
            int r6 = r1.w
            com.google.android.exoplayer2.d0 r2 = r5.N
            int r3 = r2.w
            if (r6 != r3) goto L_0x0094
            int r6 = r1.x
            int r2 = r2.x
            if (r6 != r2) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            r5.Z = r0
            r5.N = r1
            r5.x0()
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r6 = r5.H
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r0 = r5.G
            if (r6 == r0) goto L_0x00c1
            r5.R()
            goto L_0x00c1
        L_0x00a6:
            r5.N = r1
            r5.x0()
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r6 = r5.H
            com.google.android.exoplayer2.drm.DrmSession<com.google.android.exoplayer2.drm.s> r1 = r5.G
            if (r6 == r1) goto L_0x00b5
            r5.R()
            goto L_0x00c1
        L_0x00b5:
            boolean r6 = r5.o0
            if (r6 == 0) goto L_0x00c1
            r5.m0 = r0
            r5.n0 = r0
            goto L_0x00c1
        L_0x00be:
            r5.Q()
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.h0(com.google.android.exoplayer2.e0):void");
    }

    /* access modifiers changed from: protected */
    public abstract void i0(MediaCodec mediaCodec, MediaFormat mediaFormat);

    /* access modifiers changed from: protected */
    public abstract void j0(long j);

    /* access modifiers changed from: protected */
    public abstract void k0(fj fjVar);

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.p0
    public final void m(float f) {
        this.L = f;
        if (this.M != null && this.n0 != 3 && getState() != 0) {
            x0();
        }
    }

    /* access modifiers changed from: protected */
    public abstract boolean m0(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z2, boolean z3, com.google.android.exoplayer2.d0 d0Var);

    /* access modifiers changed from: protected */
    public void o0() {
        this.P = null;
        this.R = null;
        this.N = null;
        q0();
        r0();
        if (f0.a < 21) {
            this.c0 = null;
            this.d0 = null;
        }
        this.u0 = false;
        this.e0 = -9223372036854775807L;
        this.C.clear();
        this.q0 = -9223372036854775807L;
        this.r0 = -9223372036854775807L;
        try {
            MediaCodec mediaCodec = this.M;
            if (mediaCodec != null) {
                this.y0.b++;
                try {
                    mediaCodec.stop();
                } finally {
                    this.M.release();
                }
            }
            this.M = null;
            try {
                MediaCrypto mediaCrypto = this.I;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.I = null;
                this.J = false;
                s0(null);
            }
        } catch (Throwable th) {
            this.M = null;
            MediaCrypto mediaCrypto2 = this.I;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.I = null;
            this.J = false;
            s0(null);
        }
    }

    /* access modifiers changed from: protected */
    public void p0() {
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.q0
    public final int r() {
        return 8;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0059 A[Catch:{ IllegalStateException -> 0x0054 }, LOOP:1: B:20:0x0035->B:32:0x0059, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x005a A[EDGE_INSN: B:54:0x005a->B:33:0x005a ?: BREAK  , SYNTHETIC] */
    @Override // com.google.android.exoplayer2.p0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void s(long r6, long r8) {
        /*
            r5 = this;
            boolean r0 = r5.x0
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r5.x0 = r1
            r5.l0()
        L_0x000a:
            r0 = 1
            boolean r2 = r5.t0     // Catch:{ IllegalStateException -> 0x0054 }
            if (r2 == 0) goto L_0x0013
            r5.p0()     // Catch:{ IllegalStateException -> 0x0054 }
            return
        L_0x0013:
            com.google.android.exoplayer2.d0 r2 = r5.E     // Catch:{ IllegalStateException -> 0x0054 }
            if (r2 != 0) goto L_0x001e
            boolean r2 = r5.n0(r0)     // Catch:{ IllegalStateException -> 0x0054 }
            if (r2 != 0) goto L_0x001e
            return
        L_0x001e:
            r5.e0()     // Catch:{ IllegalStateException -> 0x0054 }
            android.media.MediaCodec r2 = r5.M     // Catch:{ IllegalStateException -> 0x0054 }
            if (r2 == 0) goto L_0x005e
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0054 }
            java.lang.String r4 = "drainAndFeed"
            com.google.android.exoplayer2.util.o.b(r4)     // Catch:{ IllegalStateException -> 0x0054 }
        L_0x002e:
            boolean r4 = r5.S(r6, r8)     // Catch:{ IllegalStateException -> 0x0054 }
            if (r4 == 0) goto L_0x0035
            goto L_0x002e
        L_0x0035:
            boolean r6 = r5.T()     // Catch:{ IllegalStateException -> 0x0054 }
            if (r6 == 0) goto L_0x005a
            long r6 = r5.K     // Catch:{ IllegalStateException -> 0x0054 }
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0056
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0054 }
            long r6 = r6 - r2
            long r8 = r5.K     // Catch:{ IllegalStateException -> 0x0054 }
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x0052
            goto L_0x0056
        L_0x0052:
            r6 = 0
            goto L_0x0057
        L_0x0054:
            r6 = move-exception
            goto L_0x0071
        L_0x0056:
            r6 = 1
        L_0x0057:
            if (r6 == 0) goto L_0x005a
            goto L_0x0035
        L_0x005a:
            com.google.android.exoplayer2.util.o.f()     // Catch:{ IllegalStateException -> 0x0054 }
            goto L_0x006c
        L_0x005e:
            ej r8 = r5.y0     // Catch:{ IllegalStateException -> 0x0054 }
            int r9 = r8.d     // Catch:{ IllegalStateException -> 0x0054 }
            int r6 = r5.M(r6)     // Catch:{ IllegalStateException -> 0x0054 }
            int r9 = r9 + r6
            r8.d = r9     // Catch:{ IllegalStateException -> 0x0054 }
            r5.n0(r1)     // Catch:{ IllegalStateException -> 0x0054 }
        L_0x006c:
            ej r6 = r5.y0     // Catch:{ IllegalStateException -> 0x0054 }
            monitor-enter(r6)     // Catch:{ IllegalStateException -> 0x0054 }
            monitor-exit(r6)     // Catch:{ IllegalStateException -> 0x0054 }
            return
        L_0x0071:
            int r7 = com.google.android.exoplayer2.util.f0.a
            r8 = 21
            if (r7 < r8) goto L_0x007c
            boolean r7 = r6 instanceof android.media.MediaCodec.CodecException
            if (r7 == 0) goto L_0x007c
            goto L_0x0093
        L_0x007c:
            java.lang.StackTraceElement[] r7 = r6.getStackTrace()
            int r8 = r7.length
            if (r8 <= 0) goto L_0x0092
            r7 = r7[r1]
            java.lang.String r7 = r7.getClassName()
            java.lang.String r8 = "android.media.MediaCodec"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x0092
            r1 = 1
        L_0x0092:
            r0 = r1
        L_0x0093:
            if (r0 == 0) goto L_0x009c
            com.google.android.exoplayer2.d0 r7 = r5.E
            com.google.android.exoplayer2.ExoPlaybackException r6 = r5.x(r6, r7)
            throw r6
        L_0x009c:
            goto L_0x009e
        L_0x009d:
            throw r6
        L_0x009e:
            goto L_0x009d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.s(long, long):void");
    }

    /* access modifiers changed from: protected */
    public final void t0() {
        this.x0 = true;
    }

    /* access modifiers changed from: protected */
    public boolean v0(e eVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract int w0(f fVar, n<s> nVar, com.google.android.exoplayer2.d0 d0Var);

    /* access modifiers changed from: protected */
    public final com.google.android.exoplayer2.d0 z0(long j) {
        com.google.android.exoplayer2.d0 d = this.B.d(j);
        if (d != null) {
            this.F = d;
        }
        return d;
    }

    public static class DecoderInitializationException extends Exception {
        public final e codecInfo;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(com.google.android.exoplayer2.d0 r11, java.lang.Throwable r12, boolean r13, int r14) {
            /*
                r10 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Decoder init failed: ["
                r0.append(r1)
                r0.append(r14)
                java.lang.String r1 = "], "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r3 = r0.toString()
                java.lang.String r5 = r11.r
                if (r14 >= 0) goto L_0x0020
                java.lang.String r11 = "neg_"
                goto L_0x0022
            L_0x0020:
                java.lang.String r11 = ""
            L_0x0022:
                java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_"
                java.lang.StringBuilder r11 = defpackage.je.Z0(r0, r11)
                int r14 = java.lang.Math.abs(r14)
                r11.append(r14)
                java.lang.String r8 = r11.toString()
                r9 = 0
                r7 = 0
                r2 = r10
                r4 = r12
                r6 = r13
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(com.google.android.exoplayer2.d0, java.lang.Throwable, boolean, int):void");
        }

        static DecoderInitializationException a(DecoderInitializationException decoderInitializationException, DecoderInitializationException decoderInitializationException2) {
            return new DecoderInitializationException(decoderInitializationException.getMessage(), decoderInitializationException.getCause(), decoderInitializationException.mimeType, decoderInitializationException.secureDecoderRequired, decoderInitializationException.codecInfo, decoderInitializationException.diagnosticInfo, decoderInitializationException2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public DecoderInitializationException(com.google.android.exoplayer2.d0 r11, java.lang.Throwable r12, boolean r13, com.google.android.exoplayer2.mediacodec.e r14) {
            /*
                r10 = this;
                java.lang.String r0 = "Decoder init failed: "
                java.lang.StringBuilder r0 = defpackage.je.V0(r0)
                java.lang.String r1 = r14.a
                r0.append(r1)
                java.lang.String r1 = ", "
                r0.append(r1)
                r0.append(r11)
                java.lang.String r3 = r0.toString()
                java.lang.String r5 = r11.r
                int r11 = com.google.android.exoplayer2.util.f0.a
                r0 = 21
                if (r11 < r0) goto L_0x002b
                boolean r11 = r12 instanceof android.media.MediaCodec.CodecException
                if (r11 == 0) goto L_0x002b
                r11 = r12
                android.media.MediaCodec$CodecException r11 = (android.media.MediaCodec.CodecException) r11
                java.lang.String r11 = r11.getDiagnosticInfo()
                goto L_0x002c
            L_0x002b:
                r11 = 0
            L_0x002c:
                r8 = r11
                r9 = 0
                r2 = r10
                r4 = r12
                r6 = r13
                r7 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.<init>(com.google.android.exoplayer2.d0, java.lang.Throwable, boolean, com.google.android.exoplayer2.mediacodec.e):void");
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z, e eVar, String str3, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.codecInfo = eVar;
            this.diagnosticInfo = str3;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }
    }
}
