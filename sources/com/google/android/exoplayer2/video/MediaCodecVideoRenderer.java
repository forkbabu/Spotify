package com.google.android.exoplayer2.video;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.drm.l;
import com.google.android.exoplayer2.drm.n;
import com.google.android.exoplayer2.e0;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;
import com.google.android.exoplayer2.mediacodec.e;
import com.google.android.exoplayer2.mediacodec.f;
import com.google.android.exoplayer2.t;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.o;
import com.google.android.exoplayer2.video.s;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MediaCodecVideoRenderer extends MediaCodecRenderer {
    private static final int[] o1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean p1;
    private static boolean q1;
    private final Context A0;
    private final p B0;
    private final s.a C0;
    private final long D0;
    private final int E0;
    private final boolean F0;
    private final long[] G0;
    private final long[] H0;
    private b I0;
    private boolean J0;
    private boolean K0;
    private Surface L0;
    private Surface M0;
    private int N0;
    private boolean O0;
    private long P0;
    private long Q0;
    private long R0;
    private int S0;
    private int T0;
    private int U0;
    private long V0;
    private int W0;
    private float X0;
    private MediaFormat Y0;
    private int Z0;
    private int a1;
    private int b1;
    private float c1;
    private int d1;
    private int e1;
    private int f1;
    private float g1;
    private boolean h1;
    private int i1;
    c j1;
    private long k1;
    private long l1;
    private int m1;
    private o n1;

    public static final class VideoDecoderException extends MediaCodecRenderer.DecoderException {
        public final boolean isSurfaceValid;
        public final int surfaceIdentityHashCode;
    }

    protected static final class b {
        public final int a;
        public final int b;
        public final int c;

        public b(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    /* access modifiers changed from: private */
    public final class c implements MediaCodec.OnFrameRenderedListener {
        c(MediaCodec mediaCodec, a aVar) {
            mediaCodec.setOnFrameRenderedListener(this, new Handler());
        }

        @Override // android.media.MediaCodec.OnFrameRenderedListener
        public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this == mediaCodecVideoRenderer.j1) {
                if (j == Long.MAX_VALUE) {
                    MediaCodecVideoRenderer.A0(mediaCodecVideoRenderer);
                } else {
                    mediaCodecVideoRenderer.N0(j);
                }
            }
        }
    }

    public MediaCodecVideoRenderer(Context context, f fVar, long j, boolean z, Handler handler, s sVar, int i) {
        this(context, fVar, j, null, false, z, handler, sVar, i);
    }

    static void A0(MediaCodecVideoRenderer mediaCodecVideoRenderer) {
        mediaCodecVideoRenderer.t0();
    }

    private void B0() {
        MediaCodec X;
        this.O0 = false;
        if (f0.a >= 23 && this.h1 && (X = X()) != null) {
            this.j1 = new c(X, null);
        }
    }

    private void C0() {
        this.d1 = -1;
        this.e1 = -1;
        this.g1 = -1.0f;
        this.f1 = -1;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    private static int E0(e eVar, String str, int i, int i2) {
        char c2;
        int i3;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        str.hashCode();
        int i4 = 4;
        switch (str.hashCode()) {
            case -1664118616:
                if (str.equals("video/3gpp")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 1187890754:
                if (str.equals("video/mp4v-es")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127256:
                if (str.equals("video/x-vnd.on2.vp8")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 2:
            case 4:
                i3 = i * i2;
                i4 = 2;
                break;
            case 1:
            case 5:
                i3 = i * i2;
                break;
            case 3:
                String str2 = f0.d;
                if (!"BRAVIA 4K 2015".equals(str2) && (!"Amazon".equals(f0.c) || (!"KFSOWI".equals(str2) && (!"AFTS".equals(str2) || !eVar.f)))) {
                    i3 = f0.e(i2, 16) * f0.e(i, 16) * 16 * 16;
                    i4 = 2;
                    break;
                } else {
                    return -1;
                }
                break;
            default:
                return -1;
        }
        return (i3 * 3) / (i4 * 2);
    }

    private static List<e> F0(f fVar, d0 d0Var, boolean z, boolean z2) {
        Pair<Integer, Integer> c2;
        String str = d0Var.r;
        if (str == null) {
            return Collections.emptyList();
        }
        List<e> g = MediaCodecUtil.g(fVar.b(str, z, z2), d0Var);
        if ("video/dolby-vision".equals(str) && (c2 = MediaCodecUtil.c(d0Var)) != null) {
            int intValue = ((Integer) c2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                ((ArrayList) g).addAll(fVar.b("video/hevc", z, z2));
            } else if (intValue == 512) {
                ((ArrayList) g).addAll(fVar.b("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(g);
    }

    private static int G0(e eVar, d0 d0Var) {
        if (d0Var.s == -1) {
            return E0(eVar, d0Var.r, d0Var.w, d0Var.x);
        }
        int size = d0Var.t.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += d0Var.t.get(i2).length;
        }
        return d0Var.s + i;
    }

    private static boolean H0(long j) {
        return j < -30000;
    }

    private void I0() {
        if (this.S0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.C0.c(this.S0, elapsedRealtime - this.R0);
            this.S0 = 0;
            this.R0 = elapsedRealtime;
        }
    }

    private void K0() {
        int i = this.Z0;
        if (i != -1 || this.a1 != -1) {
            if (this.d1 != i || this.e1 != this.a1 || this.f1 != this.b1 || this.g1 != this.c1) {
                this.C0.n(i, this.a1, this.b1, this.c1);
                this.d1 = this.Z0;
                this.e1 = this.a1;
                this.f1 = this.b1;
                this.g1 = this.c1;
            }
        }
    }

    private void L0() {
        int i = this.d1;
        if (i != -1 || this.e1 != -1) {
            this.C0.n(i, this.e1, this.f1, this.g1);
        }
    }

    private void M0(long j, long j2, d0 d0Var, MediaFormat mediaFormat) {
        o oVar = this.n1;
        if (oVar != null) {
            oVar.a(j, j2, d0Var, mediaFormat);
        }
    }

    private void O0(MediaCodec mediaCodec, int i, int i2) {
        this.Z0 = i;
        this.a1 = i2;
        float f = this.X0;
        this.c1 = f;
        if (f0.a >= 21) {
            int i3 = this.W0;
            if (i3 == 90 || i3 == 270) {
                this.Z0 = i2;
                this.a1 = i;
                this.c1 = 1.0f / f;
            }
        } else {
            this.b1 = this.W0;
        }
        mediaCodec.setVideoScalingMode(this.N0);
    }

    private void R0() {
        this.Q0 = this.D0 > 0 ? SystemClock.elapsedRealtime() + this.D0 : -9223372036854775807L;
    }

    private boolean S0(e eVar) {
        return f0.a >= 23 && !this.h1 && !D0(eVar.a) && (!eVar.f || k.b(this.A0));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:420:0x0651 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean D0(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 2396
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.MediaCodecVideoRenderer.D0(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.t
    public void E() {
        this.k1 = -9223372036854775807L;
        this.l1 = -9223372036854775807L;
        this.m1 = 0;
        this.Y0 = null;
        C0();
        B0();
        this.B0.c();
        this.j1 = null;
        try {
            super.E();
        } finally {
            this.C0.b(this.y0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.t
    public void F(boolean z) {
        super.F(z);
        int i = this.i1;
        int i2 = y().a;
        this.i1 = i2;
        this.h1 = i2 != 0;
        if (i2 != i) {
            o0();
        }
        this.C0.d(this.y0);
        this.B0.d();
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.t
    public void G(long j, boolean z) {
        super.G(j, z);
        B0();
        this.P0 = -9223372036854775807L;
        this.T0 = 0;
        this.k1 = -9223372036854775807L;
        int i = this.m1;
        if (i != 0) {
            this.l1 = this.G0[i - 1];
            this.m1 = 0;
        }
        if (z) {
            R0();
        } else {
            this.Q0 = -9223372036854775807L;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.t
    public void H() {
        try {
            super.H();
            Surface surface = this.M0;
            if (surface != null) {
                if (this.L0 == surface) {
                    this.L0 = null;
                }
                surface.release();
                this.M0 = null;
            }
        } catch (Throwable th) {
            if (this.M0 != null) {
                Surface surface2 = this.L0;
                Surface surface3 = this.M0;
                if (surface2 == surface3) {
                    this.L0 = null;
                }
                surface3.release();
                this.M0 = null;
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void I() {
        this.S0 = 0;
        this.R0 = SystemClock.elapsedRealtime();
        this.V0 = SystemClock.elapsedRealtime() * 1000;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void J() {
        this.Q0 = -9223372036854775807L;
        I0();
    }

    /* access modifiers changed from: package-private */
    public void J0() {
        if (!this.O0) {
            this.O0 = true;
            this.C0.m(this.L0);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.t
    public void K(d0[] d0VarArr, long j) {
        if (this.l1 == -9223372036854775807L) {
            this.l1 = j;
            return;
        }
        int i = this.m1;
        long[] jArr = this.G0;
        if (i == jArr.length) {
            long j2 = jArr[i - 1];
        } else {
            this.m1 = i + 1;
        }
        int i2 = this.m1 - 1;
        jArr[i2] = j;
        this.H0[i2] = this.k1;
    }

    /* access modifiers changed from: protected */
    public void N0(long j) {
        d0 z0 = z0(j);
        if (z0 != null) {
            O0(X(), z0.w, z0.x);
        }
        K0();
        J0();
        j0(j);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int O(MediaCodec mediaCodec, e eVar, d0 d0Var, d0 d0Var2) {
        if (!eVar.g(d0Var, d0Var2, true)) {
            return 0;
        }
        int i = d0Var2.w;
        b bVar = this.I0;
        if (i > bVar.a || d0Var2.x > bVar.b || G0(eVar, d0Var2) > this.I0.c) {
            return 0;
        }
        return d0Var.C(d0Var2) ? 3 : 2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00fc, code lost:
        r21 = r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01e7  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void P(com.google.android.exoplayer2.mediacodec.e r23, android.media.MediaCodec r24, com.google.android.exoplayer2.d0 r25, android.media.MediaCrypto r26, float r27) {
        /*
        // Method dump skipped, instructions count: 535
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.MediaCodecVideoRenderer.P(com.google.android.exoplayer2.mediacodec.e, android.media.MediaCodec, com.google.android.exoplayer2.d0, android.media.MediaCrypto, float):void");
    }

    /* access modifiers changed from: protected */
    public void P0(MediaCodec mediaCodec, int i) {
        K0();
        o.b("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, true);
        o.f();
        this.V0 = SystemClock.elapsedRealtime() * 1000;
        this.y0.e++;
        this.T0 = 0;
        J0();
    }

    /* access modifiers changed from: protected */
    public void Q0(MediaCodec mediaCodec, int i, long j) {
        K0();
        o.b("releaseOutputBuffer");
        mediaCodec.releaseOutputBuffer(i, j);
        o.f();
        this.V0 = SystemClock.elapsedRealtime() * 1000;
        this.y0.e++;
        this.T0 = 0;
        J0();
    }

    /* access modifiers changed from: protected */
    public void T0(MediaCodec mediaCodec, int i) {
        o.b("skipVideoBuffer");
        mediaCodec.releaseOutputBuffer(i, false);
        o.f();
        this.y0.f++;
    }

    /* access modifiers changed from: protected */
    public void U0(int i) {
        ej ejVar = this.y0;
        ejVar.g += i;
        this.S0 += i;
        int i2 = this.T0 + i;
        this.T0 = i2;
        ejVar.h = Math.max(i2, ejVar.h);
        int i3 = this.E0;
        if (i3 > 0 && this.S0 >= i3) {
            I0();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean V() {
        try {
            return super.V();
        } finally {
            this.U0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean Z() {
        return this.h1 && f0.a < 23;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public float a0(float f, d0 d0Var, d0[] d0VarArr) {
        float f2 = -1.0f;
        for (d0 d0Var2 : d0VarArr) {
            float f3 = d0Var2.y;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public List<e> b0(f fVar, d0 d0Var, boolean z) {
        return F0(fVar, d0Var, z, this.h1);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void c0(fj fjVar) {
        if (this.K0) {
            ByteBuffer byteBuffer = fjVar.f;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    MediaCodec X = X();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    X.setParameters(bundle);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer, com.google.android.exoplayer2.p0
    public boolean d() {
        Surface surface;
        if (super.d() && (this.O0 || (((surface = this.M0) != null && this.L0 == surface) || X() == null || this.h1))) {
            this.Q0 = -9223372036854775807L;
            return true;
        } else if (this.Q0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.Q0) {
                return true;
            }
            this.Q0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void g0(String str, long j, long j2) {
        this.C0.a(str, j, j2);
        this.J0 = D0(str);
        e Y = Y();
        Y.getClass();
        boolean z = false;
        if (f0.a >= 29 && "video/x-vnd.on2.vp9".equals(Y.b)) {
            MediaCodecInfo.CodecProfileLevel[] d = Y.d();
            int length = d.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (d[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.K0 = z;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void h0(e0 e0Var) {
        super.h0(e0Var);
        d0 d0Var = e0Var.c;
        this.C0.e(d0Var);
        this.X0 = d0Var.A;
        this.W0 = d0Var.z;
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void i0(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        this.Y0 = mediaFormat;
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        O0(mediaCodec, i, i2);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void j0(long j) {
        this.U0--;
        while (true) {
            int i = this.m1;
            if (i != 0 && j >= this.H0[0]) {
                long[] jArr = this.G0;
                this.l1 = jArr[0];
                int i2 = i - 1;
                this.m1 = i2;
                System.arraycopy(jArr, 1, jArr, 0, i2);
                long[] jArr2 = this.H0;
                System.arraycopy(jArr2, 1, jArr2, 0, this.m1);
                B0();
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void k0(fj fjVar) {
        this.U0++;
        this.k1 = Math.max(fjVar.c, this.k1);
        if (f0.a < 23 && this.h1) {
            N0(fjVar.c);
        }
    }

    @Override // com.google.android.exoplayer2.t, com.google.android.exoplayer2.n0.b
    public void l(int i, Object obj) {
        if (i == 1) {
            Surface surface = (Surface) obj;
            if (surface == null) {
                Surface surface2 = this.M0;
                if (surface2 != null) {
                    surface = surface2;
                } else {
                    e Y = Y();
                    if (Y != null && S0(Y)) {
                        surface = k.c(this.A0, Y.f);
                        this.M0 = surface;
                    }
                }
            }
            if (this.L0 != surface) {
                this.L0 = surface;
                int state = getState();
                MediaCodec X = X();
                if (X != null) {
                    if (f0.a < 23 || surface == null || this.J0) {
                        o0();
                        e0();
                    } else {
                        X.setOutputSurface(surface);
                    }
                }
                if (surface == null || surface == this.M0) {
                    C0();
                    B0();
                    return;
                }
                L0();
                B0();
                if (state == 2) {
                    R0();
                }
            } else if (surface != null && surface != this.M0) {
                L0();
                if (this.O0) {
                    this.C0.m(this.L0);
                }
            }
        } else if (i == 4) {
            this.N0 = ((Integer) obj).intValue();
            MediaCodec X2 = X();
            if (X2 != null) {
                X2.setVideoScalingMode(this.N0);
            }
        } else if (i == 6) {
            this.n1 = (o) obj;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        if ((H0(r13) && r10 > 100000) != false) goto L_0x0079;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009c  */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m0(long r26, long r28, android.media.MediaCodec r30, java.nio.ByteBuffer r31, int r32, int r33, long r34, boolean r36, boolean r37, com.google.android.exoplayer2.d0 r38) {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.MediaCodecVideoRenderer.m0(long, long, android.media.MediaCodec, java.nio.ByteBuffer, int, int, long, boolean, boolean, com.google.android.exoplayer2.d0):boolean");
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public void o0() {
        try {
            super.o0();
        } finally {
            this.U0 = 0;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public boolean v0(e eVar) {
        return this.L0 != null || S0(eVar);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecRenderer
    public int w0(f fVar, n<com.google.android.exoplayer2.drm.s> nVar, d0 d0Var) {
        int i = 0;
        if (!com.google.android.exoplayer2.util.s.j(d0Var.r)) {
            return 0;
        }
        l lVar = d0Var.u;
        boolean z = lVar != null;
        List<e> F02 = F0(fVar, d0Var, z, false);
        if (z && F02.isEmpty()) {
            F02 = F0(fVar, d0Var, false, false);
        }
        if (F02.isEmpty()) {
            return 1;
        }
        if (!(lVar == null || com.google.android.exoplayer2.drm.s.class.equals(d0Var.L) || (d0Var.L == null && t.N(nVar, lVar)))) {
            return 2;
        }
        e eVar = F02.get(0);
        boolean e = eVar.e(d0Var);
        int i2 = eVar.f(d0Var) ? 16 : 8;
        if (e) {
            List<e> F03 = F0(fVar, d0Var, z, true);
            if (!F03.isEmpty()) {
                e eVar2 = F03.get(0);
                if (eVar2.e(d0Var) && eVar2.f(d0Var)) {
                    i = 32;
                }
            }
        }
        return (e ? 4 : 3) | i2 | i;
    }

    @Deprecated
    public MediaCodecVideoRenderer(Context context, f fVar, long j, n<com.google.android.exoplayer2.drm.s> nVar, boolean z, boolean z2, Handler handler, s sVar, int i) {
        super(2, fVar, nVar, z, z2, 30.0f);
        this.D0 = j;
        this.E0 = i;
        Context applicationContext = context.getApplicationContext();
        this.A0 = applicationContext;
        this.B0 = new p(applicationContext);
        this.C0 = new s.a(handler, sVar);
        this.F0 = "NVIDIA".equals(f0.c);
        this.G0 = new long[10];
        this.H0 = new long[10];
        this.l1 = -9223372036854775807L;
        this.k1 = -9223372036854775807L;
        this.Q0 = -9223372036854775807L;
        this.Z0 = -1;
        this.a1 = -1;
        this.c1 = -1.0f;
        this.X0 = -1.0f;
        this.N0 = 1;
        C0();
    }
}
